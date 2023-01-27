<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  JS 영역 -->
<script type="text/javascript">
	/*	
		- JS 변수생성 시 데이터타입 지정x
		var 변수명;
		let 변수명; // 권장!
	*/
	
	let name = "홍길동";
	let age = 20;
	let hight = 186.33;
	let isMarried = true;
	
	// 함수를 변수에 저장할 수 있음(= 일급객체)
	let fun = function(){};
	
	// 출력방법
	 // 브라우저의 console에 출력
	console.log(name);
	console.log(age);
	console.log(hight);
	console.log(isMarried);
		
</script>
<!--  JS 영역 -->
</head>
<body>
<h2>JS 변수</h2>
</body>
</html>