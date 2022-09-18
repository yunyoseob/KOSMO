package a.b.c.ch2.aaaa;

public class Inter_1_ClassImpl implements Inter_1{
	@Override
	// public abstract void aM()에서 abstract 생략
	public void aM(){
		System.out.println("Inter_1 인터페이스에서 오버라이딩 해서 aM() {} 블럭을 만들고 재정의하는 함수");
	}

	@Override
	// public abstract void bM()에서 abstract 생략
	public void bM(){
		System.out.println("Inter_1 인터페이스에서 오버라이딩해서 bM(){} 블럭을 만들고 재정의하는 함수");
	}

	@Override
	// public abstract void cM()에서 abstract 생략
	public void cM(){
		System.out.println("Inter_1 인터페이스에서 오버라이딩 해서 cM(){} 블럭을 만들고 재정의");
	}
}