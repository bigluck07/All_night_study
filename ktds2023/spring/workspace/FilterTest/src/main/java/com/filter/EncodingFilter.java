package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException { // chain을 연결해줘야 함
		
		System.out.println("EncodingFilter.doFilter");
		chain.doFilter(request, response); // 뒤에 올 servlet과 연결하는 코드
	}

}
