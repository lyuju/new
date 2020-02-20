<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id='frm'>
<label><input type='checkbox' checked name='food' value='피자'>피자</label>
<label><input type='checkbox' checked name='food' value='백반'>백반</label>
<label><input type='checkbox'  name='food' value='치킨'>치킨</label>
<label><input type='checkbox' checked name='food' value='라면'>라면</label>
<label><input type='checkbox' name='food' value='버거'>버거</label>
<p/>
<input type='button' value='익명' name='btn1'/>
<input type='button' value='callback' name='btn2'/>
<input type='button' value='함수식' name='btn3'/>
<input type='button' value='선언적함수' name='btn4'/>
<input type='button' value='화살표' name='btn5'/>
</form>
<div id='result'></div>

<script>
let food=[];
let str='';
let r= document.getElementById('result');
//공동 호출 함수-----------
function Gen(){
	food.length=0;//배열의 초기화
	for(v of frm.food){//v에는 checkbox자체가 들어감
		if(v.checked){
			food.push(v.value);
		}
	}
	return food;
}
function callback(){
	str='callback함수:'+Gen();
	r.innerHTML=str;
}



//즉시 실행 함수

( function(){
	str='즉시 실행 함수 :' + Gen();
	r.innerHTML =str;
}() );

var a=frm.food.value;
frm.btn1.onclick= function(){
	return 'return value:'+a;
console.log(a);
}

//익명 함수----------
frm.btn1.onclick=function(){
	str='익명형 함수:'+Gen();
	r.innerHTML=str;
}

//callback함수----
frm.btn2.onclick=callback;

//함수식
let func= function(){
	food.length=0;//배열의 초기화
	for(v of frm.food){//v에는 checkbox자체가 들어감
		if(v.checked){
			food.push(v.value);
		}
	}
	str='함수식:'+food;
	r.innerHTML=str;
}
frm.btn3.onclick=func;

//선언적 함수----
//호출되는 function Gen()의 유형이 선언적 함수다.
frm.btn4.onclick=function(){
	str='선언적 함수:'+Gen();
	r.innerHTML=str;
}	
//화살표 함수----------
let arrow=()=>{
 str='arrow 함수:'+Gen();
 r.innerHTML=str;
}
	frm.btn5.onclick=arrow;


</script>
</body>
</html>