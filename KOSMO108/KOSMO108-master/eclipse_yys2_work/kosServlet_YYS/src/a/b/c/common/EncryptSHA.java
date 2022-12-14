package a.b.c.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import a.b.c.com.kosmo.board.dao.BoardDAOImpl;

public abstract class EncryptSHA {

	/*
	암호화 할 때 복호화가 불가능한 단방향 방식 암호화
	SHA-2 Secure Hash Algorithm 2
	해시 함수가 출력하는 압축하는 문장 다이제스트 Digest라고 한다.
	SHA-2가 생성하는 다이제스트는 224, 256, 384, 512bit 등 다양
	256bit : SHA-2 를 SHA-256 이라고 한다.
	*/
	public static String encryptSHA256(String s) {
		Logger logger = LogManager.getLogger(EncryptSHA.class);
		logger.info("encryptSHA256(String s) 함수 진입 >>> : ");
		String ss = "";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			// System.out.println("md >>> : " + md);
			
			md.update(s.getBytes());
			byte byteData[] = md.digest();			
			// System.out.println("byteData >>> : " + byteData);
			
			StringBuffer sb = new StringBuffer();
			
			for (int i=0; i < byteData.length; i++) {
				
				sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
				
				int tmp = byteData[i] & 0xff;
				//System.out.println("tmp >>> : " + tmp);
				int tmp_1 = 0x100;
				//System.out.println("tmp_1 >>> : " + tmp_1);
				int tmp_sum = tmp + tmp_1;
				//System.out.println("tmp_sum >>> : " + tmp_sum);
				String tmp_s = Integer.toString(tmp_sum, 16);
				//System.out.println("tmp_s >>> : " + tmp_s);
				String tmp_s_1 = tmp_s.substring(1);
				// System.out.println("tmp_s_1 >>> : " + tmp_s_1);
			}
			ss = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			logger.info(e.getMessage());
		}
		
		return ss;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = EncryptSHA.encryptSHA256("hg74111#");
		System.out.println("s >>> : " + s);
	}
}
