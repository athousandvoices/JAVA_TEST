import java.sql.*;
public class DBConn {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection conn=null;
		try {
			String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user="system";
			String pass="1234";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,user,pass);
		} catch(SQLException e) {
			
		}
	}

}
