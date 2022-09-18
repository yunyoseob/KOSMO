package a.b.c.ch2;

/*
추상 키워드 :abstract

추상 클래스

추상 클래스 = 변수 + 추상함수 + 일반함수

추상 클래스는 일반 클래스와 다르게 블록이 없는 함수들이 존재함.
*/

abstract class Abstract_1{
	abstract int add();
	abstract String eat();
	int add_1(){
		return 1;
	} // add_1() method
} // Abstract_1 class


class Abstract_2 extends Abstract_1{
	int add(){
		return 1+2;
	} // add() method

	String eat(){
		return "class Abstract_2의 String eat() method";
	} // eat() method
} // Abstract_2 class

public class Abstract_p{
	public static void main(String args[]){
		System.out.println("\n 1. Abstract_p main 함수 시작");
		Abstract_p rv= new Abstract_p();
		// 생성자를 만들어 인스턴스한다.
		// JVM이 new 뒤에 있는 클래스이름()을 보고
		// 생성자를 생성한다.
		System.out.println("\n 2. Abstract_p rv >>> : "+rv);

		Abstract_2 rv_1 = new Abstract_2();
		System.out.println("\n 3. Abstract_2 rv_1 >>> : "+rv_1);
		int add=rv_1.add();
		System.out.println("\n 4. Abstract_2 add() method >>> : "+add);
		String eat=rv_1.eat();
		System.out.println("\n 5. Abstract_2 eat() method >>> : "+eat);
		int add_1=rv_1.add_1();
		System.out.println("\n 6. Abstract_1 add_1() method >>> : "+add_1);
	} // main method
} // Abstract_p class


