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

<h2>EL태그</h2>

값1: ${requestScope.a}<br>
값1: ${sessionScope.a}<br>
값1: ${applicationScope.a}<br>


</body>
</html>