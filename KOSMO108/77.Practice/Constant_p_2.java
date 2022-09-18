package a.b.c.ch2;

import a.b.c.d.ch2.Constant_p;

public class Constant_p_2{
	public static void main(String args[]){
		System.out.println("\n 1. Constant_p_2 main 함수 시작");
		// Constant_p rv = new Constant_p();
		/*
		abstract class는 new 키워드 사용불가
		Constant_p_2.java:7: error: Constant_p is abstract; cannot be instantiated
                Constant_p rv = new Constant_p();
                                ^
				1 error
		*/
		
		// 업로드 public static finatl String 출력
		String fileUploadPath=Constant_p.FILE_UPLOAD_PATH;
		String imgUploadPath=Constant_p.IMG_UPLOAD_PATH;
		int fileUploadSize=Constant_p.FILE_UPLOAD_SIZE;
		int imgUploadSize=Constant_p.IMG_UPLOAD_SIZE;

		System.out.println("\n 2. Constant_p.FILE_UPLOAD_PATH >>> : "+fileUploadPath);
		System.out.println("\n 3. Constant_p.IMG_UPLOAD_PATH >>> : "+imgUploadPath);
		System.out.println("\n 4. Constant_p.FILE_UPLOAD_SIZE >>> : "+fileUploadSize);
		System.out.println("\n 5. Constant_p.IMG_UPLOAD_SIZE >>> : "+imgUploadSize);
		
		// JDBC 연결 public static final String 출력
		String jdbcDriver=Constant_p.JDBC_DRIVER;
		String jdbcUrl=Constant_p.JDBC_URL;
		String jdbcUser=Constant_p.JDBC_USER;
		String jdbcPwd=Constant_p.JDBC_PWD ;

		System.out.println("\n 6. Constant_p.JDBC_DRIVER  >>> : "+jdbcDriver);
		System.out.println("\n 7. Constant_p.JDBC_URL  >>> : "+jdbcUrl);
		System.out.println("\n 8. Constant_p.JDBC_USER  >>> : "+jdbcUser);
		System.out.println("\n 9. Constant_p.JDBC_PWD  >>> : "+jdbcPwd);
	} // main method
} // Constant_p_2 class

