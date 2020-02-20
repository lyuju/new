<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
border:1px solid #0000ff;
width:100px;
}
table tr:first-child{
background-color:#aaa;

}

</style>
</head>
<body>
<table></table>
<p id='info'>
폼을 사용하여, 아이디, 성명, 국어, 영어점수를 입력받아 총점과 평균을 계산하여 하나의 배열에 저장하시오.</br>
[
{'id':'park','name':'박원기','kor':90,'eng':
]
</p>
<form name='frm'>
<input type='text' name='id' value='il'/><br/>
<input type='text' name='irum' value='ilyoung'/><br/>
<input type='text' name='kor' value='90'/><br/>
<input type='text' name='eng' value='90'/><br/>
<input type='text' name='tot' readonly/><br/>
<input type='text' name='avg' readonly/><br/>

<input type='button' value='CHECK' name='btn'/>
<input type='button' value='저장' name='btnSave'/>
<input type='button' value='열기' name='btnPrint'/>
<div id='result'></div>



</form>
<script>
let array=[];
let r= document.getElementById('result');
frm.btnSave.onclick=function(){
	let id=frm.id.value;
	let irum=frm.irum.value;
	let kor=Number(frm.kor.value);
	let eng=Number(frm.eng.value);	
	let tot=kor+eng;
	let avg=tot/2;
	let data={"id":id,"irum":irum,"kor":kor,"eng":eng,"tot":tot,"avg":avg}
	
	data=JSON.stringify(frm);
	console.log(data);
	
	array.push(data);
	
	frm.tot.value=tot;
	frm.avg.value=avg;
	
}
	frm.btnPrint.onclick=function(){
	let str='<table><tr><th>ID</th><th>IRUM</th><th>kor</th>'
	       +'<th>eng</th><th>TOT</th><th>tot</th></tr>'
	console.log(str);
	for(d of array){
		str+='<tr>';
		str+=`<td>\${d.id}</td>`;//backtitk사용
		str+=`<td>\${d.irum}</td>`;
		str+=`<td>\${d.kor}</td>`;
		console.log(str);
		str+=`<td>\${d.eng}</td>`;
		str+=`<td>\${d.tot}</td>`;
		str+=`<td>\${d.avg}</td>`;
		str+='<tr>';
	}       
	
	       
	       
	str+='</table>';
	r.innerHTML=str;
	}
	//option 성적이 바뀌면 바로 tot,avg로 계산
let compute= function(){
	let kor=Number(frm.kor.value);
	let eng=Number(frm.eng.value);	
	let tot=kor+eng;
	let avg=tot/2;
	
	frm.tot.value=tot;
	frm.avg.value=avg;
}
frm.kor.onchange=compute;
frm.eng.onchange=compute;










/* frm.btn.onclick=function(){
let a=frm.id.value;
let b=frm.irum.value;
let kor=Number(frm.kor.value);
let eng=Number(frm.eng.value);	
let e=kor+eng;
let f=e/2;

let ff={"id":a,"irum":b,"국어":kor,"영어":eng,"tot":e,"평균":f}
console.log('id:',ff.id,'irum:',ff.irum,'합계:',ff.tot,'평균:',ff.평균);

} */
</script>

</body>
</html>