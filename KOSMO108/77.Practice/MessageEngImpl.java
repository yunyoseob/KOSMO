package a.b.c.ch2;

public class MessageEngImpl implements MessageInterface{
	// Impl는 아무때나 붙이는게 아니라, 일정 패턴이 있을 때 쓰면 좋다고 한다.
	@Override
	public void sayHello(String name){
		System.out.println("Hello, "+name+"!!");	
	}
} // MessageEngImpl class