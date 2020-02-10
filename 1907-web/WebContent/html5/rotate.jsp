<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rotate</title>
<style>
#can{border :2px solid #9999ff

}
</style>
</head>
<body>
<h3>rotate</h3>
<canvas id= 'can' width = '500px' height= '500px'></canvas>
<br/>
<form name='frm'>
 <label>도형의 갯수</label>
 <input type = 'range' name='cnt' min='1' max='100'/>
 <output name='msg' value='1'></output>
<script>
let ctx= document.getElementById('can').getContext('2d');
ctx.translate(250,250);
frm.cnt.onchange=function(){
	frm.msg.value=frm.cnt.value;
	ctx.lineWidth='1';
	ctx.strokeStyle='rgb(0,0,255)';
	ctx.clearRect(-250,-250,750,750);
	for(i=0;i<frm.msg.value;i++){
		let c= frm.msg.value;
		ctx.rotate(Math.PI/180*(360/c));
		ctx.strokeRect(40,40,70,70);
	}
}
</script> 
</form>
</body>
</html>