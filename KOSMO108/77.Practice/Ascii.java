package ascii.code;

public class Ascii{
	public static void main(String args[]){
		String s="A";
		
		// public char charAt(int index)
		char ch_L=s.charAt(0);

		for (int i=ch_L; i<(ch_L+26);i++){
		// 묵시적 변환 
		// char는 16비트(양의 정수)로 2바이트이다.
		// int는 32비트로 4바이트이다. 작은 바이트를
		// 큰 바이트로 바꾸는 것이라 캐스팅 연산자를 쓰지 않았음
		
		System.out.print((char)i + " ");
		// 명시적 형변환 int는 32비트로 4바이트인데
		// char는 16비트 양의 정수인 2바이트이다.
		// 큰 바이트에서 작은 바이트로 바꾸는 것이라
		// 캐스팅 연산자를 표기하여 준다.

		System.out.print(i+" ");
		// 가독성을 위해 글자 간격 한 칸을 추가해주었다.

		//public static String toBinaryString(int i)
		System.out.print("0b"+Integer.toBinaryString(i)+" ");

		// public static String toOctalString(int i)
		System.out.print("0"+Integer.toOctalString(i)+" ");

		// public static String toHexString(int i)
		System.out.print("0x"+Integer.toHexString(i)+" ");
		System.out.print("0X"+Integer.toHexString(i)+" ");
		System.out.println();	
		} // end of for keyword
		System.out.println();

		// public String toLowerCase()
		String s3=s.toLowerCase();
		// static이 없다

		char ch_S=s3.charAt(0);

		for (int i=ch_S; i<(ch_S+26); i++){
			System.out.print((char)i+" ");
			System.out.print(i+" ");
			System.out.print("0b"+Integer.toBinaryString(i)+" ");
			System.out.print("0"+Integer.toOctalString(i)+" ");
			System.out.print("0X"+Integer.toHexString(i)+" ");
			System.out.println();
		}// end of for

	} // end of main method
} // end of Ascii class