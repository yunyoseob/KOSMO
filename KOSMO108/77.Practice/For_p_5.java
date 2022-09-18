package a.b.c.ch1;

public class For_p_5{

	public static void main(String args[]){
		/*
		1. 지역변수 : 초기화 해서 사용해야 한다.
		2. 참조 변수 : 주소값을 갖는다 (생략)
		// public static int identityHashCode(Object x)
		3. rt.jar : java.lang.String : import 하지 않아도 사용 가능
		4. 문자열을 다루는 빌트인 클래스
		
		데이터 타입 선언
		참조변수 s0을 선언
		문자열 "abc" 값으로 초기화 했어요
		*/
		String s0="abc";
		// public String toUpperCase(Locale locale)
		// static이 없으니 참조변수 s0에 선언
		String s1=s0.toUpperCase();	
		// 대문자로 바꿔서 참조변수 s1에 대입

		for (int i=0; i<s0.length(); i++){
			System.out.println("s0.charAt("+i+") >>> "+s0.charAt(i));
		}

		for (int i=0; i<s1.length(); i++){
			System.out.println("s1.charAt("+i+") >>> : "+s1.charAt(i));
		}

		// public String toLowerCase()
		String s2=s1.toLowerCase();
		// 대문자로 바꿔놓은거 다시 소문자로 바꿔서 참조변수 s2에 대입
		for (int i=0; i<s2.length(); i++){
			System.out.println("s2.charAt("+i+") >>>: "+s2.charAt(i));
		}
	} // end of main method
} // end of For_p_5 class