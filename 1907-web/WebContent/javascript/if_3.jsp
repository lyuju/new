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
<label>키</label>
<input type='text' size='7' name='height'/><br/>
<label>몸무게</label>
<input type='text' size='7' name='weight'/><br/>
<input type='button' value='확인' name='btn'/>

<p/>
<h4>결과</h4>
<label><input type='radio' name='chk'>탑승</label>
<label><input type='radio' name='chk'>탑승불가</label>
</form>
<script>
frm.btn.onclick=function(){
	let h = Number(frm.height.value);
	let w = Number(frm.weight.value);
	if(h<120 || w>=100){
       frm.chk[1].checked=true;		
	}else{
		frm.chk[0].checked=true;
	}
		
}
</script>
</body>
</html>