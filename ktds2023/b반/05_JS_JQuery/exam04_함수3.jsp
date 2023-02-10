<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JS 영역 -->
<script type="text/javascript">
	
	// 일급객체 ==> 함수를 데이터로 처리함.
	/*
	   1.  함수를 변수에 저장
	   2.  함수를 함수의 리턴값으로 사용.
	   3.  함수를 함수 호출시 파라미터로 사용
	*/
   
     function fun1(n){
       console.log("fun1", n);	
     }
	 //var fun1 = function(){};
  
	 //1.변수에 저장
	 var x = fun1;
     x();  
     
     //2. 함수를 함수의 리턴값으로 사용.
     function fun2(){
    	 return fun1;
     }
     var x2 = fun2();
     x2(); 
     
     //3.  함수를 함수 호출시 파라미터로 사용
     function fun3(f){
    	 f();
     }
     
     fun3(fun1);
     
     /*
        function  함수(){}
     
        ==> 함수 사용하는 방법 2가지
         가. 일반적인 방법
           ==> 함수 호출해서 동작시켜서 결과값 반환
           ==> 함수();
           
         나. 함수 이름만 사용
           ==> 함수이름만 전달해서 나중에 전달받은 곳에서 호출해서 사용
           ==> var x = 함수;
     */ 
     
	
</script>
<!-- JS 영역 -->
</head>
<body>
<h2>JS 함수</h2>
</body>
</html>





