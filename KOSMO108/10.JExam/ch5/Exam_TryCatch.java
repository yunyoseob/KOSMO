package a.b.c.ch5;

public class Exam_TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int x = 1;
			int y = 0;
			
			int z = x / y;
			
			System.out.println("x / y = " + z);
			/*
			java runtime issue

			Exception in thread "main" 
			java.lang.ArithmeticException: 
			/ by zero
            at a.b.c.ch5.Exam_TryCatch.main
			(Exam_TryCatch.java:10)
			*/
	}
}