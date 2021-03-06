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
<h3>위치필터|함수 필터</h3>
<fieldset>
<legend>위치 필터</legend>
<li>요소:odd=>요소들 중에서 홀수번째</li>
<li>요소:even==>요소들 중에서 짝수번째</li>
<li>요소:first==>요소들 중에서 첫번째</li>
<li>요소:last==>요소들 중에서 마지막번째</li>
</fieldset>
<fieldset>
<legend>함수 필터</legend>
<li>요소:contrains(문자열)=>문자열이 포함된 요소</li>
<li>요소:eq(n)=>n번째 요소</li>
<li>요소:gt(n)=>n보다 큰 요소</li>
<li>요소:lt(n)=>n보다 작은 요소</li>
<li>요소:has(item)=>item을 갖고 있는 요소</li>
<li>요소:not(item)=>item을 갖고 있지 않는 요소</li>
<li>요소:nth-child(수열)=>수열에 해당하는 요소</li>
</fieldset>

<ol id='mnt'>
 <li>백두산</li>
 <li>한라산</li>
 <li>금강산</li>
 <li>치악산</li>
 <li>북한산</li>
 <li>설악산</li>
</ol>
 
<script>
 //홀수번째 문자색만 빨강
 $('#mnt>li:odd').css('color','#ff0000');
 $('#mnt>li:first').css('border-top','2px solid #999');
 $('#mnt>li:last').css('border-bottom','2px solid #999');
 
 
 //5보다 작은 위치의 요소의 바탕색
 $('#mnt>li:lt(5)').css('background-color','#eee');
 
 //3의 배수 위치의 border-bottom
 $('#mnt>li:nth-child(3n)').css('border-bottom','1px solid #4444ff');
 
 
</script>

</body>
</html>