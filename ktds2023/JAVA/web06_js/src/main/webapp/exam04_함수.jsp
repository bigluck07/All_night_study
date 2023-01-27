<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  JS 영역 -->
<script type="text/javascript">
	
	//1. 함수 선언식
	function func1(){
		console.log("func1"); // 호출해야 실행
	}
	func1();
	
	//2. 함수 표현식(=lambda, 익명함수)
	var func2 = function(){
		console.log("func2");
	}
	func2();
	
	
</script>
<!--  JS 영역 -->
</head>
<body>
<h2>JS 변수</h2>
</body>
</html>