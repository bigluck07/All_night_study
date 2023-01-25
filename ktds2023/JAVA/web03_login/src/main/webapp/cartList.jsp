<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>catrList</h2>
<%
	String userid = (String)session.getAttribute("user");
%>

안녕하세요<%= userid %><br>

사과<br>
배<br>

<a href="LogoutServlet">로그아웃</a><br>

</body>
</html>