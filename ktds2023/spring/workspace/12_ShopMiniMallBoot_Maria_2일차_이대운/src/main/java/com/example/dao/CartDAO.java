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
	
	@Autowired
	SqlSessionTemplate template;
	
	public int orderAllDone(List<OrderDTO> x) {
		/*
		 * 
		 */
		return 0;
	}
	
	public List<CartDTO> orderAllConfirm(List<String> list) {
		return template.selectList("CartMapper.orderAllConfirm",list);
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
		return template.delete("CartMapper.cartDel", num);
	}
	
	public int cartUpdate( Map<String, Integer> map) {
		return template.update("CartMapper.cartUpdate", map);
	}
	public int cartAdd(CartDTO dto) {
		return template.insert("CartMapper.cartAdd", dto);
	}

	public List<CartDTO> cartList(String userid) {
		return template.selectList("cartList", userid);
	}
}
