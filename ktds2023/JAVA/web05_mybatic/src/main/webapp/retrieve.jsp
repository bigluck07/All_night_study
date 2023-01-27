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
<h1>부서 정보</h1>
<form action="DeptUpdateServlet"> <!-- ?deptno=${dto.deptno}" method="post" -->
부서번호:<input type="text" name="deptno" value="${dto.deptno}" readonly><br>
부서명:<input type="text" name="dname" value="${dto.dname}"><br>
부서위치:<input type="text" name="loc" value="${dto.loc}"><br>
<input type="submit" name="수정"><br>
</form>
<a href="DeptListServlet">부서목록</a>
<a href="DeptDeleteServlet?deptno=${dto.deptno}">삭제</a>



</body>
</html>





