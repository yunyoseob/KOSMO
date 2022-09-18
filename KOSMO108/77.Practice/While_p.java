package a.b.c.ch1;

public class While_p{
	public static void main(String args[]){
		/* 실험 1
		while(false){
			System.out.println(">>>>");
		}
		// 컴파일 에러: error: unreachable statement
		// 컴파일 부터 되지 않음.
		*/

		/* 실험 2
		boolean bool=false;
		while(bool){
			System.out.println(">>>>");
		}
		// 실행만 되고 아무 출력도 되지 않음.
		*/
		
		/* 지역변수
		int num=1;
		int sum=0;
		int count=0;
		System.out.println("num >>> : "+num);
		System.out.println("sum >>> : "+sum);
		System.out.println("count >>> : "+count);

		while (num<=10){
			count++;
			// 한 번 돌리고나서 count를 1씩 올려라
			sum+=num;
			// 숫자를 더해라
			num++;		
			System.out.println("\n 1 부터  "+(count)+"까지 합 >>> "+sum);
		} // end of while
		System.out.println("\n 1부터 10까지 합 >>> : "+sum);
		*/
	} // end of main method
} // end of While_p class

