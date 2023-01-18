package com.test06.entity;

public class Juice extends Drink {
	final int COFFEE_PRICE = 50;

	public Juice() {
		super.setPrice(COFFEE_PRICE);
	}

	@Override
	public String toString() {
		return "Juice\t\t"+ COFFEE_PRICE;
	}

	
	

	
}
