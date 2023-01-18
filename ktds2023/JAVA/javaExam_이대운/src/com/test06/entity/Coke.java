package com.test06.entity;

public class Coke extends Drink {
	final int COFFEE_PRICE = 200;

	public Coke() {
		super.setPrice(COFFEE_PRICE);
	}

	@Override
	public String toString() {
		return "Coke\t\t"+ COFFEE_PRICE;
	}

	
	

	
}
