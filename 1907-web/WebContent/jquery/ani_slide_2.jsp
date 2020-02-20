<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src=../lib/jquery-3.4.1.js></script>
<style>
  *{margin:0px; padding:0px}
  
  /* Animation Canvas*/
  .animation_canvas{
  overflow:hidden;
  position : relative;
  width:600px; height:400px;
  }

 /* Slider Panel*/
 .slider_panel{width:3000px; position: relative;}
 .slider_image{float:left; width:600px; height:400px;}
  
  
 /*Slider Text Panel*/
 .slider_text_panel{
  position:absolute;top:200px;left:50px;
 } 
 .slider_text{position:absolute; widht:250px; height:150px;}
 /*Control Panel*/
 .control_panel{
  position:absolute;top:380px;
  left:270px; height:13px;
  overflow:hidden;
 }
 .control_button{
    width:12px; height:46px;
    position:relative;
    float:left; cursor:pointer;
    background:url('../images/ddd.png');
 } 
 .control_button:hover{top:-16px;}
 .control_button:active{top:-31px;}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
</style>
</head>
<body>
<h1>test header</h1>
<div class='animation_canvas'>
   <div class='slider_panel'>
    <img class='slider_image' src='../images/aaab.jpg'/>
    <img class='slider_image' src='../images/aa.jpg'/>
    <img class='slider_image' src='../images/cc.jpg'/>
    <img class='slider_image' src='../images/small.jpg'/>
    <img class='slider_image' src='../images/Koala.jpg'/>
   </div>
   <div class='slider_text_panel'>
        <div class='slider_text'>
         <h1>Lorem ipsum</h1>
         <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
       </div>
        <div class='slider_text'>
         <h1>aaaaa</h1>
         <p>bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.</p>
       </div>
        <div class='slider_text'>
         <h1>xcccccc</h1>
         <p>cccccccccccccccccccccccccccccccccccccccccccccccccccc.</p>
       </div>
        <div class='slider_text'>
         <h1>dddddddd</h1>
         <p>dddddddddddddddddddddddddddddddddddddddddddddddddddddddddd.</p>
       </div>
        <div class='slider_text'>
         <h1>eeeeeee</h1>
         <p>eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee.</p>
       </div>
   </div>
   <div class='control_panel'>
         <div class='control_button'></div>
         <div class='control_button'></div>
         <div class='control_button'></div>
         <div class='control_button'></div>
         <div class='control_button'></div>
   </div>

</div>
<h1>test footer</h1>
<script>
//슬라이더를 움직여주는 함수
function moveSlider(index){
	
}
/* //초기 텍스트 위치 지정 및 data-index 할당
let img=['img1.jpg','img1.jpg','img1.jpg','img1.jpg','img1.jpg']
$('.image').each(function(index){
	$(this).attr({
		'src':'../images/'+img[index]
	})
}) */
$('.slider_text').css('left',-300).each(function(index){
 $(this).attr('data-index',index);	

});
//컨틀로 버튼의 클릭 리스너 지정 및 data-index할당
$('.control_button').each(function(index){
	$(this).attr('data-index',index);

}).click(function(){
	var index=$(this).attr('data-index');
	moveSlider(index);
});

//초기 슬라이더 위치 지정
var randomNumber = Math.round(Math.random()*4);
moveSlider(randomNumber);
	

function moveSlider(index){
	var willMoveLeft=-(index*600);
	$('.slider_panel').animate({left:willMoveLeft},'slow');
	
	//control_button 에 active 클래스를 부여/제거합니다.
	$('.control_button[data-index='+index+']').addClass('active');
	$('.control_button[data-index!='+index+']').removeClass('active');
	
	//글자를 이동합니다.
	$('.slider_text[data-index='+index+']').show().animate({
		left:0
	},3000);
	$('.slider_text[data-index!='+index+']').hide(3000,function(){
		$(this).css('left',-300);
	});
	
	
	
	
}

</script>
</body>
</html>