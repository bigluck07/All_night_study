<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
  <meta charset="UTF-8">
  <title>Insert title here</title>

<script type="text/javascript">
  
    function sum(){
    	//1. 가격얻기
    	 var price = document.querySelector("#price").value;
    	//2. 갯수 얻기
    	 var quantity = document.querySelector("#quantity").value;
    	 console.log(price, quantity);
    	//3. 가격*갯수 결과값을 총합 태그에 설정
    	var result = Number.parseInt(price) * Number.parseInt(quantity); // "20"--> 20
    	 console.log(price, quantity, result);
    	document.querySelector("#result").innerText=result;
    }
</script>
</head>
<body>
 가격:<input type="text" name="price" id="price" ><br> 
 갯수:<select onchange="sum()" id="quantity">
   <option>10</option>
   <option>20</option>
   <option>30</option>
 </select>
 <br>
 총합:<div id="result"></div>
</body>
</html>










