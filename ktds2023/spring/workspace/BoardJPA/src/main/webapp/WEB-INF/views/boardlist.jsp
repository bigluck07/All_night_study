<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring 게시판</title>
<style type="text/css">
h3,h5 { text-align: center; }
table { margin: auto; width: 800px }
#tr_top { background: orange; text-align: center; }
#emptyArea { margin: auto; width: 800px; text-align: center; }
</style>
</head>
<body>
<img src="/upload/logo.png"/>
<h3>글 목록 &nbsp;&nbsp;<a href="./writeform">글쓰기</a></h3>
<form action="./search" method="post">					
<h5>
	<select name="type">
		<option value="subject">제목</option>
		<option value="writer">작성자</option>
		<option value="content">내용</option>
	</select>
	<input type="text" name="word"/>
	<input type="submit" value="검색"/>
</h5>
</form>					
<c:choose>
	<c:when test="${boards !=null}">
		<table>
			<tr id="tr_top"><th>번호</th><th>제목</th><th>작성자</th><th>날짜</th><th>조회수</th><td>삭제</td></tr>
			<c:forEach items="${boards }" var="article">
				<tr>
					<td>${article.num }</td>
					<td><a href="./detail/${article.num }">${article.subject }</a></td>
					<td>${article.writer }</td>
					<td>${article.regdate }</td>
					<td>${article.readcnt }</td>
					<td><a href="./delete/${article.num }">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<section id="emptyArea">등록된 글이 없습니다.</section>
	</c:otherwise>
</c:choose>

</body>
</html>