package com.learn.patterns.observer;

import com.learn.patterns.observer.subject.impl.WeatherData;
import com.learn.patterns.observer.subscriber.impl.CurrentConditionsDisplay;

public class WeatherStationSimulator {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
