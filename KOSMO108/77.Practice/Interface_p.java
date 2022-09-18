package a.b.c.ch2;

/*
implements 주의사항

1. class 대문자로시작~~~Impl implements 클래스이름{}
   interface 클래스이름{}
   은 짝궁이다. 반드시 같이 써야 한다.
2. extends랑 implements 차이
   단일상속은 extends를 쓴다.
   다중상속은 implements를 쓴다.
   단, implements 끼리는 extends를 쓴다.
3. implements를 사용하는 클래스에는 마지막글자가 Impl라는 규칙이
   있다.
4. interface 인터페이스이름 안에 블록에서 함수는 블록이 없다.
	함수이름(); (O) 
	함수이름(){} (X)
*/

//===========================================
// 첫 번째 implements
// 시작 ======================================

class Interface_B_Impl implements Interface_B{
	public void inter_b(){
		System.out.println("Interface_B_Impl.inter_b() 함수 실행");		
	} // inter_b method
} // implements(Impl) Interface_B_Impl class

interface Interface_B{
	public void inter_b();
} // Interface_B interface

// 끝 =======================================

//==========================================
// 두 번째 implements
// 시작 =====================================

class Interface_A_Impl implements Interface_A{
	public void inter_a(){
		System.out.println("Interface_A_Impl.inter_a() 함수 실행");
	} // inter_a method
} // implements(Impl) Interface_A_Impl class

interface Interface_A{
	public void inter_a();
} // Interface_A interface

// 끝 ======================================

public class Interface_p{
	public static void main(String args[]){
		// 부모 인터페이스 클래스 선언 참조변수 = new 자식클래스();
		Interface_A ia=new Interface_A_Impl();
		ia.inter_a();
		Interface_B ib=new Interface_B_Impl();
		ib.inter_b();

		/*
		부모에서 자식 걸 사용하는 것 같은데 왜 Down Casting을 쓰지 않나요?
		부모에서 자식 걸 사용하는 게 아니라 implements 규칙 자체가
		class에서 메소드를 재정의 하는 것이다.
		위에서 언급되었듯, 두 개의 클래스를 상속시키는 것이랑은 다르게
		class와 interface는 하나의 짝궁이라
		이전의 Down Casting와는 상황이 다르다.
		*/

		/*
		사용금지
		// 자식클래스선언 참조변수 = new 자식클래스();
		Interface_A_Impl iai = new Interface_A_Impl();
		iai.inter_a();

		Interface_B_Impl ib=new Interface_B_Impl();
		ib.inter_b();
		
		개인적인 생각
		부모에서 참조변수 선언한거랑 자식에서 참조변수 선언한거랑
		메모리 사용이 당연히 다를 수 밖에 없다고 생각

		예를 들어 1명의 부모가 10000000명의 자식을 가지고 있으면
		1명의 부모에 참조변수 만들어서 자식 3명 호출 할거면 
		필요한 3명의 것만 호출하면 됨.

		근데 자식에다가 참조변수 선언하면 10000000명의 자식이
		다 메모리에 올라갈 것이기 때문에 자원의 차이가 클 수 밖에 없음.
		*/
	} // main method
} // Interface_p class