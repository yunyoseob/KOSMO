-- 20220520
SELECT*FROM EMP;
                                                                                                                                                                                               
-- emp테이블 에서 입사일자가 빠른 사람 5명을 조회해보세요.

SELECT*FROM EMP ORDER BY HIREDATE ASC;
-- FROM : 80/12/17
-- TO : 81/05/01

-- 년도별 입사한 사람수 조회해보기
SELECT COUNT(EMPNO) 
FROM EMP 
WHERE TO_CHAR(TO_DATE(HIREDATE), 'YYYY-MM-DD')>='1981-01-01'
AND TO_CHAR(TO_DATE(HIREDATE), 'YYYY-MM-DD')<'1981-12-31';

SELECT A. HIREDATE
FROM EMP A;


SELECT*
FROM (SELECT*FROM EMP ORDER BY HIREDATE ASC) A
WHERE ROWNUM<=5;


-- 부서번호 20의 평균 급여보다 크고,
-- 부서번호 20에 속하지 않은 관리자를 조회하시오
SELECT DISTINCT(DEPTNO)FROM EMP;
-- 30, 20, 10

SELECT SAL FROM EMP WHERE DEPTNO=20;

SELECT AVG(SAL) FROM EMP WHERE DEPTNO=20;
-- 2175

SELECT DISTINCT(JOB) FROM EMP;

SELECT*FROM EMP WHERE JOB='MANAGER';

SELECT ROUND(AVG(SAL), 1) FROM EMP WHERE JOB='MANAGER';
-- 2758.3

-- 부서번호 20 평균급여보다 크고 :  2175이상이어야 하고 AND
-- 부서번호 20번에 속하지 않아야 하고 AND
-- 직업이 관리자여야 한다.

SELECT*
FROM (SELECT*FROM EMP WHERE JOB='MANAGER') A
WHERE A.DEPTNO!=20
AND A.SAL > (SELECT AVG(SAL) FROM EMP WHERE DEPTNO=20);



select*from tab;


-- 직업이 manager의 사원의 사원명, 부서명을 조회하시오.
SELECT*FROM EMP WHERE JOB='MANAGER';
SELECT COUNT(EMPNO) FROM EMP WHERE JOB='MANAGER';
--3

SELECT ENAME, DEPTNO FROM EMP WHERE JOB='MANAGER';

SELECT A.ENAME, B.DNAME
FROM  (SELECT ENAME, DEPTNO FROM EMP WHERE JOB='MANAGER') A, DEPT B
WHERE  A.DEPTNO=B.DEPTNO;

SELECT A.ENAME, B.DNAME
FROM (SELECT*FROM EMP WHERE JOB='MANAGER') A, DEPT B
WHERE A.DEPTNO=B.DEPTNO;

-- 스칼라 서브쿼리로 풀어야 한다면?
SELECT DNAME, DEPTNO FROM DEPT;
/*
ACCOUNTING	10
RESEARCH	20
SALES	30
OPERATIONS	40
*/
SELECT DISTINCT(DEPTNO) FROM EMP;
/*
30
20
10
*/

SELECT A.ENAME, A.DEPTNO, 
                    (SELECT B.DNAME FROM DEPT B WHERE B.DEPTNO=A.DEPTNO) DNAME
FROM EMP A
WHERE A.JOB='MANAGER';

SELECT A.DEPTNO, B.DEPTNO, B.DNAME
FROM EMP A, DEPT B
WHERE A.DEPTNO=B.DEPTNO;

-- JOIN PRACTICE
SELECT COUNT(DISTINCT(DEPTNO)) AS ENO
FROM EMP;
-- 3

SELECT COUNT(DISTINCT(DEPTNO)) AS DNO
FROM DEPT;
-- 4

-- 실습 5-31 집합 연산자(UNION)를 사용하여 출력하기
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO=10
UNION
SELECT EMPNO, ENAME, SAL
FROM EMP
WHERE DEPTNO=20;

-- 실습 5-32
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO=10
UNION
SELECT EMPNO, ENAME, DEPTNO, SAL
FROM EMP
WHERE DEPTNO=20;


-- 실습 5-33
 SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO=10
UNION
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM EMP
WHERE DEPTNO=20;


