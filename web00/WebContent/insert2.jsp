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
�Խñ� �ۼ��� ��û�Ǿ���.
<hr color="green">
�Խñ� ��ȣ: <%= no %>
�Խñ� ��ȣ: <%= title %>
�Խñ� ��ȣ: <%= content %>
�Խñ� ��ȣ: <%= writer %>

</body>
</html>
