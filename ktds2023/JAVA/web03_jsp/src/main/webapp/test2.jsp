<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	ArrayList<String> list = new ArrayList<>();
	list.add("AAA");
	list.add("BBB");
	list.add("CCC");
	
	// 저장된 데이터 브라우저에 출력
	for (String s : list) {

		
%>
	
	s: <%= s %> <br>
<%
	} // end for
%>
</body>
</html>