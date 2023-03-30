<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h3>book 화면입니다. </h3>
<hr color="red">
<form action="insert3.multi" method="get">
	name : <input name="name" value="a"><br>
	url : <input name="url" value="aa"><br>
	img : <input name="img" value="aaa"><br>
	<button type="submit">서버로 전송</button>
</form>


<hr color="red">
<a href="list3">북마크 전체 목록 가지고 오기 </a><br>
<form action="one3.multi" method="get">
	아이디 : <input name="id" value="3"><br>
	<button type="submit">서버로 전송</button>
</form>



</body>
</html>