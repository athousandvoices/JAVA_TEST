<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<%@ include file="DBConn.jsp" %>
		<%
			request.setCharacterEncoding("utf-8");
		
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
		
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				String sql="select id, name, dept, position, duty, phone from personnel where id = ? and name = ?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				rs=pstmt.executeQuery();
				if(rs.next()) {
					int rId=rs.getInt("id");
					String rName=rs.getString("name");
					
					if(id==rId && name.equals(rName)) {
						sql="delete from personnel where id = ? and name = ?";
						pstmt=conn.prepareStatement(sql);
						pstmt.setInt(1, id);
						pstmt.setString(2, name);
						pstmt.executeUpdate();
						out.println("<script>alert('퇴사 처리가 완료되었습니다!');</script>");
					}
				}
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