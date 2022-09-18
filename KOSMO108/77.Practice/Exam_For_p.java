package a.b.c.ch1;

/*
하기	main() 함수에 초기화 된 지역변수 5개를 16진수로 콘솔에 출력하시오 
단:	함수를 만들어서 main() 함수에서 각 함수를 호출해서 실행 시키시오
	콘솔에 16진수를 출력할 때는 0x 를 붙여서 출력하시오
함수 이름 toHex_S0(), toHex_S1(), toHex_S2(), toHex_S3(), toHex_S4()

16:45 까지 하기 
*/
public class Exam_For_p {


	public void toHex_S0(String str) {
		
		System.out.println("Exam_For_6.toHex_S0() 함수 진입 >>> : ");


		if (str !=null && str.length() > 0){

			char c = ' ';


			for (int i=0; i < str.length(); i++ ){

 
				c = str.charAt(i);

				System.out.print(c + " ");


				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S1(String str) {
		System.out.println("Exam_For_6.toHex_S1() 함수 진입 >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S2(String str) {
		System.out.println("Exam_For_6.toHex_S2() 함수 진입 >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S3(String str) {
		System.out.println("Exam_For_6.toHex_S3() 함수 진입 >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public void toHex_S4(String str) {
		System.out.println("Exam_For_6.toHex_S4() 함수 진입 >>> : ");

		if (str !=null && str.length() > 0){
			char c = ' ';
			for (int i=0; i < str.length(); i++ ){
				c = str.charAt(i);
				System.out.print(c + " ");
				System.out.print("0x" + Integer.toHexString(c) + " ");
				System.out.println();
			}
		}
	}

	public static void main(String args[]) {
		// String 클래스를 지역변수로 값을 초기화 했다.

		// C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_4 1 2
		// String args[] = new String[]{"어떠한 정보"};
		// String args[] = {"어떠한 정보"};
		
		// s0,s1,s2,s3,s4를 main 함수의 블록 내에서
		// 선언했으므로, s0,s1,s2,s3,s4는 지역변수이다.

		String s0 = "abcdefghijklmnopqrstuvwxyz";


		// 소문자를 전부 대문자로 바꿔준다.
		String s1 = s0.toUpperCase();

		// 여기서 s1은 참조변수이다.
		String s2 = "0123456789";

		String s3 = "*+-/";

		String s4 = "!@#%%^&*";

		// 사용자 정의 Exam_For_p() 클래스를
		// 인스턴스한다.
		// 그 다음 toHex_S0 함수를 호출한다.
		// Exam_For_p() : 생성자
		// toHex_S0 함수를 호출한 다음
		// 인수(아규먼트로) s0 지역변수를 넘겨준다.
		// s0 지역변수에는 영문자 소문자 초기화 되어 있다.
		new Exam_For_p().toHex_S0(s0);
		// 인수를 받으면 -> 함수의 파라미터가
		// 초기화


		new Exam_For_p().toHex_S1(s1);


		new Exam_For_p().toHex_S2(s2);


		new Exam_For_p().toHex_S3(s3);


		new Exam_For_p().toHex_S4(s4);