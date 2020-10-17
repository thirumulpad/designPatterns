package com.learn.patterns.observer.builtin;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {

	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;

		measurementsChanged();

	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public float getTemperature() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
