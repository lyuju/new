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
<h3>filter</h3>
<p id='info'>
option을 선택한 후 5초가 지나면 선택된 항목이 alert창으로 표시됨.
</p>
<form>
<select>
<option>간식</option>
<option>외식</option>
<option>야식</option>
</select>
</form>
<script>
$(function(){
	setTimeout(function(){
		let v=$('select>option:selected').val();
		alert(v);
	},4000)
	
	
});

</script>


</body>
</html>