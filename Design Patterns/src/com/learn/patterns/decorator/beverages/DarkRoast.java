package com.learn.patterns.decorator.beverages;

import com.learn.patterns.decorator.abstracts.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
