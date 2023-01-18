package com.test06.entity;

public class Coffee extends Drink {
	final int COFFEE_PRICE = 100;

	public Coffee() {
		super.setPrice(COFFEE_PRICE);
	}

	@Override
	public String toString() {
		return "Coffee\t\t"+ COFFEE_PRICE;
	}

	
	

	
}
