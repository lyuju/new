/**
 * 회원관리
 * date:2020.02.21
 */

let xhr=new XMLHttpRequest();
let init = function(){
	let v=$('#findStr').val();
	let url='member_select.jsp?findStr='+v;
	console.log(url);
	xhr.open('get',url);
	xhr.send();
	xhr.onreadystatechange = function(){
		if(xhr.status==200&&xhr.readyState==4){
			let temp=xhr.responseText;
			let data=JSON.parse(temp);
			$('#result').html(xhr.responseText);
		}
	}
}