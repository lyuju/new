<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>document(1)</h3>
<script>
function first(){
	let header=document.createElement('h1')
	let textNode=document.createTextNode('HEllo DOM');
	
	header.appendChild(textNode);
	
	document.body.appendChild(header);
	
	//button
	let btn=document.createElement('input');
	btn.setAttribute('type','button');
	btn.setAttribute('value','버튼');
	btn.style.width='200px';
	btn.style.height='80px';
	document.body.appendChild(btn);
    
	//text box(input type='text')
    let inputBox=document.createElement('input');
	inputBox.setAttribute('type','text');
	inputBox.setAttribute('value','hong');
	document.body.appendChild(inputBox);
	
    let br=document.createElement('br')
    document.body.appendChild(br);
    document.body.appendChild(inputBox);
} 

first();
</script>
</body>
</html>