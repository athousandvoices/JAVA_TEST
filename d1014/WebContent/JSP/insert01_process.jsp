<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
	
	Statement stmt=null;
	try {
		String sql="insert into memberTable(id,passwd,name) values('"+id+"','"+passwd+"','"+name+"')";
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
		out.println("member 테이블에 삽입이 성공했습니다.");
	} catch(SQLException e) {
		out.println("member 테이블에 삽입이 실패했습니다.");
		out.println("SQLException: "+e.getMessage());
	} finally {
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}
	%>
</body>
</html>