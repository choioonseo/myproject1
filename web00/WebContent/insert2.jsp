<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
   
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
게시글 작성이 요청되었음.
<hr color="green">
게시글 번호: <%= no %>
게시글 번호: <%= title %>
게시글 번호: <%= content %>
게시글 번호: <%= writer %>

</body>
</html>
