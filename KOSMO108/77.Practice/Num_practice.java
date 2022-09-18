package a.b.c.ch1;

public class Num_practice{
	public static void main(String args[]){
		String str1="1";
		String str2="2";
		// "1"과 "2"는 문자 상수

		System.out.println(str1+str2);
		// 문자 상수 끼리의 합이므로 12

		int iX=Integer.parseInt(str1);
		int iY=Integer.parseInt(str2);
		// 문자 상수를 정수로 바꾸어 줌.

		System.out.println(iX+iY+"\n");
		System.out.println("문자열 더하기 하면 숫자도 문자열이 된다. >>> \n");
		System.out.println(""+(iX+iY)+"\n");
		System.out.println(""+iX+iY+"\n");
	} // end of main method
} // end of Num_practice class