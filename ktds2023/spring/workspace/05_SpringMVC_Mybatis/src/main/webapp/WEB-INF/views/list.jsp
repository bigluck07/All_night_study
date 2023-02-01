<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/test.js"></script>
</head>
<body>
<h1> 목록보기 </h1>
<img src="images/고양이_나이1.jpg" width="100" height="100">
<link rel="stylesheet" href="css/test.css" type="text/css">
<p>Hello<p>
<button onclick="go()">click</button>
<table border="1">
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일</th>
		<th>조회수</th>
	</tr>

<c:forEach var="board" items="${boardList}">
	<tr>
		<th>${board.no}</th>
		<th>${board.title}</th>
		<th>${board.author}</th>
		<th>${board.writeday}</th>
		<th>${board.readcnt}</th>
	</tr>
</c:forEach>
</table>
<a href="writeForm">글작성</a> <!-- 요청매핑 값 -->
</body>
</html>
