package a.b.c.ch2.aaa;

/*
인터페이스 interface
	1. 생성자를 가질 수 없다.
	2. new 연산자로 인스턴스 할 수 없다.
	3. 함수는 모두 추상함수이다. abstract 키워드가 생략 된 형태이다.
		함수는 굳이 abstract 키워드를 사용하지 않는다.
		(왜? 귀찮으니까)
	4. 변수는 모두 상수이다.
		변수는 굳이 static final 키워드를 사용하지 않는다.
		(왜? 귀찮으니까)

	5. static 함수 가능 & default 함수 가능 (굳이 몰라도 되는 내용)
*/

public interface Inter_p{
	// 빈 껍데기 상태로 컴파일해보기
	/*  Complie issue #1
	 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
     public static void main(String[] args)
	*/

	// public String s;
	/* Complie issue
	error: = expected
	*/

	// public /* static final (생략 가능) */ String s="String 입니다.";
	/* Complie issue #2
	클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
    public static void main(String[] args)
    */
	
	// public static final String str="str 입니다.";
	/* Complie issue #3
	클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
    public static void main(String[] args)
    */

	/* 생성자 만들어보기
	 
	public Inter_p(){
		
	}
	 Compile issue #4
	 error: <identifier> expected
	*/

	// new 연산자로 인스턴스 하기 
	// Inter_p rv = new Inter_p();
	/* Compile issue #5
	error: Inter_p is abstract; cannot be instantiated
	*/

	public /*abstract 키워드 (생략 가능) */ void aM();
	public abstract void bM();
	/* Complie issue #6
	클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오.
    public static void main(String[] args)
    */
} // interface Inter_p