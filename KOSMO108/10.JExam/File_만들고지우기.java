2022-04-09
---------------------
파일은 어떻게 만들까

//절대경로 추상경로 상대경로
//https://blog.daum.net/janustop/61
//File 클래스의 인스턴스는 변경 불가능합니다. 다시 말해서, 한 번 생성되면, File 객체에 의해 표현되는 추상 경로명은 절대로 변하지 않습니다.
//https://docs.microsoft.com/ko-kr/dotnet/standard/io/file-path-formats

선행 
-----------------------------------------------------------------------------------
1. 
   -절대경로				탐색기 주소표시줄에 뜨는 C:\00.KOSMO108_PGW 형식
   -상대경로 & 절대경로 :   어려워, 복잡해, 길어, 배우지도 않았어. 그냥 그 자체로 받아들인다고 가정하고 작성
						뭔가 절대랑은 다른 애구나

	But! 인스턴스를 생성한다 = 메모리에 올린다 =  객체를 생성한다 = 참조되는 클래스마다 역할과 목적이 있다 <== 이 정도는 챙겨가보자.

2. File class : '파일' 및 '디렉토리' 경로 이름의 추상 '표현'입니다.
				'파일' 및 '디렉토리' 가 대상이므로 생성자에 들어가는 인자에 따라서 파일이 될 수도, 디렉토리가 될 수도, 둘 다 동시에 될 수도 있습니다.
				cf1)

			    //조금만 더 욕심을 내면, 이 클래스는 계층적 경로* 이름에 대한 추상적이고 시스템 독립적인 보기를 제공합니다.
				//*계층적 경로 : ???

3. 현재 작업 디렉토리 확인: String userDir = System.getProperty("user.dir");
					cf) getProperty()에 들어가는 인자에 따라서 구하는 정보가 달라짐, ex:"osName", "javaVersion"....
					함수 사용 시 경로를 따로 잡아주지 않을 경우에는 "user.dir"를 기본으로 하여 파일/디렉토리가 생성


기본 개념
-----------------------------------------------------------------------------------
@@예제1
-"abc.txt" 파일 혹은 디렉토리 경로 이름의 추상표현 = 파일도 될 수 있고 경로도 될 수 있고.
File f1 = new File("abc.txt");
	
-"abc.txt" 라는 이름을 가지는 파일을 만들어주세요
f1.createNewFile();
System.out.println("f1.createNewFile() >>> : " +f1.createNewFile());

-"abc.txt"라는 디렉토리 경로 가지는 경로를 만들어주세요
f1.mkdir();
System.out.println("f1.mkdir() >>> : " + f1.mkdir());

==> 이럴 경우 어떻게 될까??

-- 먼저 읽힌 함수만 실행, 뒤에 오는 것은 false

시사 : 뭔가 "abc.txt" <== 이게 디렉토리나 파일에 종속되는 키 값이 있는 것 같아

@@예제2
-"abc.txt" 파일 혹은 디렉토리 경로 이름의 추상표현 = 파일도 될 수 있고 경로도 될 수 있고.
File f2 = new File("a/b");

-"a/b"라는 파일을 만들어주세요
f1.createNewFile();

==> 불가능, 파일 명에 / 세퍼레이트가 올 수 없어 false

@@예제3
기본적으로 실제로 진행했던 수업에서는 먼저 디렉토리를 설정하고, 새로운 File 인스턴스를 통해 파일을 생성

File f1 = new File("a/b");
File f2 = new File(f1, "c.txt");
f2.createNewFile();

@@예제4
-user.dir 밖으로도 파일을 만들어 보자
-절대경로의 경우
File f3 = new File("C:\\00.KOSMO108_PGW\\10.JExam\\10.javaTest\\abc.txt");
f3.createNewFile(); // abc.txt 텍스트파일 생성 OK
-상대경로의 경우



사용 된 함수 모음
--------------------------------------------
java.lang.System 
public static String getProperty(String key)

java.io.File 
public boolean mkdir()
public boolean mkdirs()
public String getPath()
public String getName()
public boolean exists()
public boolean createNewFile() //atomically - 원자적 생성??
public File[] listFiles()
public String getAbsolutePath( )
public boolean isDirectory()
public boolean isFile()






