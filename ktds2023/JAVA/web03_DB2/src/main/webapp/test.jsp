<%@page language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%! int kkk = 10;%>
<%
	int num = 10;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	Date d = new Date();
	ArrayList list = new ArrayList();
%>
홍길도num:<%= num %>
</body>
</html>