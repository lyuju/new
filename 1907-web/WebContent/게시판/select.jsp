<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>조회</title>
</head>
<body>
<h4>게시판 목록</h4>
<form name='frm'>
 <input type='text' name='findStr'>
 <input type='button' value='검색' name='btnSearch'/>
</form>
<div id='title'>
 <span class='serial'>No</span>
 <span class='subject'>제목</span>
 <span class='mName'>작성자</span>
 <span class='mDate'>작성일</span>
 <span class='hit'>조회수</span>
</div>
<div id='list'>
 <div class='items'>
	 <span class='serial'>1</span>
	 <span class='subject'>방가</span>
	 <span class='mName'>길동이</span>
	 <span class='mDate'>2020-01-12</span>
	 <span class='hit'>500</span>
 </div>
 <div class='items'>
	 <span class='serial'>2</span>
	 <span class='subject'>방가2</span>
	 <span class='mName'>홍동이</span>
	 <span class='mDate'>2020-01-13</span>
	 <span class='hit'>600</span>
 </div>
 
</div>
<script>
let a=list.items
console.log(a)
let r=document.getElementById('list');
let array=[];
frm.btnSearch.onclick=function(){
	let txt=frm.findStr.value;
   for(var i=0;i<localStorage.length;i++){
		 var localId = JSON.parse(localStorage.getItem(i));
		 array.push(localId)
		
		 for(d of array){
			 if(d.serial==txt){
				 var ad=JSON.stringify(d)
				 r.innerHTML=ad;
			 }
		 }
		 
		 
		 
		 
		/*  for(y=0;y<array.length;y++){
			 if(array[y].serial==txt){
				 
				 console.log(array[y])
				 r.innerHTML=JSON.parse(array[y]);
				 break;
			 }
		 } */
		 }
		    
	 }	
	 
 
	
	
	
	
	
		    
			 
		
	




</script>
</body>
</html>