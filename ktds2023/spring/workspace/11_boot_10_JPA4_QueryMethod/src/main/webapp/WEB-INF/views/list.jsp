<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>목록</h2>
<table border="1">
	<tr>
		<th>부서번호</th>
		<th>부서명</th>
		<th>부서위치</th>
	</tr>
	
<c:forEach var="dto" items="${list}">
	<tr>
		<td>${dto.deptno}</td>
		<td><a href="retrieve/${dto.deptno}">${dto.dname}</a></td>
		<td>${dto.loc}</td>
	</tr>
</c:forEach>
</table>
<a href="writeForm">부서등록</a>

</body>
</html>