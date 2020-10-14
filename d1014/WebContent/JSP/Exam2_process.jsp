<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Exam1</title>
</head>
<body>
	<%@ include file="DBConn.jsp" %>
	<%
		request.setCharacterEncoding("utf-8");
		int no=Integer.parseInt(request.getParameter("no")); // ()안의 문자열 "no" 값을 Integer.parseInt 로 정수값으로 변환.
		String name=request.getParameter("name");
		int kor=Integer.parseInt(request.getParameter("kor"));
		int eng=Integer.parseInt(request.getParameter("eng"));
		int mat=Integer.parseInt(request.getParameter("mat"));
		int sum=kor+eng+mat;
		double avg=(double)sum/3;
		PreparedStatement pstmt=null;
		
		try {
			String sql="insert into stuTable1(no,name,kor,eng,mat,sum,avg) values(?,?,?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,no);
			pstmt.setString(2,name);
			pstmt.setInt(3,kor);
			pstmt.setInt(4,eng);
			pstmt.setInt(5,mat);
			pstmt.setInt(6,sum);
			pstmt.setDouble(7,avg);
			pstmt.executeUpdate();
			out.println("테이블에 삽입을 성공했습니다.<br><br>");
			out.println("<input type='button' value='뒤로가기' OnClick='history.back()'>");		
			} catch (SQLException e) {
			out.println("테이블에 삽입을 실패했습니다.");
			e.printStackTrace();
			out.println("SQLException: "+e.getMessage());
		} finally {
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		}
	%>
</body>
</html>