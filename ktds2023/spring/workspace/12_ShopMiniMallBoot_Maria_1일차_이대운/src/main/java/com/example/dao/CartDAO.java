package com.example.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.dto.CartDTO;
import com.example.dto.OrderDTO;

@Repository
public class CartDAO {

	public int orderAllDone(List<OrderDTO> x) {
		/*
		 * 
		 */
		return 0;
	}
	
	public List<CartDTO> orderAllConfirm(List<String> list) {
		/*
		 * 
		 */
		return null;
	}
	
	public int orderDone(OrderDTO dto) {
		/*
		 * 
		 */
		return 0;
	}
	
	public CartDTO cartbyNum(String num) {
		/*
		 * 
		 */
		return null;
	}
	
	public int cartAllDel(List<String> list) {
		/*
		 * 
		 */
		return 0;
	}
	
	public int cartDel( int num) {
		/*
		 * 
		 */
		return 0;
	}
	
	public int cartUpdate( Map<String, Integer> map) {
		/*
		 * 
		 */
		return 0;
	}
	public int cartAdd(CartDTO dto) {
		/*
		 * 
		 */
		return 0;
	}

	public List<CartDTO> cartList(String userid) {
		/*
		 * 
		 */
		return null;
	}
}
