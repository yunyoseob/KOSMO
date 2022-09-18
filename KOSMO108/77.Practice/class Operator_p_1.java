package a.b.c.ch1;

public class Operator_p_1{
	public void ternary_Oper(){
	/* 
	삼항 연산자 : ternary operator
	조건식 ? 결과1 : 결과2;
	조건식의 결과가 TRUE 이면 결과1, FALSE 이면 결과2

	저번 포스팅 때 if문 사용시 if문 소괄호에 값을 입력하기전에 

	boolean으로 로그를 찍어서 확인해봐야할 필요성에 대해 포스팅 했었다.

	이는 모든 boolean 연산과정에서 꼭 해야하는 절차이다.

	왜?

	Short Circuit 현상 때문이다.

	그게 뭔데?

	단락 회로 평가(Short Circuit Evaluation :SCU)에서
	논리 곱(&&) 연산과 논리 합(||) 연산을 할 때 두 항을 모두 실행하지
	않더라도 결과 값을 알 수 있는 경우에, 나머지 항은 실행되지 않는다.

	빅오 표기법으로 실행 시간의 상한을 체크하는 이유가 코드의 실행시간을
	파악하기 위해서이다. 병렬 연산이 인기있는 이유도 코드 실행 속도가 빠르기
	때문이다.

	컴퓨터는 기본적으로 빠를 수록 좋기 때문에, 불필요한 과정을 제거하거나,
	동시에 연산하는 것에 초점이 맞춰져 있다.

	논리에서도 전자의 결과를 통해 후자의 결과를 알 수 있는 경우에는
	컴퓨터는 실행하지 않는다.

	장바구니분석의 Apriori 알고리즘처럼 불필요할 경우에 로직이 더 실행되지 않음.

	그렇다면 논리 곱과 논리 합은 어떻게 실행되는데?

	논리 곱 (&&) 

	&& 연산
	T AND T = T
	T AND F = F
	F AND T = F
	F AND F = F

	첫 번째 결과가 F라면?
	두 번째 결과가 T, F 뭐가 나와도
	답은 F로 정해져있음

	이럴 경우 컴퓨터는 뒤에 결과 구하지 않음


	논리 합 (||)

	|| 연산
	T OR T = T
	T OR F = T
	F OR T =T
	F OR F =F

	첫 번째 결과가 T라면?
	두 번째 결과가 T, F 뭐가 나와도
	답은 T로 정해져있음

	이럴 경우 컴퓨터는 뒤에 결과 구하지 않음

	그러니까 boolean 연산을 사용하거나, 두 값을 비교해야하는 연산자를 활용할 때는
	로그를 꼭 찍어봐야 한다. (눈으로 직접 출력 결과를 확인하라는 말)
	*/
	int num 1 = 10;
	int i =2;

	boolean b0=(num1=num1+10) < 10;
	boolean b1=(i=i+2) < 10;
	boolean b2=b0&&b1;
	System.out.println("b0 >>> : "+b0);
	System.out.println("\n b1 >>> : "+b1);
	System.out.println("\n b2 >>> : "+b2);

	boolean value=((num=num1+10) < 10)&&((i=i+2)<10);
	System.out.println("\n value >>> : "+value);
	System.out.println("\n num1 >>> : "+num1);
	System.out.println("\n i >>> : "+i);

	boolean b3 = (num1=num1+10)>10;
	boolean b4 = (i=i+2)>10;
	boolean b5 = b3 || b4;
	System.out.println("\n b3 >>> : "+b3);
	System.out.println("\n b4 >>> : "+b4);
	System.out.println("\n b5 >>> : "+b5);

	boolean value1=((num1=num1+10)>10;
	System.out.println("\n value1 >>> : "+value1);
	System.out.println("\n num1 >>> : "+num1);
	System.out.println("i >>> : "+i);
	} // end of ternary_Oper method


	public static void main(String args[]){
		System.out.println("main 함수 시작 \n");
		Operator_p_1 rv=Operator_p_1();
		System.out.println("\n 참조변수 rv 주소 >>> :"+rv);
		rv.ternary_Oper();
	} // end of main method
} // end of Operator_p_1 class