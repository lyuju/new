<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1 id='my-header'>click</h1>
<script>
window.onload=function(){
	var header = document.getElementById('my-header');
	
	header.addEventListener('click',function(){
		alert('aa')
	})
};









/* window.onload=function(){
	document.getElementById('header').onclick=function(){
		alert('header');
	};
	
document.getElementById('paragraph').onclick=function(e){
	var event=e|| window.event;
	
	alert('paragraph');
	
	event.stopPropagation();
	
}
}
 */

 /* function whenClick(e){
	alert('클릭');
} */

/* window.onload=function(){
	document.getElementById('header').onclick=function(){
		this.style.color='orange';
		this.style.backgroundColor='red';
	};
	
};
 */

/* window.onload=function(){
	var output='';
	output+='<ul>';
	output+=' <li>javascript</li>';
	output+=' <li>jaa</li>';
	output+=' <li>jbb</li>';
	output+='<ul>';
	
	document.body.innerHTML=output;
	document.body.innerHTML+='<h1>obkeca</h1>';
	
}
 */

/* let str='';
var object={
		"aa_bb":"윤인성",
		"region":"서울특별시"
};
var copy=JSON.stringify(object);
for(d in object){
	str+=d+object.aa_bb
}
console.log(str)
alert(str); */



/* var add=[];
function aa(ae,ad,ac){
	var df={
			dl:ae,
			da:ad,
			de:ac,
			
	toString:function(){
		return this.da;
	},		
			
			
			
			
	};
	
	
	return df;
}

add.push(aa('dlfdud','ddd',110));
add.push(aa('eeeee','호이',112));

var output='이름\t총점\t평균\n';
for(var i in add){
	output+=add[i].toString()+'\n';
}
alert(output)
 */
/* var output='';
var product={
		name:'aaa',
		price:'aab'
}
for(a of Object.keys(product) ){
	
console.log(a)
}  */

/* var obj = document.getElementById("testDivision");
var object1={
		name:'윤인성',
		region:'서울특별시'
		
}

let a =JSON.stringify(object1);
obj.innerHTML = a
var first_key = Object.keys(object1)[0];
var first_value = object1[Object.keys(object1)[0]];

console.log(first_key);
console.log(first_value);
 */


</script>
</body>
</html>