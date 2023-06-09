--GITHUB UPLOAD


-- 주석이 보여요?
SELECT *
FROM V_TAKES

CREATE OR REPLACE VIEW V_TAKES AS
SELECT STU_ID, CLASS_ID
FROM TAKES

SELECT TITLE
FROM COURSE
WHERE COURSE_ID NOT IN (
	SELECT DISTINCT COURSE_ID
	FROM CLASS
	WHERE YEAR=2012 AND SEMESTER=2
)

SELECT DISTINCT TITLE
FROM COURSE C1, CLASS C2
WHERE C1.COURSE_ID = C2.COURSE_ID 
AND CLASSROOM='301호'

SELECT TITLE
FROM COURSE
WHERE COURSE_ID IN (
	SELECT DISTINCT COURSE_ID
	FROM CLASS
	WHERE CLASSROOM='301호'
)

SELECT COUNT(COMM)
FROM EMP
WHERE COMM IS NULL

SELECT * --STU_ID
FROM TAKES
WHERE GRADE = 'A+'

SELECT *
FROM EMP
WHERE COMM IS NOT NULL

SELECT *
FROM EMP
WHERE COMM IS NULL

SELECT DNAME, COUNT(*), AVG(SAL), MAX(SAL), MIN(SAL)
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO 
GROUP BY DNAME
HAVING COUNT(*)>=5

SELECT DEPT_NAME, COUNT(*), AVG(2012-YEAR_EMP), MAX(2012-YEAR_EMP)
FROM PROFESSOR P, DEPARTMENT D
WHERE P.DEPT_ID = D.DEPT_ID
GROUP BY DEPT_NAME
HAVING AVG(2012-YEAR_EMP)>=10

SELECT DNAME, COUNT(*), AVG(SAL), MAX(SAL), MIN(SAL)
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO 
GROUP BY DNAME
ORDER BY DNAME

SELECT DEPT_NAME, COUNT(*)
FROM STUDENT S, DEPARTMENT D
WHERE S.DEPT_ID =D.DEPT_ID 
GROUP BY DEPT_NAME

SELECT DEPT_ID, COUNT(*)
FROM STUDENT
GROUP BY DEPT_ID

SELECT ENAME, MAX(SAL)
FROM EMP

SELECT MAX(SAL), AVG(SAL), MIN(SAL)
FROM EMP E, DEPT D
WHERE E.DEPTNO =D.DEPTNO 
AND DNAME='ACCOUNTING'

SELECT AVG(SAL)
FROM EMP
WHERE JOB='PRESIDENT'

SELECT AVG(2012-YEAR_EMP)
FROM PROFESSOR

SELECT NAME, YEAR_EMP, 2012-YEAR_EMP
FROM PROFESSOR

SELECT SUM(SAL)
FROM DEPT, EMP
WHERE DEPT.DEPTNO=EMP.DEPTNO
AND DNAME='RESEARCH'

SELECT *
FROM DEPT

SELECT *
FROM EMP

SELECT SUM(SAL) 
FROM EMP
WHERE JOB='SALESMAN'

SELECT NAME, YEAR_EMP, 2012-YEAR_EMP
FROM PROFESSOR

SELECT SUM(2012-YEAR_EMP)
FROM PROFESSOR

SELECT COUNT(*)
FROM EMP
WHERE JOB='SALESMAN'
AND SAL>='1500'

SELECT COUNT(*)
FROM EMP
WHERE JOB='SALESMAN'

SELECT COUNT(*)
FROM STUDENT, DEPARTMENT
WHERE STUDENT.DEPT_ID =DEPARTMENT.DEPT_ID 
AND DEPARTMENT.DEPT_NAME ='컴퓨터공학과'

SELECT COUNT(*)
FROM STUDENT S, DEPARTMENT D
WHERE S.DEPT_ID =D.DEPT_ID 
AND D.DEPT_NAME ='컴퓨터공학과'

SELECT COUNT(DISTINCT DEPT_ID)
FROM STUDENT


SELECT COUNT(COMM)
FROM EMP

SELECT * --COUNT(*)
FROM STUDENT
WHERE YEAR=3