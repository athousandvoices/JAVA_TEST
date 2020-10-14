<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World!!!</h1>
	<%
		Connection conn = null;
		try {
			String jdbcDriver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
			
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(url,"root","1!aA3300eodlf");
			out.println("데이터베이스 연결이 성공했습니다.<br>");
		} catch (SQLException e) {
			out.println("데이터베이스 연결이 실패했습니다.<br>");
			e.printStackTrace();
			out.println(e.getMessage());
		} 
	%>
</body>
</html>