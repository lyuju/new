<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=../lib/jquery-3.4.1.js></script>
<style>
.high-light-0{background:yellow}
.high-light-1{background:orange}
.high-light-2{background:blue}
.high-light-3{background:green}
.high-light-4{background:red}
</style>
</head>
<body>
<script>

$(document).ready(function(){
	$('h1').each(function(index,item){
		$(item).addClass('high-light-'+index)
	});
});
 

	

</script>
 <h1>item-0</h1>
 <h1>item-1</h1>
 <h1>item-2</h1>
 <h1>item-3</h1>
 <h1>item-4</h1>
 
</body>
</html>