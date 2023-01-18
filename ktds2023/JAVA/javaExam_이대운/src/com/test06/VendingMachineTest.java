package com.test06;

import java.util.HashMap;

import com.test05.Employee;
import com.test05.Secretary;
import com.test06.biz.VendingMachineBiz;
import com.test06.entity.Coffee;
import com.test06.entity.Drink;

public class VendingMachineTest {

	public static void main(String[] args) {
		
		HashMap<String, Object> menu = new HashMap<>( );
		menu.put("coffee", new Coffee());
		menu.put("juice", new Coffee());
		menu.put("coke", new Coffee());
		System.out.println(menu.get("coffee"));
		
		VendingMachineBiz v = new VendingMachineBiz();
//		v.cartDrink(cfe);
		

	}
	
//	private void printMenu() {
//		for 
//			
//		}
//	}

}
