package java04_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mariadb.jdbc.export.Prepare;

public class SelectTest3_exception {

	public static void main(String[] args) {
		
		//1. 4가지 정보 설정 -> 웹이든 아닌든 항상 필요함
		String driver="org.mariadb.jdbc.Driver"; // jar 파일안 Driver 클래스명
		String url="jdbc:mariadb://localhost:3306/ktds";
		String userid="root";
		String passwd="1234";
		
		//2. 문자열로 된 드라이버 객체 생성
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3. 연결 (java.sql.Conection)
		Connection con=null; // 로컬변수임 초기화 안하면 에러남
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select deptno as no, dname as name, loc from dept";

		try {
			con = DriverManager.getConnection(url, userid, passwd);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("no");
				String dname = rs.getString("name");
				String loc = rs.getString(3);
				System.out.println(deptno+"\t"+dname+"\t"+loc);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//7. 자원반납 -> close();
			try {
				if (rs!=null) rs.close();
				if (pstmt!=null) pstmt.close();
				if (con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // end finally
		System.out.println("END");


		
		/*
		 *  1) ResultSet rs = pstmt(변수).executeQuery();
		 *  	- 문장이 select라면 executeQuery
		 *  
		 *  	리턴값 rs는 select처리된 테이블의 객체화(class).
		 *  
		 *  2) int n = pstmt.excuteUpdate();
		 *  	- 문장이 select가 아니라면 excuteUpdate
		 *  	- insert
		 *  	- delete
		 *  	- update
		 *  
		 *  	리턴값 n은 DML처리된 행의 갯수가 저장된다.
		 */
		
		
	} // end main
} // end class
