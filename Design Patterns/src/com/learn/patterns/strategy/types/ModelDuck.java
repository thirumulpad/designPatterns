package com.learn.patterns.strategy.types;

import com.learn.patterns.strategy.Duck;
import com.learn.patterns.strategy.fly.impl.FlyNoWay;
import com.learn.patterns.strategy.quack.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flybehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Iam a Model Duck");
	}

}
