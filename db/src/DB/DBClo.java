package DB;

import java.sql.*;

public class DBClo {

	public static void close(Connection con, Statement stmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
				System.out.println("rs해제");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(stmt != null) {
			try {
				stmt.close();
				System.out.println("stmt해제");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
				System.out.println("con해제");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
