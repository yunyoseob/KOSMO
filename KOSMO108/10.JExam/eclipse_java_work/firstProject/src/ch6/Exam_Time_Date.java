package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_Time_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Deprecated. : 현재꺼 보다 더 향상된 버전이 있으니 이것을 사용하지 마시오, 언제 없어질지 몰라
		// 컴터에서 시간은 : 초로 계산한다. : 1 day = 24 * 60 * 60 = 86,400
		// 컴터에서 시간은 : 초로 계산한다. : 1 year = 365 * 24 * 60 * 60 = 31,536,000 코스모 108기 박건원
		// The leap second : 윤초 : 
		// Greenwich mean time (GMT) 
		// global positioning system (GPS)
		
		// A year y is represented by the integer y - 1900.
		// A month is represented by an integer from 0 to 11; 
		// 0 is January, 1 is February, and so forth; thus 11 is December.
		// A date (day of month) is represented by an integer from 1 to 31 in the usual manner.
		// Date 클래스는 윤년이 사용 가능 		
		// 컴퓨터 시간 : 클라이언트 시간, 서버 시간
		
		/*
			Date 클래스는 epoch 시간(이포크 시간)을 리턴한다.
			1970년 1월 1일 00:00:00 시간을 기준으로 지나간 시간을 millisecond 로 반환한다.			  	
		*/
	
		Date d = new Date();
		
		// 년 
		// public int getYear()
		int year = d.getYear();
		System.out.println("year >>> : " + year);
		year = year + 1900;
		System.out.println("year + 1900 >>> : " + year);
		
		// 월
		// public int getMonth()
		int month = d.getMonth();
		System.out.println("month >>> : " + month);	
		month = month + 1;
		System.out.println("month + 1 >>> : " + month);		
		
		// 일 
		// public int getDate()
		int date = d.getDate();
		System.out.println("date >>> : " + date);			
		
		String time = year + "." + month + "." + date;
		System.out.println("time >>> : " + time);
		time = time.replace('.', '-');
		System.out.println("time >>> : " + time);	
		time = time.replace('-', '/');
		System.out.println("time >>> : " + time);
		
		
		String ymd[] = {"yyyy.MM.dd", "yyyy-MM-dd", "yyyy/MM/dd"};
		
		for (int i=0; i < ymd.length; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat(ymd[i]);
			System.out.println("sdf >>> : " + sdf);
			System.out.println("sdf.format(d) >>> : " + sdf.format(d));
		}
	}
}
