<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<script>
	function back() {
		window.history.back();
	}
</script>
<link rel="stylesheet" type="text/css" href="../sub/main.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%@ include file="DBConn.jsp" %>
	<div class="section">
		<%
			request.setCharacterEncoding("utf-8");
			PreparedStatement pstmt=null;
			try {
				String sNo=request.getParameter("sno");
				String sName=request.getParameter("sname");
				int kor=Integer.parseInt(request.getParameter("kor"));
				int eng=Integer.parseInt(request.getParameter("eng"));
				int math=Integer.parseInt(request.getParameter("math"));
				int hist=Integer.parseInt(request.getParameter("hist"));
				String sql="insert into examtbl values(?,?,?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,sNo);
				pstmt.setString(2,sName);
				pstmt.setInt(3,kor);
				pstmt.setInt(4,eng);
				pstmt.setInt(5,math);
				pstmt.setInt(6,hist);
				pstmt.executeQuery();
				out.println("<script>alert('성적입력이 완료 되었습니다!');</script>");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			}
		%>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>