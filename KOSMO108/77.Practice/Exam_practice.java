package a.b.c.ch1;

/*
하기	main() 함수에 초기화 된 지역변수 5개를 16진수로 콘솔에 출력하시오 
단:	함수를 만들어서 main() 함수에서 각 함수를 호출해서 실행 시키시오
	콘솔에 16진수를 출력할 때는 0x 를 붙여서 출력하시오
함수 이름 toHex_S0(), toHex_S1(), toHex_S2(), toHex_S3(), toHex_S4()
*/
public class Exam_practice{
	public void toHex_S0(String args_0){
		System.out.println("\n toHex_S0 시작 >>> \n");
		int a=args_0.length();
		for(int i=0;i<a;i++)
		{
			char x=args_0.charAt(i);
			System.out.println(x+" 0x"+Integer.toHexString(x)+" ");
		} // end of for
	}// end of toHex_S0 method

	public void toHex_S1(String args_1){
		System.out.println("\n toHex_S1 시작 >>>\n");
		int b=args_1.length();
		for(int i=0;i<b;i++)
		{
			char x=args_1.charAt(i);
			System.out.println(x+" 0x"+Integer.toHexString(x)+" ");
		} // end of for
		

	} // end of toHex_S1 method

	public void toHex_S2(String args_2){
		System.out.println("\n toHex_S2 시작 >>>\n");
		int c=args_2.length();
		for(int i=0;i<c;i++)
		{
			char x=args_2.charAt(i);
			System.out.println(x+" 0x"+Integer.toHexString(x)+" ");
		} // end of for
		

	} // end of toHex_S2 method

	public void toHex_S3(String args_3){
		System.out.println("\n toHex_S3 시작 >>>\n");
		int d=args_3.length();
		for(int i=0;i<d;i++)
		{
			char x=args_3.charAt(i);
			System.out.println(x+" 0x"+Integer.toHexString(x)+" ");
		} // end of for
		

	} // end of toHex_S3 method

	public void toHex_S4(String args_4){
		System.out.println("\n toHex_S4 시작 >>>\n");
		int e=args_4.length();
		for(int i=0;i<e;i++)
		{
			char x=args_4.charAt(i);
			System.out.println(x+" 0x"+Integer.toHexString(x)+" ");
		} // end of for
		

	} // end of toHex_S4 method

	public static void main(String args[]) {
		System.out.println("main 함수 시작 \n");
		
		// 영문자 소문자
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		// 영문자 대문자 
		String s1 = s0.toUpperCase();
		// 숫자 
		String s2 = "0123456789";
		// 연산기호
		String s3 = "*+-/";
		// 특수 문자
		String s4 = "!@#%%^&*";

		Exam_practice rv=new Exam_practice();
		System.out.println("\n 참조변수 주소 값 >>> : "+rv);

		rv.toHex_S0(s0);
		rv.toHex_S1(s1);
		rv.toHex_S2(s2);
		rv.toHex_S3(s3);
		rv.toHex_S4(s4);
		System.out.println("\n -------The end--------");
	} // end of main method
} // end of Exam_practice class
