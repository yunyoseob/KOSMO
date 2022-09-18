package a.b.c.ch2.aa;

import a.b.c.ch2.aa.Class_A;

// Class_A라는 부모에게서 상속받은
// Inherit_p_1라는 자식 클래스이다.
public class Inherit_p_1 extends Class_A{
	

	/* 실험 1
	public String toString(){
		return "Class_A().toString() 함수 >>> : ";
	}
	*/

	/*
	// 실험 2
	@Override
	// @ 뒤에 내용을 애노테이션이라고 한다.
	// 자바에서 제공하는 애노테이션은 컴파일러에게 특정한 정보를 제공해 주는 역할을 합니다.
	// 시그니처가 다르면, 컴파일 오류를 발생하여 프로그래머의 실수를 막아줍니다.
	// @Override는 재정의된 메서드라는 정보를 제공해주는 애노테이션입니다.

	public String toString(){
		return "Inherit_p_1에서 Override로 재정의됐습니다.";

	} // java.lang.Object 조상에 있는 클래스의 함수를
		// 후손인 Inherit_p_1 클래스가 재정의 
		*/
	

	// 실험 3
	@Override
	public void class_a_1(){
		System.out.println("Hi");
	} // class_a_1 method



	public static void main(String args[]){
		Inherit_p_1 rv=new Inherit_p_1();
		System.out.println("\n 1. Inherit_p_1 rv=new Inherit_p_1();에서 참조변수 rv의 주소값 >>> : "+rv);
		//  실험 1: Class_A().toString() 함수 >>> :
		//  실험 2: Class_A에서 매개변수 없는 생성자 출력: Class_A() 생성자 >>>
		//			참조변수 출력시 Inherit_p_1에서 Override로 재정의됐습니다. 가 출력
		//  실험 3: Class_A에서 매개변수 없는 생성자 출력: Class_A() 생성자 >>> :
		//			참조변수 출력시 a.b.c.ch2.aa.Inherit_p_1@15db9742 가 출력
		System.out.println("\n 2. rv.toString() >>> : "+rv.toString());
		//  실험 1: Class_A().toString() 함수 >>> :
		//  실험 2: Inherit_p_1에서 Override로 재정의됐습니다. 출력
		//  실험 3: a.b.c.ch2.aa.Inherit_p_1@15db9742 출력
		System.out.println("\n 3. rv.getClass().getName() >>> : "+rv.getClass().getName());
		// 실험 1: a.b.c.ch2.aa.Inherit_p_1
		// 실험 2: a.b.c.ch2.aa.Inherit_p_1
		// 실험 3: a.b.c.ch2.aa.Inherit_p_1
		rv.class_a_1();
		// 실험 1: Class_A().class_a_1() 함수 >>> : 
		// 실험 2: Class_A().class_a_1() 함수 >>> : 
		// 실험 3: Class_A().class_a_1() 함수 >>> : Hi 출력
	} // main method


} // Inherit_p_1 class