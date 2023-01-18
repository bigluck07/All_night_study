package work05;

import java.util.Scanner;


public class VehicleTest {

	
	public static void main(String[] args) {

		VehicleBiz biz = new VehicleBiz();

		while (true) {
			printMenu();
			int inputMenu = getUserInput();
			if (inputMenu== 1) {
				printVehicleAll(biz.vehicleList() );
			} else if (inputMenu== 2) {
				biz.vehicleMove();
				printVehicleAll(biz.vehicleList());
			} else if (inputMenu== 3) {
				biz.vehicleAddFuel();
				printVehicleAll(biz.vehicleList());
			} else if(inputMenu== 9) {
				break;
			}else{
				System.out.println("잘못 입력하셨군요. 다시 입력하세요.");
			}
		}

		System.out.println("프로그램 종료");

	}// end main

	private static void printVehicleAll(Vehicle[] vehicles ) {
		System.out.println("---------------------------------------------");
		System.out.println("\t[전체 차량 정보보기]");
		System.out.println("---------------------------------------------");
		System.out.println("차종   \t출력(CC)\t연료(L)\t거리(km)\t연비(km/L)");
		System.out.println("---------------------------------------------");
		String warning = "";
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof Bus) {
				Bus bus = (Bus) vehicles[i];
				if (bus.getFuelSize() <= 0) {
					warning = "주유하세요.";
				}

				System.out.println(bus+ "\t" + bus.getMileage()+ "\t" + warning);
			} else if (vehicles[i] instanceof Truck) {
				Truck truck = (Truck) vehicles[i];
				if (truck.getFuelSize() <= 0) {
					warning = "주유하세요.";
				}
				System.out.println(truck+ "\t" + truck.getMileage()+ "\t" + warning);
			} else {
				SportCar sport = (SportCar) vehicles[i];
				if (sport.getFuelSize() <= 0) {
					warning = "주유하세요.";
				}
			/*	System.out.println(sport.getCarName() + "\t"
						+ sport.getEngine() + "\t"
						+ String.format("%.1f", sport.getFuelSize()) + "\t"
						+ sport.getDistance() + "\t" + sport.getMileage()
						+ "\t" + warning);*/
				System.out.println(sport+ "\t" + sport.getMileage()+ "\t" + warning);
			}
			System.out.println("---------------------------------------------");
		}// end for
	}

	private static int getUserInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	private static void printMenu() {
		System.out.println("============================");
		System.out.println("[차량 운행 시험 시스템]");
		System.out.println("============================");
		System.out.println("1.전체 차량 정보보기");
		System.out.println("2.차량 출발(10km단위)");
		System.out.println("3.차량 주유(10L단위)");
		System.out.println("9.종료");
		System.out.println("============================");
		System.out.print("메뉴 입력 => ");
	}

}// end class

