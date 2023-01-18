package work05;

public class SportCar extends Vehicle  {


	public SportCar() {
		super();
	}

	public SportCar(String carName, String engine, int fuelSize, int distance) {
		super(carName, engine, fuelSize, distance);
	}


	@Override
	public double getMileage() {
		return 10.0;
	}

}
