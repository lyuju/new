<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
<h3>게시판수정</h3>
<form name='frm'>
<label>순번</label>
<input type='text' name='serial' readonly/>
<label>작성자</label>
<input type='text' name='mName' ><br/>
<label>제목</label>
<input type='text' name='subject' ><br/>
<textarea rows="10" cols="70" name="content"></textarea><br/>
<input type='button' value='수정' name='btnModify'>
<input type='button' value='목록' name='btnSelect'>
</form>
</body>
</html>