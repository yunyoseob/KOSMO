package a.b.c.test;

public class Math_test{
	public static void main(String args[]){
		int pageSize=0;
		int groupSize=0;
		int totalCount=0;
		int curPage=0;
		int pageCount=0;

		int a=0;
		double b=0;
	
		pageSize=3;
		groupSize=3;
		curPage=1;
		totalCount=4;
		
		
		a=totalCount/groupSize;
		System.out.println("a >>> : "+a);
		// a >>> 1
		
		b=Math.ceil(totalCount/groupSize);
		System.out.println("b >>> : "+b);
		// b >>> 1.0


		pageCount = (int)Math.ceil(totalCount / (groupSize + 0.0));
		System.out.println("pageCount >>> : "+pageCount);
		// pageCount >>> : 2

		// answer = 2
	}
}