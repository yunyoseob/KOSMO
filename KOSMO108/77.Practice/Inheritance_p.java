package a.b.c.ch2;

class Dead_Great_Grand_Parents{
	Dead_Great_Grand_Parents(){
		System.out.println("\n 10. Dead_Great_Grand_Parents 생성자"); 
	} // Dead_Great_Grand_Parents 생성자
	void p_0(){
		System.out.println("\n 11. p_0 함수");
	} // p_0 method
} // Dead Great_Grand_Parents class

class Great_Grand_Parents{
	Great_Grand_Parents(){
		System.out.println("\n 2. Great_Grand_Parents 생성자");
	} // Great_Grand_Parents 생성자
	void p_1(){
		System.out.println("\n 8. p_1 함수");
	} // p_1 method
} // Great_Grand_Parents class

class Grand_Parents extends Great_Grand_Parents{
	Grand_Parents(){
		System.out.println("\n 3. Grand Parents 생성자");
	} // Grand_Parents 생성자
	void p_2(){
		System.out.println("\n 7. p_2 함수");
	} // p_2 method
} // Grand_Parents class

class Parents extends Grand_Parents{
	Parents(){
		System.out.println("\n 4. Parents 생성자");
	} // Parents 생성자
	void p_3(){
		System.out.println("\n 6. p_3 함수");
	} // p_3 method
} // Parents class

public class Inheritance_p{
	public static void main(String args[]){
		System.out.println("\n 1. Inheritance_p main 함수 시작");
		Parents papa = new Parents();
		/*
		메모리에 올리는 세 가지 방법
		1. static
		2. new
		3. 상속
		3-1. extends 키워드 클래스 단일 상속
		3-2. implements 키워드 인터페이스 다중 상속
		*/
		System.out.println("\n 5. rv 참조변수 주소값 >>> : "+papa);
		papa.p_3();
		papa.p_2();
		papa.p_1();
		// papa.p_0();
		// Dead했기 때문에 father가 상속 못 받았음. 따라서, 에러가 출력됨.
		//  error: cannot find symbol
		//  location: variable papa of type Parents

		System.out.println("\n 9. Dead_Great_Grand_Parents 소환하기");
		Dead_Great_Grand_Parents dead = new Dead_Great_Grand_Parents();
		dead.p_0();

		
	} // main method
} // Inheritance_p class