<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp_select_form</title>

<script src='../lib/jquery-3.4.1.js'></script>
</head>
<body>
<form name='frm'>
 <input type='text' name='findStr' id='findStr'>
 <input type='button' value='검색' id='btnFind'>
</form>
<div id='div3' class='frame'></div>
<script>
let xhr = new XMLHttpRequest();

$('#btnFind').click(function(){
	let v = $('#findStr').val();
   let url='emp_select_result.jsp?findStr='+v;
    xhr.open('get',url);
    xhr.send();
    xhr.onreadystatechange=function(){
    	if(xhr.status==200 && xhr.readyState==4){
			let temp = xhr.responseText;
			let data = JSON.parse(temp);
			let a=1;
			console.log(temp);
			let str = '';
			str = "<div class='header'>"
			+"<span class='no'>No</span>"
		    + "<span class='id'>사번</span>"
		    + "<span class='dname'>성명</span>"
		    + "<span class='salary'>급여</span>"
		    + "<span class='dCode'>부서코드</span>"
		    + "<span class='dName'>부서명</span>"
		    + "</div>";
			    
			for(let i=0 ; i<data.length ; i++){
				str += "<div class='item'>"
					+"<span class='no'>"+ a++ + "</span>"
				    +  "  <span class='id'>"    + data[i].eid    + "</span>"
				    +  "  <span class='dname'>" + data[i].fn + '</span>'
				    +  "  <span class='salary'>"   + data[i].sal   + '</span>'
				    +  "  <span class='dCode'>"   + data[i].did   + '</span>'
				    +  "  <span class='dName'>"   + data[i].dname   + '</span>'
				    +  "</div>";
			}
			$('#div3').html(str);
		}
	}
})

	
	
/* String sql="select E.employee_id eid, E.first_name fn, to_char(E.salary, '999,999')"
            +"E.department_id did, nvl(D.department_name,' ') dname"
            +"from employees E left outer join departments D"
            +"on E.department_id = D.department_id"
            +"where employee_id=? or lower(first_name) like lower(?)"
            +"order by first_name"; 
            
            int id=0;
try{
	id=Integer.parseInt(findStr);//숫자면 그냥 실행 ,문자면 익셉션 발생
}catch(Exception ex){} 
            
ps.setInt(1,id)
ps.setString(2,"%"+findStr+"%");
int no = 0;
String pattern = "{'no' : '%s', 'eid' : '%s' , "
				+ " 'fn':'%s', 'sal':'%s', "
				+ " 'did' :'%s' , 'dname' : '%s'"
				};
if(rs.getInt("did")==0){
	tempDid="";
}else{
	tempDid = rs.getInt("did")+"";
}
String str = 
	String.format(pattern ,no , rs.getInt("eid"), rs.getString("fn"),
			rs.getString("sal"),tempDid,rs.getString("dname"));
			sb.append(str);
	fwkd
 
 String data=sb.toString();
 data=data.replaceAll("\'","\"")
 if(data.length()>1){
	data= data.substring(0,data.length()-1);
 }
 data+="]";	
 out.print(data);
*/

</script>
</body>
</html>