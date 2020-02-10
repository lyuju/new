<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>for_in2</title>
</head>
<body>
<h3>for_in | for_of (II)</h3>
<form name='frm'>
 <input type='checkbox' name='chk' value ='강아지'>강아지</>
 </form>
 <p/>
 <input type='button' value='FOR-OF' name='forof'>
</form>
<script>
frm.forIn.onclick = function(){
console.log('----for in-------');
for(x in frm.chk){
	console.log(x+':'+frm.chk[x]);
}
}
frm.forIn.onclick = function(){
console.log('----for of-------');
for(x of frm.chk){
	console.log(x.value);
}
}
</script>
</body>
</html>