package work05;


public abstract class Vehicle {

	private String carName; // 자동차이름
	private String engine; // 자동차 배기량
	private double fuelSize; // 현재 주유된 연료양
	private int distance; // 주행 거리

	public Vehicle(String carName, String engine, int fuelSize, int distance) {
		super();
		this.carName = carName;
		this.engine = engine;
		this.fuelSize = fuelSize;
		this.distance = distance;
	}
	
	//연비 구하기
	public abstract double getMileage();
	
	public Vehicle() {
		super();
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public double getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(double fuelSize) {
		this.fuelSize = fuelSize;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return carName+"\t"+engine+"\t"+String.format("%.1f", fuelSize)+"\t"+distance;
	}


}
