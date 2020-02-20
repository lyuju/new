<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=../lib/jquery-3.4.1.js></script>

</head>
<body>
<canvas id='canvas' width='700' height='400' style='border:3px solid black'>
</canvas>
 
 <script>
 $(document).ready(function(){

	 var canvas=document.getElementById('canvas');
	 var context=canvas.getContext('2d');
	 let flag=false;//mousedown일때 true, mouseup일때 false
	 $(canvas).on({
		 mousemove:
			 function(ev){
			 if(flag){
				 let pos=$(this).offset();
				 let x=ev.pageX-pos.left;
				 let y=ev.pageY-pos.top;
				 context.lineTo(x,y);
				 context.stroke();
				 console.log('aa')
			 }
		 },
		 
		 
		 mousedown: function(ev){
			 var position=$(this).offset();
			 var x = event.pageX-position.left;
			 var y = event.pageY-position.top;
			 
			 context.beginPath();
			 context.moveTo(x,y);
			 flag=true;
		 },
		 mouseup: function(event){ 
			 var position=$(this).offset();
			 var x = event.pageX-position.left;
			 var y = event.pageY-position.top;
			 
			 context.lineTo(x,y);
			 context.stroke();
			 flag=false;
		 }
	 

		 
	 }); 
 
 })
 
 
 
 </script>
 
 
</body>
</html>