package work05;



public class VehicleBiz implements  IVehicleBiz {

	private Vehicle[] vehicles;

	public VehicleBiz() {
		vehicles = new Vehicle[] { 
				new Bus("버스", "10000", 10, 0 ),
				new Truck("트럭", "5000", 10, 0 ),
				new SportCar("스포츠카", "3000", 10, 0) };
	}

	public Vehicle[] vehicleList() {
		return vehicles;
	}


	public void vehicleMove() {
		
		int km = 10;
		System.out.println(">>>>"+km+"km 를 이동했습니다.");
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof Bus) {
			
				Bus bus = (Bus) vehicles[i];
				if(bus.getFuelSize()>0){
					bus.setDistance(bus.getDistance()+km);
					bus.setFuelSize(bus.getFuelSize()-(km/bus.getMileage())>0?bus.getFuelSize()-(km/bus.getMileage()):0);
				}else {
					bus.setFuelSize(0);
				}
			} else if (vehicles[i] instanceof Truck) {
				Truck truck = (Truck) vehicles[i];
				if(truck.getFuelSize()>0){
					truck.setDistance(truck.getDistance()+km);
					truck.setFuelSize(truck.getFuelSize()-(km/truck.getMileage())>0?truck.getFuelSize()-(km/truck.getMileage()):0);
				}else {
					truck.setFuelSize(0);
				}
			} else {
				SportCar sport = (SportCar) vehicles[i];
				if(sport.getFuelSize()>0){
					sport.setDistance(sport.getDistance()+km);
					sport.setFuelSize(sport.getFuelSize()-(km/sport.getMileage())>0?sport.getFuelSize()-(km/sport.getMileage()):0);
				}else {
					sport.setFuelSize(0);
				}
			}
		}
	}
	
	public void vehicleAddFuel() {
		int L = 10;
		System.out.println(">>>>"+L+"L 를 주유했습니다.");
		for (int i = 0; i < vehicles.length; i++) {
			vehicles[i].setFuelSize(vehicles[i].getFuelSize()+L);
		}
	}


}
