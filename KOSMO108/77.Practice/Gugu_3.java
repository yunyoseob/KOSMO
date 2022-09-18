// 이중 for문 과 while로 구구단 쉽게 출력하기
package a.b.c.ch1;

public class Gugu_3{
	public static void main(String args[]){
		/*
		// 이중 for문 사용
		for (int j=1; j<=9; j++){
			System.out.println();
			for (int i=1; i<=9; i++){
				System.out.format("%d x %d =%2d ", i, j, i*j);
				// d는 정수 숫자가 들어갈 공간
				// 2d는 두 자리 정수 자릿수가 들어간다는 의미
			} // for i
		} // for j
		*/
		

		/* while + for 문 사용
		int w1=1;
		int w2=1;
		while (w1<=9){
			for (w2=1;w2<=9;w2++){
				System.out.printf("%d x %d =%2d ", w1, w2, w1*w2);
				} // for w2
				System.out.println();
				w1++;
			} // while w1
		*/


		// for + do while 문 사용
		for (int i=1; i<=9; i++){
			int j=2;
			do{
				System.out.format("%d x %d =%2d", j, i, j*i);
				j++;
			}
			while(j<=9);
			System.out.println();
		} // for i
	} // main method
} // Gugu_3 class
