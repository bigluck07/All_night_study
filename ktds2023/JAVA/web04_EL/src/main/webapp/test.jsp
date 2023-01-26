<%@page import="java.util.List"%>
<%@page import="com.dto.DeptDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>jsp태그</h2>
<% 
	String a = (String)request.getAttribute("a");
	String xxx = (String)request.getAttribute("xxx");
	
	DeptDTO dto = (DeptDTO)request.getAttribute("dto");
	int deptno = dto.getDeptno();
	
	List<DeptDTO> list = (List<DeptDTO>)request.getAttribute("list");
%>
값1: <%= a %><br>
값2: <%= xxx %><br>

deptno: <%= deptno %><br>
dname: <%= dto.getDname() %><br>
loc: <%= dto.getLoc() %><br>

<%
	for(DeptDTO dept: list) {
%>
	<%= dept.getDeptno() %>,<%= dept.getDname() %><br>
<% 	
	} // end for
%>


<h2>EL태그</h2>
값: ${3}<br>
값: ${3+1}<br>
값: ${3>2}<br>
값: ${3>2 && 2==2}<br>
값: ${3>2 || 2==2}<br>
<br>
값1: ${a}<br>
값2: ${xxx}<br>
값3(값 존재 여부 확인): ${empty xxx}${empty a}<br>
<br>
deptno: ${ dto.deptno}<br>
dname: ${dto.dname }<br>
loc: ${dto.loc }<br>
<br>
list
${list[0]}<br>
${list[0].deptno},${list[0].dname},${list[0].loc}<br>
${list[1].deptno},${list[1].dname},${list[1].loc}<br>
${list[2].deptno},${list[2].dname},${list[2].loc}<br>

</body>
</html>