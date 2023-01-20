package java04_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mariadb.jdbc.export.Prepare;

public class InsertTest {

	public static void main(String[] args) throws Exception {
		
		//1. 4가지 정보 설정 -> 웹이든 아닌든 항상 필요함
		String driver="org.mariadb.jdbc.Driver"; // jar 파일안 Driver 클래스명
		String url="jdbc:mariadb://localhost:3306/ktds";
		String userid="root";
		String passwd="1234";
		
		//2. 문자열로 된 드라이버 객체 생성
		Class.forName(driver);
		
		//3. 연결 (java.sql.Conection)
		Connection con = DriverManager.getConnection(url, userid, passwd);
		System.out.println(con);
		
		//4. SQL문 작성 ==> 반드시 sql문 마지막 ; 제거 필수!
		String sql = "insert into dept (deptno, dname, loc) values (?,?,?) "; // ?가 실제 다른값으로 치환됨
		
		//5. PreparedStatement ==> sql문 전송을 위한 객체
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		//5-1. ?대신 값으로 치환
		pstmt.setInt(1, 99); // (?위치(순서), 치환값(오라클은 2자리수 까지만))
		pstmt.setString(2, "개발"); // 
		pstmt.setString(3, "제주"); // 
		//JDBC의 DML은 autocommit => 명시적으로 autocommit 비활성화 가능
		
		//6. sql문 전송
		int n = pstmt.executeUpdate();
		System.out.println("적용된 행의 갯수: "+n);
		
		//7. 자원반납 -> close();
		// Connection -> PreparedStatement -> ResultSet의 역순으로 닫기
		pstmt.close();
		con.close();
		
		/*
		 *  1) ResultSet rs = pstmt(변수).executeUpdate();
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
