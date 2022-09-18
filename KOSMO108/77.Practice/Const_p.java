package a.b.c.ch2;

public class Const_p{
	String s;
	int i;
	
	public Const_p() {
		// this("Last Year", 2021);
		// error: constructor Const_p in class Const_p cannot be applied to given types;
		//  required: no arguments

		// this();
		// error: recursive constructor invocation
		System.out.println("\n 2. Const_p() 생성자 >>> : ");
		System.out.println("\n 3. Const_p() 생성자 >>> s ::: "+s);
		System.out.println("\n 4. Const_p() 생성자 >>> i ::: "+i);
	} // Const_p()

	
	public Const_p(String s, int i){
		// System.out.println("this는 생성자 블럭 안에서 주석을 제외하고 꼭 첫 번째 문장으로 수행되어야 오류가 나지 않습니다.");
		this();
		// this()를 쓰면 2번부터 4번이 반복되어 한 번 더 출력됩니다.

		// this("This Year", 2022);
		//  error: recursive constructor invocation
		System.out.println("\n 6. Const_p(String s, int i) 생성자 >>> : ");
		System.out.println("\n 7. Const_p(String s, int i) 생성자 >>> s ::: "+s);
		System.out.println("\n 8. Const_p(String s, int i) 생성자 >>> i ::: "+i);
		System.out.println("\n 9. Const_p(String s, int i) 생성자 >>> this.s ::: "+this.s);
		System.out.println("\n 10. Const_p(String s, int i) 생성자 >>> this.i ::: "+this.i);
		this.s=s;
		this.i=i;
		System.out.println("\n 11. this.s=s 이후, Const_p(String s, int i) 생성자 >>> this.s ::: "+this.s);
		System.out.println("\n 12. this.i=i 이후, Const_p(String s, int i) 생성자 >>> this.i ::: "+this.i);
	}
	
	public static void main(String args[]){
		System.out.println("\n 1. main 함수 시작");
		/*
		1. Const_p 사용자 정의 클래스 Const_p를 사용하기 위해서 선언 했다.
		2. rv : 선언한 Const_p 클래스를 사용하기 위해 참조변수(Reference Variable)를 선언했다.
		3. = : 대입 연산자
		4. new : 뉴 키워드, 뉴 인스턴스 연산자, 뉴 연산자
				: new 키워드 뒤에오는 생성자 = 클래스이름 + () 메모리에 올려주세요.
				: new가 올리는게 아니라, JVM이 new 키워드를 보고 메모리에 올려주는 것이다.
		5. Const_p : 생성자이다.
					: 인스턴스하는 클래스의 멤버변수를 초기화 한다.
					: default value 또는 생성자의 인수로 있는 변수 값으로 초기화한다.
		6. Const_p() 생성자는 Const_p() {} 기본 생성자를 호출한다.
			멤버 필드에 선언된 String s, int i를 default value로 초기화 한다.
		*/
		Const_p rv=new Const_p();
		System.out.println("\n 5. Const_p() 생성자의 참조변수 주소값 >>> : "+rv);

		// 소스 코드 상에서 매개변수가 2개 있는 생성자를 호출한다.
		// public Const_p(String s, int i) {} 생성자를 호출한다.
		Const_p rv_1=new Const_p("This Year", 2022);
		System.out.println(" \n 13. Const_p(This Year, 2022)의 생성자의 참조변수 주소값 >>> : "+rv_1);
	} // main method
} // Const_p class