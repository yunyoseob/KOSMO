package a.b.c.study;

import java.util.ArrayList;

public class CodingPoem {
	public ArrayList<String> random(ArrayList<String> aList){
		// 3. return 받을 배열 만들어놓기
		ArrayList rList=new ArrayList();
				
		//  String, int 초기화
		String s="";
		String s1="";
		int ln=0;
		int ln1=0;
		
		
		// 배열의 길이
		ln=aList.size();
		// 6
		ln1=ln-1;
		// 배열의 길이에서 1 빼기
		// 5 
		
		for(int i=0; i<2; i++){
			// 0부터 5까지 정수로 반환 받기
			int r=(int)(Math.random()*ln);
			
			/* ######  i가 0일때는 수행되지 않는 지역 ####### */
			if(i==1){
				// i가 1일 때, i가 0 일때 당첨자와 같지 않도록 확인해줍니다.
				
				s1=aList.get(r);
				// aList.get(r)로 random 숫자인 r번째 배열의 값을 s1에 대입합니다.
				
				if(s.equals(s1)){
					// 새로 대입된 s1값과 이전 값인 s가 같은 경우에만 수행되는 로직입니다.
					System.out.println("똑같아요 ㅠㅠ  >>> : "+aList.get(r));
					if(r==ln1) {
						// 배열의 마지막 인덱스가 5이므로, r=0으로 0번째 인덱스 값을 출력시키기 
						// 위한 로직
						r=0;
					}else{
						r=r+1;
						// r이 5가 아닐 경우, 그 다음 사람을 출력시키기 위한 로직
					}
				}
			}
			/* ######################################### */
			
			// System.out.println("당첨자 >>> : "+aList.get(r));
			
			s=aList.get(r);
			// aList의 r번재 값은 s로 저장합니다.
			
			rList.add(s);
			// rList에 당첨자를 추가시킵니다.
		}
		return rList;
	}
}