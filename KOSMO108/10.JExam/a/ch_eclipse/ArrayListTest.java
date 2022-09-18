package a.b.c.ch4;

import java.util.ArrayList;
import java.util.Date;
/*
 * ArrayList 클래스는 배열 클래스(객체 배열 Object Array)이다.
 * 인덱스 index를 가지고 있다.
 * 데이터 타입을 상관없이 담을 수 있다. (자바 배열은 데이터 타입이 동일해야 한다).
 * 사이즈에 제한이 없다. (자바 배열은 데이터의 길이를 정해서 사용한다 int ip[] = new int[3]).
 * */
public class ArrayListTest {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void arrayListTest() {
		System.out.println("ArrayListTest.arrayListTest() 함수 진입 >>> : ");
		
		ArrayList aList = new ArrayList();
		System.out.println("aList 참조변수 주소값 >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add("민경호");
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(27);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new ArrayListTest());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add('송');
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());	
		aList.add("정흔");
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());	
		aList.add(new Integer(27));
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(false);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());		
		aList.add(12.34566);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(new Date());
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		aList.add(aList);
		System.out.println("aList >>> : " + aList);
		System.out.println("aList.size() >>> : " + aList.size());
		
		for(int i=0; i < aList.size(); i++) {
			System.out.println("aList.get(" + i + ") >>> ::: " + aList.get(i));
		}
		
		// <> 제너릭 
		// ArrayList 클래스에 들어오는 데이터 형을 정하는 것이다.
		ArrayList<String> aList_1 = new ArrayList<String>();
		System.out.println("aList_1 >>> : " + aList_1);
		aList_1.add("황신애");
		aList_1.add("23");
		System.out.println("aList_1 >>> : " + aList_1);
		System.out.println("aList_1.size() >>> : " + aList_1.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ArrayListTest().arrayListTest();
	}

}
