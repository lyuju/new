<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>String 객체</title>
</head>
<body>
<h3>String 객체</h3>
<fieldSet  id='info'>
	<ol>
		<li>length : 문자열의 길이</li>
		<li>charAt(index) : index위치의 문자</li>
		<li>indexOf(str) | lastIndexOf(str) : str의 위치</li>
		<li>replace(regExp, replacement) : 문자열 변경(정규식) </li>
		<li>split(seperator, limit) : 문자열을 limit의 갯수만큼 분해 </li>
		<li>substring(start [,end]) : 문자열추출</li>
	</ol>
</fieldSet>
<script>
let str = "abc 가나다 123 다나가";
console.log(str + ' :length=> ' +  str.length);
let c = str.charAt(1);
console.log('str.charAt(1):',c);
let index1=str.indexOf('가');
let index2=str.lastIndexOf('가');
console.log('str.indexOf("가"):',index1);
console.log('str.lastindexOf("가"):',index2);
let rep1=str.replace('가','각');
let rep2=str.replace(/가/,'간');
let rep3=str.replace(/가/g,'갇');
console.log('rep1:',rep1);
console.log('rep2:',rep2);
console.log('rep3:',rep3);

let array =str.split(' ');
for(d in array){
	console.log(d +':'+array[d]);
}

let s1=str.substring(0,3);
console.log('str.substring(0,3):',s1);
let s2= str.substring(11);
console.log('str.substring(11):',s2);

let str2="930815-2234567";
//생년 ,생월,생일, 성별을 구별하여 console에 출력

let year=str2.substring(0,2);
let month=str2.substring(2,4);
let day=str2.substring(4,6);
let x=str2.substring(7,8);
let aa='';
let bb='여성';
if(x==1){
	aa='남성'
}else if(x==2){
	aa='여성'
}
let rd=(x%2==0)? "여자":"남자";
console.log('생년:',year);
console.log('생월:',month)
console.log('생일:',day);
console.log('성별:',aa);
</script>


</body>
</html>