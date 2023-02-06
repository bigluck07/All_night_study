<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript" src="jquery-3.6.3.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#idcheck").on("click", function(){
			event.preventDefault();
			var deptno = $("#deptno").val();
			
			$.ajax({
				type:"get",
				url:"idcheck", // 여기로 get방식으로 통해 들어감
				data:{		   // 이 데이터를 같이보냄
					deptno:deptno 
				},
				// 서버에서 응답하는 데이터 종류 지정 -> 정형화 되있음
				dataType:"text",
				success:function(responseData, status, xhr){
					console.log(responseData);
					$("#result").text(responseData);
				},
				error:function(xhr, status, error){
					console.log("error:", error);
				}
			});
		});
	});

	
	
</script>
</head>
<body>

<h2>목록추가</h2>
<form action="write">
부서번호:<input type="text" name="deptno" id="deptno">
<button id="idcheck">중복확인</button>
<div id="result"></div>
<br>
부서명:<input type="text" name="dname"><br>
부서위치:<input type="text" name="loc"><br>
<input type="submit" name="저장"><br>
</form>

</body>
</html>