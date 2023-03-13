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

	//window.onload 역할
	$(document).ready(function(){
	    var p = $("p");
	    console.log(p);
	    var a = $("a");
	    console.log(a);
	    console.log(a.text());
	    console.log(a.attr("href"));
	    
	    var id = $("#userid");
	    console.log(id.val())
	    
	    var cls = $(".x");
	 	$.each(cls, function(idx,v){
	 		console.log(idx, v, v.innerText);
	 	});
	 	
	});


</script>
</head>
<body>
 <p class="x">hello</p>
 <p>world</p>
 <a class="x" href="http://www.daum.net">daum</a>
 <input type="text" name="userid" id="userid" value="홍길동">
</body>
</html>










