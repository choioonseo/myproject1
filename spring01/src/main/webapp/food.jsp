<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>음식 호불호 화면입니다. </h3>
<hr color="red">
<form action="food" method="get">
	좋아하는 음식 : <input name="like" value="불닭"><br>
	싫어하는 음식 : <input name="dislike" value="야채"><br>
	
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

</body>
</html>