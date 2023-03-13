<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JS 영역 -->
<script type="text/javascript">
     function fun1(){
       console.log("fun1");	
     }
     function fun2(){
         console.log("fun2");	
       }
</script>
<!-- JS 영역 -->
</head>
<body onload="fun1()">
<h2>JS 이벤트 처리</h2>
<button onclick="fun1()" >fun1 호출</button><br>
아이디:<input type="text" name="userid"  onkeyup="fun2()"><br>
<select name="searchName" onchange="fun1()">
   	       <option value="dname">부서명</option>
   	       <option value="loc">부서위치</option>
</select>
</body>
</html>





