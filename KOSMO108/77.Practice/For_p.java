package a.b.c.ch1;

public class For_p{
	public static void main(String args[]){
		/*
		자바에서 for
		for 키워드
		(초기화식; 조건식; 증감식) 소괄호
		초기화식: 데이터타입 선언 변수 선언=값 초기화; int i=0;
		조건식 :boolean =1<5;
		증감식 : 초기화 식에 선언한 변수를 이용해서 증감식을 쓴다. i++
		증감식 연산자는 : 전위, 후위, ++, --, 배수 무엇이든 사용가능하다.
		{ 반복수행할 표현 식;} 중괄호
		
		자바에서는 for 키워드를 JVM이 보면
		for 키워드 뒤에 () 가 있으면 무조건 반복 수행한다.

		파이썬의 경우
		for i in range(1,5,1);
		이렇게 하면 5까지 출력되지 않고, 4까지만 출력된다.
		
		자바의 경우
		int n;
		for (n=1;n<=5;++){
			System.out.println(n);
		}

		이렇게 수행할 경우,
		조건식으로 n이 5보다 크지 않은 이상
		1부터 5까지 순차적으로 실행이 된다.

		for (; ;)로 실행하면 ()소괄호 안에 내용보고
		무한으로 돌아감.
		*/

		/* 실험 1
		for (; ;){
			System.out.println(">>>");
			}
		출력 결과: 무제한으로 >>> 출력
		*/


		/* 실험 2
		for (int i=0; ; ){
			System.out.println("i >>> : "+i);
		}
		// 출력 결과 : 무제한으로 0이 출력 된다.
		// 포인트는 위에서 int i;를 지정해주지 않았는데도
		// 0이 출력 된다는 것이다. */
		

		/* 실험 3
		int i = 0;
		for (; ; )
		{
			System.out.println("i >>> : "+i);
		}
		 // 출력 결과 : 무제한 0 출력
		 // 결과는 같지만,for문 소괄호 안에서 지정한게 아니라, 밖에서 
		 // 지정하고 시작했다는 면에서 실험 2와 차이점이 존재한다.
		 */

		 /* 실험 4
		 int i;
		 for (i=0; ; ){
			 System.out.println("i >>> : "+i);
		 }
		 // 출력 결과 : 무제한 0 출력
		 // 결과는 0이 나오지만, 차이점은
		 // int i로 int 자료형에 i를 선언한 뒤,
		 // 함수 블럭 안에서 i에 0을 대입한 뒤에
		 // 출력하였다. */

		 /* 실험 5
		 int i;
		 for (i=0;i<3;){
			 System.out.println("("+i+"<3;) >>> : "+(i<3));
			 System.out.println(" for {} 블럭 내부 ::: i >>> : "+i);
		 } 
		 // 출력 결과 true와 0이 반복적으로 계속 출력된다.
		 // 여기서는 int자료형에 i를 선언하고,
		 // i에 0을 대입한 뒤, i가 3보다 작다는 조건을 설정
		 // 콘솔창에 출력하는 과정은 첫 번째 : i가 3보다 작나요?
		 // 두 번째 i를 출력하세요
		 // 그 결과 true와 0이 무제한 반복으로 출력되는 것을 볼 수 있다.
		*/

		/* 실험 6
		int i;
		for (i=0; i<3; i++){
			System.out.println("("+i+" < 3) >>> : "+(i<3));
			System.out.println("for {} 블럭 내부 ::: i >>> : "+i);
		}
		System.out.println("for {} 블럭 외부 ::: i >>> : "+i);
		// 출력 결과 0,1,2,3이 출력 되었다.
		// 아까처럼 int 자료형에 i를 선언하고,
		// i에 0을 대입한 뒤, i가 3보다 작다는 조건을 설정했다.
		// 실험 5와 차이점은 뒤에 i++이라는 증감연산자를 사용해서,
		// 실행될때 마다 1씩 증가하게 만들었다.

		// 마지막에 for 블록 밖에서 출력된 이유는
		// for문 블럭 밖에서 int를 선언했기 때문에,
		// 블럭 밖에서도 출력이 가능하다. 
		// 마지막에 3이 출력된 이유는
		// for문의 방식이 다음과 같이 진행 되었기 때문이다.

		// 1번 int 자료형에 i가 선언 됐는데, for문을 진행해주세요.
		// 해당 i에 0을 대입해주세요.
		// i가 3보다 작나요? true 
		// i와 i<3 여부를 출력해주세요.		
		// 그 다음 이제 i에 1을 더해 주세요.

		// i는 이제 1이네요.
		// i가 3보다 작나요? true 
		// i와 i<3 여부를 출력해주세요.
		//그 다음 이제 i에 1을 더해 주세요.

		// i는 이제 2이네요.
		// i가 3보다 작나요? true 
		// i와 i<3 여부를 출력해주세요.
		// 그 다음 이제 i에 1을 더해 주세요.

		// i는 이제 3이네요.
		// i가 3보다 작나요? false
		// for문을 종료하도록 하겠습니다.

		// for문 블럭 밖에서 i를 출력하면
		// JAVA는 함수 블록 내에서
		// 인터프리터 방식으로 실행되므로,
		// main 함수 내에서 
		// i값이 업데이트 되면서 3이 출력이 되는 것이다.
		*/

		/* 실험 7
		for (int i=0; i<3; i++){
			System.out.println("("+i+"< 3) >>> : "+(i<3));
			System.out.println("for {} 블럭 내부 ::: i >>> : "+i);
		}

		System.out.println("for {} 블럭 외부 ::: i >>> : "+i);
		// 출력 결과 : javac error : cannot find symbol
		// 의미 : 해당 글자를 찾을 수 없습니다.
		// 이유 : for문 소괄호 안에서 int라는 자료형에
		// i를 선언하고 0을 대입하세요를 했기 때문에
		// compile 부터 되지 않는다.
		*/	
	} // end of main method
} // end of For_p class