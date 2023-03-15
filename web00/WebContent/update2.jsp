<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
    //자바코드를 넣는 부분
   // HttpServletRequest request = new HttpServletRequest();
   //tomcat은 미리 request 객체를 만들어서 내장시켜 놨음!!!!!!
   //즉, 그냥 request라고 쓰기만 하면 new의 부품을 사용할 수 있음.
   
   String no = request.getParameter("no"); //"010"
   String contents = request.getParameter("contents"); //"010"
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
body {
	background: lime;
}
</style>

</head>
<body>
회원정보수정 요청되었음.
<hr color="red">

당신이 수정을 원하는 번호는 : <%= no %><br>
당신이 수정을 원하는 contents는 : <%= contents %><br>


</body>
</html>