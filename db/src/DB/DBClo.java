package DB;

import java.sql.*;

public class DBClo {

	public static void close(Connection con, Statement stmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
				System.out.println("rs����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
				System.out.println("stmt����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
				System.out.println("con����");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
