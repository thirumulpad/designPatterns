package com.learn.patterns.strategy;

import com.learn.patterns.strategy.interfaces.FlyBehavior;
import com.learn.patterns.strategy.interfaces.QuackBehavior;

public abstract class Duck {

	// declare variables for behavior interfaces types
	protected FlyBehavior flybehavior;
	protected QuackBehavior quackBehavior;

	public abstract void display();

	public void performFly() {
		// delegate to behavior class.
		flybehavior.fly();
	}

	public void performQuack() {
		// delegate to behavior class.
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks Swim, even decoys");
	}

	public void setFlyBehavior(FlyBehavior fb) {
		flybehavior = fb;
	}

	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}
