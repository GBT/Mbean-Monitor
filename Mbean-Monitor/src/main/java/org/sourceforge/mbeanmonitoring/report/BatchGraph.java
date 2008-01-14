package org.sourceforge.mbeanmonitoring.report;

/**
 **      Authors:
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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

public class BatchGraph extends JFrame {

	/**
	 *
	 */
	static final long serialVersionUID = 1L;

	/**
	 * Was a Vector
	 */
	protected ArrayList<TimeSeries> _series;

	/**
	 *
	 */
	protected String _file;

	/**
	 *
	 */
	protected String _title;

	/**
	 * @param file
	 * @throws StringIndexOutOfBoundsException
	 */
	public BatchGraph(String file) throws StringIndexOutOfBoundsException {

		this._file = file;
		this.setForeground(Color.black);
		this.setBackground(Color.lightGray);
		this.setFont(new Font("Arial", Font.BOLD, 12));
		this.setTitle(this._file);
		this.setResizable(true);
		int deb = file.lastIndexOf(File.separator) + 1;
		int fin = file.indexOf('.');
		this._title = file.substring(deb, fin);
		this._series = new ArrayList<TimeSeries>();
	}

	/**
	 * @throws NoSuchElementException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void fill() throws NoSuchElementException, FileNotFoundException, IOException, ParseException {

		TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

		BufferedReader dFile = new BufferedReader(new InputStreamReader(new FileInputStream(this._file)));
		boolean eof = false;
		String line = dFile.readLine();
		if (line != null) {
			StringTokenizer st = new StringTokenizer(line, ";");
			st.nextToken();
			st.nextToken();
			while (st.hasMoreElements()) {
				String column = st.nextToken();
				this._series.add(new TimeSeries(column, Millisecond.class));
			}
		}
		while (eof == false) {
			try {
				line = dFile.readLine();

				if (line != null) {
					StringTokenizer st = new StringTokenizer(line, ";");
					st.nextToken();
					String toparse = st.nextToken();

					Date measure = formatter.parse(toparse);

					int c = 0;
					while (st.hasMoreElements()) {
						String column = st.nextToken();
						TimeSeries serie = this._series.get(c);
						serie.addOrUpdate(new Millisecond(measure), new Integer(column));
						c++;
					}

				} else {
					eof = true;

				}

			} catch (StringIndexOutOfBoundsException e) {
				eof = true;
			} catch (IOException e) {
				eof = true;
			}
		}
		for (int i = 0; i < this._series.size(); i++) {
			TimeSeries serie = this._series.get(i);
			timeseriescollection.addSeries(serie);
		}
		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(this._title, "Time", "Value", timeseriescollection,
				true, true, false);

		JPanel jpanel = new JPanel(new BorderLayout());
		ChartPanel chartpanel = new ChartPanel(jfreechart);

		jpanel.add(chartpanel);

		chartpanel.setPreferredSize(new Dimension(500, 270));
		setContentPane(jpanel);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.err.println("Usage : java BatchGraph repertoire");
			System.exit(1);
		}

		String dir = args[0];
		System.out.println(dir);
		File fdir = new File(dir);
		if (fdir.isDirectory()) {
			File[] files = fdir.listFiles();
			for (int f = 0; f < files.length; f++) {
				String file = files[f].getAbsolutePath();
				try {
					BatchGraph graph = new BatchGraph(file);
					graph.fill();
					graph.pack();
                    graph.setVisible(true);
				} catch (Exception e) {
					continue;
				}
			}
		} else {
			System.err.println("ERROR : " + dir + " is not a directory");
		}
	}
}
