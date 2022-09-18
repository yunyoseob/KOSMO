package a.b.c.ch1;

public class While_p_1{
	/*
	while() 구문과 do while() 구문은 다르다.

	do while 구문 사용 법

	do{

	}
	while ();

	종결자가 한 개이다.
	*/

	public static void main(String args[]) {
		
		// 지역변수 
		int num = 1;
		int sum = 0;

		//System.out.println("before do while : int num >>> : "+num);
		//System.out.println("before do while : sum >>> : "+sum);

		do{
			sum += num;
			num++;
		}
		while (num <= 10);
		// do 명령어는 반드시 한 번은 실행 되야 한다.
		// true일 때만 실행된다.

		//System.out.println("after do while : int num >>> : "+num);
		//System.out.println("after do while : sum >>> : "+sum);

		System.out.println("1부터 10 까지의 합은 " + sum + " 입니다.");
	} // main method
} // While_p_1 class