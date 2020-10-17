package com.learn.patterns.strategy.fly.impl;

import com.learn.patterns.strategy.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}

}
