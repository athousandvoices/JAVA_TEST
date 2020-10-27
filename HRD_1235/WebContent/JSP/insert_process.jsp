<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="../sub/main.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%@ include file="DBConn.jsp" %>
		<%
			request.setCharacterEncoding("utf-8");
			PreparedStatement pstmt=null;
			try {
				int id=Integer.parseInt(request.getParameter("id"));
				String name=request.getParameter("name");
				String dept=request.getParameter("dept");
				String position=request.getParameter("position");
				String duty=request.getParameter("duty");
				String phone=request.getParameter("phoneOne")+"-"+request.getParameter("phoneTwo")+"-"+request.getParameter("phoneThree");
				String sql="insert into personnel values(?,?,?,?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3,dept);
				pstmt.setString(4,position);
				pstmt.setString(5,duty);
				pstmt.setString(6,phone);
				pstmt.executeQuery();
				out.println("<script>alert('사원 등록이 완료되었습니다!');</script>");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(pstmt!=null)
					pstmt.close();
				if(conn!=null)
					conn.close();
			}
		%>
</body>
</html>