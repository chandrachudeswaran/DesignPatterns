package com.algos.java.patterns.observer;

public class ForecastDisplay implements IObserver, IDisplay {

	private float temperature;
	private float pressure;
	private float humidity;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData data) {
		this.weatherData=data;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Forecast: "+ "Temperature:" + temperature+"F "+ "Pressure: "+ pressure+ " Humidity: "+ humidity);

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature =temperature;
		this.pressure =pressure;
		this.humidity=humidity;
		display();

	}
	
	public void removeFromObservation(){
		weatherData.removerObserver(this);
	}

}
