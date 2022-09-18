package a.b.c.ch2;

/*
정보의 은닉화
	Java Encapsulation
	information hiding
*/

// n번은 콘솔창 출력 순서
class EncapVO{
	private String sval;
	private int ival;
	// private는 class 블록 밖에서 사용하지 못하는 접근제한자
	
	// 생성자 1
	public EncapVO(){
		System.out.println("\n 2번 EncapVO의 private sval >>> : "+sval);
		// null -> String 초기값
		System.out.println("\n 3번 EncapVO의 private ival >>> : "+ival);
		// 0 -> int 초기값
		System.out.println("\n 4번 EncapVO의 private this.sval >>> : "+this.sval);
		// null -> 현재 String sval이 초기값인 상태이므로, this를 써도 그대로 null 
		System.out.println("\n 5번 EncapVO의 private this.ival >>> : "+this.ival);
		// 0 -> 현재 int ival초기값인 상태이므로, this를 써도 그대로 0
	} // end of public EncapVo 생성자 1
	
	// 생성자 2
	public EncapVO(String sval, int ival){
		System.out.println("\n 9번 EncapVO(String sval, int ival) 매개변수에 인수를 대입한 이후 >>> : "+sval);
		// 매개변수 String sval에 인수인 String "This Year"가 대입이 되어서, This Year가 출력됩니다.
		System.out.println("\n 10번 EncapVO(String sval, int ival) 매개변수에 인수를 대입한 이후 >>> : "+ival);
		// 매개변수 int ival에 인수인 int 2022가 대입이 되어서, 2022가 출력이 됩니다.
		System.out.println("\n 11번 EncapVO(String sval, int ival) 매개변수가 아닌 멤버변수 >>> : "+this.sval);
		// EncapVO 클래스에 private String sval은 현재 null입니다. (초기값)
		System.out.println("\n 12번 EncapVO(String sval, int ival) 매개변수가 아닌 멤버변수 >>> : "+this.ival);
		// EncapVO 클래스에 private int ival은 현재 0입니다. (초기값)

		this.sval=sval;
		// 함수에 들어온 sval을 현재 private String sval에 대입하여 줍니다.
		this.ival=ival;
		// 함수에 들어온 ival을 현재 private int ival에 대입하여 줍니다.

		System.out.println("\n 13번 EncapVO(String sval, int ival) 매개변수를 멤버변수 sval, ival에 대입한 이후 >>> : "+this.sval);
		// 이제 현재 클래스의 EncapVO 클래스에 private String sval은 This Year가 되었습니다.
		// 따라서, This Year가 출력됩니다.
		System.out.println("\n 14번 EncapVO(String sval, int ival) 매개변수를 멤버변수 sval, ival에 대입한 이후 >>> : "+this.ival);
		// 이제 현재 클래스의 EncapVO 클래스에 private int ival은 2022가 되었습니다.
		// 따라서, 2022가 출력됩니다.
		} // end of EncapVO class 생성자 2


	public void setSval(String sval){
		this.sval=sval;
	}

	public String getSval(){
		return this.sval;
	}

	public void setIval(int ival){
		this.ival=ival;
	}
	public int getIval(){
		return this.ival;
	}
} // end of EncapVO class 

public class Encap_p{
	public static void main(String args[]){
		System.out.println("\n 1번 main 함수 시작 \n");
		
		// 생성자 1 Test
		EncapVO rv=new EncapVO();
		// new 인스턴스 연산자로 객체를 생성한다.
		System.out.println("\n 6번 Encap_p의 참조변수 주소 >>> : "+rv);
		// a.b.c.ch2.EncapVO@15db9742
		System.out.println("\n 7번 rv.getSval() >>> : "+rv.getSval());
		// null : 4번값과 같습니다. (현재 String sval이 초기값인 상태)
		System.out.println("\n 8번 rv.getIval() >>> : "+rv.getIval());
		// 0 : 5번값과 같습니다. (현재 int ival초기값인 상태)

		// 생성자 2 Test
		EncapVO rv_2=new EncapVO("This Year", 2022);
		// new 인스턴스 연산자로 객체를 생성한다.
		System.out.println("\n 15번 rv_2의 참조변수 주소 >>> : "+rv_2);
		// a.b.c.ch2.EncapVO@6d06d69c
		System.out.println("\n 16번 rv_2.getSval() >>> : "+rv_2.getSval());
		// This Year : 9~14번이 끝났으므로, this.sval=This Year이 되어있는 상태입니다.
		// 따라서, This Year가 출력됩니다.
		System.out.println("\n 17번 rv_2.getIval() >>> : "+rv_2.getIval());
		//  2022 : 9~14번이 끝났으므로, this.ival=2022이 되어있는 상태입니다.
		// 따라서, 2022가 출력됩니다.

		rv_2.setSval("Last Year");
		rv_2.setIval(2021);
		System.out.println("\n 18번 this.sval은 null이였는데, this.sval=Last Year이 되었으므로 >>> "+rv_2.getSval());
		System.out.println("\n 19번 this.ival은 0이였는데, this.ival=2021이 되었으므로 >>> "+rv_2.getIval());
	} // end of main method
} // end of Encap_p class