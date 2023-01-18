package com.test04;

public class PlaneTest {

	public static void main(String[] args) {
		
		// Airplane과 Cargoplane 객체생성
		Plane ap = new Airplane("L777", 1000);
		Plane cp = new Cargoplane("C50", 1000);
		
		// 생성된 객체의 정보 출력
		System.out.println("Plane\tfuelSize");
		System.out.println("--------------------");
		System.out.println(ap.getPlaneName()+"\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t"+cp.getFuelSize());
		
		// Airplane과 Cargoplane 객체에 100씩 운항
		System.out.println("100\t운항");
		ap.flight(100);
		cp.flight(100);
		
		// 운항후 객체의 변경된 정보 출력
		System.out.println("");
		System.out.println("Plane\tfuelSize");
		System.out.println("--------------------");
		System.out.println(ap.getPlaneName()+"\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t"+cp.getFuelSize());
		// Airplane과 Cargoplane 객체에 200씩 주유
		System.out.println("200\t주유");
		ap.refuel(200);
		cp.refuel(200);
		// 주유후 객체의 변경된 정보 출력
		System.out.println("");
		System.out.println("Plane\tfuelSize");
		System.out.println("--------------------");
		System.out.println(ap.getPlaneName()+"\t"+ap.getFuelSize());
		System.out.println(cp.getPlaneName()+"\t"+cp.getFuelSize());
	}

}
