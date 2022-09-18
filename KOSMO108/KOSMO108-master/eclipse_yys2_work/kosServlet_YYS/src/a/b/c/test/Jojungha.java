package a.b.c.test;

import java.util.HashMap;

public class Jojungha {
	public static void main(String args[]) {
		String a="{조정하 : 바보}";
		System.out.println("조정하는 무엇일까요 ???? >>> : "+a);
		
		HashMap hm=new HashMap();
		hm.put("조정하", "바보이다");
		
		System.out.println("조정하는 >>> : "+hm.get("조정하"));
		
	}
}
