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
<h1>목록보기</h1>
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
    <td>${board.no}</td>
    <td>${board.title}</td>
    <td>${board.author}</td>
    <td>${board.writeday}</td>
    <td>${board.readcnt}</td>
   </tr>
</c:forEach>   
</table>
<a href="writeForm">글작성</a>



</body>
</html>