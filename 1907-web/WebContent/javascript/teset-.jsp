<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src='../lib/jquery-3.4.1.js'></script>
</head>
<body>


<h1 id='my-header'>click</h1>
<script>
function callTenTimes(bb){
	for(var i=0;i<10;i++){
		bb();
	}
	
}
callTenTimes(function(){
	alert('함수호출');
})
/* var student=[];

student.push({이름:'aa',국어:87,수학:98,영어:88,과학:95});
student.push({이름:'bb',국어:92,수학:98,영어:96,과학:98});
student.push({이름:'cc',국어:76,수학:96,영어:94,과학:90});
student.push({이름:'dd',국어:98,수학:92,영어:96,과학:92});

for(var i in student){
	student[i].bb=function(){
		return this.국어+this.수학+this.영어+this.과학;
	};
	student[i].cc=function(){
		return this.bb()/4;
	};
}
console.log(student[2].cc());
var output='이름\t총점\t평균\n';
for(var i in student){
	with(student[i]){
		output+=이름+'\t'+bb()+'\t'+cc()+'\n';
	}
}
alert(output); */


/* function test(options){

options.valueA =options.valueA&&10;
console.log(options.valueB)
options.valueB=20;
options.valueC=options.valueC|30;

alert(options.valueA + ':' + options.valueB + ':' + options.valueC);
}
test({
 valueA:52,
 //valueB:50,
 valueC:255

})
 */

/* function test(options){
	
	options.valueA = options.valueA || 10;
	options.valueB = options.valueB || 20;
	options.valueC = options.valueC || 30;
	
	alert(options.valueA +':' + options.valueB + ':'+options.valueC);
	
}
	test({
		valueA:52,
		valueC:273
	}); */


/* $(document).ready(function(){
	var object={name:'윤인성'};
	
	$.extend(object,{
		
	 region:'서울특별시 강서구',
	 part:'세컨드 기타'
	
	});
	
	var output='';
	$.each(object, function(key, item){
		output+= key+':' +item+'\n';
	});
	alert(output);







}); */


/* window.onload=function(){
	var header = document.getElementById('my-header');
	
	header.addEventListener('click',function(){
		alert('aa')
	})
}; */

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