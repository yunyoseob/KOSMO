package a.b.c.ch2.aa;

import a.b.c.ch2.aa.Class_A;

// Class_A라는 부모에게서 상속받은
// Inherit_p_2라는 자식 클래스이다.
public class Inherit_p_2 extends Class_A{
	public Inherit_p_2(){
		super();
		System.out.println("\n 1. Inherit_p_2() 생성자 >>> : "+super.class_a_2());
		// Class_A라는 부모 클래스에서 class_a_2를 실행하고 싶을 때
	} // Inherit_p_2 생성자 1
	public Inherit_p_2(String s){
		super(s);
		System.out.println("\n 2. Inherit_p_2(String s) 생성자 >>> : "+s);
	} // Inherit_p_2 생성자 2

	@Override
	public String toString(){
		return "Hello";
	}

	@Override
	public void class_a_1(){
		System.out.println("Hi");
	}

	public static void main(String args[]){
		Inherit_p_2 rv= new Inherit_p_2();
		// Class_A() 생성자 >>> :
		// Class_A().class_a_2() 함수 >>> :
		// 1. class_a_2() 함수 >>> :
		System.out.println("\n 3. Inherit_p_2 rv= new Inherit_p_2(); 에서 참조변수 주소값 >>> : "+rv);
		// 3. Hello
		System.out.println("\n 4. rv.toString() >>> : "+rv.toString());
		//  4. Hello
		System.out.println("\n 5. rv.getClass().getName() >>> : "+rv.getClass().getName());
		// 5. a.b.c.ch2.aa.Inherit_p_2
		rv.class_a_1();
		// Hi

		Inherit_p_2 rv_1=new Inherit_p_2("NiceToMeetYou");
		// Class_A(String s 생성자 >>> : NiceToMeetYou
		// 2. Inherit_p_2(String s) 생성자 >>> : NiceToMeetYou
		System.out.println("\n 6. Inherit_p_2 rv_1 = new Inherit_p_2(NiceToMeetYou); 에서 참조변수 주소값 >>> : "+rv_1);
		//  Hello
	}
} // Inherit_p_2 class