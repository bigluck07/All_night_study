<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인 화면:get</h1>
<form action="xxx" method="get">
  아이디: <input type="text" name="userid" value=""><br><br>
  비번: <input type="text" name="passwd" value=""><br><br>
  <input type="submit" value="로그인">
</form>

<h1>로그인 화면:post</h1>
<form action="xxx" method="post">
  아이디: <input type="text" name="userid" value=""><br><br>
  비번: <input type="text" name="passwd" value=""><br><br>
  <input type="submit" value="로그인">
</form>

<h1>체크박스 실습</h1>
<form action="yyy">
  야구<input type="checkbox" name="hobby" value="야구">
  농구<input type="checkbox" name="hobby" value="농구">
  축구<input type="checkbox" name="hobby" value="축구">
  <input type="submit" value="저장">
</form> 

</body>
</html>