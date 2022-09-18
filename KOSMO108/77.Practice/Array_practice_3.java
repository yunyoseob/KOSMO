package a.b.c.ch1;

public class Array_practice_3{
	public void byteArray(){
		byte bArr[]=new byte[10];
		// byte 클래스에 배열을 할당할 건데
		// new라는 인스턴스 연산자를 선언하고
		// 크기는 10으로 할당하여 준다.
		System.out.println("bArr 참조 변수 >>> : "+bArr+"\n");

		byte b1=bArr[0];
		byte b10=bArr[9];
		// 인덱스는 0부터 시작함
		// 0을 입력해야 첫 번째 값이 나옴.

		System.out.print("bArr 1번째 값 >>> : "+b1+"\n");
		System.out.print("bArr 10번째 값 >>> : "+b10+"\n");
	}// end of byteArray method

	public void charArray(){
		char cArr[]=new char[10];
		// char 클래스에 배열을 할당할 건데
		// new라는 인스턴스 연산자를 선언하고
		// 크기는 10으로 할당하여 준다.

		System.out.println("cArr 참조 변수 >>> : "+cArr+"\n");
		
		char c1=cArr[0];
		char c10=cArr[9];

		System.out.print("cArr 1번째 값 >>> : "+c1+"\n");
		System.out.print("cArr 10번째 값 >>> : "+c10+"\n");
	} // end of charArray method

	public void doubleArray(){
		double dArr[]=new double[10];
		// double 클래스에 new라는 인스턴스 연산자를 선언하여
		// 10의 크기인 배열을 대입하여 준다.

		System.out.println("dArr 참조 변수 >>> : "+dArr+"\n");
		
		double d1=dArr[0];
		double d10=dArr[9];

		System.out.print("dArr 1번째 값 >>> : "+d1+"\n");
		System.out.print("dArr 10번째 값 >>> : "+d10+"\n");
	} // end of doubleArray method

	public void stringArray(){
		String sArr[] = new String[10];
		System.out.println("sArr 참조변수 >>> : " + sArr+"\n");

		System.out.print("sArr 1번째 값 >>> : "+sArr[0]+"\n");
		System.out.print("sArr 10번째 값 >>> : "+sArr[9]+"\n");
	
	} // end of stringArray method


	public void stringArray_1(){
		char sArr_1[]=new char[10];
		// String 클래스에 new라는 인스턴스 연산자를
		// 선언하여 10의 크기인 배열을 대입하여 준다.
		System.out.println("sArr_1 참조 변수 >>> : "+sArr_1+"\n");
				
		String str=new String(sArr_1);
		System.out.println("str=new String(sArr_1)"+"\n");

		char s1=str.charAt(0);
		char s10=str.charAt(9);

		System.out.print("sArr_1 1번째 값 >>> : "+s1+"\n");
		System.out.print("sArr_1 10번째 값 >>> : "+s10+"\n");

	} // end of stringArray_1 method

	public static void main(String args[]){
		new Array_practice_3().byteArray();
		new Array_practice_3().charArray();
		new Array_practice_3().doubleArray();
		new Array_practice_3().stringArray();
		new Array_practice_3().stringArray_1();
	} // end of main method

} // end of Array_practice_3 class