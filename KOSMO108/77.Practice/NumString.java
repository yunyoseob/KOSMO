package a.b.c.ch1;

public class NumString{
	public static void main(String args[]){
		// 문자 상수 : 숫자를 문자열로 표현한 것 : 숫자를 떠블 쿼테이션으로 묶은 것
		String sX="1";
		String sY="2";

		System.out.println(sX+sY);
		// 12가 출력됨.
		
		// public static int parseInt(String s)
		// static 있으니까 객체 만들필요 X
		int iX=Integer.parseInt(sX);
		int iY=Integer.parseInt(sY);
		System.out.print(iX+iY);
		// 3이 출력됨

		System.out.println("\n 문자열 더하기 하면 숫자도 문자열이 된다. >>> : ");
		System.out.println(""+iX+iY);
		// 이렇게 하면 숫자 3이 출력되지 않고, 12가 출력됨.
		// 앞에 ""을 붙여줬기 때문

		System.out.println(""+(iX+iY));
		// 그러나 () 소괄호로 iX+iY를 묶어주면, 3이 출력됨.

		// 문자 상수를 숫자로 변환하는 다른 방법
		String sI="1";
		String sL="11";
		String sF="1.123";
		String sD="1.1";
		// String이기 때문에 "" 큰 따옴표 사용
		
		// public static int parseInt(String s)
		// 좌항에 int는 기초자료형
		// 우항에 Integer는 객체 안에 참조자료형
		int iVal=Integer.parseInt(sI);
		
		// public static long parseLong(String s)
		// 좌항에 long과 우항의 long이 같아짐.
		// 좌항에 long은 기초자료형
		// 우항에 Long은 객체 안에 참조자료형
		// 클래스의 첫 글자는 뭐로 시작한다? 대문자
		long lVal=Long.parseLong(sL);
		
		// public static float parseFloat(String s)
		// 좌항에 float는 기초자료형
		// 우항에 Float는 객체 안에 참조자료형
		float fVal=Float.parseFloat(sF);

		// public static double parseDouble(String s)
		// 왼쪽에 double은 기초자료형
		// 오른쪽에 Double은 객체 안에 참조자료형
		double dVal=Double.parseDouble(sD);
		

		System.out.println("iVal >>> : "+iVal);
		// 1
		System.out.println("lVal >>> : "+lVal);
		// 11
		System.out.println("fVal >>> : "+fVal);
		// 1.123
		System.out.println("dVal >>> : "+dVal);
		// 1.1

		// 숫자를 문자로 변환
		int nInt =100;
		long nLong=101L;
		float nFloat=1.01F;
		double nDouble=1.001D;
		// int를 제외하고는 전부 자료형에 따라 마지막에 L,F,D를 붙여줌
		
		// public String toString()
		String sInt=Integer.toString(nInt);
		String sLong=Long.toString(nLong);
		String sFloat=Float.toString(nFloat);
		String sDouble=Double.toString(nDouble);

		System.out.println("sInt >>> : "+sInt);
		// 100
		System.out.println("sLong >>> : "+sLong);
		// 101
		System.out.println("sFloat >>> : "+sFloat);
		// 101
		System.out.println("nDouble >>> : "+nDouble);
		// 1.01
		
		// public static String valueOf(int i)
		String s0=String.valueOf(nInt);
		// public static String valueOf(long l)
		String s1=String.valueOf(nLong);
		// public static String valueOf(float f)
		String s2=String.valueOf(nFloat);
		// public static String valueOf(double d)
		String s3=String.valueOf(nDouble);

		System.out.println("s0 >>> : "+s0);
		// 100
		System.out.println("s1 >>> : "+s1);
		// 101
		System.out.println("s2 >>> : "+s2);
		// 1.01
		System.out.println("s3 >>> : "+s3);
		// 1.001

		String ss = nInt + ""; //사용을 지양하자
		System.out.println("ss >>> : "+ss);
		// 100
	} // end of main method
} // end of NumString class