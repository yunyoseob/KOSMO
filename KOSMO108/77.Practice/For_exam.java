package a.b.c.c1;

/*
String sArr={"abc","def","ghi"};
콘솔에 a b c ... 으로 출력하시오.
*/

public class For_exam{
	public static void main(String args[]){
		String sArr[]={"abc","def","ghi"};
		// String이라는 참조자료형 변수에 
		// sArr[] 배열을 선언한다.
		// 3개의 원소로 이루어진 배열을 sArr[]에 
		// 객체를 생성하여 대입한다.
		// 배열은 객체이다.

		int slen=sArr.length;
		// length는 배열의 길이를 구할 수 있는 키워드이다.
		// sArr의 배열의 길이를 구하여 기초자료형인 int 상자에
		// slen을 선언 후, 대입한다.
		int i=0;
		// 기초자료형 int에 i를 선언한 후, 0을 대입한다.
		// int의 default값이 0이라 int i;와 int i=0;의
		// 결과는 같다.

		for (i=0;i<slen;i++)
		// 반복문 for에 초기화식에 i에 0을 다시 대입하고,
		// 조건식에는 i가 sArr배열의 길이보다 작다는 조건을 설정한 뒤,
		// 증감자 자리에는 for문 블록 내의 작업이 끝나면 i를 하나씩 올리고 loop를 실행할 것을 명령한다.
		{
			int j=0;
			// for문 블럭 내에서 int 자료형에 j를 선언한 후,
			// 0을 대입하여 준다.
			// do while문이 끝날때마다 초기화 해주기 위함이다.
			int len_s=sArr[i].length();
			// sArr 배열의 i번째 원소의 문자열 길이를
			// int자료형에 len_s를 선언 후 대입한다.
			// length()는 문자열의 길이를 구할 때 사용한다.
			do{	
			// do 명령문으로 while 소괄호 안에 조건에
			// 만족할 때 까지 실행시킨다.
				char c=sArr[i].charAt(j);
				// sArr의 i번째 원소의 j번째 글자를
				// 기초자료형 char에 c를 선언 후
				// 대입하여 준다.
				System.out.print(c+" ");
				// sArr의 i번째 원소의 j번째 글자를
				// 출력시키고 한 칸 띄운다.
				j++;
				// j를 하나 증가시킨다.
				}
			while (j<len_s);
			// do 과정을 j가 배열의 i번째 원소의 길이가 끝날 떄까지
			// 반복시킨다.
		} // for i
	} // main
} // For_exam