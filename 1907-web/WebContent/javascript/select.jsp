<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>select</title>
<style>
.sel{
width:150px;
}
#result{
 border:1px solid #aaaaff;
 paddiong: 15px;
 box-sizing:border-box;
 width:300px;
 height:150px;
 box-shadow:3px 3px 4px #555;

}

</style>
</head>
<body>
<h3>select</h3>
<form name='frm'>
	<h4>과정명을 하나만 선택하시오</h4>
	<select name='course' size='1'>
		<option value='프로그래밍 과정'>프로그래밍 과정</option>
		<option value='웹 디자인 과정'>웹 디자인 과정</option>
		<option value='스크립터 과정'>스크립터 과정</option>
		<option value='퍼블리싱 과정'>퍼블리싱 과정</option>
	</select>
	<h4>신청 과목을 한개 이상 선택</h4>
	<select name='subject' size='7' multiple='multiple' class='sel'>
		<option value='java'>java</option>
		<option value='html5'>html5</option>
		<option value='css3'>css3</option>
		<option value='javascript'>javascript</option>
		<option value='jsp'>jsp</option>
		<option value='ajax'>ajax</option>
		<option value='jquery'>jquery</option>
		<option value='node.js'>node.js</option>
		<option value='spring'>spring</option>
	</selet>
	<p/>
	<input type='button' value='선택' name='btn'/>
</from>
<div id='result'></div>				
<script>
let subject=[];
let r = document.getElementById('result');
let str='';

frm.btn.onclick=function(){
	str='<li>과정명 :'+ frm.course.value;
	r.innerHTML=str;
	
	
}
</script>				
		





</body>
</html>