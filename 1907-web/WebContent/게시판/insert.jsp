<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name='frm'>
<label>작성자</label>
<input type='text' name='mName' ><br/>
<label>제목</label>
<input type='text' name='subject' value='b'><br/>
<textarea rows="10" cols="70" name="content"></textarea>
<input type='button' value='저장' name='btnSave'>
<input type='button' value='열기' name='btnLoad'>
</form>

<script>
let r=document.getElementById('content');
function board(serial,date,mName,subject,content,hit){
	this.serial=serial;
	this.date=date;
	this.mName=mName;
	this.subject=subject;
	this.content=content;
	this.hit=hit
	this.setSerial=function(serial){this.serial=serial;};
	this.setDate=function(date){this.date=date;}
	this.setmName=function(mName){this.mName=mName;};
	this.setSubject=function(subject){this.subject=subject;};
	this.setContent=function(content){this.content=content;};
	this.setHit=function(hit){this.hit=hit;};
	
	
	
	
	this.getSerial=function(){return this.serial;};
	this.getDate=function(){return this.date;};
	this.getmName=function(){return this.mName;};
	this.getSubject=function(){return this.subject;};
	this.getContent=function(){return this.content;};
	this.getHit=function(){return this.hit;};
	

	this.toJSON=function(){
		let str={
				 'serial': this.serial,
				 'date': this.date,
				 'mName':this.mName,
				 'subject': this.subject,
				 'content': this.content,
				 'hit': this.hit
				 
	};
 return str;
}
}
var today = new Date();
var dd = today.getDate();
var mm = today.getMonth()+1; //January is 0!
var yyyy = today.getFullYear();

if(dd<10) {
    dd='0'+dd
} 

if(mm<10) {
    mm='0'+mm
} 

today = mm+'/'+dd+'/'+yyyy;



let array=[]
var aa=0;
frm.btnSave.onclick = function(){
aa++;
let ser=aa;
let date=today;
let name = frm.mName.value;
let sub=frm.subject.value;
let con=frm.content.value;
let hit=aa;
	let ad=new board();
	ad.setSerial(ser);
	ad.setDate(date);
	ad.setmName(name);
	ad.setSubject(sub);
	ad.setContent(con);
	ad.setHit(hit);
	array.push(ad)
	for(var i=0;i<array.length;i++){
		localStorage.setItem(i,JSON.stringify(array[i].toJSON()));
	  
		
	  console.log(array[i].toJSON());
	  
	  console.log(array.length)
	}
 }
frm.btnLoad.onclick = function(){
	 
	 for(var i=0;i<localStorage.length;i++){
    var localId = JSON.parse(localStorage.getItem(i));
    
    console.log(localId)
	 }
	 
}
</script>
</body>
</html>