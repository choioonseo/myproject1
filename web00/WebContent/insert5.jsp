
<%@page import="multi.PlaceDAO"%>
<%@page import="multi.PlaceVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	//1. 전달되는 값을 받기

String id = request.getParameter("id");
String name = request.getParameter("name");
String address = request.getParameter("address");
String score = request.getParameter("score");
String img = request.getParameter("img");

//2. dao에 데이터응 주기 위해 값을 넣기


PlaceVO bag = new PlaceVO();
bag.setId(id);
bag.setName(name);
bag.setAddress(address);
bag.setScore(score);
bag.setImg(img);

//3. dao에 가방을 주면서 insert요청
PlaceDAO dao = new PlaceDAO();
dao.insert(bag);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	명소가 등록되었습니다.
</body>
</html>