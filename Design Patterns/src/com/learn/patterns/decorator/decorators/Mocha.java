package com.learn.patterns.decorator.decorators;

import com.learn.patterns.decorator.abstracts.Beverage;
import com.learn.patterns.decorator.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
