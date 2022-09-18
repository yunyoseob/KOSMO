package a.b.c.ch1;

public class For_p_2{

	public static void main(String args[]){
		// String args[]를 통해
		// 문자 배열이 들어온다.
		System.out.println("<<< main 함수 시작 >>> \n");
		System.out.println("\n main 함수에 들어온 입력 값 >>>> : "+args);

		boolean aBool=args.lenth==1;
		// args 배열에 배열의 길이를 알 수 있는
		// length 명령어를 실행하고
		// 조건은 1, 그러니까 한 개의
		// 문자열일 경우면 aBool은 true, 아니면 false
		System.out.println("\n 들어온 배열의 길이가 1개면 true 아니면 false를 출력하세요. >>> : "+aBool);
		if (aBool){
			String sVal=args[0];
			// sVal 변수를 String 참조 자료형 변수에 선언 후,
			// 입력된 문자 배열의 첫 번째 원소를 대입합니다.
			System.out.println("\n 들어온 배열의 첫 번째 원소 >>> : "+sVal);
			
			boolean bBool= sVal != null && sVal.length()=0;
			// sVal이 입력 값이 없고, sVal의 문자열의 길이가 0이 아닌
			// 두 가지 조건이 맞아야만 if문 돌아가게 하기 위함이다.
			System.out.println("\n 들어온 값이 null이 아니면서, 길이가 0이 아니면 true 아니면 false를 출력하세요. >>> : "+bBool);
			if (bBool){
				

			}
			else{
				System.out.println("\n 들어온 값이 null이거나, 길이가 0이니 다시 입력하세요.");
				
			}


		}
		else{
			System.out.println("\n 배열의 원소가 한 개가 아닙니다. 다시 입력하세요.");
		}

	} // end of main method
} // end of For_p_2