package com.learn.patterns.decorator.beverages;

import com.learn.patterns.decorator.abstracts.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decafenniated";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
