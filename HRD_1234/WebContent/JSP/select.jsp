<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
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
	.selectTable {
		width:99%;
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
	.tableright {
		text-align:right;
	}
</style>
<link rel="stylesheet" type="text/css" href="../sub/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>성적조회</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<jsp:include page="nav.jsp" />
	<section class="section">
	<%@ include file="DBConn.jsp" %>
		<%
			request.setCharacterEncoding("utf-8");
		%>
		<br>
		<h1>성적조회목록</h1>
		<br>
		<hr style="margin-bottom:10px;">
		<table class="selectTable">
			<tr class="tableheader">
				<th width=80>학년</th>
				<th width=80>반</th>
				<th width=80>번호</th>
				<th>성명</th>
				<th width=90>국어</th>
				<th width=90>영어</th>
				<th width=90>수학</th>
				<th width=90>역사</th>
				<th width=90>총점</th>
				<th width=90>평균</th>
			</tr>
			<%
				ResultSet rs=null;
				PreparedStatement pstmt=null;
				
				int tkor=0;
				int teng=0;
				int tmath=0;
				int thist=0;
				int tsum=0;
				double tavg=0;
				int cnt=0;
				
				try {
					String sql="select * from examtbl";
					pstmt=conn.prepareStatement(sql);
					rs=pstmt.executeQuery();
					while(rs.next()) {
						String sNo=rs.getString("sNo");
						String sName=rs.getString("sName");
						String sGrade=sNo.substring(0,1);
						String sClass=sNo.substring(1,3);
						String sNumber=sNo.substring(3,5);
						int kor=rs.getInt("kor");
						int eng=rs.getInt("eng");
						int math=rs.getInt("math");
						int hist=rs.getInt("hist");
						int sum=kor+eng+math+hist;
						double avg=(double)sum/4;
						tkor=tkor+kor;
						teng=teng+eng;
						tmath=tmath+math;
						thist=thist+hist;
						tsum=tkor+teng+tmath+thist;
						tavg=(double)tsum/4;
						cnt++;
			%>
			<tr>
				<td class="tablecenter"><%=sGrade %></td>
				<td class="tablecenter"><%=sClass %></td>
				<td class="tablecenter"><%=sNumber %></td>
				<td class="tablecenter"><%=sName %></td>
				<td class="tableright"><%=kor %></td>
				<td class="tableright"><%=eng %></td>
				<td class="tableright"><%=math %></td>
				<td class="tableright"><%=hist %></td>
				<td class="tableright"><%=sum %></td>
				<td class="tableright"><%=avg %></td>
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
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td class="tablecenter" style="font-weight:bold;">총점</td>
				<td class="tableright"><%=tkor %></td>
				<td class="tableright"><%=teng %></td>
				<td class="tableright"><%=tmath %></td>
				<td class="tableright"><%=thist %></td>
				<td class="tableright"><%=tsum %></td>
				<td class="tableright"><%=tavg %></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td class="tablecenter" style="font-weight:bold;">총평균</td>
				<td class="tableright"><%=tkor/cnt %></td>
				<td class="tableright"><%=teng/cnt %></td>
				<td class="tableright"><%=tmath/cnt %></td>
				<td class="tableright"><%=thist/cnt %></td>
				<td class="tableright"><%=tsum/cnt %></td>
				<td class="tableright"><%=tavg/(double)cnt %></td>
			</tr>
		</table>
		<hr style="margin-top:10px;">
	</section>
	<jsp:include page="footer.jsp" />
</body>
</html>