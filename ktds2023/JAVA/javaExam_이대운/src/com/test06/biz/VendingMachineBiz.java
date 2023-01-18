package com.test06.biz;

import java.net.http.HttpRequest.BodyPublisher;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Flow.Subscriber;

import com.test06.entity.Coffee;
import com.test06.entity.Drink;

public class VendingMachineBiz implements BodyPublisher {
	
	private int balance = 1000;
	private Drink[] cartList = new Drink[3];
	private int count;

	
	@Override
	public void subscribe(Subscriber<? super ByteBuffer> subscriber) {
		// TODO Auto-generated method stub

	}

	@Override
	public long contentLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public void cartDrink(Drink drink) { // 음료수 구매 로직을 구현하는 메서드
//		System.out.println(getBalance());
		String[] val = drink.toString().split("\t");
		if (getBalance()>=Integer.parseInt(val[1])) { // 살 수 있는 경우
			setBalance(getBalance()-Integer.parseInt(val[1]));
			if (val[0]=="Coffee") {
				System.out.println("커피를 구입했습니다.현재 잔액: "+getBalance()+" 원");
			} else if (val[0]=="Coke") {
				System.out.println("코크를 구입했습니다.현재 잔액: "+getBalance()+" 원");
			} else { 
				System.out.println("쥬스를 구입했습니다.현재 잔액: "+getBalance()+" 원");
			}
			if (/* 카트 자리가 있는지 확인하는 조건*/ ) {
				// 비었으면 넣기
			} else {
				
			}
		} else {									  // 살 수 없는 경우
			if (val[0]=="Coffee") {
				System.out.println("잔액이 부족하여 커피 구매 불가능합니다.");
			} else if (val[0]=="Coke") {
				System.out.println("잔액이 부족하여 코크 구매 불가능합니다.");
			} else { 
				System.out.println("잔액이 부족하여 쥬스 구매 불가능합니다.");
			}
		}

		
		
		
		
	}
	public void printCart() { //구매 목록 배열에 저장된 정보를 출력하는 메서드
	
	}
	public void printDrinkList(Drink[] drinkList) { //음료수 자판기내의 모든 음료수를 출력하는 메서드
	
		// drinkList 배열에 저장된 내용을 출력(음료수명은 한글로 출력)
		for (Drink drink : drinkList) {
			System.out.println(drink);
			
		}
		System.out.println(getBalance());
	}

	
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Drink[] getCartList() {
		return cartList;
	}

	public void setCartList(Drink[] cartList) {
		this.cartList = cartList;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
