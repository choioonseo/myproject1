
<%@page import="multi.PlaceDAO"%>
<%@page import="multi.PlaceVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	// Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest(); 
    	//car.run();
    	String id = request.getParameter("id"); //String, "100" 
    	//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
    	
    	PlaceDAO dao = new PlaceDAO();
    	PlaceVO bag2 = dao.one(id);
    	
    %>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
당신이 검색을 원하는 번호는<%= id %>
<hr color="red">
 <table class="table table-danger table-striped">
 	<tr>
 		<td>명소 id</td>
 		<td><%= bag2.getId() %></td>
 	</tr>
 	<tr>
 		<td>명소 이름</td>
 		<td><%= bag2.getName() %></td>
 	</tr>
 	<tr>
 		<td>명소 주소</td>
 		<td><%= bag2.getAddress() %> </td>
 	</tr>
 	
 	<tr>
 		<td>명소 평점 </td>
 		<td><%= bag2.getScore() %></td>
 		
 	</tr>
 	<tr>
 		<td>명소 이미지</td>
 		<td>
 		
 		<img src = "img/<%=bag2.getImg()%>"> 
 		</td>
 	</tr>
 	
 </table>
</body>
</html>