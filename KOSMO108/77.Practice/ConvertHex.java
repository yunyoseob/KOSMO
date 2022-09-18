package a.b.c.ch1;

import java.util.Scanner;

public class ConvertHex{

	public void toHex_Str(String str) {
		System.out.println("ConvertHex.toHex_Str() 함수 진입 >>> : ");

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
		
		String s0 = "abcdefghijklmnopqrstuvwxyz";

		String s1 = s0.toUpperCase();

		String s2 = "0123456789";

		String s3 = "*+-/";

		String s4 = "!@#%%^&*";

		System.out.println(   "1 : 영문자 소문자 \n"
							+ "2 : 영문자 대문자 \n"
							+ "3 : 숫자 \n"
							+ "4 : 연산 기호 \n"
							+ "5 : 특수 문자 \n"
							+ "를 입력하시오 ");
		
		Scanner sc = new Scanner(System.in);
		int iVal = sc.nextInt();

		if (1 == iVal){
			new ConvertHex().toHex_Str(s0);
		}
		if (2 == iVal){
			new ConvertHex().toHex_Str(s1);
		}
		if (3 == iVal){
			new ConvertHex().toHex_Str(s2);
		}
		if (4 == iVal){
			new ConvertHex().toHex_Str(s3);
		}
		if (5 == iVal){
			new ConvertHex().toHex_Str(s4);
		}
	}
}