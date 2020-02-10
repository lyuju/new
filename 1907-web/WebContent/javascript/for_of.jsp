<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>for_of</h3>
<p id='info'>
 배열의 정수를 임의의 개수를 저장한 후 for of를 사용하여 최대값과 최소값을 div에 출력하시오.
<p/>
<div id='result'></div>
<script>
let array=[464,1256,545,2,452,21,5462,456];
let max=array[0];
let min=array[0];
let r= document.getElementById('result');

for(let v of array){
	if(max<v) max=v;
	if(min>v) min=v;
	
}
	r.innerHTML='<li>최대값 :'+max
	           +'<li>최소값 :'+min;



</script>
</body>
</html>