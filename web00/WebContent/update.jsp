<%@page import="multi.MemberDAO3"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
    //�ڹ��ڵ带 �ִ� �κ�
   // HttpServletRequest request = new HttpServletRequest();
   //tomcat�� �̸� request ��ü�� ���� ������� ����!!!!!!
   //��, �׳� request��� ���⸸ �ϸ� new�� ��ǰ�� ����� �� ����.
   
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
ȸ���������� ��û�Ǿ���.
<hr color="red">
������ id : <%= id %> <br>
������ tel : <%= tel %><br>

</body>
</html>