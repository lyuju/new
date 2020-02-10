<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>css_transform</title>
<style>
div{
 border:2px solid #aaaaff;
 width:400xp; height:150px;
 margin-bottom:20px;
}
#rotate>span{
 position:absolute;
 margin:30px;
 font-size:30px;
 -webkit-transform-origin : 0% 0%;
 transform:rotate(45deg);
}
#scale{
 height:400px;
}
#scale>.a{
 transform:scale(0.5);
}
#scale>.b{
position:relative;
top:50px; left:50px;
 transform:scale(1.3);
}
#skew>span{
position:absolute;
font-size:50px;
transform:skew(40deg,10deg);
}
#translate>span{
 font-size:50px;
 position:absolute;
 transform:translate(100px,30px)
 
}
</style>
</head>
<body>
<h3>transform</h3>
<ul>
 <li>rotate</li>
 <li>scale</li>
 <li>skew</li>
 <li>translate</li>
</ul>
<hr/>
<div id='rotate'>
 <span>화이팅 1907</span>
</div> 
<div id='scale'>
 <img src='../images/ccc.jpg' />
 <img src='../images/ccc.jpg' class='a'/>
 <img src='../images/ccc.jpg' class='b'/>
</div> 
<div id='skew'>
 <span>화이팅 1907</span>
</div> 
<div id='translate'>
 <span>화이팅 1907</span>
</div> 
</body>
</html>