<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JS 영역 -->
<script type="text/javascript">
	
	// undefined ==> 변수선언하고 초기화하지 않으면 undefined 저장된다.  ( null 아님 )

    //1. 함수 선언식
     function fun1(n){
       console.log("fun1", n);	
     }
     fun1();
     fun1(10);
   
     //2. default 파라미터
     function fun2(n=1){
         console.log("fun2", n);	
       }
       fun2();
       fun2(10);
       
       
       
       
	
</script>
<!-- JS 영역 -->
</head>
<body>
<h2>JS 함수</h2>
</body>
</html>





