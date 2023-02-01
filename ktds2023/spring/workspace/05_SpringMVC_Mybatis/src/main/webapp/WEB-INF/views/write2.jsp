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
<h1>글쓰기 화면</h1>
<form action="write" method="post">
제목:<input type="text" name="title"><br>
작성자:<input type="text" name="author"><br>
내용:<textarea rows="5" cols="5" name="content"></textarea>
<input type="submit" value="작성">
</form>
<a href="list">목록보기</a>



</body>
</html>