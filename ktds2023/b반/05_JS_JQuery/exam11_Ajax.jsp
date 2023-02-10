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
    	
    	   $("#idcheck").on("click", function(){
    		   /*
    		      Ajax
    		   */
    		   var userid = $("#userid").val();
    		   $.ajax({
    			   type:"get",
    			   url:"idcheck.jsp",
    			   data:{
    				   //userid:userid
    				   userid:$("#userid").val() // 서버에서는 request.getParameter("userid")
    			   },
    			   //서버에서 응답하는 데이터 종류 지정
    			   dataType:"text",
    			   success:function(responseData, status, xhr){
    				   console.log(responseData);
    				   $("#result").text(responseData);
    			   },
    			   error:function(xhr, status, error){
    				   console.log("error:", error);
    			   }
    		   });
    		   
    		   event.preventDefault();
    	   });
      });
</script>
</head>
<body>
 <form action="child.jsp" method="get">
	아이디(*):<input type="text" name="userid" id="userid">
	<button id="idcheck">중복확인</button>
	<div id="result"></div>
	<br>
	비번:<input type="text" name="passwd"><br>
	<input type="submit" value="로그인">
	
	<!-- type="button" 은 서브밋 안됨 -->
	<input type="button" value="로그인2">
</form>
</body>
</html>










