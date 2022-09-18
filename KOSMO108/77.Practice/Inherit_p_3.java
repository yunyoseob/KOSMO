package a.b.c.ch2;

class Parents extends java.lang.Object{
	Parents(){
		System.out.println("\n 4 or 9. Make Parents Constructor");
	} // Parents Constructor

	void Parents_method(){
		System.out.println("\n 7 or 12. Parents Method");
	} // Parents_method method
} // Parents

class Child extends Parents{
	Child(){
		System.out.println("\n 5 or 10. Make Child Constructor");
	} // Child Constructor

	void Child_method(){
		System.out.println("\n 8 or 13. Child Method");
	} // Child_method method
} // Child


public class Inherit_p_3{
	void Inherit_p_3_method(){
		System.out.println("\n 3. Inherit_p_3_method");
	} // Inherit_p_3_method

	public static void main(String args[]){
		System.out.println(" \n 1. Start main method ");

		Inherit_p_3 rv=new Inherit_p_3();
		System.out.println(" \n 2. Inherit_p_3 rv >>> : "+rv);
		rv.Inherit_p_3_method();

		// First Experiment
		// Child Class reference variable = new Child Class();
		Child rv_c=new Child();
		System.out.println(" \n 6. Child rv_c >>> : "+rv_c);
		rv_c.Parents_method();
		rv_c.Child_method();

		// Second Experiment
		// Parents Class reference variable = new Parents Class();
		Parents rv_p=new Child();
		System.out.println(" \n 11. Parents rv_p >>> "+rv_p);
		rv_p.Parents_method();
		// rv_p.Child_method();
		/* Compile Issue
		error: cannot find symbol
		symbol:   method Child_method()
		location: variable rv_p of type Parents
		1 error
		*/

	
		/* Issue 한글 해설
		생성자는 자식껄로 생성해서
		부모 생성자와 자식 생성자를 다 만들기는 하는데
		참조변수를 부모 클래스에서 만들어놔서
		부모 클래스의 함수는 쓸 수 있는데
		자식 클래스의 함수를 사용하지 못함.
		*/

		// Second Experiment issue
		// How to use rv_p.Parnets_Method() ??

		/* 한글 설명
		부모클래스의 참조변수로는 자기자신 클래스의 자원만 사용이 가능하다.
		이럴 경우 부모클래스의 참조변수를 자식 클래스로 형변환(캐스팅)을 해야한다.
		클래스의 형변환 클래스 캐스팅하는 방법은 3가지 방법이 있다.
		*/
		
		/*
		// Class Casting method 1
		Child rv_ca=(Child)rv_p;
		rv_ca.Child_method();
		System.out.println("\n 14. Child rv_ca >>> : "+rv_ca);
		// 특이사항 : rv_p와 rv_ca의 주소는 같다. 
		*/
		
		/*
		// Class Casting method 2
		Object obj=rv_p;
		Object obj_1=obj;
		Child rv_ca2 = (Child)obj_1;
		rv_ca2.Child_method();
		System.out.println("\n 14. Child rv_ca2 >>> : "+rv_ca2);
		// 특이사항 : rv_p와 rv_ca2의 주소는 같다.
		*/

		// Class Casting method 3
		Object obj_2=(Object)rv_p;
		// == Object obj_2=rv_p;
		Child rv_ca3=(Child)obj_2;
		rv_ca3.Child_method();
		// System.out.println("\n 14. Child rv_ca3 >>> : "+rv_ca3);
		// 특이사항 : rv_p와 rv_ca3의 주소는 같다.

		/* 
		강사님 말씀

		파평 윤씨 3대손까지만 호출했는데 
		파평 윤씨 다 나오면 큰일남.

		java.lang 클래스의 시조인 Object의 후손인
		어떤 클래스를 소환했는데 해당 클래스의 후손들까지
		전부 소환되면 문제가 커짐.

		따라서, 해당 클래스의 후손을 사용하려면, 
		클래스 다운 캐스팅을 해야함.

		클래스 다운 캐스팅을 해줘야 나를 기준으로
		후손에서 찾아올 수 있음.
		 */
	} // main method
} // Inherit_p_3 class

	