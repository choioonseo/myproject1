<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@page import="sun.awt.image.PixelConverter.Bgrx"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>



<%
    //자바코드를 넣는 부분
   // HttpServletRequest request = new HttpServletRequest();
   //tomcat은 미리 request 객체를 만들어서 내장시켜 놨음!!!!!!
   //즉, 그냥 request라고 쓰기만 하면 new의 부품을 사용할 수 있음.
   
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
회원정보수정 요청되었음.
<hr color="red">

당신이 수정을 원하는 id는 : <%= id %><br>
당신이 수정을 원하는 score은 : <%= score %><br>


</body>
</html>