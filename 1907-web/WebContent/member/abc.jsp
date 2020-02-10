<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<span>폼 태그의 값들을 전달받음...</span>
<%//스클립들릿(java code)
 String mid = request.getParameter("mid");//input name='mid' 스클립들릿 영역은 대소문자 구별
 out.print(mid);




%>
</body>
</html>