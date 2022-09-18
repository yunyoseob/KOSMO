package a.b.c.ch6;

import java.util.Calendar;
import java.util.TimeZone;

public class Exam_Time_Clcok implements Runnable{

	private Thread thread;
	
	public Exam_Time_Clcok() {
		
		if(thread == null){
            
            //this의 의미는 Runnable이 구현된 객체를 뜻함(DigitalClock)
            thread = new Thread(this);
            thread.start();
        }
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while(true){
	           
        	Calendar cal = Calendar.getInstance();
            String now = 	cal.get(Calendar.YEAR)+"년"+
		                    (cal.get(Calendar.MONTH)+1)+"월"+
		                    cal.get(Calendar.DATE)+"일"+
		                    cal.get(Calendar.HOUR)+"시"+
		                    cal.get(Calendar.MINUTE)+"분"+
		                    cal.get(Calendar.SECOND)+"초";
            
            System.out.println(now);
           
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){               
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Exam_Time_Clcok();
	}

	
}
