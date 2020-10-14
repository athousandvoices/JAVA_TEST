<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exam1</title>
</head>
<body>
	<form name="Exam1" method="post" action="Exam1_process.jsp">
		<p>학번 : <input type="text" name="no"></p>
		<p>이름 : <input type="text" name="name"></p>
		<p>국어 : <input type="text" name="kor"></p>
		<p>영어 : <input type="text" name="eng"></p>
		<p>수학 : <input type="text" name="mat"></p>
		<p>
			<input type="submit" value="전송">
			<input type="reset" value="초기화">
		</p>
	</form>
</body>
</html>