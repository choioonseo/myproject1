<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
    //자바코드를 넣는 부분
   // HttpServletRequest request = new HttpServletRequest();
   //tomcat은 미리 request 객체를 만들어서 내장시켜 놨음!!!!!!
   //즉, 그냥 request라고 쓰기만 하면 new의 부품을 사용할 수 있음.
   
   String id = request.getParameter("id"); //"apple"
   String pw = request.getParameter("pw"); //"1234"
   String name = request.getParameter("name"); //"apple"
   String tel = request.getParameter("tel"); //"010"
   
   //import단축키 : ctrl + shift + m
 //가방을 만들어서 값들을 넣고(set)!
 	MemberVO bag = new MemberVO();
     bag.setId(id);
     bag.setPw(pw);
     bag.setName(name);
     bag.setTel(tel);
     
     
 	//dao에게 가방을 전달하자.!
 	MemberDAO3 dao = new MemberDAO3();
 	dao.insert(bag);
   
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
body {
	background: lime;
}
</style>

</head>
<body>
회원가입 요청되었음.
<hr color="red">
가입한 id : <%= id %> <br>
가입한 pw : <%= pw %><br>
가입한 name : <%= name %><br>
가입한 tel : <%= tel %><br>

</body>
</html>