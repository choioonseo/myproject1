<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() { //body부분이 dom tree로 메모리에 준비가 되었을 때, 

		$('#b2').click(function() {

			$.ajax({
				url : "movie",
				data : {
					title : $('#title').val(),
					price : $('#price').val(),
				},
				
				success : function(x) {
					alert('영화 관람 정보 요청 성공!' )
					alert(x)
					$('#result').append(x + "<br>")
				},
				error : function() {
					alert('영화 관람 정보 요청 실패!')
				}
			})
		})
		$('#b3').click(function() {

			$.ajax({
				url : "fruit",
				
				success : function(x) {
					alert('fruit 요청 성공!' )
					alert(x)
					$('#result').append(x + "<br>")
				},
				error : function() {
					alert('fruit 요청 실패!')
				}
			})
		})
	})
	})
	$('#b4').click(function() {
		
			$.ajax({
				url : "tour",
				
				success : function(x) {
					alert('tour 요청 성공!' )a
					alert(x)
					$('#result').append(x + "<br>")
				},
				error : function() {
					alert('tour 요청 실패!')
				}
			})
		})
	})
		})
	
</script>
</head>
<body>
	영화 제목 :
	<input id="title">
	<br> 영화 관람료 :
	<input id="price">
	<br>
	<input id="b2" type="button" value="영화 관람 확인">
	<br>
	<input id="b3" type="button" value="과일목록 가지고 오기">
	<br>
	<input id="b4" type="button" value="여행목록 가지고 오기">
	<br>
	<hr color="red">
	<div id="result"></div>
</body>
</html>