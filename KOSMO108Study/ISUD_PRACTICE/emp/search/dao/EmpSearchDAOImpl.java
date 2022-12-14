package a.b.c.emp.search.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.OracleConnProperty;
import a.b.c.emp.search.sql.EmpSearchQueryMap;
import a.b.c.emp.search.vo.EmpSearchVO;

public class EmpSearchDAOImpl implements EmpSearchDAO {

	// 穿端 伊事 ---------------------------------------------------------------------------
	@Override
	public ArrayList<EmpSearchVO> empSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("EmpSearchDAOImpl.empSelectAll() >>> : 遭脊 失因 ");
		
		//
		Connection conn = null;
		//
		PreparedStatement pstmt = null;
		//
		ResultSet rsRs = null;
		//
		ArrayList<EmpSearchVO> aList = null;
		// 
		EmpSearchVO esvo = null;
		
		
		try {
			// 朕学芝 尻衣
			conn = OracleConnProperty.getConnection();
			
			// 汀軒庚 穿含
			String sql = EmpSearchQueryMap.getEmpSelectAll();
			pstmt = conn.prepareStatement(sql);
			System.out.println("穿端 伊事 >>> : \n" + sql);
			
			// 霜税 衣引 閤壱
			rsRs = pstmt.executeQuery();
			
			// 閤精 衣引研 dao 拭辞 service 稽 穿含馬奄 
			/*
			1. 霜税 衣引亜 赤澗走 溌昔 
			2. 霜税 衣引亜 赤生檎 ArrayList 昔什渡什 馬奄 
			3. 軒箭闘実拭 赤澗 boolean 朕辞 next 敗呪稽 傾坪球 亜閃神奄 
			4. 亜閃紳 傾坪球 VO 眼奄 
			5. VO 研 ArrayList拭 眼奄 
			*/		
			// 1. 霜税 衣引亜 赤澗走 溌昔 
			if (rsRs !=null) {
				// 2. 霜税 衣引亜 赤生檎 ArrayList 昔什渡什 馬奄 
				aList = new ArrayList<EmpSearchVO>();
				
				// 3. 軒箭闘実拭 赤澗 boolean 朕辞 next 敗呪稽 傾坪球 亜閃神奄 
				while (rsRs.next()) {
					
					// 4. 亜閃紳 傾坪球 VO 眼奄 
					esvo = new EmpSearchVO();
					esvo.setEmpno(rsRs.getString(1));
					esvo.setEname(rsRs.getString(2));
					esvo.setJob(rsRs.getString(3));
					esvo.setMgr(rsRs.getString(4));
					esvo.setHiredate(rsRs.getString(5));
					esvo.setSal(rsRs.getString(6));
					esvo.setComm(rsRs.getString(7));
					esvo.setDeptno(rsRs.getString(8));
					
					// 5. VO 研 ArrayList拭 眼奄 
					aList.add(esvo);
				}
				
			}else {
				System.out.println("EmpSearchDAOImpl :: 穿端 伊事 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("EmpSearchDAOImpl :: DAO :: 穿端 伊事掻 拭君亜 >>> :  " + e.getMessage());
		}
		
		// ArrayList 軒渡馬奄 
		return aList;
	}

	// 紫腰 伊事 ---------------------------------------------------------------------------
	@Override
	public ArrayList<EmpSearchVO> empSelectEmpno(EmpSearchVO evo) {		
		// TODO Auto-generated method stub
		System.out.println("EmpSearchDAOImpl.empSelectEmpno() >>> : 遭脊 失因 ");
		System.out.println("evo.getEmpno() >>> : " + evo.getEmpno()); // 7934

		// 走蝕痕呪 識情 貢 default value initialization 奄沙葵生稽 段奄鉢馬奄 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EmpSearchVO> aList = null;		
		EmpSearchVO _evo = null; // 7934	MILLER	CLERK	1982-01-23	10  眼聖 VO 
		
		/*
		朕学芝
		汀軒庚 穿含
		霜税衣引 閤焼神奄 
		*/
		try {
			// 朕学芝
			conn = OracleConnProperty.getConnection();
			
			// 汀軒庚 穿含
			String sql = EmpSearchQueryMap.getEmpSelectEmpno();
			pstmt = conn.prepareStatement(sql);
			System.out.println("紫腰 伊事 >>> : \n" + sql);
			
			pstmt.clearParameters();
//			sb.append(" WHERE    A.EMPNO = ?					\n"); // place holder 1
			pstmt.setString(1, evo.getEmpno()); // place holder 1  7934
			
			// 霜税衣引 閤焼神奄 
			rsRs = pstmt.executeQuery();
			// 7934	MILLER	CLERK	1982-01-23	10
			
			// 閤精 衣引研 dao 拭辞 service 稽 穿含馬奄 
			/*
			1. 霜税 衣引亜 赤澗走 溌昔 
			2. 霜税 衣引亜 赤生檎 ArrayList 昔什渡什 馬奄 
			3. 軒箭闘実拭 赤澗 boolean 朕辞 next 敗呪稽 傾坪球 亜閃神奄 
			4. 亜閃紳 傾坪球 VO 眼奄 
			5. VO 研 ArrayList拭 眼奄 
			*/		
			
			// 1. 霜税 衣引亜 赤澗走 溌昔 
			if (rsRs !=null) {
				// 2. 霜税 衣引亜 赤生檎 ArrayList 昔什渡什 馬奄 
				aList = new ArrayList<EmpSearchVO>();
				
				// 3. 軒箭闘実拭 赤澗 boolean 朕辞 next 敗呪稽 傾坪球 亜閃神奄 
				while (rsRs.next()) {
					// 4. 亜閃紳 傾坪球 VO 眼奄 
					
					_evo = new EmpSearchVO();
					// 7934	MILLER	CLERK	1982-01-23	10
					_evo.setEmpno(rsRs.getString(1));
					_evo.setEname(rsRs.getString(2));
					_evo.setJob(rsRs.getString(3));
					_evo.setHiredate(rsRs.getString(4));
					_evo.setDeptno(rsRs.getString(5));
					
					// 5. VO 研 ArrayList拭 眼奄 
					aList.add(_evo);					
				}
				
			}else {
				System.out.println("EmpSearchDAOImpl :: 紫腰 伊事 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("EmpSearchDAOImpl :: 紫腰 伊事掻 拭君亜  >>> : " + e.getMessage());
		}
		// ArrayList 軒渡馬奄 
		return aList;
	}

	// 戚硯 伊事 LIKE ---------------------------------------------------------------------------
	@Override
	public ArrayList<EmpSearchVO> empSelectEname(EmpSearchVO evo) {
		// TODO Auto-generated method stub
		System.out.println("EmpSearchDAOImpl.empSelectEname() >>> : 遭脊 失因 ");
		System.out.println("evo.getEname() >>> : " + evo.getEname()); 

		// 走蝕痕呪 識情 貢 default value initialization 奄沙葵生稽 段奄鉢馬奄 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EmpSearchVO> aList = null;		
		EmpSearchVO _evo = null; 

		try {
			conn = OracleConnProperty.getConnection();
			String sql = EmpSearchQueryMap.empSelectEname();
			pstmt = conn.prepareStatement(sql);
			System.out.println("戚硯 伊事 >>> : \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, evo.getEname()); // place holder 1 

			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				aList = new ArrayList<EmpSearchVO>();

				while (rsRs.next()) {
					
					_evo = new EmpSearchVO();
					_evo.setEmpno(rsRs.getString(1));
					_evo.setEname(rsRs.getString(2));
					_evo.setJob(rsRs.getString(3));
					_evo.setHiredate(rsRs.getString(4));
					_evo.setDeptno(rsRs.getString(5));
					 
					aList.add(_evo);					
				}
				
			}else {
				System.out.println("EmpSearchDAOImpl :: 戚硯 伊事 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("EmpSearchDAOImpl :: 戚硯 伊事掻 拭君亜  >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 紫腰 戚硯 伊事 ---------------------------------------------------------------------------
	@Override
	public ArrayList<EmpSearchVO> empSelectEmpnoEname(EmpSearchVO evo) {
		// TODO Auto-generated method stub
		System.out.println("EmpSearchDAOImpl.empSelectEmpnoEname() >>> : 遭脊 失因 ");
		System.out.println("evo.getEmpno() >>> : " + evo.getEmpno()); 
		System.out.println("evo.getEname() >>> : " + evo.getEname()); 

		// 走蝕痕呪 識情 貢 default value initialization 奄沙葵生稽 段奄鉢馬奄 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EmpSearchVO> aList = null;		
		EmpSearchVO _evo = null; 

		try {
			conn = OracleConnProperty.getConnection();
			String sql = EmpSearchQueryMap.empSelectEmpnoEname();
			pstmt = conn.prepareStatement(sql);
			System.out.println("紫腰 戚硯 伊事 >>> : \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, evo.getEmpno()); // place holder 1  
			pstmt.setString(2, evo.getEname()); // place holder 2  

			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				aList = new ArrayList<EmpSearchVO>();

				while (rsRs.next()) {
					
					_evo = new EmpSearchVO();
					_evo.setEmpno(rsRs.getString(1));
					_evo.setEname(rsRs.getString(2));
					_evo.setJob(rsRs.getString(3));
					_evo.setHiredate(rsRs.getString(4));
					_evo.setDeptno(rsRs.getString(5));
					 
					aList.add(_evo);					
				}
				
			}else {
				System.out.println("EmpSearchDAOImpl :: 紫腰 戚硯 伊事 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("EmpSearchDAOImpl :: 紫腰 戚硯 伊事掻 拭君亜  >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 送辰 伊事 LIKE --------------------------------------------------------------------------
	@Override
	public ArrayList<EmpSearchVO> empSelectJob(EmpSearchVO evo) {
		// TODO Auto-generated method stub
		System.out.println("EmpSearchDAOImpl.empSelectJob() >>> : 遭脊 失因 ");
		System.out.println("evo.getJob() >>> : " + evo.getJob()); 

		// 走蝕痕呪 識情 貢 default value initialization 奄沙葵生稽 段奄鉢馬奄 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EmpSearchVO> aList = null;		
		EmpSearchVO _evo = null; 

		try {
			conn = OracleConnProperty.getConnection();
			String sql = EmpSearchQueryMap.empSelectJob();
			pstmt = conn.prepareStatement(sql);
			System.out.println("送奪 伊事 >>> : \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, evo.getJob()); // place holder 1  

			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				aList = new ArrayList<EmpSearchVO>();

				while (rsRs.next()) {
					
					_evo = new EmpSearchVO();
					_evo.setEmpno(rsRs.getString(1));
					_evo.setEname(rsRs.getString(2));
					_evo.setJob(rsRs.getString(3));
					_evo.setHiredate(rsRs.getString(4));
					_evo.setDeptno(rsRs.getString(5));
					 
					aList.add(_evo);					
				}
				
			}else {
				System.out.println("EmpSearchDAOImpl :: 送奪 伊事 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("EmpSearchDAOImpl :: 送奪 伊事掻 拭君亜  >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 劾促 伊事 ---------------------------------------------------------------------------
	@Override
	public ArrayList<EmpSearchVO> empSelectHiredate(EmpSearchVO evo) {
		// TODO Auto-generated method stub
		System.out.println("EmpSearchDAOImpl.empSelectHiredate() >>> : 遭脊 失因 ");
		System.out.println("evo.getFromdate() >>> : " + evo.getFromdate()); 
		System.out.println("evo.getTodate() >>> : " + evo.getTodate()); 

		// 走蝕痕呪 識情 貢 default value initialization 奄沙葵生稽 段奄鉢馬奄 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<EmpSearchVO> aList = null;		
		EmpSearchVO _evo = null; 

		try {
			conn = OracleConnProperty.getConnection();
			String sql = EmpSearchQueryMap.empSelectHiredate();
			pstmt = conn.prepareStatement(sql);
			System.out.println("劾促 伊事 >>> : \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, evo.getFromdate());  // place holder 1 
			pstmt.setString(2, evo.getTodate()); 	// place holder 2  

			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				aList = new ArrayList<EmpSearchVO>();

				while (rsRs.next()) {
					
					_evo = new EmpSearchVO();
					_evo.setEmpno(rsRs.getString(1));
					_evo.setEname(rsRs.getString(2));
					_evo.setJob(rsRs.getString(3));
					_evo.setHiredate(rsRs.getString(4));
					_evo.setDeptno(rsRs.getString(5));
					 
					aList.add(_evo);					
				}
				
			}else {
				System.out.println("EmpSearchDAOImpl :: 劾松 伊事 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("EmpSearchDAOImpl :: 劾松 伊事掻 拭君亜  >>> : " + e.getMessage());
		}
		
		return aList;
	}
	
}












