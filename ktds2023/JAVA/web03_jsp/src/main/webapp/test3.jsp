<%@page language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	// 사용자 입력 데이터 얻기
	// request.getParameter(key) - 단일값
	// request.getParameterValues
	
	String mesg = "hello";

	// JSP에서 다음 변수는 그냥 사용 가능.
	out.print(request);
	out.print(response);
	out.print(session);
	out.print(application);
	out.print(config);
	out.print(out);
	
	// 코드로 브라우저에 값을 출력
	out.print(mesg);
%>
<%= mesg %>

</body>
</html>