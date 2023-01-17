
# ----------------------------
문제
1.  각각의 사원번호에 대해 휴가 시작일과 휴가 종료일을 보여주되, 
오전오후의 속성인 SMA_VC와 EMA_VC를 이용하여 1일 경우는 오전, 2일 경우는 오후로 출력하시오.

SELECT EMPNO_VC, STDATE_VC, IF(SMA_VC=1,'오전','오후') AS SMA_VC_STR, EDDATE_VC, IF(EMA_VC=1,'오전','오후') AS EMA_VC_STR
from T_HOLHISTORY;

SELECT EMPNO_VC, STDATE_VC,
	CASE SMA_VC WHEN 1 THEN '오전'
					ELSE '오후' END 시작일,
	EDDATE_VC,
	CASE EMA_VC WHEN 1 THEN '오전'
					ELSE '오후' END 종료일
from T_HOLHISTORY;




문제
2. 사원번호와 휴가신청 상태를 표시하되 
상태( STATE_VC)의 현재상태 코드가 0일 경우 허가 , 
10일 경우대기 , 20일 경우 불허가로 표시하시오.
SELECT EMPNO_VC,# STATE_VC,
	CASE STATE_VC WHEN 0 THEN '허가'
					  WHEN 10 THEN '대기'
					  WHEN 20 THEN '불허가'
					  ELSE STATE_VC END 휴가신청상태
FROM T_HOLHISTORY;

# ----------------------------------------------------------
# 실습문제
1. 부서테이블과 사원테이블에서 사번 , 사원명 , 부서코드 , 부서명을 검색 하시오
(사원명 오름차순 정렬할 것)

SELECT EMPNO, ENAME, d.DEPTNO, d.DNAME
FROM emp e JOIN dept d ON e.DEPTNO=d.DEPTNO
ORDER BY ENAME;

2. 부서테이블과 사원테이블에서 사번 , 사원명 , 급여 , 부서명을 검색 하시오 . 
단 , 급여가 2000 이상인 사원에 대하여 급여기준으로 내림차순 정렬할 것





# 