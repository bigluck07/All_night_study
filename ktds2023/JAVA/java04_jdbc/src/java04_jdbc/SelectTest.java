package java04_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.mariadb.jdbc.export.Prepare;

public class SelectTest {

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
		String sql = "select deptno as no, dname as name, loc from dept";
		
		//5. PreparedStatement ==> sql문 전송을 위한 객체
		PreparedStatement = con.prepareStatement(sql);
		
		//6. sql문 전송
		/*
		 * ArrayList에 저장해서 출력하시오
		 * 각각의 칼럼을 받으면 뽑기 어려움, 그래서 하나의 행을 저장할 수 있는 클래스를 만들어
		 * 해당 클래스를 arraylist에 누적하는게 좋음
		 */
//		ArrayList<Object> dept = new ArrayList<>();
		
		List<Dept> list = new ArrayList<>();
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int deptno = rs.getInt("no");
			String dname = rs.getString("name");
			String loc = rs.getString(3);
			Dept dept = new Dept(deptno, dname, loc);
//			System.out.println(deptno+"\t"+dname+"\t"+loc);
			// ArrayList 저장
			list.add(dept);
		}
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		//7. 자원반납 -> close();
			// Connection -> PreparedStatement -> ResultSet의 역순으로 닫기
		rs.close();
		pstmt.close();
		con.close();
		
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
