<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>function_declare</title>
</head>
<body>
<h3>function declare</h3>
<h4>익명함수</h4>
<script>
var f= function(){
	return 'hong';
}
var f2=function(a){
	return 'return value:'+a;
}
console.log(f());
console.log(f2('park'));
</script>

<h4 id='h4'>callback 함수</h4>
<script>
let h4= document.getElementById('h4');
h4.onmouseover =abc;
	function abc(){
  console.log('HI....');	 
 }
	 
</script>
<h4>선언적 함수(hoising)</h4>
<script>
hoi('123');
function hoi(n){
	console.log(n);
}
hoi('456');	
</script>
</body>
</html>