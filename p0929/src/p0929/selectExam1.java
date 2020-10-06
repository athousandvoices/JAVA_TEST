package p0929;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class selectExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from student";
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl,"root","1!aA3300eodlf");
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			System.out.println("id\t\tnum\t\tname\t\taddr\t\t\t\t\tphone");
			System.out.println("---------------------------------------------------"
					+ "-------------------------------------------------");
			while(rs.next()){
				System.out.print(rs.getLong("hakbun") + "\t\t");
				System.out.print(rs.getString("name") + "\t\t");
				System.out.print(rs.getString("hakyen") + "\t\t");
				System.out.print(rs.getString("address") + "\t\t\t\t");
				System.out.print(rs.getString("hp") + "\n");
			}
		} 
		catch (Exception e){
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
