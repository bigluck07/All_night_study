<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JS 영역 -->
<script type="text/javascript">
	/*
	    JS는 변수 선언시 데이터타입 지정 안함. 
	    var 변수명;
	
	    let 변수명; //권장
	*/
	 
	let name = "홍길동";
	let age = 20;
	let height = 186.33;
	let isMarried = true;
	
	// 함수를 변수에 저장 가능하다. ( 일급객체)
	let fun = function(){};
	
	//브라우저 콘솔에 출력
	console.log(name);
	console.log(age);
	console.log(height);
	console.log(isMarried);
	console.log(fun);
	
</script>
<!-- JS 영역 -->
</head>
<body>
<h2>JS 변수</h2>
</body>
</html>