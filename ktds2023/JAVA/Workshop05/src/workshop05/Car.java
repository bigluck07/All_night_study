package workshop05;

public class Car extends Vehicle {
	
	private double restOil;
	private int curWeight;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
		// TODO Auto-generated constructor stub
	}
	
	
	public void addOil(int oil) {
		if((restOil+oil) <= getOilTankSize()) {
			restOil+=oil;
		}
	}
	public void moving(int distance) {
		restOil-= (distance / getEfficiency());
	}
	public void addWeight(int weight) {
		if ( (curWeight+weight) <= getMaxWeight()) {
			curWeight+=weight;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+ "\t\t" + restOil + "\t\t" +curWeight ;
	}
	
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	
	

}
