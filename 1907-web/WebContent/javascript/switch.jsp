<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>switch</title>
</head>
<body>
<h3>switch</h3>
<p id='info'>
prompt를 사용하여 정수 하나를 입력받아 짝수, 홀수를 구분하여 출력하고, 만약 숫자가 아니라면 '숫자를 입력하세요'
메시지를 div창에 출력.
</p>
<div id='result'></div>




<script>
let r = document.getElementById('result');
var input=Number(prompt('숫자를 입력하세요','100'));

switch(input%2){

case 0:
	r.innerHTML='짝수입니다.';
	break;
	
	
case 1:
	r.innerHTML='홀수입니다.';
	break;
	
default:
	r.innerHTML='정수입력요망';

}



</script>

</body>
</html>