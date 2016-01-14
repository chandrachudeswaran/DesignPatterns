package com.algos.java.patterns.observer;

public interface ISubject {

	public void registerObserver(IObserver observer);
	public void removerObserver(IObserver observer);
	public void notifyObservers();
}
