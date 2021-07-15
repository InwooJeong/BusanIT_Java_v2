package DB;
import java.sql.*;
import java.util.*;

public class CusDAO {
	Connection con; //멤버변수
	Statement stmt;
	ResultSet rs;
	
	public void getCon() { //close관리를 위해 일단 분리
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "madang";
		String pwd = "madang";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("DB연결 준비@@@@");
			con = DriverManager.getConnection(url,userid,pwd);
			System.out.println("DB연결 성공@@@");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	ArrayList<CusDTO> cList(){
		ArrayList<CusDTO> cList = null;
		
		String query = "SELECT * FROM CUSTOMER";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("Cust ID \tNAME \t\tADDRESS \t\tPHONE");
			cList = new ArrayList<CusDTO>();
			while(rs.next()) {
				CusDTO cdto = new CusDTO();
				
				cdto.setCustid(rs.getInt(1));
				cdto.setName(rs.getString(2));
				cdto.setAddress(rs.getString(3));
				cdto.setPhone(rs.getString(4));
				cList.add(cdto);
			}
			con.close();
			
			for(CusDTO cdto : cList) {
				System.out.println(cdto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cList;
	}
	
	
}
