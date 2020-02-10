<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>이미지 경로를 절대|상대 경로지정</h3>
<img src='../images/aaab.jpg'><br/>
<img src='/1907-web/images/aaab.jpg'><br/>
<h3>이미지 표시 사이즈 변경</h3>
<img src='../images/aaab.jpg' width='100px'><br/>
<img src='../images/aaab.jpg' width='50px'><br/>
<img src='../images/aaab.jpg' width='50px' height='150px'/><br/>

<h3>문자와 이미지의 배치</h3>
<p>
<img src='../images/aaab.jpg' align='left'>
align='left' 속성은 이미지가 문자의 왼쪽에 배치된다는 의미임.
<p/>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<p>
<img src='../images/aaab.jpg' align='right'>
align='right' 속성은 이미지가 문자의 왼쪽에 배치된다는 의미임.
<p/>

<p>
<img src='../images/aaab.jpg' align='left'hspace='50px'>
align='left' 속성은 이미지가 문자의 왼쪽에 배치된다는 의미임.
<p/>

<h4>use map</h4>
<img src='../images/aaab.jpg' usemap='#usemap_image'>
<map name ='usemap_image'>
 <area shape = 'rect' coords ='0,0,324,339' title='폰트연습페이지' href = 'font.jsp'>
 <area shape = 'rect' coords ='0,340,324,434' title='aa연습페이지' href = 'paragraph.jsp'>
 <area shape = 'rect' coords ='0,435,324,593' title='bb연습페이지' href = 'anchor.jsp'>

</map>
</body>
</html>