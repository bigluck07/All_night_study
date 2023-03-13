<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- JS 영역 -->
<script type="text/javascript">
     
     let arr = [10,20,30];
     console.log(arr[0]);
     console.log(arr.length);
     arr.push(300,400);
     
     arr.pop();
     var subarr = arr.slice(1,3);
     console.log(subarr);
     console.log(arr);
     
     let x = [1,2,3,4,5,6];
     //x.splice(0,2);
     //x.splice(0,2,100,200);
     x.splice(0,0,100,200);
     
     console.log(x);
     
     x.forEach(function(v,idx,arr){
    	 console.log(v, idx, arr);
     });
     
</script>
<!-- JS 영역 -->
</head>
<body>
</body>
</html>





