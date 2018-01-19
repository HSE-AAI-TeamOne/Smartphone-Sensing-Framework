/*
 *  This file is part of the Multimodal Mobility Analyser(MMA), based
 *  on the Smartphone Sensing Framework (SSF)

    MMA (also SSF) is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    MMA (also SSF) is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with MMA.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.example.ldg8fe.rapiddisruption.hardwareAdapter.accelerometer;



// TODO: Auto-generated Javadoc

import android.content.Context;
import android.util.Log;
import android.widget.TextView;

import com.example.ldg8fe.rapiddisruption.data.CsvFileReader;
import com.example.ldg8fe.rapiddisruption.hardwareAdapter.IAccelerometer;

/**
 * Simulated accelerometer with data input from a saved CSV file 
 * @author Dionysios Satikidis (dionysios.satikidis@yahoo.de)
 * @version 1.0
 */

public class accelerometerSim implements IAccelerometer {


	/**
	 * the AccelerometerSim method initialise a new buffer
	 */
	public accelerometerSim() {
	}

	/**
	 * gets the x-axis value in Float format from the CSV file 
	 * 
	 * @return getAccX returns the values of the x-axis from the CSV file
	 */
	@Override
	public Float getAccX() {
		Log.d("getAccX", "accelerometerSim.getAccX");
		return CsvFileReader.getAccX();
	}
	
	/**
	 * gets the y-axis value in Float format from the CSV file 
	 * 
	 * @return getAccY returns the values of the y-axis from the CSV file
	 */
	@Override
	public Float getAccY() {
		return CsvFileReader.getAccY();
	}
	
	/**
	 * gets the z-axis value in Float format from the CSV file 
	 * 
	 * @return getAccZ returns the values of the z-axis from the CSV file
	 */
	@Override
	public Float getAccZ() {
		return CsvFileReader.getAccZ();
	}

	@Override
	public Double getAccA() {
		return  CsvFileReader.getVectorA();
	}
	@Override
	public void initAccelerometer(Context context) {

	}

	@Override
	public void start() {

	}

	@Override
	public void stop() {

	}

	@Override
	public void accUI(double v1, double v2, double v3, double v4, TextView... tvs) {
		tvs[0].setText("X: " + String.format("%.2f", v1));
		tvs[1].setText("Y: " + String.format("%.2f", v2));
		tvs[2].setText("Z: " + String.format("%.2f", v3));
		tvs[3].setText("AccV: " + String.format("%.2f", v4));
	}
}
