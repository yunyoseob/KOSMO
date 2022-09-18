파일을 어덯게 읽고 쓸까



선행 
-----------------------------------------------
0. /**/ 은 읽어도 그만, 안읽어도 그만
1. 자바는 기본적으로 Byte 단위로 입출력이 이뤄짐
2. 한글은 2Byte임
3. 깨짐
4. 따라서 2Byte인 한글을 읽고 쓰기 위해 문자 단위 스트림을 제공

/*
cf 1)바이트 단위 스트림: 이미지, 동영상, 음악 파일 등 대부분의 파일 읽기 / 쓰기.
클래스 이름이 Stream으로 끝나는 경우는상 바이트 단위 스트림.
cf 2)문자 단위 스트림: 문자를 읽고 쓰는데 사용하는 스트림.
영문자의 경우에는 바이트 단위 스트림으로도 읽기 / 쓰기 가능.
Reader나 Writer로 끝나는 이름은 문자를 위한 스트림 클래스.
*/

표현방식 - package a.b.c.ch6; public class Exam_InOutStrReadTest
------------------------------------------
public static final String FILE_PATH_CH6 = "C:\\00.KOSMO108_PGW\\10.JExam\\eclipse_java_work\\firstProject\\src\\a\\b\\c\\ch6";
String inFile = filePath +"/"+ "Exam_InOutStrReadTest.java";
String outFile = filePath +"/"+ "Exam_InOutStrReadTest.bak";
int data = 0;
if(bFile) {	
//읽기
fis = new FileInputStream(ff);
isr = new InputStreamReader(fis);
br = new BufferedReader(isr);
//쓰기
fos = new FileOutputStream(outFile);
osw = new OutputStreamWriter(fos);
bw = new BufferedWriter(osw);

while ((data=br.read()) !=-1) {
	System.out.print((char)data);
	bw.write(data);
}
cf) bw.write(date); =  해당 경로에 파일 생성
cf2) read() : public int read(), Return : the next byte of data, or -1 if the end of the file is reached.

개괄 
------------------------------------------
1. 파일의 경로를 상수로 선언
2. 새로운(new) File 클래스 선언, 생성자의 인자로 파일의 경로를 대입
- File(inFile) : 대입 된 파일 경로를 추상 경로 이름으로 변환하여 새 File 인스턴스를 만듭니다.

3. 새로운(new) FileInputStream 클래스 선언, 생성자의 인자로 2.에서 생성된 File인스턴스를 대입
-FileInputStream(File file) : 파일 시스템의 File 개체 파일에 의해 명명된 파일인 실제 파일에 대한 연결을 열어 FileInputStream을 만듭니다.

4. 새로운(new) InputStreamReader 클래스 선언, 생성자의 인자로 3.에서 생성된 FileInputStream(File inFile)인스턴스를 대입
- InputStreamReader(FileInputStream(File file)) : 기본 문자 집합을 사용하는 InputStreamReader를 만듭니다.

5. 새로운(new) BufferedReader 클래스 선언, 생성자의 인자로 4.에서 생성된 InputStreamReader(FileInputStream(File file)) 인스턴스를 대입
- BufferedReader(InputStreamReader(FileInputStream(File file))) : 기본 크기의 입력 버퍼를 사용하는 버퍼링 문자 입력 스트림을 만듭니다.

6. 쓰기는 반대로 2.에서 outFile을 대입하고 3.에서 FileOutputStream 에 넣고, 4.에서 OutputStreamWriter 에 넣고, 5.에서 BufferedWriter에 넣고 write() 돌려주면 끝!

/*
파일을 읽어들이는데 필요한 클래스 설명
------------------------------------------
1. File class : 파일과 디렉토리에 관한 클래스, exist()함수로 지정한 경로에 파일이 존재하는가를 boolean으로 리턴
		파일 및 디렉토리 경로 이름의 추상'표현'.(추상클래스 아님.)
		이 클래스는 계층적 경로 이름에 대한 추상적이고 시스템 독립적인 견해를 제공합니다.

2. FileInputStream class : FileInputStream은 파일 시스템의 파일에서 입력 바이트를 얻습니다.
						상속 : Object - InputStream - FileInputStream

3. InputStreamReader class: InputStreamReader는 바이트 스트림에서 문자 스트림으로의 브리지입니다. 
			    byte-> char 변환하는 io 보조스트림 클래스
			    바이트를 읽고 지정된 문자 집합을 사용하여 문자로 디코딩합니다.
			    상속 : Object - Reader - InputStreamReader
4. BufferedReader class: 문자 입력 스트림에서 텍스트를 읽고 문자, 배열 및 행을 효율적으로 읽을 수 있도록 문자를 버퍼링합니다.
*/						
						

아래는 함수가 아닌 생성자임을 유념
-------------------------------------------
읽을 파일의 경로를 상수 inFile
새롭게 만들 파일의 경로를 상수 outFile이라 했을 때
//읽기
File(inFile) - FileInputStream() - InputStreamReader() - BufferedReader() 
//쓰기
File(outFile) - FileOutputStream() - OutputStreamWriter() -BufferedWriter()

/*
BufferedInputStream		2048byte 수용가능
BufferedOutputStream	512byte 수용가능

BufferedReader
BufferedWriter	8192char~16384byte 수용가능 <-- 확실치가 않아

바이트 단위 스트림
----------------
InputStream
	DataInputStream
	FileInputStream
	BufferedInputStream		2048byte
OutputStream
	DataOutputStream
	FileOutputStream
	BufferedOutputStream		512byte
	PrintStream

문자 단위 스트림
----------------
Reader
	FileReader
	BufferedReader
	InputStreamReader
Writer
	FileWriter
	BufferedWriter		16384byte
	OutputStreamWriter
	PrintWriter
*/