<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%
    
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    //1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자
    BbsVO bag = new BbsVO();
    bag.setTitle(title);
    bag.setContent(content);
    bag.setWriter(writer);
    
    //2. dao에게 가방을 전달하면서 insert해달라고 하자
    BbsDAO dao = new BbsDAO();
    dao.insert(bag);
   
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

게시글 번호: <%= title %>
게시글 번호: <%= content %>
게시글 번호: <%= writer %>

</body>
</html>
