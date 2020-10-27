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
<title>사원정보변경화면</title>
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
		<h1 style="margin-top:5px;">인사관리 사원정보변경 화면</h1>
		<br>
		<hr style="margin-bottom:10px;">
		<form name="f" method="post" action="update_process.jsp" target="iframe1" onsubmit="return checkWrite();">
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
					<th width="125" height="35" align=center>소속부서</th>
					<td width="350" height="35" align=left>
						<select id="dept" name="dept" style="width:80px; height:30px;">
							<option value="인사부" selected>인사부</option>
							<option value="기획부">기획부</option>
							<option value="영업부">영업부</option>
							<option value="경리부">경리부</option>
						</select>
					</td>
				</tr>
				<tr>
					<th width="125" height="35" align=center>직급</th>
					<td width="350" height="35" align=left>
						<select id="position" name="position" style="width:80px; height:30px;">
							<option value="1" selected>1급</option>
							<option value="2">2급</option>
							<option value="3">3급</option>
							<option value="4">4급</option>
						</select>			
					</td>				
				</tr>
				<tr>
					<th width="125" height="35" align=center>직책</th>
					<td width="350" height="35" align=left>
						<input type="text" name="duty" size=30 id="duty" class="textbox">
					</td>				
				</tr>
				<tr>
					<th width="125" height="35" align=center>연락처</th>
					<td width="350" height="35" align=left>
						<select id="phone" name="phoneOne" style="width:50px; height:30px;">
							<option value="010" selected>010</option>
							<option value="011">011</option>
							<option value="016">016</option>
							<option value="017">017</option>
							<option value="018">018</option>
							<option value="019">019</option>					
						</select>
						-
						<input type="text" name="phoneTwo" size=7 id="phone" maxlength=4 style="width:70px; height:30px;">
						-
						<input type="text" name="phoneThree" size=7 id="phone" maxlength=4 style="width:70px; height:30px;">						
					</td>
				</tr>
				<tr>
					<td colspan="2" align=center height="30">
						<input type="submit" name="submit" value="변 &nbsp;경" class="buttons">
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