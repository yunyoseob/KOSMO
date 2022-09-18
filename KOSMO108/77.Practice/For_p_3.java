package a.b.c.ch1;

public class For_p_3{
	public static void main(String args[]){
		System.out.println("<<< main 함수 시작 >>>\n");
	/*
	자바에서 for 문 초기화 식에서 항상 초기화 값을
	0으로 하는데, 그 이유는 for문이 대부분 배열
	데이터를 처리하는데 사용하기 때문이다.
	배열의 인덱스는 0부터 시작하기 때문이다.
	*/
	
	// for문을 통해 출력하고자 하는 것 : 0,1,2,3,4

	// 초기화 식을 int i=0으로 시작

	// 1번째 방법
	for (int i=0; i<5 ; i++){
		System.out.println("\n 1번째 방법 : i 값은 >>> : "+i);
	}
	System.out.println("\n-----------------");
	
	// 2번째 방법
	for (int i=0; i<=4; i++){
		System.out.println("\n 2번째 방법 : i 값은 >>> : "+i);
	}
	System.out.println("\n-----------------");

	// 초기화 식은 int i=1으로 시작

	// 3번째 방법
	for (int i=1; (i-1)<5; i++){
		System.out.println("\n 3번째 방법 : i 값은 >>> : "+(i-1));
	}
	System.out.println("\n-----------------");

	// 4번째 방법
	for (int i=1; i<=5; i++){
		System.out.println("\n 4번째 방법 : i 값은 >>> : "+(i-1));
	}
	System.out.println("\n-----------------");
	} // end of main method
} // end of For_p_3 class