package com.learn.patterns.strategy;

import com.learn.patterns.strategy.fly.impl.FlyRocketPowered;
import com.learn.patterns.strategy.types.MallardDuck;
import com.learn.patterns.strategy.types.ModelDuck;

public class DuckSimulator {

	public static void main(String[] args) {

		Duck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();

		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}

}
