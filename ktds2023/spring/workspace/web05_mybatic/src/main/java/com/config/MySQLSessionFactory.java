package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySQLSessionFactory {
	static SqlSessionFactory sqlSessionFactory;
	static { // 무조건 실행하는 블록
		String resource = "com/config/Configuration.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sqlSessionFactory = 
		new SqlSessionFactoryBuilder().build(inputStream);
		
		
	}//end static
	
	
	// service가 매우 쉽게 SqlSession 얻도록 메소드 추가
	public static SqlSession getsession() {
		
		return sqlSessionFactory.openSession();
	}

}//end class
