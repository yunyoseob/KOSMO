2022-02-08
--------------------

문자
문자열 

데이터 :		자바에서는 모든 데이터가 객체이다. All Object
			자바에서 객체가 아닌 것이 있다. <-- Primitive Type 기초자료형 (byte char short int long float double)
			Primitive type 기초자료형 <--> Wrapper Class 
			JVM 숫자 int (키워드, 기초자료형, Integer 클래스의 상수) --> Integer 형변환 되어서 일을 한다. 

자바에서 변수 
	기초 자료형	primitive type	byte chsr short int long float double 
				변수 상자에 값을 직접 대입한다.

	참조 자료형	모두 참조 자료형이다.
				변수 상자에 주소값을 대입하고 주소값으로 값을 가르킨다.
				예외)		String 클래스 ..... 
						String str = "abc";
						String str1 = new String("abc");
						public static int identityHashCode(Object x) 이 함수를 이용해서 주소값을 볼 수 있다.


문자		char			기초자료형
		char 초기화는 싱글 쿼테이션  작은 따옴표
		char c =  ' ';
		양의정수 16비트 사용한다.(음수를 사용하지 않는다. 문자를 다뤄야 하기 때문에)

					인코딩
		문자 char <----------------> 숫자 2진수, 8진수, 10진수, 16진수 : ASCII (ANSI)
					디코딩

문자열	String	char[]	참조자료형		
		String 초기화는 더블 쿼테이션  큰 따옴표, null
		String s = "";
		String s1 = null;
		int length() : 스트링 길이를 구하는 함수 
		char charAt(int index) : 스트림 문자열에서 문자를 구하는 함수 