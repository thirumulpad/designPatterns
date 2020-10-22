package com.learn.patterns.decorator.decorators;

import com.learn.patterns.decorator.abstracts.Beverage;
import com.learn.patterns.decorator.abstracts.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;

	public SteamedMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
