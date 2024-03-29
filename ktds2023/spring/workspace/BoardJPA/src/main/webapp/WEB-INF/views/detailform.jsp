<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC 게시판</title>
<style type="text/css">
h2 {
	text-align: center;
}
table {
	margin: auto;
	width: 450px;
}
.td_left {
	width: 150px;
	background: orange;
}
.td_right {
	width: 300px;
	background: skyblue;
}
#commandCell {
	text-align: center;
}
</style>
</head>
<body>
	<!-- 게시판 등록 -->

	<section id="./writeForm">
		<h2>게시판글상세</h2>
		<form action="/boardmoify" method="post">
		<input type="hidden" name="num" value="${article.num}"/>
			<table>
				<tr>
					<td class="td_left"><label for="writer">글쓴이</label></td>
					<td class="td_right"><input type="text" name="writer"
						id="writer" readonly="readonly" value="${article.writer}"/></td>
				</tr>
				<tr>
					<td class="td_left"><label for="subject">제 목</label></td>
					<td class="td_right"><input name="subject" type="text"
						id="subject" value="${article.subject }"/></td>
				</tr>
				<tr>
					<td class="td_left"><label for="content">내 용</label></td>
					<td><textarea id="content" name="content"
							cols="40" rows="15" >${article.content }</textarea></td>
				</tr>
				<c:if test="${article.filename !=null}">
				<tr>
					<td class="td_left"><label for="content">이미지</label></td>
					<td><img src="/image/${article.filename }" width="100px" height="100px"/></td>
				</tr>
				</c:if>				
			</table>
			<section id="commandCell">
				<input type="submit" value="수정">&nbsp;&nbsp; 
				<a href="./">목록</a>
			</section>
		</form>
	</section>
	<!-- 게시판 등록 -->
</body>
</html>