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

<h2> JSTL </h2>
<h3>변수사용</h3>
<c:set value="${userid}" var="xxx"></c:set>

값1: ${ userid }<br>
값2: ${ xxx }<br>

<h3>값 출력</h3>
값1: <c:out value="${userid}"></c:out>

<h3>단일 조건문</h3>
	<c:if test="${userid == 'admin'}">
		${userid} 이 맞음<br>
	</c:if>
<h3>반복문</h3>
	<c:forEach begin="1" end="5">
		hello<br>
	</c:forEach>
	<br>
	<c:forEach var="x" begin="1" end="5">
		${x}: hello2<br>
	</c:forEach>
	<br>
	<c:forEach var="i" begin="1" end="5" step="2">
		${i}: hello3<br>
	</c:forEach>
	<br>
	<c:forEach var="j" items="${list}">
		${j}<br>
	</c:forEach>
	<c:forEach var="dto" items="${dtoList}">
		${dto.deptno},${dto.dname},${dto.loc}<br>
	</c:forEach>
<h3>반복문 추가정보</h3>
	<c:forEach var="dto" items="${dtoList}" varStatus="status">
		${status.index}/${status.count}:${dto.deptno},${dto.dname},${dto.loc}:${status.first}/${status.last}<br>
	</c:forEach>

</body>
</html>