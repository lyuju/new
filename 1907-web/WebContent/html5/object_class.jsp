<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>object_class</title>
</head>
<body>
<h3>class를 사용한 객체 생성</h3>
<script>
class Member{
	constructor(id,name,phone){
		this.id=id;
		this.name=name;
		this.phone=phone;
	}
	setId(id){this.id=id;}		
	setName(name){this.name=name;}
	setPhone(phone){this.phone=phone;}
    
	getId(){return this.id};
	getName(){return this.name};
	getPhone(){return this.phone};
	

 toJSON(){
	 let str={
				'id': this.id,
				'name':this.name,
				'phone':this.phone
		};
		return str;
 }
				




}
</script>
</body>
</html>