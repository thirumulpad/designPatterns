package com.learn.patterns.singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

	// private static ChocolateBoiler uniqueInstance;

	// threadsafe approach
	public volatile static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			//double checked locking
			// check for a instance and if there isn't one enter synchronized block
			synchronized (ChocolateBoiler.class) {
				//once in the block, check again and if still null create one.
				if(uniqueInstance==null)
					uniqueInstance = new ChocolateBoiler();
			}
		}
		return uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
