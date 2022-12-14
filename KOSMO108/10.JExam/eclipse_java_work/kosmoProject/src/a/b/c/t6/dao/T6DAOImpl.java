package a.b.c.t6.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.KosmoConnProperty;
import a.b.c.t6.sql.T6QueryMap;
import a.b.c.t6.vo.T6VO;

public class T6DAOImpl implements T6DAO {

	// 穿端 繕噺
	@Override
	public ArrayList<T6VO> t6SelectAll() {
		// TODO Auto-generated method stub
		System.out.println("T6DAOImpl.t6SelectAll >>> : ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<T6VO> aList = null;		
		T6VO _tvo = null; 

		try {
			conn = KosmoConnProperty.getConnection();
			String sql = T6QueryMap.getT6SelectAll();
			pstmt = conn.prepareStatement(sql);
			System.out.println("穿端 繕噺 >>> : \n" + sql);
			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				aList = new ArrayList<T6VO> ();

				while (rsRs.next()) {
					
					_tvo = new T6VO();
					_tvo.setT1(rsRs.getString(1));
					_tvo.setT2(rsRs.getString(2));
					_tvo.setT3(rsRs.getString(3));
					_tvo.setT4(rsRs.getString(4));
					_tvo.setT5(rsRs.getString(5));
					_tvo.setT6(rsRs.getString(6));
					 
					aList.add(_tvo);					
				}
				
			}else {
				System.out.println("T6DAOImpl :: 穿端繕噺 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("T6DAOImpl ::  穿端繕噺掻 拭君亜  >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 戚硯 繕噺
	@Override
	public ArrayList<T6VO> t6SelectName(T6VO tvo) {
		// TODO Auto-generated method stub
		System.out.println("T6DAOImpl.t6SelectName >>> : ");
		T6VO.printlnT6VO(tvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<T6VO> aList = null;		
		T6VO _tvo = null; 

		try {
			conn = KosmoConnProperty.getConnection();
			
			String sql = T6QueryMap.getT6SelectName();
			pstmt = conn.prepareStatement(sql);
			System.out.println("戚硯 繕噺 >>> : \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, tvo.getT2());
			
			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				aList = new ArrayList<T6VO> ();
				while (rsRs.next()) {					
					_tvo = new T6VO();
					_tvo.setT1(rsRs.getString(1));
					_tvo.setT2(rsRs.getString(2));
					_tvo.setT3(rsRs.getString(3));
					_tvo.setT4(rsRs.getString(4));
					_tvo.setT5(rsRs.getString(5));
					_tvo.setT6(rsRs.getString(6));					 
					aList.add(_tvo);					
				}
				
			}else {
				System.out.println("T6DAOImpl :: 戚硯繕噺 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("T6DAOImpl ::  戚硯繕噺掻 拭君亜  >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 劾促 伊事
	@Override
	public ArrayList<T6VO> t6SelectDate(T6VO tvo) {
		// TODO Auto-generated method stub
		System.out.println("T6DAOImpl.t6SelectDate >>> : ");
		T6VO.printlnT6VO(tvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<T6VO> aList = null;		
		T6VO _tvo = null; 

		try {
			conn = KosmoConnProperty.getConnection();
			
			String sql = T6QueryMap.getT6SelectDate();
			pstmt = conn.prepareStatement(sql);
			System.out.println("劾促 繕噺 >>> : \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, tvo.getFromdate());
			pstmt.setString(2, tvo.getTodate());
			
			rsRs = pstmt.executeQuery();

			if (rsRs !=null) { 
				aList = new ArrayList<T6VO> ();
				while (rsRs.next()) {					
					_tvo = new T6VO();
					_tvo.setT1(rsRs.getString(1));
					_tvo.setT2(rsRs.getString(2));
					_tvo.setT3(rsRs.getString(3));
					_tvo.setT4(rsRs.getString(4));
					_tvo.setT5(rsRs.getString(5));
					_tvo.setT6(rsRs.getString(6));					 
					aList.add(_tvo);					
				}
				
			}else {
				System.out.println("T6DAOImpl :: 戚硯繕噺 衣引亜 蒸樫 せせせ >>> : " + rsRs);
			}
		}catch(Exception e) {
			System.out.println("T6DAOImpl ::  戚硯繕噺掻 拭君亜  >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 脊径
	/*
	JDBC 研 戚遂背辞 汽戚斗今戚什拭 脊径,  呪舛, 肢薦, 繕噺
	
	sqlplus
	---------------
	繕噺 : SELECT : DQL 
	脊径, 呪舛, 肢薦 : INSERT, UPDATE, DELETE : DML : TRANSACTION : COMMIT, ROLLBACK
		DML  庚舌生稽 汽戚斗研 砺戚鷺拭 脊径馬檎 
		1. 五乞軒拭 彰陥.
		2. 五乞軒拭 煽舌吉 鎧遂聖 溌昔 馬壱 
		   鯉旋拭 限生檎 COMMIT,  限走省生檎 ROLLBACK 
		3. COMMIT 生稽 督析拭 彰 戚板拭澗 ROLLBACK 鞠走 省澗陥.
	
	splplus 拭辞 馬澗 依戚 焼艦壱 
	jdbc 球虞戚獄研 戚遂背辞 切郊 覗稽益轡拭辞 姥薄馬澗 依 
	
	切郊覗稽益轡 - jdbc 球虞戚獄 - 神虞適 汽戚斗今戚什 
	
	1. Connection
	2. PreparedStatement 汀軒庚精 汽戚斗今戚什拭 穿含
	3. ResultSet, int 汽戚今戚什拭辞 呪楳吉 衣引研 覗稽益轡生稽 穿含 閤焼醤 廃陥.
	
	SELECT
		砺戚鷺拭辞 繕噺吉 ROW(督析)亜 覗稽益轡生稽 穿含 吉陥.
		Connection 
		PreparedStatement
		ResultSet
		executQuery() 
	
	INSERT, UPDATE, DELETE 
		砺戚鷺拭 鋼慎吉 衣引研 闇呪稽 穿含吉陥. 
		Connection 
		PreparedStatement
		int 
		executUpdate()
		
		jdbc 球虞戚獄拭辞 析聖 背層陥. (Oracle 拭辞 jdbc 幻球澗 鯵降切亜 舛背層陥.)
		jdbc 球虞戚獄研 戚遂背辞 
		神虞適 汽戚斗今戚什 砺戚鷺拭 汽戚斗研 脊径馬檎 
		置社 1闇精 切疑生稽 朕行聖 背層陥. <-- 獄穿 紺稽 ???
		
		朕行聖 嬢巨辞 嬬闘継 馬澗亜 : jdbc 球虞戚獄拭辞 蝕醗聖 馬壱 : 神虞適 殖遭拭惟 推短聖 廃陥. 
		鯵降切亜 拝 呪 赤澗 析精
		Connection 昔斗凪戚什 setAutoCommit(), getAutCommit() 砧亜走 敗呪研 亜走壱 
		jdbc 球虞戚獄拭惟 推短聖 馬檎 
		jdbc 球虞戚獄亜 神虞適 殖遭(辛銅原戚煽)拭惟 推短聖 廃陥.
		推短聖 閤精 神虞適 殖走(辛銅原戚煽)亜 薄仙 益 砺戚鷺税 雌殿研 左壱 
		推短廃 舛左研 呪楳 廃陥. 
		
		Connection 昔斗凪戚什研 戚遂背辞 
			切郊覗稽益轡 - jdbc 球虞戚獄 - 神虞適 汽戚斗今戚什 亜 尻衣鞠檎
		Connection.setAutoCommit() true 昔 雌殿亜 吉陥.
		setAutoCommit 戚 true 昔 雌殿拭辞 置段 1闇 幻 切疑生稽 朕行聖 廃陥. 		 
	*/	
	@Override
	public boolean t6Insert(T6VO tvo) {
		// TODO Auto-generated method stub
		System.out.println("T6DAOImpl.t6Insert >>> : tvo " + tvo);
		T6VO.printlnT6VO(tvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try  {
			// conn = KosmoConnProperty.getConnection(); 什砺戚闘胡闘 庚舌戚 失験鞠檎
			// 戚 雌殿拭辞 朕学芝戚 馬蟹 神蚤戚 吉陥.
			// 朕革芝戚 神蚤戚 鞠檎辞 setAutoCommit() true 昔 雌殿亜 吉陥.
			// 置段 1闇戚 切疑 朕行戚陥. <-- 切疑 朕行聖 推短廃陥. 1. jdbc 球虞戚獄, 2. 神虞適 殖遭 
			conn = KosmoConnProperty.getConnection();			
			
			String sql = T6QueryMap.getT6Insert();
			pstmt = conn.prepareStatement(sql);
				System.out.println("脊径馬奄 >>> : \n" + sql);
			
			pstmt.clearParameters();
			pstmt.setString(1, tvo.getT1());
			pstmt.setString(2, tvo.getT2());
			pstmt.setString(3, tvo.getT3());
			
			nCnt = pstmt.executeUpdate();
//			boolean b = !conn.getAutoCommit();
//			System.out.println("b >>> : " + b);
//			if (b) conn.commit(); // <-- 戚 雌殿亜澗 朕行聖 廃 依戚 焼艦壱 朕行聖 推短聖 梅陥. 1. jdbc 球虞戚獄拭惟 
			if (!conn.getAutoCommit()) conn.commit();
			
			System.out.println("nCnt >>> : " + nCnt + " 闇 去系 鞠醸製 ");			
			if (nCnt > 0) { bool = true;}
			
//			KosmoConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("拭君亜 >>> : " + e.getMessage());
		}finally {
			KosmoConnProperty.conClose(conn, pstmt);
		}
		
		return bool;
	}

	@Override
	public boolean t6Update(T6VO tvo) {
		// TODO Auto-generated method stub
		System.out.println("T6DAOImpl.t6Update >>> : tvo " + tvo);
		T6VO.printlnT6VO(tvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try  {
			conn = KosmoConnProperty.getConnection();			
			String sql = T6QueryMap.getT6Update();
			pstmt = conn.prepareStatement(sql);
			System.out.println("呪舛馬奄 >>> : \n" + sql);
			
			pstmt.clearParameters();			
			pstmt.setString(1, tvo.getT2()); // place holder 1 :: A.T2 = ?
			pstmt.setString(2, tvo.getT3()); // place holder 2 :: A.T3 = ?
			pstmt.setString(3, tvo.getT1()); // place holder 3 :: A.T1 = ?
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			
			System.out.println("nCnt >>> : " + nCnt + " 闇 呪舛 鞠醸製 ");			
			if (nCnt > 0) { bool = true;}
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("拭君亜 >>> : " + e.getMessage());
		}finally {
			KosmoConnProperty.conClose(conn, pstmt);
		}
		
		return bool;	
	}

	// 肢薦
	@Override
	public boolean t6Delete(T6VO tvo) {
		// TODO Auto-generated method stub
		System.out.println("T6DAOImpl.t6Delete >>> : tvo " + tvo);
		T6VO.printlnT6VO(tvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try  {
			conn = KosmoConnProperty.getConnection();
			
			String sql = T6QueryMap.getT6Delete();
			pstmt = conn.prepareStatement(sql);
			System.out.println("肢薦馬奄 >>> : \n" + sql);
			
			pstmt.clearParameters();						
			pstmt.setString(1, tvo.getT1()); // place holder 1 :: A.T1 = ?
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			
			System.out.println("nCnt >>> : " + nCnt + " 闇 肢薦 鞠醸製 ");			
			if (nCnt > 0) { bool = true;}
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("拭君亜 >>> : " + e.getMessage());
		}finally {
			KosmoConnProperty.conClose(conn, pstmt);
		}
		
		return bool;	
	}
}
