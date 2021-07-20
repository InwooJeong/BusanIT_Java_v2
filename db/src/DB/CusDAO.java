package DB;
import java.sql.*;
import java.util.*;

public class CusDAO {
	Connection con; //�������
	Statement stmt;
	ResultSet rs;
	
//	public void getCon() { //close������ ���� �ϴ� �и�
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String userid = "madang";
//		String pwd = "madang";
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("����̹� �ε� ����");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			System.out.println("DB���� �غ�@@@@");
//			con = DriverManager.getConnection(url,userid,pwd);
//			System.out.println("DB���� ����@@@");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	ArrayList<CusDTO> cList(){

		con = new DBCon().getConnection();
		
		ArrayList<CusDTO> cList = null;
		
		String query = "SELECT * FROM CUSTOMER";
		System.out.println("Cust ID \tNAME \t\tADDRESS \t\tPHONE");
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			cList = new ArrayList<CusDTO>();
			while(rs.next()) {
				CusDTO cdto = new CusDTO();
				
				cdto.setCustid(rs.getInt(1));
				cdto.setName(rs.getString(2));
				cdto.setAddress(rs.getString(3));
				cdto.setPhone(rs.getString(4));
				cList.add(cdto);
			}
//			rs.close();
//			stmt.close();
//			con.close();
			//System.out.println("DB ��� �Ϸ� ���� ����@@@");
			//System.out.println("DB���� ����@@@");
			
			for(CusDTO cdto : cList) {
				System.out.println(cdto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBClo.close(con, stmt, rs);
		}
		
		return cList;
	}
	
	
}
