package a.b.c.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Exam_HashMap_3 {
	
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
		Exam_HashMap_3 ex3 = new Exam_HashMap_3();
		
		ArrayList<HashMap<String, String>> aList1 = ex3.hashMapGeneric();
		System.out.println("aList1.size() >>> : " + aList1.size());
		
		for (int i=0; i < aList1.size(); i++) {
			
			HashMap<String, String> hm = aList1.get(i);			
			
			Iterator<String> keys = hm.keySet().iterator();
			
			// Iterator 참조변수 keys 를 이용 해서 이터레이터에 들어 있는 데이터를 hasNext() 함수로 확인 한다. 
			while (keys.hasNext()) {
				String key = keys.next();
				String value = "";
				
				if ("이름".equals(key)) {
					value = hm.get(key);
				}
				if ("나이".equals(key)) {
					value = hm.get(key);
				}
				if ("주소".equals(key)) {
					value = hm.get(key);
				}
				
//				if ("이름".equals(key) || "나이".equals(key) || "주소".equals(key)) {
//					value = hm.get(key);
//				}
				System.out.println(key + " : " + value);
			}
		}	
				
	}
}
