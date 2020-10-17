package com.learn.patterns.observer.subscriber.impl;

import com.learn.patterns.observer.interfaces.DisplayElement;
import com.learn.patterns.observer.interfaces.Observer;
import com.learn.patterns.observer.interfaces.Subject;
import com.learn.patterns.observer.subject.impl.WeatherData;

public class CurrentConditionsDisplay implements DisplayElement, Observer {

	private float temp;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(WeatherData wd) {
		this.weatherData = wd;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current Conditions : " + temp + " F degrees with " + humidity + " % humidity");
	}

}
