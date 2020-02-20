<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=../lib/jquery-3.4.1.js></script>
</head>
<body>
<img src='../images/aaab.jpg'>
<img src='../images/Koala.jpg'>
<img src='../images/cc.jpg'>
<script>
$(document).ready(function(){
$('img').css('width',250);

setInterval(function(){
	$('img').first().appendTo('body');
},2000);
	
ds



}) ;


</script>
</body>

</html>