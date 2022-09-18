package a.b.c.test.paging;

import java.sql.Connection;
import java.sql.Statement;

public class BoardTestData {
	
public void insertData() throws Exception {
		
		Connection	conn = ConnProperty.getConnection();			
		Statement	stmt = conn.createStatement();
		String sqls = null;
			
		for (long i = 0; i < 200 ; i++){
			sqls = "INSERT INTO BOARD_PAGING VALUES ( "
														+ "B_SEQ.NEXTVAL, " 
														+ "'" + i + "', " 
														+ "'" + i + "', " 
														+ "'" + i + "', " 
														+ "'" + i + "', " 										 
														+ "DEFAULT, "
														+ "1"
												  + ")";
			
			int nCount = stmt.executeUpdate(sqls);		
			if (nCount % 100 == 0) conn.commit();
		}
		
		conn.commit();		
		stmt.close();stmt = null;
		conn.close();conn = null;
		System.out.println("finish >>> : ");
	}

	public static void main(String[] args) throws Exception{
		new BoardTestData().insertData();
	}

}
