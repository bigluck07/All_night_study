$(document).ready(function(){

    	 //수정버튼
        $(".updateBtn").on("click",function(){
           	var num = $(this).attr("data-xxx");
        	var gAmount = $("#cartAmount" + num).val();
        	var gPrice = $(this).attr("data-price");
        	$.ajax({
        		url:"cartUpdate",
        		type:"get",
        		dataType:"text",
        		data:{
        			num:num,
        			gAmount:gAmount
        		},
        		success:function(responseData,status,xhr){
        			$(gAmount).val($(gAmount));
        			$(`#sum+#{num}`).text(gAmount*gPrice+"원");
        			alert("수량을 수정했습니다.");

        		},
        		error :  function(xhr, status, error) {
					console.log(xhr, status, error);
					alert("오류발생");	
				}

        	});//end ajax
        });
    	 
        //삭제버튼
        $(".delBtn").on("click",function(){
        	var num= $(this).attr("data-xxx");
        	var xxx = $(this);
        	$.ajax({
        		url:'cartDelete',
        		type:'get',
        		dataType:'text',
        		data:{
        			num:num
        		},
        		success:function(data,status,xhr){
        			alert("상품을 삭제하였습니다.");
        			$(`#item${num}`).remove();
        		},
        		error:function(xhr,status,error){}
        	});//end ajax
        });
 
        $("#mainBtn").click(function(){
			location.href="/shop/main";
		});
		$("#logoutBtn").click(function() {			
			location.href = "/shop/logout";	
			alert("로그아웃 되었습니다.");		
		});
		$("#myPageBtn").click(function() {
			location.href = "/shop/mypage";
		});
		$("#cartListBtn").click(function() {
			location.href = "/shop/cartList";
		});
		
		
        //전체선택
        $("#allCheck").on("click",function(){
        	$(".check").each((idx,elem) => {
        		elem.checked = !elem.checked;
        	});
        });
        
       
        $("#delAllCart").on("click",function(){
        	$("form").attr("action", "CartDelAll");
        	$("form").submit();// trigger
        });
        
       
        $(".orderBtn").on("click",function(){
        	var num= $(this).attr("data-xxx");
        	location.href="cartOrderConfirm?num="+num;
        });
     
        $("#orderAllConfirm").on("click",function(){
        	$("form").attr("action", "cartOrderAllConfirm");
        	$("form").submit();// trigger
        });
   });