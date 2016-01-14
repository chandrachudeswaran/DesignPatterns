package com.algos.java.patterns.observer;

import java.util.ArrayList;

public class WeatherData implements ISubject {

	private float temperature;
	private float humidity;
	private float pressure;
	private ArrayList<IObserver> observers;

	public WeatherData() {
		observers= new ArrayList<IObserver>();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
		
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}

	@Override
	public void registerObserver(IObserver observer) {
			observers.add(observer);
	}

	@Override
	public void removerObserver(IObserver observer) {
		int index = observers.indexOf(observer);
		if(index>=0){
			observers.remove(index);
		}

	}

	@Override
	public void notifyObservers() {
		for(IObserver observer:observers){
			observer.update(temperature,humidity,pressure);
		}

	}

}
