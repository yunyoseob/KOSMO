package a.b.c.ch2;

// 생성자를 만든다 -> 변수를 초기화 한다 -> 생성자에서 this.변수=변수로 인수를 초기화한다

class Const_VO{
	private String mid;
	private String mpw;
	private String mname;
	private int mage;
	// private는 클래스 블록 밖으로 나가지 못한다.
	// public 생성자를 만들지 못할 경우
	// 외부에서 정보를 못가져가게 하는 것을
	// 정보의 은닉화라고 한다.

	public Const_VO(){
		System.out.println("Const_VO() >>> this ::: "+this);
		System.out.println("Const_VO() >>> : "+this.getClass().getName());
		
	} // Const_VO 생성자 1 (매개변수 없음)

	public Const_VO(String mid, String mpw, String mname, int mage){
		this.mid=mid;
		this.mpw=mpw;
		this.mname=mname;
		this.mage=mage;
		// this.변수이면 초기화 값 지정을 안 했으므로 default값이 출력된다.
		// this.변수를 인수로 초기화 한다.
		System.out.println("\n 3. Const_VO 2번째 생성자 this.mid=mid >>> : "+this.mid);
		System.out.println("\n 4.Const_VO 2번째 생성자 this.mpw=mpw >>> : "+this.mpw);
		System.out.println("\n 4.Const_VO 2번째 생성자 this.mname=mname >>> : "+this.mname);
		System.out.println("\n 6.Const_VO 2번째 생성자 this.mage=mage >>> : "+this.mage);
	} // Const_VO 생성자 2 (매개변수 있음)

	// setter : 세터 메소드 : 세터 함수 : 값을 초기화 하는 함수

	/*
	규칙
	private String mid 변수를 setter 함수 만들기
	1. set
	2. 멤버변수의 변수명에 첫 번째 글자를 대문자로 변경한다. : Mid
	3. set+Mid=setMid()
	4. public void setMid(String mid){this.mid=mid;}
	*/

	public void setMid(String mid){
		this.mid=mid;
	}

	public void setMpw(String mpw){
		this.mpw=mpw;
	}

	public void setMname(String name){
		this.mname=mname;
	}
	public void setMage(int mage){
		this.mage=mage;
	}

	// getter : 게터 메소드 : 게터 함수 : 값을 리턴하는 함수
	/*
	private String mid 변수를 getter 함수 만들기
	1. get
	2. 멤버변수의 변수명에 첫 번째 글자를 대문자로 변경한다. : Mid
	3. get + Mid = getMid()
	4. public String getMid() {return this.mid;}
	*/

	public String getMid(){
		return this.mid;
	}

	public String getMpw(){
		return this.mpw;
	}

	public String getMname(){
		return this.mname;
	}

	public int getMage(){
		return this.mage;
	}


} // Const_VO class

public class Const_p_2{
	public static void main(String args[]){
		System.out.println("\n 1. main 함수 시작");
		Const_VO rv=new Const_VO();
		// 사용자정의 클래스 Const_VO 를 사용하기 위해 선언했다.
		// Const_VO()는 생성자로 인수값이 없다.
		// Const_VO()는 public NameSpace(){} 기본 생성자를 호출한다.
		// 생성자의 역할은 멤버필드를 초기화하는 것으로, 멤버필드의 변수들을
		// default값으로 초기화한다.
		System.out.println("\n 2. Const_VO 생성자의 참조변수 주소값 >>> : "+rv);

		Const_VO rv1= new Const_VO("HGD","HGD00","홍길동",22);
		/* 멤버변수
			private String mid;
			private String mpw;
			private String mname;
			private int mage;
		*/
		System.out.println("\n 7. Const_VO 생성자의 참조변수 주소값 >>> : "+rv1);
		
		rv.setMid("KCS");
		rv.setMpw("KCS00");
		rv.setMname("김철수");
		rv.setMage(21);
		System.out.println("\n 8. rv_1.getMid() >>> : "+rv.getMid());
		System.out.println("\n 9. rv_1.getMpw() >>> : "+rv.getMpw());
		System.out.println("\n 10. rv_1.getMname() >>> : "+rv.getMname());
		System.out.println("\n 11. rv_1.getMage() >>> : "+rv.getMage());
	} // main method
} // Const_p_2 class