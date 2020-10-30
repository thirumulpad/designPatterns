package com.learn.patterns.factory.pizzas;

import com.learn.patterns.factory.abstracts.Pizza;

public class NYStlyeCheesePizza extends Pizza {

	public NYStlyeCheesePizza() {
		name = "New York Style Cheese Pizza";
		dough = "thin crust";
		sauce = "marinara sauce";
		toppings.add("Grated Reggiano Cheese");
	}

}
