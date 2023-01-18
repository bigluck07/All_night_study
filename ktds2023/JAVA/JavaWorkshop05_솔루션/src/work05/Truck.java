package work05;

public class Truck extends Vehicle  {


	public Truck() {
		super();
	}

	public Truck(String carName, String engine, int fuelSize, int distance) {
		super(carName, engine, fuelSize, distance);
	}


	@Override
	public double getMileage() {
		return 15.0;
	}
}
