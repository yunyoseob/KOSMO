package a.b.c.ch1;


public class Operator_p{
	public void inc_dec_Oper(){
				/*
			증감 연산자 increment and decrement operators
			++x : x를 먼저 1 증가 시킨 후 그 값을 사용
			--x: x를 먼저 1 감소 시킨 후 그 값을 사용
			x++ : x를 먼저 사용한 후 1증가
			x-- : x값을 먼저 사용한 후 1 감소
		*/
		int aX=10;
		System.out.println("ax =10 >>> : "+aX+"\n");
		// 10
		
		// 10인 aX를 1 만큼 증감시키는 방법 
		aX++; // aX = aX+z --> 10=10+1;
		System.out.println("aX++; >>> : "+aX+"\n");
		// 11

		++aX;
		System.out.println("++aX; >>> : "+aX+"\n");
		// 12


		// 대입연산자 써서 해보기
		int aXX=100;
		System.out.println("int aXX=100 >>> : "+aXX+"\n");
		// 100

		int aa=aXX++;
		System.out.println("int aa=aXX++; >>> : "+aa+"\n");
		// 100
		// aXX가 증가 되지 않음.

		aa=++aXX;
		System.out.println("bb=++bXX; >>> : "+aa+"\n");
		// 102
		// 2만큼 증가함.

		
		int bXX=100;
		int bb=++bXX;
		System.out.println("bb=++bXX; >>> : "+bb+"\n");
		// 101
		// 1만큼 증가함.
	} // end of inc_dec_Oper

	public static void main(String args[]){
		Operator_p rv=new Operator_p();
		System.out.println("rv >>> : "+rv);

		// Operator_p 클래스의 rv 참조변수로 inc_dec_Oper 함수를 호출한다. (invoke)
		rv.inc_dec_Oper();

		// 삼항 연산자 ternary operator
		// 조건식 ? 결과1 : 결과2
		// 조건식의 결과가 TRUE 이면 결과 1, FALSE 이면 결과 2
		int fatherAge=57;
		int motherAge=54;

		// char ch = ' '; char 자료형 빈 문자로 초기화 하기
		char ch ='\u0000'; // char 자료형 유니코드로 초기화 하기
		// char MIN_VALUE '\u0000' -> ASCII CODE
		// char MAX_VALUE '\uFFFF' -> ASCII CODE

		boolean bool=fatherAge>motherAge;
		// 조건문 쓰기 전에 boolean 연산자로 로그 찍기 위한 과정
		System.out.println("bool >>> : "+bool);
		ch= (fatherAge > motherAge) ? 'T':'F';
		System.out.println("ch >>> : "+ch);

		if (fatherAge > motherAge){
			System.out.println("true >>> : ");
		} // end of if
		else{
			System.out.println("false >>> : ");
		} // end of end

		/* 하기 로직은 사용을 지양한다.
		if (fatherAge > motherAge)
			System.out.println("true >>> : ");
		else
			System.out.println("false >>> : ");



	} // end of main method
} // end of Operator_p class