package p0929;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class selectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(jdbcDriver);
			System.out.println("데이터베이스 연결 중...");
			conn = DriverManager.getConnection(jdbcUrl,"root","1!aA3300eodlf");
			System.out.println("데이터베이스 연결 성공!");
		} catch (Exception e){
			System.out.println("데이터베이스 연결 실패!");
		}
	}

}
