package a.b.c.ch1;

public class FlowControl_practice{

	public static void main(String args[]){
		// if 문을 조건 분기문 이라하고
		// if 절에는 참인 경우가 실행되고!!
		// else 절에는 if 절의 창의 
		// 반대인 거짓일 때 실행된다.
		// if 절은 () 소괄호에 사용하는 표현식의 결과가
		// 참(true)인 경우만 수행된다.
		if (true){
			System.out.println("true");
		}
		// true로 정상 출력된다.

		if (false){
			System.out.println("false");
		}
		// 출력되지 않는다.
		// 유의해야 할 점은 compile은 된다.
		// 그러나 출력이 되지 않는다.
		// 다시 한 번 if 옆 소괄호가 true여야만
		// 실행이 된다는 것을 제대로 인지해야 한다.
		// false로 나오는 것 써놓고 출력 안 된다고
		// 징징거리는거 금지!
		
		/*
		boolean bool=true;
		if (bool){
			System.out.println("true");
		}
		*/

		// 출력이 된다.
	} // end of main method
} // end of FlowControl_practice class

