package com.learn.patterns.observer.interfaces;

public interface Subject {

	public void registerObserver(Observer obs);

	public void removeObserver(Observer obs);

	public void notifyObservers();

}
