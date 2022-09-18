package a.b.c.ch2.aa;

public class Class_A extends java.lang.Object{
	public Class_A(){
		System.out.println("Class_A() 생성자 >>> : ");
		} // public Class_A 매개변수 없는 생성자
	public Class_A(String s){
		System.out.println("Class_A(String s 생성자 >>> : "+s);
	} // public Class_A 매개변수 있는 생성자
	public void class_a_1(){
		System.out.println("Class_A().class_a_1() 함수 >>> : ");
		
	} // public class_a_1 method 리턴값이 없는 함수
	public String class_a_2(){
		System.out.println("Class_A().class_a_2() 함수 >>> : ");
		return "class_a_2() 함수 >>> : ";
	} // public class_a_2 method 리턴값이 있는 함수
} // Class_A class