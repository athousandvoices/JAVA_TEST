<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="DBConn.jsp" %>
	<% 
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		String name=request.getParameter("name");
		PreparedStatement pstmt=null;
		
		try {
			String sql="insert into memberTable(id,passwd,name) values(?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,passwd);
			pstmt.setString(3,name);
			pstmt.executeUpdate();
			out.println("member 테이블에 삽입을 성공했습니다.");
		} catch(SQLException e) {
			out.println("member 테이블에 삽입을 실패했습니다.");
			e.printStackTrace();
			out.println("SQLException: "+e.getMessage());
		} finally {
			if(pstmt != null)
				pstmt.close();
			if(conn != null)
				conn.close();
		}
	%>
</body>
</html>