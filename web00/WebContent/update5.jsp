<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@page import="sun.awt.image.PixelConverter.Bgrx"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>



<%
    //�ڹ��ڵ带 �ִ� �κ�
   // HttpServletRequest request = new HttpServletRequest();
   //tomcat�� �̸� request ��ü�� ���� ������� ����!!!!!!
   //��, �׳� request��� ���⸸ �ϸ� new�� ��ǰ�� ����� �� ����.
   
   String id = request.getParameter("id"); //"010"
   String score = request.getParameter("score"); //"010"
   
   PlaceVO bag = new PlaceVO();
   bag.setId(id);
   bag.setScore(score);
  
   
   PlaceDAO Dao = new PlaceDAO();
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

����� ������ ���ϴ� id�� : <%= id %><br>
����� ������ ���ϴ� score�� : <%= score %><br>


</body>
</html>