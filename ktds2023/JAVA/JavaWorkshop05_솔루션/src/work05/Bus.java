package work05;

public class Bus extends Vehicle {


	public Bus() {
		super();
	}

	public Bus(String carName, String engine, int fuelSize, int distance) {
		super(carName, engine, fuelSize, distance);
	}

	@Override
	public double getMileage() {
		return 20.0;
	}
}
