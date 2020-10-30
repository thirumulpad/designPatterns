package com.learn.patterns.factory.abstracts;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<String>();

	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing " + dough);
		System.out.println("Adding " + sauce);
		System.out.println("Adding toppings");
		for (String string : toppings) {
			System.out.println(" " + string);
		}
	}

	void bake() {
		System.out.println("Bake for 25 mins at 350");
	}

	protected void cut() {
		System.out.println("Cutting the pizza at diagnoal slices");
	}

	void box() {
		System.out.println("Place Pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
}
