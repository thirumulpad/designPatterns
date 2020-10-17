package com.learn.patterns.strategy.quack.impl;

import com.learn.patterns.strategy.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<< SILENCE >>");
	}

}
