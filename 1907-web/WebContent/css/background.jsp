<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>css_background</title>
<style>
/*모든 div의 넓이와 높이를 설정(250x150) 적당한 여백 display속성을 inline-block수정*/
div{
  border:2px solid #ff0000;

  width:500px; height:500px;
  margin:10px;
  display : inline-block;
 }
 #div1{
 overflow:auto;
 background-image:url(../images/ccc.jpg);
 background-attachment:scroll;
 }
 #div2{
 background-image:url(../images/ccc.jpg);
 background-repeat : no-repeat;
 barkground-position : 20px 20px;
 }
 #div3{
 background-image:url(../images/ccc.jpg);
 background-repeat : repeat-x;
 }
 #div4{
 background-image:url(../images/ccc.jpg);
 background-repeat : repeat-y;
 }
 #div5{
  background-image:url(../images/ccc.jpg);
  background-size:100% 100%;
 }
</style>
</head>
<body>
<h3>바탕이미지</h3>
<ul>
 <li>background-image:url(path)</li>
 <li>background-attachement : fixed | scroll</li>
 <li>background-position : x y | left | right| botton| top|center</li>
 <li>background-repeat : repeat-x | repeat-y|no-repeat</li>
 <li>background-size: sizeX sizeY</li>
</ul>
<hr/>
<div id='div1'>
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
엄청 많은 내용이 있는 영역
</div>
<div id='div2'></div>
<div id='div3'></div>
<div id='div4'></div>
<div id='div5'></div>
</body>
 
</html>