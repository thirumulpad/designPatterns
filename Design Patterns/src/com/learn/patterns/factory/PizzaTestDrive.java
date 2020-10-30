package com.learn.patterns.factory;

import com.learn.patterns.factory.abstracts.Pizza;
import com.learn.patterns.factory.abstracts.PizzaStore;
import com.learn.patterns.factory.pizzastores.ChicagoPizzaStore;
import com.learn.patterns.factory.pizzastores.NYPizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nystore = new NYPizzaStore();
		PizzaStore chicagostore = new ChicagoPizzaStore();

		Pizza pizza = nystore.orderPizza("veggies");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagostore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}

}
