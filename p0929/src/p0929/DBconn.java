package p0929;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {
	
	public static Connection makeConnection(){
		String url = "jdbc:mysql://localhost/yangjung?serverTimezone=UTC";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 중...");
			con=DriverManager.getConnection(url,"root","1!aA3300eodlf");
			System.out.println("데이터베이스 연결 성공!");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다...");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
		}
		return con;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeConnection();
	}
}

/*
*프로젝트 우클릭하여
*ㄴ Build Path
* ㄴ Configure Build Path
*  ㄴ Libraries
*   ㄴ Add External JARs
*    ㄴ MySQL 경로에서 Connector J x.x 폴더 안의 JAR 파일 임포트
*/