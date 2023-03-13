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
    	  $("form").on("submit", function(){
    		  var id = $("#userid").val();
    		  if(id.length ==0){
    			alert("userid 필수");
    		    event.preventDefault();
    		  }
    	  });
      });
</script>
</head>
<body>
 <form action="child.jsp" method="get">
	아이디(*):<input type="text" name="userid" id="userid"><br>
	비번:<input type="text" name="passwd"><br>
	<input type="submit" value="로그인">
</form>
</body>
</html>










