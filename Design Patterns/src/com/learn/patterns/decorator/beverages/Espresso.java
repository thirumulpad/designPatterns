package com.learn.patterns.decorator.beverages;

import com.learn.patterns.decorator.abstracts.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
