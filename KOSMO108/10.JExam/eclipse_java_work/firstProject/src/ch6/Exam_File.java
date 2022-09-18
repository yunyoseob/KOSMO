package a.b.c.ch6;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Exam_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		java.io.File 클래스는 자바에서 파일 또는 폴더 객체를 다루는 클래스이다. 
		new File() : File 클래스의 인스턴스 생성(파일 또는 폴더를 생성하시오).
		실제 하드디스크에 물리적인 파일/폴더(디렉토리)를 생성하지 않는다.
		실제 파일/폴더(디렉토리)를 만들기 위해서는 File 클래스에 있는 함수를 호출해야 한다.
			createNewFile()
			mkdir()
			mkdirs() 
		File 클래스가 가르키는 기본 위치(default directory)를 꼭 확인하고 사용해야 한다.
		*/
				
		File f = new File("박건원");
		System.out.println("f >>> : " + f);
		System.out.println("f.getName() >>> : " + f.getName());
				
		File fd = new File("aaaa");
		System.out.println("fd >>> : " + fd);
		System.out.println("fd.getName() >>> : " + fd.getName());
		
		File fds = new File("aa/bb/cc");
		System.out.println("fds >>> : " + fds);
		System.out.println("fds.getName() >>> : " + fds.getName());
		
		try {
			// C:\00.KOSMO108\10.JExam\eclipse_java_work\firstProject\박건원			
			boolean b = f.createNewFile();
			System.out.println("b >>> : " + b);
			
			boolean bdir = f.isDirectory();
			System.out.println("bdir >>> : " + bdir);
			boolean bfile = f.isFile();
			System.out.println("bfile >>> : " + bfile);
			
			boolean bd = fd.mkdir();
			System.out.println("bd >>> : " + bd);
			
			boolean bddir = fd.isDirectory();
			System.out.println("bddir >>> : " + bddir);
			boolean bdfile = fd.isFile();
			System.out.println("bdfile >>> : " + bdfile);
			
			boolean bds = fds.mkdirs();
			System.out.println("bds >>> : " + bds);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("에러가 >>> : " + e.getMessage());
		}
	}
}
