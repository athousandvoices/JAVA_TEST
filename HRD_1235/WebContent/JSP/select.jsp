<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<script type="text/javascript" src="../sub/main.js"></script>
<style>
	.section {
		text-align:center;
	}
	.selectTable {
		margin-left:auto;
		margin-right:auto;
		width:800px;
		max-width:800px;
		border:1px solid #252525;
		border-collapse:collapse;
	}
	th, td {
		border:1px solid #252525;
	}
	.tableheader {
		text-align:center;
		height:25px;
	}
	.tablecenter {
		text-align:center;
	}
	.idselect a {
		text-decoration:none;
		color:black;
		font-weight:bold;
	}
</style>
<title>직원정보조회</title>
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
	<%@ include file="DBConn.jsp" %>
		<%	
			request.setCharacterEncoding("utf-8");
		%>
		<br>
		<h1 style="margin-top:5px;">직원 정보 조회</h1>
		<br>
		<hr style="margin-bottom:10px;">
		<table class="selectTable">
			<tr class="tableheader">
				<th width=20>no</th>
				<th width=130>성명</th>
				<th width=70>사번</th>
				<th width=70>직급</th>
				<th width=70>직책</th>
				<th width=160>연락처</th>
				<th width=130>소속부서</th>
			</tr>
			<%
				ResultSet rs=null;
				PreparedStatement pstmt=null;
				
				int no=0;
				
				try {
					String sql="select * from personnel";
					pstmt=conn.prepareStatement(sql);
					rs=pstmt.executeQuery();
					while(rs.next()) {
						int id=rs.getInt("id");
						no++;
						String name=rs.getString("name");
						String dept=rs.getString("dept");
						String p=rs.getString("position");
						String duty=rs.getString("duty");
						String phone=rs.getString("phone");
			%>
			<tr>
				<td class="tablecenter"><%=no %></td>
				<td class="tablecenter"><%=name %></td>
				<td class="tablecenter idselect">
					<a href="update_click.jsp?send_id=<%=rs.getString("id")%>">
						<%=id %>
					</a>
				</td>
				<td class="tablecenter"><%=p %>급</td>
				<td class="tablecenter"><%=duty %></td>
				<td class="tablecenter"><%=phone %></td>
				<td class="tablecenter"><%=dept %></td>
			</tr>
			<%
				}
				} catch(SQLException e) {
					e.printStackTrace();
				} finally {
					if(rs!=null)
						rs.close();
					if(pstmt!=null)
						pstmt.close();
					if(conn!=null)
						conn.close();
				}
			%>
		</table>
		<hr style="margin-top:10px;">
	</section>
	<jsp:include page="footer.jsp" />