<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post</title>
<script src='../lib/jquery-3.4.1.js'></script>
</head>
<body>
<h3>post 방식으로 데이터 전송</h3>
<form name='frm' id='frm' method='post'>
<input type='text' name='mid' value='hong'/>
<input type='password' name='pwd' value='1234'/>
<input type='hidden' name='page' value='10'/>
<br/>
<input type='radio' name='hobby' value='축구' checked>축구
<input type='radio' name='hobby' value='야구'>야구
<input type='radio' name='hobby' value='농구'>농구
<br/>
<input type='checkbox' name='mnt' value='백두산' checked>백두산
<input type='checkbox' name='mnt' value='한라산' checked>한라산
<input type='checkbox' name='mnt' value='내장산'>내장산
<br/>
<select name='sel' multiple="multiple">
	<option value='한식' selected>한식</option>
	<option value='양식'>양식</option>
	<option value='중식' selected>중식</option>
	<option value='일식'>일식</option>
</select>
<p/>
<input type='button' value='전송' id='btn'/>
</form>

<div id='result'></div>

<script>
$('#btn').click(function(){
	let v = $('#frm').serialize();
	let xhr = new XMLHttpRequest();
	xhr.open('POST', 'post_result.jsp');
	xhr.setRequestHeader('Content-type', 
			'application/x-www-form-urlencoded;charset=utf-8')
	xhr.send(v);
	console.log(v);
	xhr.onreadystatechange=function(){
		if(xhr.status==200 && xhr.readyState==4){
			$('#result').html(xhr.responseText);
		}
	}
})

</script>


</body>
</html>




