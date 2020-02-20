<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src='../lib/jquery-3.4.1.js'></script>
</head>
<body>
<h3>선택자를 사용하지 않는 플러그인</h3>
<h1>header a</h1>
<h1>header b</h1>
<script>
//플러그인 정의
$.reload=function(){
	location=location;
}
//플러그인 호출(실행)
$('h1').first().click(function(){
	
	$.reload();
})
</script>



</body>

</html>