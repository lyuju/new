<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>declare</title>
<style>
p>div:nth-child(2n-1){
color:red;
}
</style>
<script>
function gugu(){
	let dan=5;
	let i=0;
	let r=0;
	let p = document.getElementById('result');
	for(i=1 ; i<10 ; i++){
		r='<div>'+ dan + '*'+i+'='+(dan*i)+'</div>';
		/*document.write(r);
		document.write('<br/>');*/
		p.innerHTML= p.innerHTML + r;
	}
}
</script>
</head>
<script>
 document.write('정일영');
 console.log('hi....','박원기');
</script>
<body>
 <input type ='button' value ='ok' onclick='alert("ok")'/>
 <input type ='button' value ='ok' 
 onclick='javascript:a=10;b=20;c=a+b;alert(c)'/>
 <input type='button' value='구구단' onclick='gugu()' />d
 <p id='result'></p>
 
 
</body>
</html>