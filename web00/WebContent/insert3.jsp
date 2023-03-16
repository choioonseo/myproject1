<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	//1. 전달되는 값을 받기

String id = request.getParameter("id");
String name = request.getParameter("name");
String content = request.getParameter("content");
String price = request.getParameter("price");
String company = request.getParameter("company");
String img = request.getParameter("img");

//2. dao에 데이터응 주기 위해 값을 넣기




ProductVO bag = new ProductVO();
bag.setId(id);
bag.setName(name);
bag.setContent(content);
bag.setPrice(price);
bag.setCompany(company);
bag.setImg(img);

//3. dao에 가방을 주면서 insert요청
ProductDAO dao = new ProductDAO();
dao.insert(bag);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	상품들록되었습니다!
	<img src="img/<%=img%>" width=200 height=200>
</body>
</html>