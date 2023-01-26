<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약정보</title>
</head>
<body>

<h3>예약정보</h3>
<hr>
<b>입력한 생년월일: ${birthday}</b>
<b>선택한 티겟:${type}</b>
<br>
나이:${userage}세<br> 
<c:if test="${userage<19}">
	등급: 미성년자<br> 
	할인 적용 금액: ${type*0.4}원<br> 
	지불금액:${type-(type*0.4)}원<br>
</c:if>
<c:if test="${60>=userage && userage>=19}">
	등급: 성인<br> 
	할인 적용 금액: ${type*0.1}원<br>  
	지불금액: ${type-(type*0.4)}원<br>
</c:if>
<c:if test="${60<userage}">
	등급: 미성년자<br> 
	할인 적용 금액: ${type*0.5}원<br> 
	지불금액:${type-(type*0.4)}원<br>		
			
</c:if>
 
</body>
</html>