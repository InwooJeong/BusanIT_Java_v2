package DB;

import java.sql.*;

public class DBCon {
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String userid = "madang";
			String pwd = "madang";
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("@@@DB���� ����@@@");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("@@@DB���� ����@@@");
		}
		
		return con;
	}
	
}
