package a.b.c.ch1;


public class Array_practice_4{

	public void byteArray(){
		
		// 배열을 선언하고 JVM이 선언한 데이터 타입의 디폴트 값으로 초기화 한다.
		byte bArr[] = new byte[3];
		System.out.println("bArr 참조변수 >>> : " + bArr+"\n");
		System.out.println("bArr.length 배열의 길이 구하기 >>> : " + bArr.length+"\n");
		System.out.println("bArr[0] >>> : " + bArr[0]+"\n");
		System.out.println("bArr[1] >>> : " + bArr[1]+"\n");
		System.out.println("bArr[2] >>> : " + bArr[2]+"\n");
		// 0,0,0으로 출력이 된다. (default 값)
		
		// 배열의 값을 선언 과 동시에 초기화 하기 
		byte bArr_1[] = new byte[]{1, 2, 3};
		System.out.println("bArr_1.length 배열의 길이 구하기 >>> : " + bArr_1.length+"\n");
		System.out.println("bArr_1[0] >>> : " + bArr_1[0]+"\n");
		System.out.println("bArr_1[1] >>> : " + bArr_1[1]+"\n");
		System.out.println("bArr_1[2] >>> : " + bArr_1[2]+"\n");
		// 1,2,3 을 넣어주니까 0,0,0이 아닌 1,2,3으로 출력됨.
		
		// 배열의 값을 선언 과 동시에 초기화 하면서 new 연산자와 데이터타입 생략하기  
		byte bArr_2[] = {11, 22, 33};
		System.out.println("bArr_2.length 배열의 길이 구하기 >>> : " + bArr_2.length+"\n");
		System.out.println("bArr_2[0] >>> : " + bArr_2[0]+"\n");
		System.out.println("bArr_2[1] >>> : " + bArr_2[1]+"\n");
		System.out.println("bArr_2[2] >>> : " + bArr_2[2]+"\n");
		// 마찬가지로, // 11,22,33 을 넣어주니까 11,22,33이 아닌 1,2,3으로 출력됨.
	}

	public void charArray(){

		// 배열을 선언하고 JVM이 선언한 데이터 타입의 디폴트 값으로 초기화 한다.
		char cArr[] = new char[3];
		System.out.println("cArr 참조변수 >>> : " + cArr+"\n");
		System.out.println("cArr.length 배열의 길이 구하기 >>> : " + cArr.length+"\n");
		System.out.println("cArr[0] >>> : " + cArr[0]+"\n");
		System.out.println("cArr[1] >>> : " + cArr[1]+"\n");
		System.out.println("cArr[2] >>> : " + cArr[2]+"\n");
		// 아무것도 출력되지 않음 default None
		// 콘솔창에 null로 출력되는 것이 아니라, 아무것도 출력되지 않음.

		// 배열의 값을 선언 과 동시에 초기화 하기 
		char cArr_1[] = new char[]{'a', 'b', 'c'};
		System.out.println("cArr_1.length 배열의 길이 구하기 >>> : " + cArr_1.length+"\n");
		System.out.println("cArr_1[0] >>> : " + cArr_1[0]+"\n");
		System.out.println("cArr_1[1] >>> : " + cArr_1[1]+"\n");
		System.out.println("cArr_1[2] >>> : " + cArr_1[2]+"\n");
		// a,b,c를 입력하니까, a,b,c로 출력된다.
		
		// 배열의 값을 선언 과 동시에 초기화 하면서 new 연산자와 데이터타입 생략하기  
		char cArr_2[] = {'d', 'e', 'f'};
		System.out.println("cArr_2.length 배열의 길이 구하기 >>> : " + cArr_2.length+"\n");
		System.out.println("cArr_2[0] >>> : " + cArr_2[0]+"\n");
		System.out.println("cArr_2[1] >>> : " + cArr_2[1]+"\n");
		System.out.println("cArr_2[2] >>> : " + cArr_2[2]+"\n");
		// d,e,f를 입력하니까 d,e,f로 출력된다.
	}

	public void intArray(){
		int iArr[] = new int[3];
		System.out.println("iArr 참조변수 >>> : " + iArr+"\n");
		System.out.println("iArr.length 배열의 길이 구하기 >>> : " + iArr.length+"\n");
		System.out.println("iArr[0] >>> : "+iArr[0]+"\n");
		System.out.println("iArr[1] >>> : "+iArr[1]+"\n");
		System.out.println("iArr[2] >>> : "+iArr[2]+"\n");
		// 0으로 출력됨. default 0

		// 배열의 값을 선언과 동시에 초기화 하기
		int iArr_1[]= new int[]{1,2,3};
		System.out.print("iArr_1.length 배열의 길이 구하기 >>> : "+iArr_1.length+"\n");
		System.out.print("iArr_1[0] >>> : "+iArr_1[0]+"\n");
		System.out.print("iArr_1[1] >>> : "+iArr_1[1]+"\n");
		System.out.print("iArr_1[2] >>> : "+iArr_1[2]+"\n");
		// 1,2,3을 입력하니, 1,2,3으로 출력됨.

		// 배열의 값을 선언 과 동시에 초기화 하면서 new 인스턴스 연산자와 데이터 타입 생략하기
		int iArr_2[]={1,2,3};
		System.out.print("iArr_2.length 배열의 길이 구하기 >>> : "+iArr_2.length+"\n");
		System.out.print("iArr_2[0] >>> : "+iArr_2[0]+"\n");
		System.out.print("iArr_2[1] >>> : "+iArr_2[1]+"\n");
		System.out.print("iArr_2[2] >>> : "+iArr_2[2]+"\n");
		// 마찬가지로 1,2,3으로 출력됨.
		}

	public void doubleArray(){
		double dArr[] = new double[3];
		System.out.println("dArr 참조변수 >>> : " + dArr);
		System.out.println("dArr.length 배열의 길이 구하기 >>> : " + dArr.length+"\n");
		System.out.println("dArr[0] >>> : "+dArr[0]+"\n");
		System.out.println("dArr[1] >>> : "+dArr[1]+"\n");
		System.out.println("dArr[2] >>> : "+dArr[2]+"\n");
		// 0으로 출력됨. default 0

		// 배열의 값을 선언과 동시에 초기화 하기
		double dArr_1[]=new double[]{4,5,6};
		System.out.println("dArr_1.length 배열의 길이 구하기 >>> : " + dArr_1.length+"\n");
		System.out.println("dArr_1[0] >>> : "+dArr_1[0]+"\n");
		System.out.println("dArr_1[1] >>> : "+dArr_1[1]+"\n");
		System.out.println("dArr_1[2] >>> : "+dArr_1[2]+"\n");
		// 4,5,6을 입력하니까 4.0,5.0,6.0으로 출려됨.
		// int랑 다르게 4,5,6이 아닌 4.0,5.0,6.0으로 출력된다는 면에서 차이가 존재

		// 배열의 값을 선언과 동시에 초기화 하면서 new 인스턴스 연산자와 데이터 타입 생략하기
		double dArr_2[]={7,8,9};
		System.out.println("dArr_2.length 배열의 길이 구하기 >>> : "+dArr_2.length+"\n");
		System.out.println("dArr_2[0] >>> : "+dArr_2[0]+"\n");
		System.out.println("dArr_2[1] >>> : "+dArr_2[1]+"\n");
		System.out.println("dArr_2[2] >>> : "+dArr_2[2]+"\n");
		// 7,8,9를 입력하니까, 7.0,8.0,9.0으로 출력됨.
		// 자료형이 double이기 때문에, 마찬가지로 7,8,9가 아닌
		// 7.0,8.0,9.0으로 출력된다.
	}

	public void stringArray(){

		// 배열을 선언하고 JVM이 선언한 데이터 타입의 디폴트 값으로 초기화 한다.
		String sArr[] = new String[3];
		System.out.println("sArr 참조변수 >>> : " + sArr+"\n");
		System.out.println("sArr.length 배열의 길이 구하기 >>> : " + sArr.length+"\n");
		System.out.println("sArr[0] >>> : " + sArr[0]+"\n");
		System.out.println("sArr[1] >>> : " + sArr[1]+"\n");
		System.out.println("sArr[2] >>> : " + sArr[2]+"\n");
		// 전부 null로 출력됨.
		// char랑은 다르게 아무것도 출력이 안 되는 것이 아니라
		// null으로 출력된다는 면에서 char랑 다르다..
		// default None

		// 배열의 값을 선언 과 동시에 초기화 하기 
		String sArr_1[] = new String[]{"abc", "def", "ghi"};
		System.out.println("sArr_1.length 배열의 길이 구하기 >>> : " + sArr_1.length+"\n");
		System.out.println("sArr_1[0] >>> : " + sArr_1[0]+"\n");
		System.out.println("sArr_1[1] >>> : " + sArr_1[1]+"\n");
		System.out.println("sArr_1[2] >>> : " + sArr_1[2]+"\n");
		// abc, def, ghi 를 입력하여 주니
		// abc, def, ghi 가 출력된다.

		// 배열의 값을 선언 과 동시에 초기화 하면서 new 연산자와 데이터타입 생략하기  
		String[] sArr_2 = {"abc", "def", "ghi"};
		System.out.println("sArr_2.length 배열의 길이 구하기 >>> : " + sArr_2.length+"\n");
		System.out.println("sArr_2[0] >>> : " + sArr_2[0]+"\n");
		System.out.println("sArr_2[1] >>> : " + sArr_2[1]+"\n");
		System.out.println("sArr_2[2] >>> : " + sArr_2[2]+"\n");
		// 마찬가지로, abc, def, ghi를 입력하니
		// abc, def, ghi가 출력된다.

		// String에 있는 원소들 더 쪼개보기 : Convert String to Char
		String str_1=sArr_2[0];

		System.out.println("sArr_2[0] 첫 번째 글자 >>> : "+str_1.charAt(0)+"\n");
		System.out.println("sArr_2[0] 두 번째 글자 >>> : "+str_1.charAt(1)+"\n");
		System.out.println("sArr_2[0] 세 번째 글자 >>> : "+str_1.charAt(2)+"\n");
		// sArr_2에 있는 첫 번째 원소인 abc를 charAt로 쪼개서
		// 출력하니, a,b,c,로 나옴.

		String str_2=sArr_2[1];

		System.out.println("sArr_2[1] 첫 번째 글자 >>> : "+str_2.charAt(0)+"\n");
		System.out.println("sArr_2[1] 두 번째 글자 >>> : "+str_2.charAt(1)+"\n");
		System.out.println("sArr_2[1] 세 번째 글자 >>> : "+str_2.charAt(2)+"\n");
		// sArr_2에 있는 두 번째 원소인 def를 charAt로 쪼개서
		// 출력하니, d,e,f로 나옴.

		String str_3=sArr_2[2];

		System.out.println("sArr_2[2] 첫 번째 글자 >>> : "+str_3.charAt(0)+"\n");
		System.out.println("sArr_2[2] 두 번째 글자 >>> : "+str_3.charAt(1)+"\n");
		System.out.println("sArr_2[2] 세 번째 글자 >>> : "+str_3.charAt(2)+"\n");
		// sArr_2에 있는 세 번째 원소인 ghi를 charAt로 쪼개서
		// 출력하니, g,h,i로 나옴.
	}


	// 콘솔 어플리케이션의 시작점이다.
	public static void main(String args[]) {
	
		Array_practice_4 ea3 = new Array_practice_4();
		ea3.byteArray();
		ea3.charArray();
		ea3.intArray();
		ea3.doubleArray();
		ea3.stringArray();
		// new 클래스이름().메소드이름(); 으로 객체를 생성한 게 아니라
		// 클래스이름 참조변수 = new 클래스이름();
		// 으로 객체를 생성한 뒤, 필요한 내용을 한 번에 출력하는 방식

	} // end of main() 
} // end of Array_practice_4 class