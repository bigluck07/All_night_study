package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.DeptDTO;

// DAO: Data Access Object
// DB전담 클래스 일반적으로 테이블 당 한개씩 작성함
public class DeptDAO {

	//SQL + PreparedStatement + ResultSet
	public List<DeptDTO> select(Connection con) { // 서비스의 con을 넘겨줌
		List<DeptDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select deptno as no, dname as name, loc from dept";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("no");
				String dname = rs.getString("name");
				String loc = rs.getString(3);
				DeptDTO dept = new DeptDTO(deptno, dname, loc);
				list.add(dept);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt!=null) pstmt.close();
				if (rs!=null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//end select
		return list;
	}
}
