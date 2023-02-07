<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>1. 이전방식</h2>
<a href="/app/soap?id=aaa&pw=1234">soap1</a>
<a href="/app/soap?id=bbb&pw=9876">soap2</a>
<h2>2. RESTful 방식</h2>
<a href="/app/rest/id/aaa/pw/1234">rest1</a>
<a href="/app/rest/id/bbb/pw/9876">rest2</a>
</body>
</html>