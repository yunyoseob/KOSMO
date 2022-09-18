package a.b.c.ch6;

import java.util.HashMap;

public class Exam_HashMap_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashMap의 Key 는 해당 프로그램에서 항상 유니크해야 한다.
		
		HashMap hp = new HashMap();
		System.out.println("hp 참조변수 주소값 >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
		
		hp.put("1", 1);
		System.out.println("hp 참조변수 주소값 >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());	
		
		hp.put("2", 2);
		System.out.println("hp 참조변수 주소값 >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
		/*
		  	hp 참조변수 주소값 >>> : {1=1, 2=2}
		  	, : CSV			
		*/
		hp.put("3", 3);
		System.out.println("hp 참조변수 주소값 >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());	
		
		hp.put("2", 222);
		System.out.println("hp 참조변수 주소값 >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
		
		hp.put("2", 222333);
		System.out.println("hp 참조변수 주소값 >>> : " + hp);
		System.out.println("hp.size >>> : " + hp.size());
	}
}
