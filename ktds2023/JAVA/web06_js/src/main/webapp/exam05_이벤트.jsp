<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  JS 영역 -->
<script type="text/javascript">

	function func1(){
		console.log("func1"); // 호출해야 실행
	}
	function func2(){
		console.log("func2"); // 호출해야 실행
	}

</script>
<!--  JS 영역 -->
</head>
<body onload="func1()">
<h2>JS 이벤트 처리</h2>
<button onclick="func1()">func1 호출</button><br>
아이디: <input type="test" name="userid" onkeyup="func2()">

<select name="searchName" onchange="func1()">
	<option value="dname">부서명</option>
	<option value="loc">부서위치</option>
</select>
</body>
</html>