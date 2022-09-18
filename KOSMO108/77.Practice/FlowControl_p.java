package a.b.c.ch1;

import java.util.Scanner;
/*
java.lang의 경우 import를 하지 않아도
따로 내장이 되어 있으므로 이제 까지 문제가 없었다.
그러나, java.util은 내장이 되어있는 것이 아니므로,
import 명령어로 해당 패키지에 있는 클래스를 가져온다.

유의사항 1: Name Space에서 클래스 첫 글자는 대문자다
import java.util.scanner; (X)

유의사항 2: Name Space를 필요한 것만 제대로 불러와야 한다.
import java.util.* (X)
- 내가 무슨 클래스를 썻는지 알 수 없음. 이는 가독성 저하문제 발생

유의사항 3: 반드시 import를 하기전에 내가 부를 패키지의 클래스의
버전을 api를 통해 확인한다. 
- 회사마다 사용하는 JAVA 버전이 다 다르기 때문에 확인하지 않으면,
- version이 맞지 않아 import가 안 되는 문제가 생길 수 있음.

유의사항 4 : 빌트인 클래스의 참조변수에는 주소값이 보여주는 경우가 있고, 아닌 경우도 있다.

유의사항 5 : 클래스를 메모리에 올리는 동작은 new 키워드 말고도 다른 것들이 여러가지가 있다.
*/


public class FlowControl_p{
	public int add(int x, int y){
		return x+y;
		// 인수값 두 개가 들어오면, 둘을 더해서 출력해주는 함수
		// public뒤에 int, 파라미터인 int x, int y, 
		// return 뒤에 x+y의 자료형이 모두 같아야 한다.
	} // end of add method
	public static main(String args[]){
		System.out.println("더하고자 하는 두 수를 입력하세요. >>> : ");
		/* 
		java se 8 api : System.in 
		public static InputStream in 
		The "standard" input stream.
		
		InputStream은 명령어를 통해 집어 넣는다는 의미이다.
		*/

		/*
		Scanner(File source)
		File source를 Scanner에 넣는다.
		*/

		

		Scanner rv=new Scanner(System.in);
		// Scanner에서 nextInt()를 사용할 건데
		// api에 설명이 public int nextInt()
		// 으로 되어있다. static이 없기 때문에 클래스.메서드로 사용하는게 
		// 아니라 참조변수를 통해 출력하도록 한다.
		// System.in은 들어오는 명령어를 객체로 생성하여 
		// 참조변수에 대입하겠다는 것이다.

		int x=rv.nextInt();
		int y=rv.nextInt();
		// 시스템에 들어온 두수를 각 각
		// int x, int y에 대입한다.
		// 이 때 주의해야 할 것은 좌항에 있는 int 자료형과
		// 우항에 자료형이 같아야 한다는 것이다.
		System.out.println("x >>>> : "+x);
		// x값이 잘 들어왔는지 확인해보기
		System.out.println("y >>> : "+y);
		// y값이 잘 들어왔는지 확인해보기

		FlowControl_p rv_f=new FlowControl_p();
		// add 함수의 경우 static 수정자 키워드가 없기 때문에
		// new 키워드로 객체 생성

		int addSum=rv_f.add(x,y);

		System.out.println("addSum >>> : "+addSum);

	
	} // end of main method
} // end of FlowControl_p class




