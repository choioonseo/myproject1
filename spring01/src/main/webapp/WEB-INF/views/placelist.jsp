<%@page import="com.multi.mvc01.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}

td {
	width: 100px;
	text-align: center;
}

.top {
	background: black;
	color: white;
}

.down {
	background: lime;
}
</style>
</head>
<body>
<a href="place.jsp">처음 페이지로 </a>
<a href="placeone.jsp">게시물 하나 검색 목록페이지 </a>
	<table>
		<tr>
			<td class="top">id</td>
			<td class="top">name</td>
			<td class="top">address</td>
			<td class="top">score</td>
			<td class="top">img</td>
		</tr>

		<c:forEach items="${list}" var="bag">

			<tr>
				<td class="down">${bag.id}</td>
				<td class="down"><a href="https://map.naver.com/v5/entry/place/35306752?lng=127.10256248097612&lat=37.51257018494376&placePath=%2Fhome&entry=plt&c=15,0,0,0,dh">${bag.name}</a>
				</td>
				<td class="down">${bag.address}</td>
				<td class="down">${bag.score}</td>
				<td class="down">${bag.img}</td>
			</tr>
			
		</c:forEach>
	</table>
</body>
</html>

