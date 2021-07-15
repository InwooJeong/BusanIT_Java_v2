package DB;

import java.sql.*;
import java.util.*;

public class BookDAO {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	//public DB() {
	public void getCon() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang";
		String pwd = "madang";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("DB연결 준비");
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("DB연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
//	void sqlRun() {
//		String query = "SELECT * FROM Book";
//		try {
//			stmt = con.createStatement();
//			rs = stmt.executeQuery(query);
//			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \t\t\tPRICE");
//			while(rs.next()) {
//				System.out.print("\t"+rs.getInt(1));
//				System.out.print("\t"+rs.getString(2));
//				System.out.print("\t\t\t"+rs.getString(3));
//				System.out.println("\t\t\t\t"+rs.getInt(4));
//			}
//			//con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	void cusSel() {
//		String query = "SELECT	*"
//				+ "		FROM	customer";
//		try {
//			stmt = con.createStatement();
//			rs = stmt.executeQuery(query);
//			System.out.println("CUST ID \tNAME \t\tADDRESS \tPHONE");
//			while(rs.next()) {
//				System.out.print("\t"+rs.getInt(1));
//				System.out.print("\t"+rs.getString(2));
//				System.out.print("\t\t"+rs.getString(3));
//				System.out.println("\t"+rs.getString(4));
//			}
//			//con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
	ArrayList<BookDTO> bList(){
		ArrayList<BookDTO> bList = null;
		
		String query = "SELECT * FROM book";
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("Book NO \tBOOK NAME \t\tPUBLISHER \t\tPRICE");
			bList = new ArrayList<BookDTO>();
			while(rs.next()) {
				BookDTO bdto = new BookDTO();
				
				bdto.setBookid(rs.getInt(1));
				bdto.setBookname(rs.getString(2));
				bdto.setPublisher(rs.getString(3));
				bdto.setPrice(rs.getInt(4));
				bList.add(bdto);
			}
			
			//System.out.println(bList);
			for(BookDTO bdto : bList) {
				System.out.println(bdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bList;
	}
	
}	