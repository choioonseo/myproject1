<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%
    
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    //1. ���� �����͸� dao���� �ֱ� ���ؼ� ������ ���� ����
    BbsVO bag = new BbsVO();
    bag.setTitle(title);
    bag.setContent(content);
    bag.setWriter(writer);
    
    //2. dao���� ������ �����ϸ鼭 insert�ش޶�� ����
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
�Խñ� �ۼ��� ��û�Ǿ���.
<hr color="green">

�Խñ� ��ȣ: <%= title %>
�Խñ� ��ȣ: <%= content %>
�Խñ� ��ȣ: <%= writer %>

</body>
</html>
