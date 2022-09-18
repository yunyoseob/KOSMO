package a.b.c.ch2;

public class MessageTest{
	public static void main(String[] args){
	MessageInterface eme=new MessageEngImpl();
	eme.sayHello("velog");

	MessageInterface emk=new MessageKorImpl();
	emk.sayHello("º§·Î±×");
	}
}