<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
    //�ڹ��ڵ带 �ִ� �κ�
   // HttpServletRequest request = new HttpServletRequest();
   //tomcat�� �̸� request ��ü�� ���� ������� ����!!!!!!
   //��, �׳� request��� ���⸸ �ϸ� new�� ��ǰ�� ����� �� ����.
   
   String no = request.getParameter("no"); //"010"
   String contents = request.getParameter("contents"); //"010"
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

����� ������ ���ϴ� ��ȣ�� : <%= no %><br>
����� ������ ���ϴ� contents�� : <%= contents %><br>


</body>
</html>