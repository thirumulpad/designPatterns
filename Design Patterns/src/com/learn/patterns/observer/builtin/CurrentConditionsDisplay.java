package com.learn.patterns.observer.builtin;

import java.util.Observable;
import java.util.Observer;

import com.learn.patterns.observer.interfaces.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temp;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current Conditions : " + temp + " F degrees with " + humidity + " % humidity");
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

}
