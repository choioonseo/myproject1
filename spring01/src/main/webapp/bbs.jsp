<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 화면입니다. </h3>
<hr color="red">
<form action="insert22" method="get">
	no : <input name="no" value="1"><br>
	title : <input name="title" value="a"><br>
	content : <input name="content" value="aa"><br>
	writer : <input name="writer" value="aaa"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판 수정 화면입니다. </h3>
<hr color="red">
<form action="update22" method="get">
	no : <input name="no" value="2"><br>
	content : <input name="content" value="bb"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판 삭제 화면입니다. </h3>
<hr color="red">
<form action="delete22" method="get">
	no : <input name="no" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>게시판 검색 화면입니다. </h3>
<hr color="red">
<form action="one22" method="get">
	no : <input name="no" value="1"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>