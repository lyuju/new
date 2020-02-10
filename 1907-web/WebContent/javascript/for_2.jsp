<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

#result{
margin:20px;
width:400px; height:800px;
border:2px outset#4444ff;
border-radius:10px;
padding:30px;
box-sizing:border-box;
box-shadow:3px 3px 4px #aaa;
overflow:auto;
}
#result>div{
padding:20px;
font-weight:bold;
font-size:1.5em;
}
#result>div:nth-child(2n-1){
background-color:#ff9999;
margin-bottom:10px;
}
#result>div:nth-child(2n-1){
background-color:#9999ff;
margin-bottom:10px;
}
</style>
</head>
<body>
<script>
function gugu(){
 let dan=0;
 let str='';
 let r= document.getElementById('result');

 for(dan=2;dan<9;dan++){
	 str+='<div>';
  for(i=1 ; i<10;i++){
	  str+=dan+'*'+i+'='+(dan*i)+'<br/>';
	 p.innerHTML= p.innerHTML + r;
  }
  str+='</div>'
 }
 r.innerHTML=str;
}
</script>
<input type='button' value='구구단' onclick='gugu()' />a
<p id='result'>aa</p>
</body>
</html>