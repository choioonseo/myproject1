
<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	  	
    	PlaceDAO dao = new PlaceDAO();
    //5,6)dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다. 
    	ArrayList<PlaceVO> list = dao.list();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
전체명소 갯수: <%= list.size() %>

<% if(list.size() == 0) { %>
<h3>등록된 명소가 없습니다.</h3>
<img src="img/empty.jpg" width=250 height="250">
<%}else{ %>


 <table class="table table-hover table-striped">
 <tr>
 	<td>id</td>
 	<td>name</td>
 	<td>address</td>
 	<td>score</td>
 	<td>img</td>
 	
 </tr>
<% 
	for(PlaceVO bag2: list){
%>
 <tr>
 	<td><%= bag2.getId() %></td>
 	<td>
 		<a href="http://localhost:8889/web00/one5.jsp?id=<%= bag2.getId() %>">
			<%= bag2.getName() %>
		</a>
 	</td>
 	<td><%= bag2.getAddress()%> </td>
 	<td><%= bag2.getScore() %> </td>
 	<td><img src = "img/<%=bag2.getImg()%>"></td>
 </tr>
 
 <% } %>
 
 </table>
 
  <% } %>
</body>
</html>