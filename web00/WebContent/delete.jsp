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
   
   
   MemberDAO3 dao = new MemberDAO3();
   dao.delete(id);
 
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

</body>
</html>