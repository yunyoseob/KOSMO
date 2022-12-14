package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.t6.vo.T6VO;

public abstract class ChabunQuery {

	public static final short CHABUN_QUERY_TEST = 0;
	public static final short CHABUN_QUERY_T6=1;
	
	public static String chabun_query[] = {
		"SELECT NVL(MAX(SUBSTR(A.T1, -4)), 0) + 1  COMM_NUM FROM TEST_T4 A",
		"SELECT NVL(MAX(SUBSTR(A.T1, -4)), 0) + 1  COMM_NUM FROM TEST_T6 A"
	};
	

	
	public static String getTestChabunQuery() {
		System.out.println("ChabunQuery.getTestChabunQuery() >>> : ");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNum = "";
		
		try {
			conn = OracleConnProperty.getConnection();
			
			String sql = ChabunQuery.chabun_query[CHABUN_QUERY_TEST];
			pstmt = conn.prepareStatement(sql);
			System.out.println("채번 쿼리 >>> : \n" + sql);
	
			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				while (rsRs.next()) {
					commNum = rsRs.getString("COMM_NUM");					
				}
				
			}else {
				System.out.println("ChabunQuery :: 채번 검색 결과가 없넹 ㅋㅋㅋ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("ChabunQuery :: 채번 검색중 에러가  >>> : " + e.getMessage());
		}
		return commNum;
	}
	
	public static String getT6ChabunQuery(){
		System.out.println("\n ChabunQuery.getT6ChabunQuery(String name, String age) 시작");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNum = "";
		
		try{
			conn=OracleConnProperty.getConnection();
			
			String sql=ChabunQuery.chabun_query[CHABUN_QUERY_T6];
			pstmt = conn.prepareStatement(sql);
			System.out.println("채번 쿼리 >>> : \n" + sql);
			
			rsRs = pstmt.executeQuery();
						
			if (rsRs !=null) {
				while (rsRs.next()) {
					commNum = rsRs.getString("COMM_NUM");
				}
			}else {
				System.out.println("ChabunQuery :: 채번 검색 결과가 없넹 ㅋㅋㅋ >>> : " + rsRs);
			}		
		}catch(Exception e){
			System.out.println("ChabunQuery.getT6ChabunQuery :: error >>> : "+e.getMessage());
		}
		return commNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
