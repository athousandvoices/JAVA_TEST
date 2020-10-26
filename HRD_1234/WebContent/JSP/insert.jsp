<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<style>
	* {
		font-family: 'NanumSquareRound'; 
	}
	.section {
		text-align:center;
	}
	table {
		margin-left:auto;
		margin-right:auto;
	}
</style>
<script type="text/javascript" src="../sub/insert.js"></script>
<link rel="stylesheet" type="text/css" href="../sub/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>성적입력</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="nav.jsp" />
	<section class="section">
		<br>
		<h1>학생 성적 입력</h1>
		<br>
		<form name="f" method="post" action="insert_process.jsp" target="iframe1" onsubmit="return checkWrite();">
			<table border=1>
				<tr>
					<td width="150" align=center>학번</td>
					<td width="200"><input type="text" name="sno" size=25 id="sno" maxlength="5"></td>
				</tr>
				<tr>
					<td width="150" align=center>성명</td>
					<td width="200"><input type="text" name="sname" id="sname" size=25></td>
				</tr>
				<tr>
					<td width="150" align=center>국어</td>
					<td width="200"><input type="text" name="kor" size=25 maxlength="3" id="kor"></td>
				</tr>
				<tr>
					<td width="150" align=center>영어</td>
					<td width="200"><input type="text" name="eng" size=25 maxlength="3" id="eng"></td>
				</tr>
				<tr>
					<td width="150" align=center>수학</td>
					<td width="200"><input type="text" name="math" size=25 maxlength="3" id="math"></td>
				</tr>
				<tr>
					<td width="150" align=center>역사</td>
					<td width="200"><input type="text" name="hist" size=25 maxlength="3"id="hist"></td>
				</tr>
				<tr>
					<td colspan="2" align=center>
						<input type="submit" name="submit" value="성적저장">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp" />
</body>
<iframe name="iframe1" style="display:none;"></iframe>
</html>