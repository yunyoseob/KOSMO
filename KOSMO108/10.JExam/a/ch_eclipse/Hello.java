package a.b.c.ch3;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("안녕 이클립스 ㅋㅋㅋ!!!");
		
		HelloInterface hif = new HelloInterfaceImpl();
		hif.interfaceFunc();
		
		HelloVO hvo = new HelloVO();
		hvo.setMid("PGW");
		hvo.setMpw("PGW00");
		hvo.setMname("박건원");
		
		System.out.print(hvo.getMid() + " ");
		System.out.print(hvo.getMpw() + " ");
		System.out.println(hvo.getMname() + " ");
	}

}
