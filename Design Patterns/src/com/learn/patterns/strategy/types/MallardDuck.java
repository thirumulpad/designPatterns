package com.learn.patterns.strategy.types;

import com.learn.patterns.strategy.Duck;
import com.learn.patterns.strategy.fly.impl.FlyWithWings;
import com.learn.patterns.strategy.quack.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flybehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a real Mallard Duck");
	}

}
