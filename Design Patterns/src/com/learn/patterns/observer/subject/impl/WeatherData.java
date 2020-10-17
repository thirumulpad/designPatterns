package com.learn.patterns.observer.subject.impl;

import java.util.ArrayList;

import com.learn.patterns.observer.interfaces.Observer;
import com.learn.patterns.observer.interfaces.Subject;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for (Observer obs : observers) {
			obs.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();

	}
}
