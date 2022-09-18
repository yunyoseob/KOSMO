package a.b.c.ch1;

public class Var_test{
	public static void main(String args[]){
		byte byte_max=Byte.MAX_VALUE;
		byte byte_min=Byte.MIN_VALUE;


		int integer_max=Integer.MAX_VALUE;
		int integer_min=Integer.MIN_VALUE;

		long long_max=Long.MAX_VALUE;
		long long_min=Long.MIN_VALUE;

		System.out.println("Byte.MAX_VALUE >>>"+byte_max);
		// Byte.MAX_VALUE : 127 : 2^7-1
		System.out.println("Byte.MIN_VALUE >>>"+byte_min);	
		// Byte.MIN_VALUE : -128 : -2^7
		
		System.out.println("Integer.MAX_VALUE >>>"+integer_max);
		// Integer.MAX_VALUE : 2147483647 : 2^31-1
		System.out.println("Integer.MIN_VALUE >>>"+integer_min);	
		// Integer.MIN_VALUE : -2147483648 : -2^31


		System.out.println("Long.MAX_VALUE >>>"+long_max);
		// Long.MAX_VALUE : 9223372036854775807 :  2^63-1
		System.out.println("Long.MIN_VALUE >>>"+long_min);
		// Long.MIN_VALUE : -9223372036854775808 : -2^63
	}
}