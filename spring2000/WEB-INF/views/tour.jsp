<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--  computer호출했을 때 결과담는 곳!
-->
<table border=1>
<tr>
	<td>영화제목</td>
	<td>영화가격</td>
</tr>
<tr>
	<td>${vo.title}</td>
	<td>${vo.price}</td>
</tr>
<tr>
	<td a<%= "문자인증받기" %>></td>
	
</tr>

</table>