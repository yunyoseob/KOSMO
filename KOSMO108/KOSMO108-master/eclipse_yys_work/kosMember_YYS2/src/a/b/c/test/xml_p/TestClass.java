package a.b.c.test.xml_p;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.ArrayList;

public class TestClass {
	public void test(){
		// Logger logger = LogManager.getLogger(TestClass.class);
		System.out.println("a.b.c.test.xml.TestClass 클래스에 있는 test() 메소드 입니다.");
		System.out.println("Hello >>>>>>>>>> : ");
		
		ArrayList<String> aList=new ArrayList<String>();
		aList.add("벨로그");
		aList.add("웹");
		aList.add("포스팅");
		aList.add("입니다");
		
				
		for (int i=0; i<aList.size(); i++){
			System.out.println(" >>> : "+aList.get(i));
		}
		
	}
	public static void main(String args[]){
		TestClass tc= new TestClass();
		tc.test();
	}
}
