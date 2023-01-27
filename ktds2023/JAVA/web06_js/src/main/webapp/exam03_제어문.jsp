<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  JS 영역 -->
<script type="text/javascript">
	
	// 배열
	let n = [1,2,3,4,5];
	
	console.log(n[0], n[1]);

	console.log("");
	
	// 반복문
	for(var x of n){ // of는 값 값
		console.log(x);
	}
	
	for(var x in n){ // in은 인덱스값
		console.log(x);
	}
	
	
</script>
<!--  JS 영역 -->
</head>
<body>
<h2>JS 변수</h2>
</body>
</html>