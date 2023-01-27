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
<h1>부서 목록</h1>
<table border="1">
	<!-- 검색 -->
	<tr>
		<td colspan="3">
			<form action="DeptSearchServlet">
				<select name="searchName">
					<option value="dname">부서명</option>
					<option value="loc">부서위치</option>
				</select>
				<input type="text" name="searchValue">
				<input type="submit" value="검색">
			</form>
		</td>
	</tr>
	<!-- 검색 -->
	<tr>
		<th>부서번호</th>
		<th>부서명</th>
		<th>위치</th>
	</tr>
<c:forEach var="dto" items="${deptList}">
	<tr>
		<td>${dto.deptno}</td>
		<td><a href ="DeptRetrieveServlet?deptno=${dto.deptno}">${dto.dname}</a></td>
		<td>${dto.loc}</td>
	</tr>
</c:forEach>
</table>
<a href="DeptWriteFormServlet">부서등록</a>



</body>
</html>




