package workshop05;

public class Truck extends Car {

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	
	public double getEfficiency() {
		return super.getEfficiency() - ((getCurWeight() / 5) * 0.2);
	}
	public void moving(int distance) {
		setRestOil( getRestOil() - calcOil(distance) );
	}
	public double calcOil(int distance) {
		return distance/getEfficiency();
	}
	public int getCost(int distance) {
		return (int)(3000*(calcOil(distance)/1));
	}

	@Override
	public String toString() {
		return super.toString() + "\t\t" +getEfficiency();
	}
	
	
	

}
