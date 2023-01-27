<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  JS 영역 -->
<script type="text/javascript">
	
	// undefined ==> 변수 선언 후 초기화 하지 않으면 'undefined'( null아님!! )
	
	//1. 함수 선언식
	function func1(n){
		console.log("func1", n); // 호출해야 실행
	}
	func1();
	func1(10);
	
	//2. default 파라미터
	function func2(n=1){
		console.log("func2", n); // 호출해야 실행
	}
	func2();
	func2(10);
	
	
</script>
<!--  JS 영역 -->
</head>
<body>
<h2>JS 변수</h2>
</body>
</html>