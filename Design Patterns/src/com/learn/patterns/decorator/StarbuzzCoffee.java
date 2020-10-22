package com.learn.patterns.decorator;

import com.learn.patterns.decorator.abstracts.Beverage;
import com.learn.patterns.decorator.beverages.DarkRoast;
import com.learn.patterns.decorator.beverages.Espresso;
import com.learn.patterns.decorator.beverages.HouseBlend;
import com.learn.patterns.decorator.decorators.Mocha;
import com.learn.patterns.decorator.decorators.Soy;
import com.learn.patterns.decorator.decorators.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage bev = new Espresso();
		System.out.println(bev.getDescription() + " $" + bev.cost());

		Beverage bev2 = new DarkRoast();
		bev2 = new Mocha(bev2);
		bev2 = new Mocha(bev2);
		bev2 = new Whip(bev2);
		System.out.println(bev2.getDescription() + " $" + bev2.cost());

		Beverage bev3 = new HouseBlend();
		bev3 = new Soy(bev3);
		bev3 = new Mocha(bev3);
		bev3 = new Whip(bev3);
		System.out.println(bev3.getDescription() + " $" + bev3.cost());
	}

}
