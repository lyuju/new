<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=../lib/jquery-3.4.1.js>s</script>
<style>
*{margin:0px ; padding:0px}
#canvas{background-color:gray;
width:600px;
height:400px;
position:relative;
overflow:hidden;
}
.inner_box{
background:orange;
width:100px;
height:100px;

position :absolute;
}

</style>
</head>
<body>
<h1>Test Header</h1>
<div id='canvas'>
 <div class='inner_box'></div>
 <div class='inner_box'></div>
 <div class='inner_box'></div>
 <div class='inner_box'></div>
 <div class='inner_box'></div>
</div>
<h1>Test Foother</h1>
<script>
$('.inner_box').each(function(index){
	$(this).css({
		left: index*90,
	    top: index*90
	});
});

</script>
</body>
</html>