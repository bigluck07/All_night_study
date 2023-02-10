<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JS 영역 -->
<script type="text/javascript">

    // BOM의 Location 객체
    
     console.log(location);
     console.log(window.location);
     
     function go(){
    	 location.href="http://www.google.com";
     }
     
</script>
<!-- JS 영역 -->
</head>
<body>
<button onclick="go()">google</button>
</body>
</html>





