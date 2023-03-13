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
      $(document).ready(function(){
    	  //이벤트
    	  $("#quantity").on("change", function(){
    		  var price = $("#price").val();
    		  var quantity = $("#quantity").val();
    		  var result = Number.parseInt(price)*Number.parseInt(quantity);
    		  $("#result").text(result);
    	  });
      });
</script>
	
</head>
<body>
 가격:<input type="text" name="price" id="price" ><br> 
 갯수:<select id="quantity">
   <option>10</option>
   <option>20</option>
   <option>30</option>
 </select>
 <br>
 총합:<div id="result"></div>
</body>
</html>










