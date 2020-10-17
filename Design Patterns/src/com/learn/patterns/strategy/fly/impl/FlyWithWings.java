package com.learn.patterns.strategy.fly.impl;

import com.learn.patterns.strategy.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i am flying");
	}

}
