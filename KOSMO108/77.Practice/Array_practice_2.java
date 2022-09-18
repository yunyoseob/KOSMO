package a.b.c.ch1;

public class Array_practice_2{
	public void dim_Array(){
		// 배열을 사용해보자.
		// int 형 1차원 배열을 선언한다. []
		// int는 기초자료형인데 이것을 배열로 선언하면
		// 객체로 변한다.
		int iReferenceVariable[]= new int[3];
		// Array 선언 방식이다.
		/* 배열 선언 방법
		1차원 배열	 []
		-----------------------
		자료형 배열참조변수[] = new 자료형[배열의 갯수];
		자료형[] 배열참조변수 = new 자료형[배열의 갯수];

		int라는 자료형에 배열참조변수를 iReferenceVariable[]
		으로 지정해주고 대입 연산자를 통해 new int[]로 배열을 객체로
		할당하여 준다. 배열 크기는 3으로 한다.
		*/
		System.out.println("참조변수 주소 값 >>> : "+iReferenceVariable);
		// 참조변수 주소 값 : [I@15db9742
		// [는 1차원 I는 int @뒤에는 주소

		// iReferenceVariable[0]; 이런식으로 출력하면 안 됨.
		// iReferenceVariable는 method가 아니라 참조변수임.
		int iVal0=iReferenceVariable[0];
		int iVal1=iReferenceVariable[1];
		int iVal2=iReferenceVariable[2];
		System.out.println("iVal0 >>> : "+iVal0+"\n");
		System.out.println("iVal0 >>> : "+iVal1+"\n");
		System.out.println("iVal0 >>> : "+iVal2+"\n");


		// double 형 2차원 배열을 선언한다. [][]
		/*
		2차원 배열 [][]
		-----------------------
		자료형 배열참조변수[][] = new 자료형[배열의 갯수][배열의 갯수];
		자료형[][] 배열참조변수 = new 자료형[배열의 갯수]배열의 갯수;
		자료형[] 배열참조변수[] = new 자료형[배열의 갯수]배열의 갯수;
		*/

		double iReferenceVariable_1[][]= new double[1][3];
		System.out.println(" iReferenceVariable_1 참조변수 주소 값 >>> : "+iReferenceVariable_1);
		double iVal0_0=iReferenceVariable_1[0][0];
		double iVal0_1=iReferenceVariable_1[0][1];
		double iVal0_2=iReferenceVariable_1[0][2];
		System.out.println("iVal0_0 >>> : "+iVal0_0+"\n");
		System.out.println("iVal0_1 >>> : "+iVal0_1+"\n");
		System.out.println("iVal0_2 >>> : "+iVal0_2+"\n");


		double dReferenceVariable[][]=new double[3][2];
		// double이라는 자료형에 배열 참조변수를 dReferenceVariable[]
		// 으로 지정해주고 대입연산자를 통해 new double[][]로 배열을
		// 객체로 할당하여 준다. 배열 크기는 3*2 행렬로 한다.
		System.out.println("참조변수 주소 값 >>> : "+dReferenceVariable);
		// 참조변수 주소 값: [[D@6d06d69c
		// [[는 2차원 배열 D는 double @ 뒤에는 주소

		// 2차원 배열도 마찬가지로 dReferenceVariable[0][0]; 이렇게 출력하면 안 된다.
		double dVal0_0=dReferenceVariable[0][0];
		double dVal0_1=dReferenceVariable[0][1];
	
		double dVal1_0=dReferenceVariable[1][0];
		double dVal1_1=dReferenceVariable[1][1];

		double dVal2_0=dReferenceVariable[2][0];
		double dVal2_1=dReferenceVariable[2][1];

		System.out.println("dVal0_0 >>> : "+dVal0_0+"\n");
		System.out.println("dVal0_1 >>> : "+dVal0_1+"\n");

		System.out.println("dVal1_0 >>> : "+dVal1_0+"\n");
		System.out.println("dVal1_1 >>> : "+dVal1_1+"\n");

		System.out.println("dVal2_0 >>> : "+dVal2_0+"\n");
		System.out.println("dVal2_1 >>> : "+dVal2_1+"\n");
	} // end of one_dim_Array method

	public static void main(String arg[]){
		new Array_practice_2().dim_Array();
	} // end of main method
} // end of Array_practice_2 class