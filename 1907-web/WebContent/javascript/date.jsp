<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>date</title>

</head>
<body>
<h3>date</h3>
<p id='info'>
   생년월일을 입력하여 오늘날짜를 기준으로 년수(나이), 개월수, 시간수, 분수를 계산하여
   표시하시오.
</p> 
<form name='frm'>
	<label>생년월일</label>
	<input type='date' name='birth'/><br/>
	<label>오늘날짜</label>
	<input type='date' name='now'/><p/>
	<input type='button' value='날수계산' name='btn'/>
</form>
<br/>
<div id='result'></div> 
<script>
let tempDate = new Date();
let r = document.getElementById('result');
//
frm.birth.valueAsDate = tempDate;
frm.now.valueAsDate = tempDate;

frm.btn.onclick = function(){
	let str = '';
	let d1 = new Date(frm.birth.value);
	let d2 = new Date(frm.now.value);
	
	let d = (d2-d1)/1000; // 1/1000초 단위를 초 단위로 변경
	
	let mi = d/60; //분수
	let ho = d/60/60; //시간수
	let da = d/60/60/24; //날수
	let mo = d/60/60/24/30; //개월수
	let ye = d/60/60/24/30/12; //년수
	
	str = '<li>년수 : '   + ye
		  + '<li>개월수 : ' + mo
		  + '<li>날수 : '   + da
		  + '<li>시간수 : ' + ho
		  + '<li>분수 : '   + mi;
	
	r.innerHTML =str;
}

</script>
</body>
</html>






