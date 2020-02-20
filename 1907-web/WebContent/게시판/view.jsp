<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보기</title>
</head>
<body>
<h3>게시판 상세보기</h3>
<form name='frm'>
<label>순번</label>
<input type='text' name='serial' readonly/>
<label>작성자</label>
<input type='text' name='mName' readonly><br/>
<label>제목</label>
<input type='text' name='subject' readonly><br/>
<input type='button' value='수정' name='btnModify'>
<input type='button' value='삭제' name='btnDelete'>
<input type='button' value='목록' name='btnSelect'>

<table id='content'></table>
</form>
<script>
let r = document.getElementById('content');
let array=[];
frm.btnSelect.onclick=function(){
	 for(var i=0;i<localStorage.length;i++){
		
	    var localId = JSON.parse(localStorage.getItem(i));
		 var ad=JSON.stringify(localId)
		 
	    array.push(ad)
	    
	    var abb=localId.filter(function(element){
			 console.log(element);
			 return element.subject=='b';
		 });
		 console.log("aab")
		 console.log(abb);
	   /*  r.innerHTML="'AAAAa'+<br/>";
	    r.innerHTML+="'AAAa+<br/>+bbbb'" */
	    
	    
	    r.innerHTML += "<div class='items'  onclick='add("+ i +")'>" +
        "<span class='serial'>"+ i + "</span>" +
        "<span class='subject'>" + member.mname + "</span>" +
        "<span class='mName'>" + member.subject + "</span>"+
        "<span class='mData'>" + member.content + "</span>"+
        "<span>" + member.view + "</span>"+
        "</div>";
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    //r.innerHTML=array;
	 }    
}
frm.btnModify.onclick=function(){
	let ser=frm.serial.value
}	    
frm.btnDelete.onclick=function(){
	
	
}	
content.mouseover=function(){
	console.log('a');
	var Arr = this.attr("serial");
	console.log(Arr)
}	

function ondbclick_event(){
	let serial=document.getElementById('s').innerText;
	console.log(serial);
}		
	
		 
	 
</script>
</body>

</html>