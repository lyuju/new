<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<h3>첨부 이미지 동적 삽입/삭제</h3>
<style>
#att_file {
	border: 1px solid #0000ff;
	padding: 10px;
	box-sizing: border-box;
	width: 600px;
}

#att_file>div {
	position: relative;
	display: inline-block;
	margin: 3px;
}
#att_file .btnDel{
	position: absolute;
	right:2px;
	bottom: 2px;
	width:40px;
	height:40px;
	font-size:34px;
	border:0px solid #ffffff;
	opacity: 0.3;
}
</style>
	<form name='frm'>
		<label>첨부이미지</label>
		<div id='att_file'></div>
	</form>


	<script>
		let main = document.getElementById('att_file');
		let cnt = 0;

		makeDiv(main);

		function makeDiv(main) {
			let div = document.createElement('div');
			div.setAttribute('style',
					'border:1px solid #f00; width:120px; height:180px');

			//image tag
			let img = document.createElement('img');
			img.setAttribute('name', 'img' + cnt);
			img.setAttribute('width', '120px');
			img.setAttribute('height', '180px');
			img.src = 'http://placehold.it/120x180';

			div.appendChild(img);

			//삭제 버튼
			let btnDel = document.createElement('input');
			btnDel.setAttribute('name', 'btnDel' + cnt);
			btnDel.setAttribute('type', 'button');
			btnDel.setAttribute('value', 'X');
			btnDel.setAttribute('class', 'btnDel');
			btnDel.onclick=function(ev){
				let obj=ev.srcElement;
				let parent=obj.parentNode;
				let tag=parent.getElementsByTagName('input')[1];//첫번째 태그는 del 두번쨰는 감춰논 파일태그
				if(tag.getAttribute('modify')=='yes'){
				main.removeChild(parent)	
				}
			}
			
			div.appendChild(btnDel);

			//이미지당 file tag
			let file = document.createElement('input');
			file.setAttribute('type', 'file');
			file.setAttribute('name', 'attFile' + cnt);
			file.setAttribute('style', 'display:none');
			file.setAttribute('modify', 'no');
			div.appendChild(file);

			//이미지를 클릭하면
			img.onclick = function() {//바탕이미지가 클릭되면 숨겨져있는 파일태그가 클릭된것처럼 한다.
				file.click();

			}
			file.onclick = function(event) {
				let btn = event.srcElement;//file tag
				btn.onchange = function() {
					//event.serElement;이벤트일어난곳이 btnFile이라 사용할 수 없다.
					let url = btn.files[0];
					let reader = new FileReader();
					reader.readAsDataURL(url);
					reader.onload = function(ev) {
						let temp = new Image();
						temp.src = ev.target.result;
						img.src = temp.src;//검은 이미지를 읽어들인 이미지로 바꿔준다.
					}
					if (file.getAttribute('modify') == 'no') {

						makeDiv(main);
					}
					file.setAttribute('modify', 'yes');
				}

			}

			main.appendChild(div);
			cnt++
		}
	</script>




</body>
</html>