<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2> 로그인 </h2>
<form action="login">
	아이디:<input type="text" name="userid"><br>
	비밀번호:<input type="text" name="passwd"><br>
	<input type="submit" name="로그인"><br>
</form>

<h2> 로그인 멀티 </h2>
<form action="loginMulti">
	아이디:<input type="text" name="userid"><br>
	비밀번호:<input type="text" name="passwd"><br>
	취미:<br>
		<input type="checkbox" name="hobby" value="야구" > 야구 <br>
		<input type="checkbox" name="hobby" value="농구" > 농구 <br>
		<input type="checkbox" name="hobby" value="축구" > 축구 <br>
		
	<input type="submit" name="로그인"><br>
</form>

</body>
</html>