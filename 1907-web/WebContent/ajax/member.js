/**
 * 회원관리
 * date:2020.02.21
 */

let xhr=new XMLHttpRequest();
let init = function(){
	xhr.open('get','member_select.jsp');
	xhr.send();
	xhr.onreadystatechange = function(){
		if(xhr.status==200&&xhr.readyState==4){
			$('#result').html(xhr.responseText);
		}
	}
}