<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#result{
border:1px solid #ff0000;
padding:20px;
box-sizing:border-box;
width:400px;
height:150px;
}

</style>
</head>
<body>
<form name='frm'>
<h3>가고싶은 산을 한개만 고르시오</h3>
<label><input type='radio' name='mnt' value='금강산'>금강산</label>
<label><input type='radio' name='mnt' value='한라산'>한라산</label>
<label><input type='radio' name='mnt' value='백두산'>백두산</label>
<label><input type='radio' name='mnt' value='설악산'>설악산</label>
<label><input type='radio' name='mnt' value='치악산'>치악산</label>
<label><input type='radio' name='mnt' value='북한산'>북한산</label>

<h3>살고 싶은 지역을 하나만 선택</h3>
<label><input type='radio' name='city' value='강원도'>강원도</label>
<label><input type='radio' name='city' value='경기도'>경기도</label>
<label><input type='radio' name='city' value='충청도'>충청도</label>
<label><input type='radio' name='city' value='제주도'>제주도</label>
<label><input type='radio' name='city' value='함경도'>함경도</label>
<label><input type='radio' name='city' value='전라도'>전라도</label>
<label><input type='radio' name='city' value='서울'>서울</label>

<h3>가봤던 나라를 하나만 선택</h3>
<label><input type='radio' name='country' value='터키'>터키</label>
<label><input type='radio' name='country' value='마카오'>마카오</label>
<label><input type='radio' name='country' value='캄보디아'>캄보디아</label>

<p/>
<input type='button' value='결정' name='btn'/>
</form>
<div id='result'></div>
<script>
let str='';
let r=document.getElementById('result');
frm.btn.onclick=function(){
/* 산의 선택 여부 체크*/
	
	let mntFlag = false;
	for(i=0;i<frm.mnt.length ;i++){
		if(frm.mnt[i].checked){
		str='<li>선택한 산의 이름:' +frm.mnt[i].value;
		mntFlag=true;
		}
	}
	if(mntFlag==false){
		alert('가고 싶은 산을 선택하세요');
	}
	r.innerHTML=str;
}

</script>


</body>
</html>