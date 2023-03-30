<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h3>원하는 명소 하나 검색 화면입니다. </h3>
<hr color="red">
<form action="placeone" method="get">
	id : <input name="id" value="2"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>명소 전체검색 화면입니다. </h3>
<hr color="red">
<form action="placelist" method="get">
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>