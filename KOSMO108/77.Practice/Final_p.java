package a.b.c.ch2;

public class Final_p{
	public static final String FILE_UPLOAD_PATH="C:\\Java_Practice\\fileUpload";
	// 매개변수에 final
	void finalMethod(final String s){
		// s="velog_post";
		// error: final parameter s may not be assigned
		String ss=s;
		// ss="velog_post";
		// 굳이 굳이 굳이 바꾸겠다하면 이렇게 바꾸면 되긴 한다.
		// 그러나 final에 들어오는 변수는 바꾸는 것을 매우 지양해야 한다.
		System.out.println("ss >>> : "+ss);
	} // fianlMethod method

	public static void main(String args[]){
		String s = Final_p.FILE_UPLOAD_PATH;
		System.out.println(" s >>> : "+s);

		Final_p rv = new Final_p();
		rv.finalMethod("velog");
	} // main method	
} // Final_p class