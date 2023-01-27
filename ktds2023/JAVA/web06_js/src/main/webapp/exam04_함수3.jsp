<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  JS 영역 -->
<script type="text/javascript">
	
	// 일급객체 - 함수를 데이터로 처리함
	/*
		1. 함수를 변수에 저장가능
		2. 함수를 함수의 리턴값으로 사용가능
		3. 함수 호출시 파라미터로 사용가능
	*/
	
	function func1(n){
		console.log("func1", n); // 호출해야 실행
	}
	
	//1. 변수에 저장
	var x = func1;
	x();
	
	//2. 함수를 함수의 리턴값으로 사용
	function func2(){
		return func1
	}
	var x2 = func2();
	x2();
	
	//3. 함수 호출시 파라미터로 사용
	function func3(f){
		f();
	}
	func3(func1);
	/*
		function 함수(){	}
		==> 함수 사용하는 방법 2가지
		가. 일반적인 방법
			함수 호출로 결과값 반환
			`함수()`
			
		나. 함수명만 사용
			함수명만 전달해서 이후 전달받은 곳에서 호출
			`var x = 함수();`
	*/
	
	
	
</script>
<!--  JS 영역 -->
</head>
<body>
<h2>JS 변수</h2>
</body>
</html>