<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<script type="text/javascript" src="../sub/main.js"></script>
<style>
	h1 {
		text-align:center;
	}
	table {
		margin-left:auto;
		margin-right:auto;
	}
	.textbox {
		height:28px;
	}
	.buttons {
		text-align:center;
		width:65px;
		height:26px;
	}
</style>
<title>퇴사처리화면</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../sub/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<header class="header">
		<h1 id="header_title">(과정평가형 정보처리산업기사) 인사관리 시스템ver1.0</h1>
	</header>
	<div class="error800">
		<span id="errortitle">
			800px 미만 환경에서는 동작하지 않습니다.
		</span>
	</div>
	<jsp:include page="nav.jsp" />
	<section class="section">
		<br>
		<h1 style="margin-top:5px;">인사관리 퇴사처리 화면</h1>
		<br>
		<hr style="margin-bottom:10px;">
		<form name="f" method="post" action="delete_process.jsp" target="iframe1" onsubmit="return checkWrite();">
			<table border=1>
				<tr>
					<th width="125" height="35" align=center>성명</th>
					<td width="350" height="35" align=left>
						<input type="text" name="name" size=30 id="name" class="textbox">
					</td>
				</tr>
				<tr>
					<th width="125" height="35" align=center>사원번호</th>
					<td width="350" height="35" align=left>
						<input type="text" name="id" size=30 id="id" class="textbox" maxlength=3>
					</td>
				</tr>
				<tr>
					<td colspan="2" align=center height="30">
						<input type="submit" name="submit" value="삭 &nbsp;제" class="buttons">
						<input type="reset" name="reset" value="취 &nbsp;소" class="buttons">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp" />
</body>
<iframe name="iframe1" style="display:none;"></iframe>
</html>