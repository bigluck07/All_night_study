<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <!-- jquery 설치1 : 직접 다운로드 -->
<script type="text/javascript" src="jquery-3.6.3.min.js"></script>

<script type="text/javascript">
      $(document).ready(function(){
    	  //이벤트
    	  $("#xxx").on("click  mouseover", function(){
    		  console.log("jquery")
    	  });
      });
</script>
	
</head>
<body>
 <button onclick="fun()">OK</button>
 <button id="ok2">OK2</button>
 <button id="ok3">OK3</button>
 <button id="xxx">jquery</button>
 
 <script type="text/javascript">
 //javascript
   // DOM Level 0: 인라인
	function fun(){
	  console.log("OK"); 
    }
   // DOM Level 0: 고전방식
    document.querySelector("#ok2").onclick=function(){
    	 console.log("OK2"); 
   };
   // DOM Level 2
   document.querySelector("#ok3").addEventListener("click", function(){
	   console.log("OK3"); 
   });
   
</script>
</body>
</html>










