<%@page import="com.dto.DeptDTO"%>
<%@page import="java.util.List"%>
<%@page language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  서블릿에서 저장한 list 얻기 html주석 --> 
<%-- jsp 주석
<% int num = 1;%>

--%>
<%
	List<DeptDTO> list = (List<DeptDTO>)request.getAttribute("list");
%>

<table>
	<tr>
		<th>부서번호</th>
		<th>부서명</th>
		<th>위치</th>
	</tr>
	
<%
	for (DeptDTO dto : list) {
		int deptno = dto.getDeptno();
%>
	<tr>
		<td><%= deptno%></td>
		<td><%= dto.getDname()%></td>
		<td><%= dto.getLoc()%></td>
	</tr>
<%
	}//end for
%>
</table>
</body>
</html>