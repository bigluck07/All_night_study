<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

    function del(deptno){
    	location.href="/app/delete?deptno="+deptno
    }
</script>
</head>
<body>
<h2>자세히보기</h2>
<form action="/app/update">
부서번호:<input type="text" name="deptno" value="${retrieve.deptno}" id="deptno" readonly="readonly"><br> 
부서명:<input type="text" name="dname" value="${retrieve.dname}"><br> 
부서위치:<input type="text" name="loc" value="${retrieve.loc}"><br>
 <input type="submit" value="수정"> 
</form>
<button onclick="del(${retrieve.deptno})">삭제</button>

</body>
</html>


