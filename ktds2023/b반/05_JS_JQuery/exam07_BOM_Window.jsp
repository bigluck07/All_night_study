<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
<!-- JS 영역 -->
  <script type="text/javascript">

    // BOM의 Window 객체
      var child;
   function win_open(){
    	child = window.open("child.jsp","width=200,height=200");
    }
   function win_close(){
	  child.close(); 
   }  
    
     
</script>
<!-- JS 영역 -->
  </head>
 <body>
  <button onclick="win_open()">새로운창열기</button>
  <button onclick="win_close()">새로운창닫기</button>
</body>
</html>





