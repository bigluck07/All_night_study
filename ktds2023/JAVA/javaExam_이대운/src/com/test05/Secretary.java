package com.test05;

public class Secretary extends Employee implements Bonus {
	
	public Secretary() {
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void incentive(int pay) {
		setSalary(getSalary()+(pay/12));
	}

	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return (getSalary()*0.1);
	}

	

}
