package a.b.c.ch1;

public class For_p_7{
	public void forTest(int iArr_forTest[]){
		System.out.println("\n <<< forTest method 시작 >>> ");
		System.out.println("인수가 매개변수에 잘 입력됐는지 확인 iArr_forTest >>> "+iArr_forTest);
		
		// 지역변수 : 배열의 깊이를 체크하기 위해서
		int iArrLen=0;

		// forTest의 매개변수 넘어온 iArr_forTest 배열 참조변수에 데이터가 있는지
		// 없는지 체크하는 것
		// 배열은 객체이기 때문에 null(iArr_forTest != null);
		// 및 길이(iArr_forTest.length > 0)를 체크한다.
		if (iArr_forTest != null && iArr_forTest.length > 0){
			// 배열의 길이 체크
			iArrLen=iArr_forTest.length;
			// length는 배열의 길이 체크
			// length()는 문자열의 길이 체크

			// for문을 이용해서 배열의 길이만큼 배열의 데이터를 콘솔에 출력
			for (int i=0; i<iArrLen; i++){
				System.out.println("iArr_forTest["+i+"] >>> : "+iArr_forTest[i]);
			}
		}
	} // end of forTest method

	public static void main(String args[]){
		int iArr_main[]={1,2,3,4,5,6,7,8,9};
		System.out.println("iArr_main 참조변수 주소값 >>> : "+iArr_main);

		For_p_7 rv=new For_p_7();
		System.out.println("rv 참조변수 주소값 >>> : "+rv);

		rv.forTest(iArr_main);
	} // end of main method
} // end of For_p_7