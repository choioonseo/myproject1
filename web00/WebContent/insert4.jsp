
<%@page import="multi.MovieDAO"%>
<%@page import="multi.MovieVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
	//1. 전달되는 값을 받기

String id = request.getParameter("id");
String title = request.getParameter("title");
String content = request.getParameter("content");
String location = request.getParameter("location");
String director = request.getParameter("director");

//2. dao에 데이터응 주기 위해 값을 넣기


MovieVO bag = new MovieVO();
bag.setId(id);
bag.setTitle(title);
bag.setContent(content);
bag.setLocation(location);
bag.setDirector(director);


//3. dao에 가방을 주면서 insert요청
MovieDAO dao = new MovieDAO();
dao.insert(bag);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	영화등록되었습니다!
</body>
</html>