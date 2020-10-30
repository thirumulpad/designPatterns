package com.learn.patterns.factory.pizzastores;

import com.learn.patterns.factory.abstracts.Pizza;
import com.learn.patterns.factory.abstracts.PizzaStore;
import com.learn.patterns.factory.pizzas.ChichagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equalsIgnoreCase("cheese")) {
			return new ChichagoStyleCheesePizza();
		}
		return null;
	}

}
