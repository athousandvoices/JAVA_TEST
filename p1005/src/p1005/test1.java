package p1005;

import java.sql.*;
import java.util.Scanner;

public class test1 {
		Scanner s=new Scanner(System.in);
		String jdbcDriver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
		public test1(){
			System.out.println("## 학생정보를 등록하세요.");
			System.out.print("학번 : ");
			int hakbun=s.nextInt();
			System.out.print("이름 : ");
			String name=s.next();
			System.out.print("학년 : ");
			int hakyen=s.nextInt();
			try {
				Class.forName(jdbcDriver);
				conn=DriverManager.getConnection(url,"root","1!aA3300eodlf");
			} catch(Exception e) {
				e.printStackTrace();
			}
			String  sql="insert into student(hakbun,name,hakyen) values(?,?,?)";
			try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, hakbun);
				pstmt.setString(2, name);
				pstmt.setInt(3, hakyen);
				pstmt.executeUpdate();
			} catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("## 학생 명단 ##");
			sql="select hakbun,name,hakyen from student";
			try {
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next()){
					System.out.printf("%10d %10s %5d\n", rs.getInt(1),rs.getString(2),rs.getInt(3));
				} 
			} catch(Exception e) {
				e.printStackTrace();
			}
		}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test1();
	}

}
