--요청데이터                                       
                                                                                        not null
1 	회원번호	    MNUM	VARCHAR2	    (20)	        O		
2 	회원이름	    MNAME	VARCHAR2	    (50)			
3 	아이디	    MID	    VARCHAR2	    (50)			     O
4 	패스워드	    MPW	    VARCHAR2	    (300)		 O
5 	핸드폰번호	MHP	    VARCHAR2	    (16)			 O
6 	이메일	    MEMAIL	VARCHAR2	    (200)		 O
7 	성별	        MGENDER	VARCHAR2	    (10)			
8 	취미  	    MHOBBY	VARCHAR2	    (100)			
9 	지역	        MLOCAL	VARCHAR2	    (200)			
10 	내용	        MMSG	VARCHAR2	    (2000)			
11 	회원여부	    DELETEYN	VARCHAR2      1	  O
12 	등록일	    INSERTDATE	DATE	      -			
13 	수정일	    UPDATEDATE	DATE	      -		


CREATE TABLE KOS_MEMBER (
     MNUM	    VARCHAR2(20)	PRIMARY KEY  --회원번호
    ,MNAME      VARCHAR2(20)                 --회원이름
    ,MID	    VARCHAR2(50)	NOT NULL     --아이디	           
    ,MPW	    VARCHAR2(300)	NOT NULL     --패스워드
    ,MHP	    VARCHAR2(16)	NOT NULL     --핸드폰번호	
    ,MEMAIL	    VARCHAR2(200)	NOT NULL     --이메일  
    ,MGENDER	VARCHAR2(10)                 --성별
    ,MHOBBY	    VARCHAR2(100)                --취미
    ,MLOCAL	    VARCHAR2(200)                --지역
    ,MMSG	    VARCHAR2(2000)               --내용
    ,DELETEYN	VARCHAR2(1)	    NOT NULL     --회원여부
    ,INSERTDATE	DATE                         --등록일
    ,UPDATEDATE	DATE                         --수정일
);

--TEST 삽입 
INSERT INTO KOS_MEMBER(MNUM,MNAME,MID,MPW,MHP,MEMAIL,MGENDER,MHOBBY,MLOCAL,MMSG,DELETEYN,INSERTDATE,UPDATEDATE)
VALUES (123,'PGW','RIVEF','123','01023351912','RIVENF@NAVER.COM','M','BIKE','SEOUL','MSG','Y',SYSDATE,SYSDATE);
COMMIT;

--@@@@@@@@@전체회원검색(정규쿼리식) getKOSSelectAll()@@@@@@@@@
--'Y'회원만 검색
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM KOS_MEMBER A
WHERE DELETEYN='Y';

--@@@@@@@@@회원번호검색 getKOSSelectNum()@@@@@@@@@
--Y회원만검색, LIKE검색
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM    KOS_MEMBER A
WHERE   1+1=2
AND     DELETEYN='Y';
AND     A.MNUM LIKE '%?%';

--@@@@@@@@@회원이름검색 getKOSSelectName()@@@@@@@@@
--Y회원만 검색, LIKE검색
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM  KOS_MEMBER A
WHERE 1+1=2
AND   DELETEYN='Y';
AND   A.MNAME LIKE UPPER('%?%');

--@@@@@@@@@회원날짜검색 getKOSSelectDate();@@@@@@@@@
--YYYY-MM-DD양식
SELECT
     A.MNUM       AS MNUM
    ,A.MNAME      AS MNAME
    ,A.MID        AS MID
    ,A.MPW        AS MPW
    ,A.MHP        AS MHP
    ,A.MEMAIL     AS MEMAIL
    ,A.MGENDER    AS MGENDER
    ,A.MHOBBY     AS MHOBBY
    ,A.MMSG       AS MMSG
    ,A.MLOCAL     AS MLOCAL
    ,A.DELETEYN   AS DELETEYN
    ,A.INSERTDATE AS INSERTDATE
    ,A.UPDATEDATE AS UPDATEDATE
FROM  KOS_MEMBER A
WHERE 1+1=2
AND   DELETEYN='Y';
AND   TO_CHAR(TO_DATE(A.INSERTDATE),'YYYY-MM-DD')>=TO_CHAR(TO_DATE(?),'YYYY-MM-DD')
AND   TO_CHAR(TO_DATE(A.INSERTDATE),'YYYY-MM-DD')<=TO_CHAR(TO_DATE(?),'YYYY-MM-DD');

--@@@@@@@@@회원추가 getKOSInsert(); @@@@@@@@@
--테이블엘리어스 불가능, UPDATEDATE칼럼을 NULL로 처리(UPDATE시 SYSDATE로 변경하도록 함)
--신규 중복회원은 PK가 막아줄 것
INSERT INTO KOS_MEMBER
            (
             MNUM    ,MNAME    ,MID
            ,MPW     ,MHP      ,MEMAIL
            ,MGENDER ,MHOBBY   ,MLOCAL
            ,MMSG    ,DELETEYN ,INSERTDATE
            ,UPDATEDATE
            )
VALUES      (
             '?',   UPPER('?')  ,'?'
            ,'?'      ,'?'      ,'?' 
            ,'?'      ,'?'      ,'?'
            ,'?'      ,'?'      ,SYSDATE
            ,NULL
            );

--@@@@@@@@@회원업데이트 getKOSUpdate();@@@@@@@@@
--업데이트 시 초기 NULL을 SYSDATE로 변경하게 함
UPDATE  KOS_MEMBER A
SET     
        A.MNAME   =  UPPER('?')    
        A.MID     =  '?'
        A.MPW     =  '?'
        A.MHP     =  '?'
        A.MEMAIL  =  '?'
        A.MGENDER =  '?'
        A.MHOBBY  =  '?'
        A.MLOCAL  =  '?'
        A.MMSG    =  '?'
        A.UPDATEDATE = SYSDATE
WHERE   1+1=2
AND     A.MID = '?'
AND     A.MPW = '?';

--@@@@@@@@@회원삭제 getKOSDelete();@@@@@@@@@
--Y회원만 검색
UPDATE  KOS_MEMBER A
SET     A.DELETEYN='N'
       ,A.UPDATEDATE=SYSDATE
WHERE   1+1=2
AND     A.DELETEYN='Y'
AND     A.MID = '?'
AND     A.MPW = '?';

