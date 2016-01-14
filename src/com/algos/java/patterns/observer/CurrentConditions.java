package com.algos.java.patterns.observer;

public class CurrentConditions implements IObserver,IDisplay {

	private float temperature;
	private float pressure;
	private WeatherData subject;
	
	public CurrentConditions(WeatherData data) {
		this.subject = data;
		subject.registerObserver(this);
	}
	
	@Override
	public void update(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.pressure=pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current weather conditions: "+ "Temperature: "+ temperature+ "  "+ "Pressure:"+ pressure);
	}

	
	public void removeFromObservation(){
		subject.removerObserver(this);
	}
}
