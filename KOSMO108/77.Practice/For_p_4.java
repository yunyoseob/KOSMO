package a.b.c.ch1;

public class For_p_4{
	public static void main(String args[]){
		for (int i=0; i<=10; i+=2){
			// 0부터 10까지 2칸씩 출력
			System.out.print(i+" ");
			// 첫 번째: print와 println의 차이
			// print는 한 줄에 다 출력하세요.
			// print는 한 줄 띄고 다 출력하세요.
			// i로만 출력하면 0246810 이렇게 붙어 나옴
			// 즉, 구분자가 없이 나와버림
			// " "는 char에서 ' '는 초기화지만
			// Sting에서는 Null Space도 출력이 됨.
			// i + " "는 한 칸씩 띄어서 출력하라는 의미
		}
		System.out.println("\n");
		for (int i=0; i<=10; i+=3){
			System.out.print(i+" ");
		}
		System.out.println("\n");
		for (int i=10; i>=0; i-- ){
		// 10부터 0까지 1씩 감소하여 출력 
			System.out.print(i+" ");
		// 속도가 더 빠르다고 한다.
		ㅣ 
		}
	} // end of main method
} // end of For_p_4