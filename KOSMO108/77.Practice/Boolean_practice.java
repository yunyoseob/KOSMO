package a.b.c.ch1;
// 나중에 작성하기

public class Boolean_practice{
	boolean defaultBVal;

	public static void main(String args[]){
		boolean bool_false =false;
		boolean bool_true=true;

		System.out.println("bool false >>> : "+bool_false+"\n");
		System.out.println("\n bool true >>> : "+bool_true+"\n");

		System.out.print("\n new Boolean_practice().defaultBVal;에서 생성자의 주소 출력 \n"+new Boolean_practice());
		System.out.print(" new Boolean_practice().defaultBVal \n");
		System.out.print(new Boolean_practice().defaultBVal);
		
		Boolean_practice rv=new Boolean_practice();		
		System.out.print("\n Boolean_practice rv=new Boolean_practice() 주소 출력 >>> : "+rv);
		System.out.print("\n rv.defaultBval >>> : "+rv.defaultBval);
	} // end of main method
} // end of Boolean_practice class