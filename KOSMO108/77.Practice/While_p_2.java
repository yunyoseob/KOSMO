package a.b.c.ch1;

public class While_p_2{
	public static void main(String args[]){
		// 지역변수
		int i=2;
		int sum=1;

		while (i<=100){
			sum += i;
			boolean iBool= sum>55;
			if (iBool){
				sum=sum-i;
				break;
			}
			else{
				System.out.println("1부터 "+i+" 까지의 합 >>> : "+sum);
			}
			i++;
		}
		System.out.print("1부터 10까지 의 합 >>> : "+sum);
				// break : sum이 20보다 크면 loop를 멈추라는 의미
				// continue : loop를 지속하라는 의미인데, python이랑은 다르게
				// java에서는 사용하는 것을 지양하는게 좋음. (따져야 하는 사항이 많음)
		} // end of main method
} // end of While_p_2 class