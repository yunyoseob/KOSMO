package a.b.c.ch2;

import java.util.Date;
import java.util.Calendar;

// this 키워드 : 자기 자신 클래스를 가르킨다. : Object 를 사용하는 모든 언어, 스크립트가 동일하게 적용된다.
public class Get_Class_p{
	String s;
	int i;

	Get_Class_p(){
		System.out.println("1. Get_Class_p의 기본 생성자 \n");
		System.out.println("\n 2. this >>> : "+this.getClass().getName());
		System.out.println("\n 3. this.s >>> : "+this.s);
		System.out.println("\n 4. this.i >>> : "+this.i);
	}

	Get_Class_p(String ss){
		System.out.println("\n 6. Get_Class_p의 매개변수 String ss가 있는 생성자");
		System.out.println("\n 7. this >>> : "+this.getClass().getName());
	}

	public static void main(String args[]){
		Get_Class_p rv=new Get_Class_p();
		System.out.println("\n 5. rv 참조변수 주소값 >>> : "+rv);

		Get_Class_p rv_1=new Get_Class_p("글자 넣기");
		System.out.println("\n 8. rv_1 참조변수 주소값 >>> : "+rv_1);

		System.out.println("\n 9. rv.getClass() >>> : "+rv.getClass());
		System.out.println("\n 10. rv.getClass().getName() >>> : "+rv.getClass().getName());

		int iArr[]=new int[]{1,2};
		System.out.println("\n 11. iArr 참조변수 주소값 >>> : "+iArr);

		int iArr_2[][]=new int[2][3];
		System.out.println("\n 12. iArr_2.getClass().getName() >>> : "+iArr_2.getClass().getName());

		Date d=new Date();
		System.out.println("\n 13. d 참조변수 주소값 >>> : "+d);
		System.out.println("\n 14. d.getClass().getName() >>> : "+d.getClass().getName());
	} // main method
} // Get_Class_p class