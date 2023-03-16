<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO3"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id"); 
    	String pw = request.getParameter("pw"); 
    	String name = request.getParameter("name"); 
    	String tel = request.getParameter("tel"); 
    	
    	
    	MemberDAO3 dao = new MemberDAO3();
    	MemberVO bag2 = new MemberVO();
    	bag2.setId(id);
    	bag2.setPw(pw);
    	bag2.setName(name);
    	bag2.setTel(tel);
    	
    	
    	bag2 = dao.one(id);
    	 
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신이 검색할 id는 <%= id %>

<hr color="red">
이름 : <%= bag2.getId() %> <br>
비밀번호 : <%= bag2.getPw()  %><br>
전화번호 : <%= bag2.getTel() %> <br>

</body>
</html>