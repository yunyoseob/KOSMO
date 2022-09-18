package a.b.c.ch1;

public class If_practice_2{
	public void result_1(String args_1[]){
		//  첫 번째 boolean 체크 안 한 if문
		System.out.println("\n boolean 체크 하지 않는 if문 시작 합니다. \n");
		if (args_1.length==2){
			// String 문자열 클래스의 참조변수 s0에
			// 명령행 인수 첫 번째 값을 할당
			String s0=args_1[0];

			// String 문자열 클래스의 참조변수 s1에
			// 명령행 인수 두 번째 값을 할당
			String s1=args_1[1];

			// public static int parseInt(String s)
			// 문자 상수 : "1" 이렇게 생긴 애들
			int x=Integer.parseInt(s0);
			int y=Integer.parseInt(s1);

			int add=x+y;
			int subtract=x-y;
			int multiply=x*y;
			int devide=x/y;
	
			System.out.println("add(x,y) >>> : "+add);
			System.out.println("subtract(x,y) >>> : "+subtract);
			System.out.println("multiply(x,y) >>> : "+multiply);
			System.out.println("devide(x,y) >>> : "+devide);
		} // end of if args_1.length
		else{
			System.out.println("연산할 수를 잘 입력하세요 >>> : ");
		} // end of else args_1.length

		System.out.println("\n boolean 체크 하지 않는 if문 끝내도록 하겠습니다. \n");
	} // end of result_1 method

	public void result_2(String args_2[]){
		// 두 번째 boolean 체크 한 if 문
		System.out.println("\n boolean 체크한 if문 시작 하도록 하겠습니다. \n");
		int argsLength=args_2.length;
		boolean aBool=argsLength==2;
		if (aBool){
			String s0=args_2[0];
			// 첫 번째 값 할당
			String s1=args_2[1];
			// 두 번째 값 할당

			// public static int parseInt(String s)
			// parseInt(String s) : 문자 숫자를 숫자로 바꾸는 함수
			int x=Integer.parseInt(s0);
			int y=Integer.parseInt(s1);

			int add=x+y;
			int subtract=x-y;
			int multiply=x*y;
			int devide=x/y;

			System.out.println("add(x,y) >>> : "+add);
			System.out.println("subtract(x,y) >>> : "+subtract);
			System.out.println("multiply(x,y) >>> : "+multiply);
			System.out.println("devide(x,y) >>> : "+devide);
			} // end of if aBool
		else {
			System.out.println("연산할 수를 잘 입력하세요 >>> : ");
		} // end of else aBool	
		System.out.println("\n boolean 체크한 if문 끝내도록 하겠습니다. \n");
	} // end of result_2 method


	public static void main(String args[]){
		// String args[]=new String[];
		// String args[]={}
		If_practice_2 rv_1 = new If_practice_2();
		System.out.println(" If_practice_2 rv_1 참조 변수 주소 >>> : "+rv_1);
		rv_1.result_1(args);

		If_practice_2 rv_2=new If_practice_2();
		System.out.println("If_practice_2 rv_2(참조변수)의 주소값 >>> : "+rv_2);
		rv_2.result_2(args);
	} // end of main method
} // end of If_practice_2 class