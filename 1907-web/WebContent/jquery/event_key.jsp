<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=../lib/jquery-3.4.1.js></script>
</head>

<body>
 <div>
  <p>지금 내 생각을</p>
  <h1>150</h1>
  <textarea cols-'70'rows-'5'></textarea>
 </div>

<script>
$(document).ready(function(aa){
	$('textarea').keyup(function(){
		//남은 글자 수를 구합니다
		var inputLength=$(this).val().length;
	    var remain =150-inputLength;
	
	$('h1').html(remain);
	
	if(remain>=0){
		$('h1').css('color','black');
	}else{
		$('h1').css('color','red');	
	}
	});

});

</script>



</body>
</html>