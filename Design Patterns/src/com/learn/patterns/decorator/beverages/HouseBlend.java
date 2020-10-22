package com.learn.patterns.decorator.beverages;

import com.learn.patterns.decorator.abstracts.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
