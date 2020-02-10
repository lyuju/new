<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>if_2</title>
</head>
<body>
<form name='frm'>
<label>정수</label>
<input type='search' name='su' value='90'/>
<input type='button' value='RUN' name='btn'/>
<hr/>
<label><input type='radio' name='chk' value='전액장학생'>전액장학생</label>
<label><input type='radio' name='chk' value='반액장학생'>반액장학생</label>
<label><input type='radio' name='chk' value='전액납부생'>전액납부생</label>
</form>
<script>
frm.btn.onclick=function(){
	let su=Number(frm.su.value);
	if(su>=90) frm.chk[0].checked=true;
	else if(su>=70) frm.chk[1].checked=true;
	else  frm.chk[2].checked=true;
}
</script>
</body>
</html>