package com.test04;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		// TODO Auto-generated constructor stub
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		// 일정양의 연료 주입, 기존 연료가 증가됨
		this.fuelSize+=fuel;
	}
	public abstract void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	
}
