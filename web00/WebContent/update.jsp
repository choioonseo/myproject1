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
   String tel = request.getParameter("tel"); //"010"
   
   MemberVO bag = new MemberVO();
   bag.setTel(tel);
   bag.setId(id);
   
   MemberDAO3 dao = new MemberDAO3();
   dao.update(bag);
   
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
회원정보수정 요청되었음.
<hr color="red">
변경한 id : <%= id %> <br>
변경한 tel : <%= tel %><br>

</body>
</html>