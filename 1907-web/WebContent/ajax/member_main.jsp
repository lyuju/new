<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_main</title>
<link rel='styleesheet' type='text/css' href='member.css'/>
<script src='../lib/jquery-3.4.1.js'></script>
<script src='member.js'></script>
</head>
<body>
<h2>회원 관리</h2>
<input type='text' name='findStr' value='m758' id='findStr'>
 <input type='button' value='검색' id='btnFind'>
<div id='result'></div>

<script>
$('#btnFind').click(function(){
	
init();
})

</script>
</body>
</html>