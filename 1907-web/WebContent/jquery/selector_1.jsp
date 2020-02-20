<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>
<h3>sector (1)</h3>
<ul>
	<li>전체 선택자 : *</li>
	<li>태그 선택자 : 태그명</li>
	<li id='id1'>아이디 선택자 : #아이디명</li>
	<li class='class1'>클래스 선택자 : .클래스명</li>
	<li modify ='yes'>속성 선택자 : 요소[속성명]</li>		
</ul>
<div>
	<span>자손1</span>
	<span>자손2</span>
	<span>자손3</span>
	<span>자손4</span>
	<p>
	<span>후손1</span>
	<span>후손2</span>
	<span>후손3</span>
	<span>후손4</span>
	</p>
</div>
<script>
			//모든선택자
			
$(document).ready(function(){ //$(function() {   });짧게사용// 기본골격
	//모든선택자
	$('*').css('border' , '1px solid #0000ff'); //'*'모든 선택자  //모든 태그에 보더가 붙어있다.
	//태그선택자
	$('h3').css('background-color', '#ffff00');	
	
	//아이디선택자
	$('#id1').css('color','#ff0000');
	
	//클래스선택자
 	$('.class1').css('background-color', '#ffff00');
	
	//속성 선택자
	$('[modify=yes]').css('background-color', '#ff0000');
	
	//자손 태그 꺽새
	$('div>span').css('font-size' , '5px'); //div에 스팬만포함
	
	//후손태그
	$('div span').css('color','red');
	
	
});

</script>

</body>
