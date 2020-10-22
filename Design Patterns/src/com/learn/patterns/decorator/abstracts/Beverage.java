package com.learn.patterns.decorator.abstracts;

public abstract class Beverage {

	protected String description = "Unknown beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
