<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 설정</title>
</head>
<body>
<b>[ 티켓 예매 정보 입력 ]</b><hr/>
[ 티켓 구매일 기준 : 미성년자 - 19세 미만, 경로자 : 만 60세 이상]
<form action="reserveTicket" method="post">
<table border="1">
<tr>
<th>구매관련안내</th>
<td>생년월일을 기준으로 구매일 기준 할인율은 다음과 같습니다.<br/> 미성년자(40%), 성인(10%), 경로우대(50%)</td>
</tr>
<tr>
	<th>생년월일</th>
	<td><input type="text" name="birthday"></input>  [ 입력 예 : 2015/01/05 ]</td>
</tr>
<tr>
	<th>티켓선택</th>
	<td>
		<input type="radio" name="type" value="20000"/>일반(20,000)
		<input type="radio" name="type" value="30000"/>로열(30,000)
		<input type="radio" name="type" value="50000"/>VIP(50,000)
	</td>
</tr>
<tr>
	<th colspan="2">
		<input type="submit" value="예약하기"></input>
		<input type="reset" value="다시입력"></input>
	</th>
</tr>
</table>
</form>
</body>
</html>