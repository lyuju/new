<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>object_prototype</title>
</head>
<body>
<h3>prototype을 사용한 메서드 선택</h3>
<div id='result'>
<div id='title'>
 <span class='code'>제목</span>
 <span class='codeName'>제목명</span>
 <span class='ea'>수량</span>
 <span class='price'>금액</span>
 </div>
</div>

 
<script>

function Product(code,codeName,ea,price){
	this.code=code;
	this.code=codeName;
	this.ea=ea;
	this.price=price;
}
//product로 만들어진 객체들이 사용하는 공유메서드(prototype)
Product.prototype.setCode=function(code){this.code=code;};
Product.prototype.setCodeName=function(codeName){this.codeName=codeName};
Product.prototype.setEa=function(ea){this.ea=ea};
Product.prototype.setPrice=function(price){this.price=price};

Product.prototype.toaa=function(){
	let str=`{ "code":"\${this.code}",
			  "codeName":"\${this.codeName}",
			  "ea":"\${this.ea}",
			  "price":"\${this.price}"
	
	
	}`;
	return str;
}
Product.prototype.toJSON2= function(){
	let str={
			'code': this.code,
			'codeName':this.codeName,
			'ea':this.ea,
			'price':this.price
	};
	return str;
}
Product.prototype.toHTML = function(){
	let str = "<div class='items'>"
			    + "  <span class='code'>"     + this.code     + "</span>"
			    + "  <span class='codeName'>" + this.codeName + "</span>"
			    + "  <span class='ea'>"       + this.ea       + "</span>"
			    + "  <span class='price'>"    + this.price    + "</span>"
			    + "</div>";
	return str;			    
}		
let r=document.getElementById('result');	


let s1=new Product();
s1.setCode('aaa');
s1.setCodeName('홍길동');
s1.setEa('111');
s1.setPrice('1234');


let array=[];	
array.push(s1);
for(d of array){
	r.innerHTML+=d.toJSON();
   
}
</script>

</body>
</html>