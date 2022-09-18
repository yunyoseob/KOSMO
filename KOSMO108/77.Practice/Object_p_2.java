package a.b.c.ch2;

/*
생성자 : Constructor
생성자의 모습

클래스이름(){

}

생성자는 클래스를 메모리에 올릴때 자바 버철머신이 사용하는 함수로
자바 소스에 생성자 코드 블럭이 있으면 그 생성자를 사용하고
자바 소스에 생성자의 코드 블럭이 없으면 jvm 생성자가 만들어서 사용한다.
*/

// .java 파일 소스에 클래스가 두 개 이상일 때는
// main 함수가 있는 클래스의 클래스 키워드 앞에 public 키워드를 붙이고
// 파일이름도 main 함수가 있는 클래스 이름으로 저장한다.

class Const_p{
	String s;
	int i;
}

public class Object_p_2{	
	// 실험1 : 생성자가 없는 경우

	/* 실험2 : 매개변수가 없는 기본 생성자 만들기
	Object_p_2() {
		System.out.println("매개변수가 없는 기본 생성자");
	}
	*/

	/* 실험3 : 매개변수가 있는 기본 생성자 만들기
	Object_p_2(String s) {
		System.out.println("매개변수가 있는 기본 생성자 \n");
		System.out.println("Object_p_2(String s)의 s >>> : "+s);
	}
	*/



	public static void main(String args[]){

		// 실험1 : 생성자가 없는 경우
		// System.out.println("Hello Java");

		/*
		Compiled from "Object_p_2.java"
		public class a.b.c.ch2.Object_p_2 {
		public a.b.c.ch2.Object_p_2();
		public static void main(java.lang.String[]);
		}
		javap 역컴파일을 해보면 기본생성자를 JVM이 생성하였다.
		jvm이 기본생성자를 만들어서 멤버필드를 초기화 한다.
		*/

		// Object_p_2 rv = new Object_p_2();
		// System.out.println("참조변수 주소값 >>> : "+rv);
		// 생성자가 생성이 되면서 "매개변수가 없는 기본 생성자"가 출력된다.
		// 참조변수 주소값도 출력됨.

		/*
		public class a.b.c.ch2.Object_p_2 {
			java.lang.String s;
			int i;
			a.b.c.ch2.Object_p_2();
			public static void main(java.lang.String[]);
			}
		 javap 역컴파일을 해보면 마찬가지로 기본생성자가 생긴 것을 확인 할 수 있다.
		*/

		// Object_p_2 rv = new Object_p_2("실험3의 매개변수 입력");
		// System.out.println(" 실험3의 참조변수 >>> : "+rv);
		/*
		매개변수가 있는 기본 생성자

		Object_p_2(String s)의 s >>> : 실험3의 매개변수 입력
		실험3의 참조변수 >>> : a.b.c.ch2.Object_p_2@15db9742
		*/

		/*
		Compiled from "Object_p_2.java"
		public class a.b.c.ch2.Object_p_2 {
		java.lang.String s;
		int i;
		a.b.c.ch2.Object_p_2(java.lang.String);
		public static void main(java.lang.String[]);
		}
		기본 생성자가 아닌 새로운 생성자 하나를 만듬.
		*/

		Const_p rv = new Const_p();
		System.out.println("rv 참조변수 주소값 >>> : "+rv);
		System.out.println("rv.s >>> : "+rv.s);
		System.out.println("rv.i >>> : "+rv.i);
		/*
		rv 참조변수 주소값 >>> : a.b.c.ch2.Const_p@15db9742
		rv.s >>> : null
		rv.i >>> : 0

		Compiled from "Object_p_2.java"
		public class a.b.c.ch2.Object_p_2 {
		public a.b.c.ch2.Object_p_2();
		public static void main(java.lang.String[]);
		}
		*/

	} // main method
} // Object_p_2 class