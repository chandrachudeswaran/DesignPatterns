package com.algos.java.patterns.observer;

public class WeatherDataClient {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditions(weatherData);
		ForecastDisplay display = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(10, 10, 10);

		display.removeFromObservation();

		weatherData.setMeasurements(20, 20, 20);
	}

}
