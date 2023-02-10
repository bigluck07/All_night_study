<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="UTF-8">
  <title>Insert title here</title>

<script type="text/javascript">
   // JS에서 html 접근 ==> document.메서드(선택자);
   function init(){
     var p = document.querySelectorAll("p");
     console.log(p);
     console.log(p[0].innerText);
     console.log(p[1].innerText);
     
     var a = document.querySelector("a");
     console.log(a);
     console.log(a.innerText);
     console.log(a.href);
     
     var input = document.querySelector("#userid");
     console.log(input);
     console.log(input.value);
     
     var cls =  document.querySelectorAll(".x");
     console.log(cls);
     cls.forEach(function(v,idx,arr){
    	console.log(v.innerText); 
     });
   }
</script>
</head>
<body onload="init()">
 <p class="x">hello</p>
 <p>world</p>
 <a class="x" href="http://www.daum.net">daum</a>
 <input type="text" name="userid" id="userid" value="홍길동">
</body>
</html>










