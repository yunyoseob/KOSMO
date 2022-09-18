package a.b.c.ch1;

public class Add_One_To_Ten_3{
	public static void main(String args[]){
		int i=2;
		int sum=1;
		int cnt=1;

		while (i<=10){
			sum=sum+i;
			System.out.println("1부터 "+i+" 까지의 합 >>> : "+sum);
			i+=1;
		}
		System.out.println("1부터 10까지의 합 >>> : "+sum);
	}
}