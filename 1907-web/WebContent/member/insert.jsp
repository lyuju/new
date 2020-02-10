<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 입력</title>
</head>
<body>
<div id = 'm_insert' class='m_insert'>
<h3>회원정보 입력</h3>
<form name ='m_frm' action='abc.jsp' method='' target=''>
 <label>아이디</label>
 <input type='text' name='mid' size='12'value='hong' maxlength='10'/>
 <br/>
 <label>암&nbsp;&nbsp;&nbsp;호</label>
 <input type='password' name='pwd' size = '15' maxlength='20'/>
 <br/>
 <label>회원명</label>
 <input type='search' name='mName' size='15'/> 
 <br/>
 <label>생년월일</label>
 <input type='date' name='birth' />
 <label>[주민번호 뒷자리 한자]</label>
 <input type = 'text' name='jumin' size='1' maxlength='1'/>
 <br/>
 <label>성별</label>
 <label><input type='radio' name='gender' value='m'>남자</label>
 <label><input type='radio' name='gender' value='f'>여자</label>
 <br/>
 <label>취미</label>
  <label><input type='checkbox' name='hobby' value='축구'>축구</label>
  <label><input type='checkbox' name='hobby' value='야구'>야구</label>
  <label><input type='checkbox' name='hobby' value='배구'>배구</label>
  <label><input type='checkbox' name='hobby' value='농구'>농구</label>
 <br/>
 <label>좋아하는 색상</label>
 <input='color' name='fcolor'/>
 <br/>
 <label>주량</label>
 <input type ='range' min='0' max='20000' step='1000' value='1000'/>

 <label>증명사진</label>
 <input type='file' name='photo'/>
 
 <br/>
 <label>간단한 자기 소개</label>
 <textarea rows='10' cols ='60' name='info'></textarea>
 
 <br/>
 <label>학년</label>
 <select name = 'grade' size='3'>
  <option value='1'>1학년</option>
  <option value='2'>2학년</option>
  <option value='3'>3학년</option>
  <option value='4'>4학년</option>
  <option value='5'>5학년</option>
 </select>
 <br/>
 <label>지원과정</label>
 <select name='course'>
   <optgroup label="WEB">
    <option value = 'html5'>html5</option>
    <option value='css'>css</option>
    <option value='javascript'>javascript</option>
   </optgroup>
   <optgroup label="framework">
    <option value ='ajax'>ajax</option>
    <option value ='mybatis'>mybatis</option>
    <option value ='node.js'>node.js</option>
    <option value ='spring'>spring</option>
   </optgroup>
    
   
   
    
 
 </select>
 <p/>
  <input type='reset' value='초기값'/>
  <input type='button' value='버튼'/>
  <input type='submit' value='전송'/>
 
 
 
 </form>



</div>




</body>
</html>