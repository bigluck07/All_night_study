<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String userid = request.getParameter("userid");
     //DB연동 ( admin이면 중복, 아니면 가능)
    String mesg = "사용가능";
    if("admin".equals(userid.trim())){
    	mesg = "사용불가";
    }
%>
<%= mesg %>




