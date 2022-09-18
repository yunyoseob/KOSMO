package a.b.c.ch1;

import java.util.Scanner;

public class FlowControl_2{

	public int add(int x, int y) {		
		return x + y;
	}

	public int subtract(int x, int y) {		
		return x - y;
	}

	public int multiply(int x, int y) {		
		return x * y;
	}

	public int divide(int x, int y) {		
		return x / y;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

		System.out.println("\n 첫 번째 숫자를 입력하세요.");
		int x=sc.nextInt();
		System.out.println("\n 두 번째 숫자를 입력하세요.");
		int y=sc.nextInt();

		System.out.println("\n Scanner를 통해 입력한 첫 번째 숫자 >>> :"+x);
		System.out.println("\n Scanner를 통해 입력한 두 번째 숫자 >>> :"+y);
		
		FlowControl_2 iarr=new FlowControl_2();
		int add = iarr.add(x, y);
		System.out.println("\n add >>> : " + add);
			
		int subtract = iarr.subtract(x, y);
		System.out.println("\n subtract >>> : " + subtract);
			
		int multiply = iarr.multiply(x, y);
		System.out.println("\n multiply >>> : " + multiply);
			
		int divide = iarr.divide(x, y);
		System.out.println("\n divide >>> : " + divide);
	}
}