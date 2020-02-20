<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>setInterval</title>
</head>
<body>
<h3>setInterval을 사용한 시계</h3>

<div id='date'></div>
<div id='time'></div>
<script>



let watch = document.getElementById('watch');
let weeks=['일','월','화','수','목','금','토'];
let func=function(){	
	let now= new Date();
	let year=now.getFullYear();
	let month= now.getMonth()+1;//0~11월
	let day=now.getDate();
	let week= now.getDay()//요일;
	let hour=now.getHours();
	let min = now.getMinutes();
	let sec= now.getSeconds();
	//시분초 2자리로
	hour = (hour<10)? '0'+hour :hour;
	min=(min<10)?'0'+min : min;
    sec=(sec<10)? '0'+sec : sec; 
	let d=`\${year} 년 \${month}월 \${day}일 (\${weeks[week]})` ;
	let t=`\${hour}:\${min}:\${sec}`;
	
	date.innerHTML=d;
	time.innerHTML=t;
}
setInterval(func,1000);
</script>
</body>
</html>