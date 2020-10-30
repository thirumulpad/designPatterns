package com.learn.patterns.factory.pizzastores;

import com.learn.patterns.factory.abstracts.Pizza;
import com.learn.patterns.factory.abstracts.PizzaStore;
import com.learn.patterns.factory.pizzas.NYStlyeCheesePizza;
import com.learn.patterns.factory.pizzas.NYStlyeVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equalsIgnoreCase("cheese")) {
			return new NYStlyeCheesePizza();
		}else if(type.equalsIgnoreCase("veggies")) {
			return new NYStlyeVeggiePizza();
		}
		return null;
	}

}
