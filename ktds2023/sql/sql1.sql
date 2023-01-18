# SELECT
# 주석문 오라클은 //
SELECT * FROM dept;
SELECT * FROM emp;
SELECT * FROM salgrade;

# 특정 컬럼 데이터
SELECT empno, ename, job, hiredate FROM emp;

# 칼럼 별칭 사용
SELECT empno AS 사번, ename AS 성명, sal 급여 FROM emp

# null
SELECT empno, ename, comm, comm+10 FROM emp;
# null값을 가진 컬럼을 연산하기
SELECT empno, ename, comm, NVL(comm, 0)+100 FROM emp;

# 연봉구하기
SELECT empno, ename, sal, comm,  (sal+NVL(comm, 0))*12 AS 연봉 FROM emp;

# 중복값 제거해 출력
SELECT job FROM emp;



# WHERE
SELECT empno, empno, job, deptno FROM emp
WHERE deptno = 30;

SELECT empno, ename, job, deptno
FROM emp 
WHERE job ='salesman'; # 리터럴 값은 대소문 구별안함
								# 단, 오라클은 구별함
								
SELECT empno, ename, job, deptno
FROM emp WHERE hiredate = '1980-12-17';

# 연산자1
SELECT empno, ename, job, deptno
FROM emp WHERE sal <= 1000; # <> 로 해도 가능

# 연산자2
SELECT empno, ename, job, deptno
FROM emp
WHERE sal BETWEEN 800 AND 2000

SELECT empno, ename, job, deptno
FROM emp
WHERE sal NOT BETWEEN 800 AND 2000

SELECT empno, ename, job, deptno
FROM emp
WHERE comm IS NULL;

SELECT empno, ename, job, deptno
FROM emp
WHERE empno NOT IN (7369, 7566, 7698);

SELECT empno, ename, job, deptno
FROM emp
WHERE empno IN (7369, 7566, 7698);

SELECT empno, ename, job, deptno
FROM emp
WHERE ename IN ('SMITH', 'jones', 'blake');

SELECT empno, ename, job, deptno
FROM emp
WHERE hiredate IN ('1980-12-17','1981-12-17','1982-12-17');

# LIKE
SELECT empno, ename, sal
FROM emp
WHERE ename LIKE 'A%'; # A로 시작

SELECT empno, ename, sal
FROM emp
WHERE ename LIKE '%T%'; # T포함

SELECT empno, ename, sal
FROM emp
WHERE ename LIKE '_L%' # 2번째 문자 L

DESC emp;

INSERT INTO emp ( empno, ename,  job, mgr, hiredate, sal, comm, deptno)
VALUES ( 9999, 'AA_B', 'SALESMAN', 7902, NOW(), 500, 0, 30);

SELECT empno, ename, sal
FROM emp
# WHERE ename LIKE '%\_%' # escape 뒤에 오는 문자는 와일드카드가 아닌 그냥 문자로 인식
WHERE ename LIKE '%E_%' ESCAPE 'E';

# 논리연산자
SELECT empno, ename,  job, deptno, hiredate
FROM emp
WHERE job ='SALESMAN' AND sal >= 1500

SELECT empno, ename,  job, deptno, hiredate
FROM emp
WHERE job ='SALESMAN' OR sal >= 1500


# 정렬
SELECT empno, ename, hiredate
FROM emp ORDER BY hiredate # 내림차순

SELECT empno, ename, hiredate
FROM emp ORDER BY hiredate DESC; # 오름차순

SELECT empno, ename, hiredate
FROM emp ORDER BY 1; # 셀렉절의 첫번째 칼럼 기준

# 다중정렬
SELECT empno, ename, sal*12
FROM emp ORDER BY 3, 1; # 셀렉절의 세번째 칼럼기준 정렬하되 같은 값은 첫번째 칼럼 기준


# 문자열함수
SELECT empno, ename, LENGTH(ename), SUBSTR(LOWER(ename),3),  LENGTH(SUBSTR(LOWER(ename),3))
FROM emp;

# REPLACE
SELECT empno, ename, sal, REPLACE(sal, '0', 'o')
FROM emp;

# INSTR
SELECT INSTR('foobarbar','bar'), INSTR('foobarbar', 'xbar');

# TRIM
SELECT TRIM('   bar   '),
	TRIM(BOTH FROM '   bar  '),
	TRIM(LEADING FROM '   bar  '),
	TRIM(TRAILING FROM '   bar  ');
	
# REVERSE
SELECT ename, REVERSE(ename)
FROM emp

# FORMAT
SELECT FORMAT (9876543.2145, 2)


# 숫자함수
# ROUND
SELECT ROUND(45.678), ROUND(45.678,2), ROUND(45.678, -1)
FROM DUAL;

#TRUNCATE
SELECT TRUNCATE(45.678, 0), TRUNCATE(45.678,2), TRUNCATE(45.678, -1)
FROM DUAL

# CEIL
SELECT CEIL (45.178), CEIL (45.178);

#MOD
SELECT MOD (10, 3), 10%3, 10 MOD 3 FROM DUAL;

# SIGN
SELECT SIGN(-1.200), SIGN(34.3), SIGN (0) FROM DUAL;



# 날짜
# CURDATE
SELECT CURDATE(), CURRENT_DATE(), CURRENT_DATE() FROM DUAL;
# CURTIME
SELECT CURTIME(), CURRENT_TIME(), CURRENT_TIME() FROM DUAL;
# SYSDATE
SELECT SYSDATE(), NOW() FROM DUAL;

#DATE_ADD # 왜 안댐
SELECT DATE_ADD('2008-01-02', INTERVAL 1 DAY) AS A1,
	DATE_ADD('2008-01-02', INTERVAL 1 MONTH) AS A2,
	DATE_ADD('2008-01-02', INTERVAL 1 YEAR) AS A3,
	NOW () as A4,
	DATE_ADD(NOW(), INTERVAL 10 MINUTE) AS A5,
	DATE_ADD(NOW(), INTERVAL 2 HOUR) AS A6;
	
# EXTRACT
SELECT NOW(),
	EXTRACT(SECOND FROM NOW()),
	EXTRACT(MINUTE FROM NOW()),
	EXTRACT(HOUR FROM NOW()),
	EXTRACT(DAY FROM NOW()),
	EXTRACT(MONTH FROM NOW()),
	EXTRACT(YEAR FROM NOW()),
	EXTRACT(YEAR_MONTH FROM NOW());
	
	
	
# 조건함수
# CASE
SELECT empno, ename, sal, job,
	case job WHEN 'ANALYST' THEN sal * 1.1
				WHEN 'CLERK' THEN sal * 1.2
				WHEN 'MANAGER' THEN sal * 1.3
				WHEN 'PRESIDENT' THEN sal * 1.4
				WHEN 'SALESMEN' THEN sal * 1.5
				ELSE sal END AS 급여
FROM emp;

SELECT  empno, ename, sal,
	CASE WHEN sal > 3500 THEN '이사급'
		  WHEN sal > 2500 THEN '과장급'
		  ELSE '사원급' END AS 직급연봉
FROM emp
# IF
SELECT sal, IF (sal >2500, '과장이상급', '사원급')
FROM emp



# 그룹함수
# GROUP BY
SELECT deptno, COUNT(*), ROUND(AVG(sal)), MIN(sal), MAX(sal), SUM(sal)
FROM emp
WHERE SUM(sal) > 10000
GROUP BY deptno
ORDER BY SUM(sal) DESC;

# HAVING
SELECT deptno, SUM(sal)	#5
FROM emp						#1
WHERE sal > 1500			#2
GROUP BY deptno			#3
HAVING SUM(sal) > 7000	#4
ORDER BY SUM(sal) DESC;	#6



# 조인
# Cross Join
SELECT empno, ename, dname
FROM emp CROSS JOIN dept;
# Natural Join
SELECT empno, ename, dname # e.empno e.ename d.dname e.deptno
FROM emp e NATURAL JOIN dept d; # 테이블 별칭가능
# Using

# self-join
SELECT e.ename 사원, m.ename 관리자
FROM emp e JOIN emp m ON e.mgr = m.empno;


#SELECT * FROM emp e JOIN dept d ON e.DEPTNO=d.DEPTNO
#						  JOIN salgrade s ON e.sal BETWEEN s.lowsal AND s.hisal;


# Outer
SELECT empno, ename, dname, d.deptno
FROM emp e RIGHT OUTER JOIN dept d ON e.deptno=d.deptno;
# 신입사원
# INSERT INTO emp VALUES (9000, 'TEST', 'SALESMEN',7499, '90/01/01', 600, NULL, NULL);
# COMMIT
SELECT empno, ename, dname, d.deptno
FROM emp e LEFT OUTER JOIN dept d ON e.deptno=d.deptno;



# 서브쿼리
# 단일행서브쿼리
SELECT empno, ename, job, sal
FROM emp
WHERE sal > (SELECT sal 
				FROM emp
				WHERE ename ='scott');
# 복수행서브쿼리
SELECT empno, ename, job, hiredate, sal, deptno
FROM emp
WHERE sal IN ( SELECT MIN(sal) 
					FROM emp
					GROUP BY job );
					
# EXISTS
SELECT empno, ename, job, hiredate, sal, deptno
FROM emp
WHERE EXISTS ( SELECT empno
				  	FROM emp
					WHERE comm IS NOT NULL );
					
# 다중칼럼서브쿼리
SELECT deptno, empno, ename, sal
FROM emp
WHERE (deptno, sal) IN (SELECT deptno, MAX(sal),
							FROM emp
							GROUP BY deptno ) ;
							
							
							
# DML
# insert
# 단일행
# 컬럼명 지정
INSERT INTO dept (deptno, dname, loc)
VALUES (90 '인사과', '서울');
# 컬럼명 미지정
INSERT INTO dept
VALUES (90 '인사과', '서울');
# 다중행
# CTAS이용
CREATE TABLE copy_emp
AS
SELECT empno, ename, sal FROM emp
WHERE 1=2;
#  서브쿼리 이용
INSERT INTO copy_emp(deptno, dname, loc)
SELECT empno, ename, sal FROM emp;

# update
UPDATE dept
SET dname = (SELECT dname
				FROM dept
				WHERE deptno = 20),
		loc = (SELECT loc
				 FROM dept
				 WHERE deptno = 30)
WHERE deptno = 90;



# --------------------------------------------------
UPDATE dept
SET dname='경리과', loc='부산'
WHERE deptno = 90;

DELETE FROM dept
WHERE deptno = 90; # 애없으면 에러남

# 서브쿼리 이용한 삭제
DELETE FROM dept
WHERE deptno IN ( SELECT deptno
						FROM dept
						WHERE dname = '인사과');
						
# MERGE
INSERT INTO dept (deptno, dname, loc)
VALUES (90, '인사과', '서울');

INSERT INTO dept (deptno, dname, loc)
VALUES (90, '인사과', '서울') ON DUPLICATE KEY UPDATE loc='제주';

# COMMIT
show variables like 'autocommit%';
# autocommit 설정 또는 해제
# SET AUTOCOMMIT = TRUE; # 설정
SET AUTOCOMMIT = FALSE; # 해제

ROLLBACK;


# ---------------------------------------------------
# DDL
# 테이블 생성
CREATE TABLE IF NOT EXISTS dept_2
( deptno INT,
  dname VARCHAR(10),
  loc VARCHAR(10) );
  
CREATE TABLE dept_2 # 에러가 달라
( deptno INT,
  dname VARCHAR(10),
  loc VARCHAR(10) );
  
# DEFAULT 옵션
CREATE TABLE IF NOT EXISTS dept_3
( deptno INT,
  dname VARCHAR(10),
  loc VARCHAR (10) DEFAULT '서울');
  
INSERT INTO dept_3 (deptno, dname)
VALUES (10, 'aaa');

SELECT * FROM dept_3;


CREATE TABLE IF NOT EXISTS board
(	num INT PRIMARY KEY AUTO_INCREMENT,
	author VARCHAR(10) NOT NULL,
	title VARCHAR(20) NOT NULL,
	content VARCHAR(100) NOT NULL,
	writeday DATE DEFAULT NOW(),
	readcnt INT DEFAULT 0 );
	
INSERT INTO board (author, title, content ) VALUES ('홍길동', '제목','내용');

SELECT * FROM board;


# 테이블 생성- 칼럼레벨
CREATE TABLE B
(  no INT PRIMARY KEY,
   name VARCHAR(10) UNIQUE,
   address VARCHAR(10) NOT NULL,
   age INT CHECK ( age IN (10,20,30)));
#	CONSTRAINT PRIMARY KEY(num) );


INSERT INTO B (NO, NAME, ADDRESS, AGE) VALUES (1, 'aa','bb',10);
INSERT INTO B (NO, NAME, ADDRESS, AGE) VALUES (2, 'bb','bb',20);
INSERT INTO B (NO, NAME, ADDRESS, AGE) VALUES (3, null,'bb',30);
INSERT INTO B (NO, NAME, ADDRESS, AGE) VALUES (4, 'aa','bb',40);

# 테이블 생성 - 테이블레벨
CREATE TABLE stdt
(  no INT,
   name VARCHAR(10),
   address VARCHAR(10),
   age INT,
	CONSTRAINT PRIMARY KEY(NO),
	CONSTRAINT UNIQUE(NAME),
	CONSTRAINT CHECK (age IN (10,20,30)));
	

SELECT * FROM B;



# FOREIGN KEY 실습
CREATE TABLE MASTER1
( NO INT PRIMARY KEY,
	NAME VARCHAR(10) NOT NULL)
	
INSERT INTO MASTER1 (NO, NAME) VALUES (1, 'aa1');
INSERT INTO MASTER1 (NO, NAME) VALUES (2, 'aa2');
INSERT INTO MASTER1 (NO, NAME) VALUES (3, 'aa3');

SELECT * from MASTER1
# 컬럼
CREATE TABLE SLAVE1
( num INT PRIMARY KEY,
  NO INT REFERENCES master1 (NO));
  
INSERT INTO SLAVE1 (num, NO) VALUES (10, 1);
INSERT INTO SLAVE1 (num, NO) VALUES (11, 2);
INSERT INTO SLAVE1 (num, NO) VALUES (12, 3);
INSERT INTO SLAVE1 (num, NO) VALUES (13, 4);
INSERT INTO SLAVE1 (num, NO) VALUES (14, NULL);

SELECT * from SLAVE1


# 테이블
CREATE TABLE SLAVE2
( num INT PRIMARY KEY,
	NO INT,
	CONSTRAINT FOREIGN KEY (NO) REFERENCES master1 (NO));
	
INSERT INTO SLAVE2 (num, NO) VALUES (10, 1);
INSERT INTO SLAVE2 (num, NO) VALUES (11, 2);
INSERT INTO SLAVE2 (num, NO) VALUES (12, 3);
INSERT INTO SLAVE2 (num, NO) VALUES (13, 4);
INSERT INTO SLAVE2 (num, NO) VALUES (14, NULL);

SELECT * from SLAVE2

# master table 삭제
DROP TABLE MASTER1; # 삭제 불가 -> fk가 참조중임
# 해결은 slave먼저 삭제 후 나중에 master 삭제

# 레코드 삭제
DELETE FROM MASTER1 # 에러 -> 참조중!
WHERE NO = 1;

DROP TABLE SLAVE1;
DROP TABLE SLAVE2;

CREATE TABLE SLAVE2
( num INT PRIMARY KEY,
  NO INT,
  CONSTRAINT FOREIGN KEY (NO) REFERENCES master1 (NO) ON DELETE CASCADE );
  
INSERT INTO SLAVE2 (num, NO) VALUES (10, 1);
INSERT INTO SLAVE2 (num, NO) VALUES (11, 2);
INSERT INTO SLAVE2 (num, NO) VALUES (12, 3);

SELECT * from SLAVE2

DELETE FROM MASTER1 # 삭제됨 SLAVE2의 레코드를 같이 삭제 시킴
WHERE NO = 1;

SELECT * from SLAVE2



CREATE TABLE SLAVE1
( num INT PRIMARY KEY,
  NO INT,
  CONSTRAINT FOREIGN KEY (NO) REFERENCES master1 (NO) ON DELETE SET NULL );
  
#INSERT INTO SLAVE1 (num, NO) VALUES (10, 1);
INSERT INTO SLAVE1 (num, NO) VALUES (11, 2);
INSERT INTO SLAVE1 (num, NO) VALUES (12, 3);

SELECT * from SLAVE1

DELETE FROM MASTER1 # 삭제됨 SLAVE2의 레코드를 null로 변경
WHERE NO = 2;

SELECT * from SLAVE1



SELECT * from board
# 테이블 삭제
TRUNCATE TABLE board
ROLLBACK # 롤백안댐!



# 테이블 변경
# 컬럼 추가

CREATE TABLE scott_t
( num INT,
  NO INT);

DESC scott_t;
  
ALTER TABLE scott_t
ADD (address VARCHAR(10));

ALTER TABLE scott_t
MODIFY address VARCHAR (5);

# 제약조건 추가
CREATE TABLE scott_t2
( num INT,
  NAME VARCHAR(10),
  age INT,
  address VARCHAR(20));
  
ALTER TABLE scott_t2
ADD CONSTRAINT PRIMARY KEY(num);
ALTER TABLE scott_t2
ADD CONSTRAINT UNIQUE(NAME);
ALTER TABLE scott_t2
ADD CONSTRAINT CHECK(age>20);
ALTER TABLE scott_t2
MODIFY address VARCHAR(20) NOT NULL;


CREATE TABLE scott_t2_child
( no INT PRIMARY KEY,
  num INT );
  
ALTER TABLE scott_t2_child
ADD CONSTRAINT FOREIGN KEY (num) REFERENCES scott_t2(num);