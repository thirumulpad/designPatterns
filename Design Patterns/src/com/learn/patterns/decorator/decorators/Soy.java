package com.learn.patterns.decorator.decorators;

import com.learn.patterns.decorator.abstracts.Beverage;
import com.learn.patterns.decorator.abstracts.CondimentDecorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + .15;
	}

}
