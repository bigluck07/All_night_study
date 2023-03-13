<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JS 영역 -->
<script type="text/javascript">
function win_close(){
	  opener.close(); // opener: 부모창
 }  
function win_self_close(){
	  window.close();  // window: 내 창
}  
</script>
<!-- JS 영역 -->
</head>
<body >
child.jsp<br>
<button onclick="win_close()">부모창닫기</button>
<button onclick="win_self_close()">내창닫기</button>
</body>
</html>





