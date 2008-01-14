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

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.ui.RefineryUtilities;

public class Graph extends JFrame implements Runnable {

	static final long serialVersionUID = 1L;

	private static void displayGraphFromCapture(Capture capture) {
		String theCharSep = capture.params.getSeparateur();
		String file = capture.params.getGenereTo() + System.getProperty("file.separator") + Capture.CURRENT_DIRECTORY;
		int wait = capture.params.getDelay();
		long delay = new Long(wait).longValue();
		delay = delay * 1000;

		File f = new File(file);
        ArrayList<Graph> graphs = new ArrayList<Graph>();

		if (f.isDirectory()) {
			String[] children = f.list();
			for (int i = 0; i < children.length; i++) {
				String fileName = file + System.getProperty("file.separator") + children[i];
				graphs.add(new Graph(fileName, delay, theCharSep));
			}
		}

		for (int i = 0; i < graphs.size(); i++) {
			Graph graph = graphs.get(i);
			graph.pack();
			RefineryUtilities.centerFrameOnScreen(graph);
			graph.setVisible(true);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Capture cap = null;
		Capture.isGraphRuntime = true;
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				cap = new Capture(args[i]);
				Graph.displayGraphFromCapture(cap);
			}
		} else {
			cap = new Capture();
			Graph.displayGraphFromCapture(cap);
		}
	}

	public String dir = null;

	BufferedReader in;
	String line = null;

	String sep = null;
	TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();

	ArrayList<TimeSeries> timeSeriesVector = new ArrayList<TimeSeries>();

	public long wait = 0;

	/**
	 * @param fileName
	 * @param delay
	 * @param sep
	 */
	public Graph(String fileName, long delay, String sep) {
		super(fileName);
		this.wait = delay;
		this.sep = sep;

		try {
			this.in = new BufferedReader(new FileReader(fileName));
			StringTokenizer st = new StringTokenizer(in.readLine(), this.sep);

			st.nextToken();
			st.nextToken(); // date and hour

			String column;
			while (st.hasMoreElements()) {
				column = st.nextToken();
				TimeSeries serie = new TimeSeries(column, Millisecond.class);
				timeSeriesVector.add(serie);
				timeseriescollection.addSeries(serie);
			}

		} catch (Exception _) {
			_.printStackTrace();
		}

		StringTokenizer st = new StringTokenizer(fileName, "\\");
		String title = null;
		while (st.hasMoreElements()) {
			title = st.nextToken();
		}
		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(title, "Time", "Value", timeseriescollection, true,
				true, false);

		XYPlot xyplot = jfreechart.getXYPlot();
		ValueAxis valueaxis = xyplot.getDomainAxis();
		valueaxis.setAutoRange(true);
		valueaxis.setFixedAutoRange(60000D);
		valueaxis = xyplot.getRangeAxis();
		// valueaxis.setRange(0.0D, 10D);

		JPanel jpanel = new JPanel(new BorderLayout());
		ChartPanel chartpanel = new ChartPanel(jfreechart);

		// JButton jbutton = new JButton("Add New Data Item");
		// jbutton.setActionCommand("ADD_DATA");
		// jbutton.addActionListener(this);
		jpanel.add(chartpanel);
		// jpanel.add(jbutton, "South");

		chartpanel.setPreferredSize(new Dimension(500, 270));
		setContentPane(jpanel);

		Thread thread = new Thread(this);

		thread.start();

	}

	private void push(String line) {

		// System.out.println(line);

		StringTokenizer st = new StringTokenizer(line, this.sep);

		String date = st.nextToken();
		String heure = st.nextToken();

		Millisecond m = null;

		try {

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			java.util.Date d = formatter.parse(date + " " + heure);
			m = new Millisecond(d);

		} catch (ParseException _) {
			_.printStackTrace();
		}

		// System.out.print( "date[" + date + "] heure[" + heure + "] = " );

		int i = 0;
		String valueString = null;
		Double valueDouble = null;
		TimeSeries timeSerie = null;

		while (st.hasMoreElements()) {

			timeSerie = timeSeriesVector.get(i++);
			valueString = st.nextToken();
			valueDouble = new Double(valueString);

			// System.out.print( " " + valueDouble );
			timeSerie.add(m, valueDouble);
		}

		// System.out.println();

	}

	public void run() {
		while (true)

			try {

				line = in.readLine();

				if (line != null || line.length() != 0) {
					this.push(line);
				}

				Thread.sleep(this.wait);

			} catch (Exception _) {
                // TODO !
			}
	}
}