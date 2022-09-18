package a.b.c.ch1;

public class If_practice{
	public static void main(String args[]){
		int x=1;
		int y=2;

		boolean xyBool=x>y;
		System.out.println("xybool >>> : "+xyBool);
		
		if (xyBool){
			System.out.println("false");
		} // end of xyBool keyword

		if (x > y) {
			System.out.println("false");
		}
		
		/*
		if (1 < 2) {
			System.out.println("1 < 2 >>> : true");
		}
		*/
		
		/*
		boolean xyfalse=x>2;
		System.out.println("xyfalse >>> : "+xyfalse);

		if (xyfalse)
		{
			System.out.println("xyfalse >>> false");
		}
		// false 출력 됨
		*/


		/*
		왜 if (x<y) 혹은 if (1<2)로 해도
		아무 문제 없이 실행이 되는데, 
		boolean xyBool=x<y;
		System.out.println("xybool >>> : "+xyBool);
		명령어 두 줄을 치고
		소괄호 ()에 xyBool을 칠 까???

		여기서는 코드가 몇 십줄 밖에 되지 않지만,
		만약 코드가 몇 만 줄이고 데이터가 실시간으로 계속 들어오는 걸
		처리해야 한다고 가정해보자.

		if 뒤 소괄호 () 안에서 true가 아니여도
		컴파일도 되고 자바 실행도 된다.

		다만, if 문에 대한 결과가 나오지 않을 뿐!!

		이럴 경우, 나중에 프로그래밍에 문제가 생겼을 때,
		어디서 어떤게 잘못됐는지 확인하기가 굉장히 어렵다.
		if문이 100개 정도 있다고 했을 때, 일일히

		100개의 소괄호 안의 내용이 맞는지 아닌지 확인해야하기 때문

		그렇기 때문에 if문을 쓰기전에 항상 
		boolean 연산자를 통해 true임을 확인하는 습관을 가져야 한다.

		그래야 디버깅할 때 피눈물을 안 흘릴 수 있다.

		항상 boolean으로 확인하고, 출력해서 true임을 확인하는
		습관을 가질 것!!!!! 별표 백만개!
		*/
	} // end of main method
} // end of if_practice class