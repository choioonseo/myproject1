<%@page import="sun.awt.image.PixelConverter.Bgrx"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>


<%
    //�ڹ��ڵ带 �ִ� �κ�
   // HttpServletRequest request = new HttpServletRequest();
   //tomcat�� �̸� request ��ü�� ���� ������� ����!!!!!!
   //��, �׳� request��� ���⸸ �ϸ� new�� ��ǰ�� ����� �� ����.
   
   String no = request.getParameter("no"); //"010"
   String content = request.getParameter("content"); //"010"
   
   BbsVO bag = new BbsVO();
   bag.setNo(Integer.parseInt(no));
   bag.setContent(content);
  
   
   BbsDAO Dao = new BbsDAO();
   Dao.update(bag);
   
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
����� ������ ���ϴ� content�� : <%= content %><br>


</body>
</html>