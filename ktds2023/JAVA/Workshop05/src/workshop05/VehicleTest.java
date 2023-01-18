package workshop05;

public class VehicleTest {

	public static void main(String[] args) {
		
		Truck car = new Truck(1000, 100, 5);
		
		System.out.println("최대적재중량 \t 오일탱크크기 \t 잔여오일량 \t 현재적재중량 \t 연비");
		System.out.println("=========================================================================");
//		System.out.println(car.getMaxWeight()+"\t"+car.getOilTankSize()+"\t"+car.getRestOil()+"\t"+car.getCurWeight()+"\t"+car.getEfficiency());
		System.out.println(car);
		// 50L 주유 후 트럭의 정보를 출력한다.
		car.addOil(50);		
		System.out.println();
		System.out.println("50L 주유 후");
		System.out.println(car);
		// 50Km 주행 후 트럭의 정보를 출력한다.
		car.moving(50);		
		System.out.println();
		System.out.println("50Km 주행 후");
		System.out.println(car);
		// 100Kg을 적재한 후 트럭의 정보를 출력한다.
		car.addWeight(100);		
		System.out.println();
		System.out.println("100Kg 적재 후");
		System.out.println(car);
		// 30Km 주행 후 트럭의 정보를 출력한다.
		car.moving(30);		
		System.out.println();
		System.out.println("30Km 주행 후");
		System.out.println(car);
		// 100Kg을 탑재하고 30Km를 주행하면 요금이 얼마인지 출력한다.
		System.out.println();
		System.out.println("요금 : "+car.getCost(30)+"원");
		
//		// 30Km 운행 시 요금을 계산한다. 답이랑 문제랑 같은지 확인할 것
//        System.out.println();
//        System.out.println("요금 : " + car.getCost(30) + "원");
	}
}
