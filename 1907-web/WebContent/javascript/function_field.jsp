<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
let student={
		id:'hong',
		irum:'홍길동',
		getId : function(){
			return this.id;
		},
		getIrum : function(){
			return this.irum;
		},
		setId :function(id){
			this.id=id;
		},
		setIrum : function(n){
			this.irum=n;
		}
};
		console.log('id:', student.getId());
		console.log('irum:',student.getIrum());
		
student.setId('kim:',student.getId());
student.setIrum('김삿갓:',student.getIrum());
console.log('id:', student.getId());
console.log('irum:',student.getIrum());
</script>
</body>
</html>