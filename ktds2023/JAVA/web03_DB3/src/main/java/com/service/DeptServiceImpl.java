package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.DeptDAO;
import com.dto.DeptDTO;

// 서비스 클래스: 실제는 인턴페이스를 같이 사용해야 함, 지금은 생략
// Connection 까지만 얻음. 나머지는 DAO에서 처리함
public class DeptServiceImpl {

	//1. 4가지 정보 설정
	String driver="org.mariadb.jdbc.Driver"; // jar 파일안 Driver 클래스명
	String url="jdbc:mariadb://localhost:3306/ktds";
	String userid="root";
	String passwd="1234";
	
	//생성자
	public DeptServiceImpl() {
		//2. 문자열로 된 드라이버 객체 생성
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end 생성자
	
	// 메서드
	public List<DeptDTO> select(Connection con) {
		//3. 연결 (java.sql.Conection)
		List<DeptDTO> list = null;
//		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
		
			// DAO연동
			DeptDAO dao = new DeptDAO();
			list = dao.select(con);

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}//end select
	public void insert() {
		
		
	}
}
