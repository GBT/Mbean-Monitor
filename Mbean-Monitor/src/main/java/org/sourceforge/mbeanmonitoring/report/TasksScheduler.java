package org.sourceforge.mbeanmonitoring.report;

/**
 **      Author:
 **              Laurent Le Grandois <Laurent.Le.Grandois@gmail.com>
 **              Gilles Bardouillet  <Gilles.Bardouillet@gmail.com>
 **
 **  This program is free software; you can redistribute it and/or modify
 ** it under the terms of the GNU General Public License as published by
 **  the Free Software Foundation; either version 2 of the License, or
 **  (at your option) any later version.
 **
 ** This program is distributed in the hope that it will be useful,
 **  but WITHOUT ANY WARRANTY; without even the implied warranty of
 **  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 **  GNU General Public License for more details.
 **
 **  You should have received a copy of the GNU General Public License
 ** along with this program; if not, write to the Free Software
 **
 */

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.log4j.Logger;

public class TasksScheduler extends TimerTask {
	private PoolWorker[] threads;
	private final LinkedList<Runnable> tasksToExecuteNow;
	private final LinkedList<Runnable> availableTasks;
	private final Logger log = Logger.getLogger(Capture.mbeanMonitorLoggerName);

	public TasksScheduler() {
		tasksToExecuteNow = new LinkedList<Runnable>();
		availableTasks = new LinkedList<Runnable>();
	}

	public void addRunnableTasks(Runnable r) {
		availableTasks.addLast(r);
	}

	public void startScheduledTasks(int intervalInSec) {
		int maxThreadsNeeded = availableTasks.size();
		threads = new PoolWorker[maxThreadsNeeded];
		for (int i = 0; i < maxThreadsNeeded; i++) {
			threads[i] = new PoolWorker();
			threads[i].setId(i);
			threads[i].start();
		}
		log.info("Scheduler: TasksPool=" + maxThreadsNeeded + " / Interval=" + intervalInSec + "s");
		log.info("Scheduler: Hope each task does not last more than " + (intervalInSec * maxThreadsNeeded)
				+ "s !");
		Timer timer = new Timer();
		timer.schedule((TimerTask) this, 0, intervalInSec * 1000);
	}

	// Finds an available task and puts it in the list of tasks to start now.
	public void run() {
		Runnable r;
		synchronized (availableTasks) {
			// Find a task available to be run

			if (availableTasks.isEmpty())
				log.warn("NO TASKS TO RUN... INCREASE THE TASKS POOL SIZE !");

			while (availableTasks.isEmpty()) {
				try {
					availableTasks.wait();
				} catch (InterruptedException ignored) {
				}
			}
			r = (Runnable) availableTasks.removeFirst();
		}
		executeTask(r);
	}

	public void executeTask(Runnable r) {
		synchronized (tasksToExecuteNow) {
			tasksToExecuteNow.addLast(r);
			tasksToExecuteNow.notify();
		}
	}

	//////////////////////////////////////////////////////////////////////////////

	private class PoolWorker extends Thread {
		private int ID = 0;

		public void setId(int _id) {
			this.ID = _id;
		}

		public void run() {
			Runnable r;

			while (true) {
				synchronized (tasksToExecuteNow) {
					while (tasksToExecuteNow.isEmpty()) {
						try {
							tasksToExecuteNow.wait();
						} catch (InterruptedException ignored) {
						}
					}
					r = (Runnable) tasksToExecuteNow.removeFirst();
				}

				// If we don't catch RuntimeException,
				// the pool could leak threads
				try {
					log.info("Worker [" + this.ID + "]: Task launched");
					long dureeDebut = System.currentTimeMillis();
					r.run();
					long dureeFin = System.currentTimeMillis();
					long tempsPasse = dureeFin - dureeDebut;
					if (tempsPasse < 0) {
						tempsPasse = 0;
					}
					log.info("Worker [" + this.ID + "]: Task done in " + tempsPasse + " ms");

					// Puts back this task to the list of tasks available for a
					// run...
					synchronized (availableTasks) {
						availableTasks.addLast(r);
						availableTasks.notify();
					}
				} catch (RuntimeException e) {
					e.printStackTrace();
					log.error("Cautch exception, lets continue ....", e);
					// You might want to log something here
				}
			}
		}
	}
}