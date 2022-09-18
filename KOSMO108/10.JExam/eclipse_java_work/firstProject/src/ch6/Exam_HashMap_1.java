package a.b.c.ch6;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam_HashMap_1 {

	public ArrayList hashMap() {
		
		HashMap hm0 = new HashMap();
		hm0.put("이름", "박건원");
		hm0.put("나이", "30");
		hm0.put("주소", "서울시 송파구");
	
		HashMap hm1 = new HashMap();
		hm1.put("이름", "박주형");
		hm1.put("나이", "27");
		hm1.put("주소", "서울시 구로구");
		
		HashMap hm2 = new HashMap();
		hm2.put("이름", "김별");
		hm2.put("나이", "23");
		hm2.put("주소", "서울시 동작구");
		
		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public ArrayList<HashMap<String, String>> hashMapGeneric() {
		
		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("이름", "김건희");
		hm0.put("나이", "27");
		hm0.put("주소", "부천시 춘의동");
	
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("이름", "신익현");
		hm1.put("나이", "26");
		hm1.put("주소", "서울시 금천구");
		
		HashMap <String, String> hm2 = new HashMap<String, String>();
		hm2.put("이름", "민경호");
		hm2.put("나이", "27");
		hm2.put("주소", "서울시 양천구");
		
		ArrayList<HashMap<String, String>> aList = 
				new ArrayList<HashMap<String, String>>();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);	
		
		return aList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam_HashMap_1 ex1 = new Exam_HashMap_1 ();
	
		ArrayList aList = ex1.hashMap();
		System.out.println("aList.size() >>> : " + aList.size());
		
		for (int i=0; i < aList.size(); i++) {
			HashMap hm = (HashMap)aList.get(i);			
			
			Object obj1 = hm.get("이름");
			String name1 = (String)obj1;
			//System.out.println("이름 >>> : " + name1);
			
			Object obj2 = hm.get("나이");
			String age1 = (String)obj2;
			//System.out.println("나이 >>> : " + age1);
			
			Object obj3 = hm.get("주소");
			String addr1 = (String)obj3;
			//System.out.println("주소 >>> : " + addr1);
			System.out.println(name1 + " : " + age1 + " : " + addr1);			
		}
				
		ArrayList<HashMap<String, String>> aList1 = ex1.hashMapGeneric();
		System.out.println("aList1.size() >>> : " + aList1.size());
		
		for (int i=0; i < aList1.size(); i++) {
			
			HashMap<String, String> hm = aList1.get(i);			
			
			String name1 = hm.get("이름");			
			String age1 = hm.get("나이");			
			String addr1 = hm.get("주소");			
			System.out.println(name1 + " : " + age1 + " : " + addr1);
		}			

	}

}
