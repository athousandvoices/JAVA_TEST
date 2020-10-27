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
				String sql="update personnel set name=?, dept=?, position=?, duty=?, phone=? where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,name);
				pstmt.setString(2,dept);
				pstmt.setString(3,position);
				pstmt.setString(4,duty);
				pstmt.setString(5,phone);
				pstmt.setInt(6,id);
				pstmt.executeQuery();
				out.println("<script>alert('정보 수정이 완료되었습니다!');</script>");
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