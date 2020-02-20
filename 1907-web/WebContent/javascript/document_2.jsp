<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form>select{
width:200px;
}

</style>
</head>
<body>
<form name='frm'>
<label>국가</label>
<select name='cty' id='cty'></select>
<label>지역</label>
<select name='zone' id='zone'></select>

<label>인원수</label>
<select name='cnt' id='cnt'></select>
</form>
<script>
function init(){
	let arrayCty=['미국','일본'];
	let arrayZone=[
		
		['LA','New york'],
		['동경','오사까']
	]
	let arrayCnt=[
		[1,2,3,4],
		[5,6,8],
		[2,4,6,8,10],
		[1,3]
	]
let cty= document.getElementById('cty');
let zone=document.getElementById('zone');
let cnt= document.getElementById('cnt');
		
//국가항목에 option 추가
for(i=0;i<arrayCty.length;i++){
	var op =document.createElement('option');
	var txt = document.createTextNode(arrayCty[i]);
	
	op.appendChild(txt);
	cty.appendChild(op);
	
   }
	
	//국가 선택이되면 지역 변경
	cty.onchange=function(){
		let index=cty.selectedIndex;
		zone.length=0;//option 초기화
		for(i=0;i<arrayZone[index].length;i++){
			var txt=arrayZone[index][i];
			zone.options[i]=new Option(txt,txt);
		}
		
	}
	
	//지역이 변경이되면 인원수
	zone.onchange=function(){
		let index=zone.selectedIndex;
		cnt.length=0;//option 초기화
		for(i=0; i<arrayCnt[index].length;i++){
			var txt=arrayCnt[index][i];
			cnt.options[i]=new Option(txt,txt);
		}
	}
	cty.onchange();
	zone.onchange();
}
init();
	
	
	
	
		
	
		
	
	
	
	
	
	
</script>






</body>
</html>