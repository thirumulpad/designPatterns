package com.learn.patterns.decorator.decorators;

import com.learn.patterns.decorator.abstracts.Beverage;
import com.learn.patterns.decorator.abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .10;
	}

}
