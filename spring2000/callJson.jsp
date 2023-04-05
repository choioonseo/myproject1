<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- content delivery network  : CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url: "json.jsp",
				success: function(json) {
					$('#result').append(json)
				} //success
			}) //ajax
		})//b1
		$('#b2').click(function() {
			$.ajax({
				url: "json2.jsp",
				success: function(json) {
					$('#result').append(json)
				} //success
			}) //ajax
		})//b1
		$('#b3').click(function() {
			$.ajax({
				url: "json3.jsp",
				success: function(json) {
					$('#result').append(json)
				} //success
			}) //ajax
		})//b1
		$('#b4').click(function() {
			$.ajax({
				url: "json4.jsp",
				success: function(json) {
					$('#result').append(json)
				} //success
			}) //ajax
		})//b1
	})//$
</script>

</head>
<body>
<button id="b1">JSON을 받아오자.!</button>
<button id="b2">JSONArray를 받아오자.!</button>
<button id="b3">JSON3을 받아오자.!</button>
<button id="b4">JSONArray4를 받아오자.!</button>
<hr color="red">
<div id="result"></div>
</body>
</html>