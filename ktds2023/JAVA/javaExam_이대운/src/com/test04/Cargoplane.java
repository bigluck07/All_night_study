package com.test04;

public class Cargoplane extends Plane {

	
	public Cargoplane() {
		// TODO Auto-generated constructor stub
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void flight(int distance) {
		setFuelSize( getFuelSize()-((distance/10)*50));
	}

}
