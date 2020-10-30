package com.learn.patterns.factory.pizzas;

import com.learn.patterns.factory.abstracts.Pizza;

public class ChichagoStyleCheesePizza extends Pizza {

	public ChichagoStyleCheesePizza() {
		name = "Chicago Style Deep Dish Pizza";
		dough = "extra thick crust";
		sauce = "plum tomato sauce";
		toppings.add("Shredded Mozarella Cheese");
	}

	protected void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
