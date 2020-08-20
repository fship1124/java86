create table salgrade (
	grade char(1),
	min_sal number(6),
	max_sal number(6)
);

insert into salgrade values ('1', 20000, 100000);
insert into salgrade values ('2', 10000, 19999);
insert into salgrade values ('3', 6000, 9999);
insert into salgrade values ('4', 3000, 5999);
insert into salgrade values ('5', 1, 2999);

select *
  from salgrade;
select *
  from JOBS ;  
select last_name, salary
  from EMPLOYEES;
  
-- 사원명, 급여, 급여 등급을 화면에 출력  
select e.last_name, e.salary, s.grade
  from employees e, salgrade s
 where e.salary between s.min_sal 
                    and  s.max_sal;
                    
-- 각 사원의 job_id에 해당하는 최대 받을 수 있는 급여와
-- 최소 급여가 얼마인지 출력하시오
-- 출력항목 : last_name, salary, job_id,
--          직무명(job_title), 최대급여, 최소급여      
 select e.last_name, e.salary, e.job_id, j.job_title, j.min_salary, j.max_salary
   from JOBS j, employees e
  where e.job_id = j.job_id;
  
-- 각 사원의 관리자 정보를 출력하시오
 select e.last_name 사원명, m.last_name 관리자명
   from employees e, employees m
  where e.manager_id = m.employee_id; 
-- join 조건을 만족하지 않을때 만족하게 하고 싶을때 사용 : 아우터 조인  

-- 각 사원의 관리자 정보를 출력하시오
-- join 조건을 만족하지 않는 데이터 출력(대표는 관리자가 없어 관리자 값이 부족)
-- 관리자가 없는 사원의 경우 "관리자 없음" 출력
 select e.last_name 사원명, m.last_name 관리자명
   from employees e, employees m
  where e.manager_id = m.employee_id(+);
  
select e.last_name 사원명, nvl(m.last_name, '관리자 없음') 관리자명
  from employees e, employees m
 where e.manager_id = m.employee_id(+); 
  

-- SET 연산자 -------------------------------------------------------
-- 테스트 데이터 생성
create table tc_seta (
	no number,
	data varchar2(2)
); 

create table tc_setb (
	no number,
	data varchar2(2)
); 
  
insert into tc_seta values(1, 'a');  
insert into tc_seta values(2, 'b');  
insert into tc_seta values(3, 'c');  
insert into tc_seta values(4, 'd');  

insert into tc_setb values(3, 'c');  
insert into tc_setb values(4, 'd');  
insert into tc_setb values(5, 'e');  
insert into tc_setb values(6, 'f');  

--union all : union보다 속
select no, data
  from tc_seta
union all
select no, data
  from tc_setb;
  
--union : 중복 제거뿐 아니라 정렬까지 해준다. 다만 속도가 좀 느림  
--중첩된 데이터는 한번만 사용. 데이타 자동 정렬
select no, data
  from tc_seta
union 
select no, data
  from tc_setb;

--minus : 차집합
select no, data
  from tc_seta
minus
select no, data
  from tc_setb;

--intersect : 교집합
select no, data
  from tc_seta
intersect
select no, data
  from tc_setb;
 
-- 에러 발생 :  결과 열의 수가 다르다.. 
select last_name, salary, department_id
  from employees
 union all
select department_id, department_name
  from departments;
-- 에러 발생 : 같은 위치의 열들은 데이터 타입이 같아야 함.
select last_name, salary
  from employees
 union all
select department_id, department_name
  from departments;
-- 에러 발생 : order by 절은 항상 쿼리문의 제일 마지막에 위치해야 함
select last_name, salary
  from employees
 order by last_name
 union all
select department_id, department_name
  from departments;
-- 첫번째 select 절의 컬럼명이 사용됨(head 컬럼명) 
select last_name, salary
  from employees
 union all
select department_name, department_id
  from departments
 order by last_name;
   
-- 서브쿼리 -------------------------------------------------------
-- 모든 절에 모두 사용 가능.
-- Chen 사원이 속해있는 부서의 평균 급여를 구하시오
-- Chen 부서가 10번일 경우 같은 부서에 속했는 사원들의 평균 급여를 구하시오
select avg(salary)
  from employees
 where department_id = 10
   
-- Chen 부서번호
select department_id
  from employees
 where last_name = 'chen';
  
-- Chen 사원이 속해있는 부서의 평균 급여를 구하시오. Chen의 부서번호를 모르는 경우
-- ()안에 Chen 부서번호 쿼리 넣음 : 서브쿼리
-- 서브쿼리 형식 : ()

-- 서브쿼리의 결과행이 하나인 경우 : Single Row subquery
select avg(salary)
  from employees
 where department_id = (select department_id
						  from employees
						 where last_name = 'chen');
						 
-- 서브쿼리의 결과행이 여러개인 경우: Multi Row subquery
-- 오류발생되므로 서브쿼리 밖의 = 을 in 연산자 사용 
select avg(salary)
  from employees
 where department_id in (select department_id
						  from employees
						 where last_name = 'King');
  
-- (30번 부서의 평균 급여)보다 급여를 많이 받는 사원의 정보를 출력
select *
  from employees
 where salary > (select avg(salary)
                   from employees
                  where department_id = 30);
  
-- (30번 부서의 사원들이 받는 급여)보다 많은 급여를 받는 사원의 정보 출력  
select *
  from employees
where salary > (select max(salary)
                   from employees
                  where department_id = 30);
 
                  
select *
  from employees
where salary > (select salary)
                   from employees
                  where department_id = 30);
-- 위에 쿼리에 대한 값
-- >ALL, <ALL : ()서브쿼리의 결과 모두 만족해야 됨  
-- >ANY, <ANY : ()서브쿼리의 결과중에서 하나만 만족하면 됨     
-- >ALL :max 개념. 뒤에 있는 값들보다 큰것                  
select *
  from employees
 where salary >ALL (3000,5000); 
-- <ALL: min 개념. 뒤에 있는 값들보다 작은것.                   
select *
  from employees
 where salary <ALL (3000,5000);   
-- >ANY: ()값들중. 최소값보다 크면 됨                  
select *
  from employees
 where salary <ANY (3000,5000);   
  
-- 각 부서에서 가장 작은 급여를 받는 사원의 정보를 출력하시오
-- 값 오류. 부서의 작은 급여 1명출력 : 비교가 salary와 최소급여만 비교되므로... 
select department_id, last_name, salary
  from employees
 where salary in (select min(salary)
                    from employees
                   group by department_id);
-- 개선. Multi Column SubQuery
-- 비교값을 2컬럼을 줌. 단 비교하는 컬럼이 양쪽이 일치해야함
select department_id, last_name, salary
  from employees
 where (department_id, salary) in 
                 (select department_id, min(salary)
                    from employees
                   group by department_id); 

-- 사원명, 부서번호, 부서명                   
select e.last_name, e.department_id, d.department_name
  from employees e, departments d;
 where e.department_id = d.department_id;

select department_name
  from departments
 where department_id = 10;

-- select 절에 사용된 subquery : 위의 join문을 subquery 로 변경 
select e.last_name, e.department_id,
       (select department_name from departments
         where department_id = e.department_id)
  from employees e;
  
-- From 절에서 사용하는 subquery : Inline View . 임시메모리
-- Inline View 에서는 Order by 사용 가능
select department_id, max_sal
  from (select department_id, max(salary) max_sal
          from c
         group by department_id);
  
-- 위의 쿼리를 join 문으로 변경 (Inline View를 활용)  
select e1.department_id, last_name, salary
  from employees e1,
      (select department_id, min(salary) min_sal
              from employees
             group by department_id) e2
 where e1.department_id = e2.department_id   
   and e1.salary        = e2.min_sal;
         
-- rownum 에 대한 이해... -----------------------------------
-- rownum 컬럼은 오라클에서 제공하는 가상 컬럼 / 중복값 나오지 않음
-- rownum 특성상 비교는 1부터 진행된다.
select rownum, last_name, salary
  from employees;
      
-- 10개까지 데이터 출력 
select rownum, last_name, salary
  from employees
 where rownum < 11;   
  
-- rownum 이 1번인 데이터 출력 
select rownum, last_name, salary
  from employees
 where rownum = 1;   
-- rownum 이 2번인 데이터 출력 
-- 값이 나오지 않음
select rownum, last_name, salary
  from employees
 where rownum = 2;   
  
-- 사원 중에서 급여를 많이 받는 5명을 출력하시오
-- 가상테이블(급여순으로 내림차순한 테이블)을 사용하여 쿼리 작성함

select rownum, last_name, salary
  from (select * from employees order by salary desc) 
 where rownum < 6;
 
-- rownum 의 컬럼을 rnum으로 별칭을 줘서 재정의 함으로써 
-- rownum의 특성인 1번부터 무조건 순차적으로 되어야 한다는 틀을 깸. 
-- 그래서 6~10까지 값을 불러올수 있음
select rnum, last_name, salary 
  from (select rownum rnum, last_name, salary
          from (select * from employees order by salary desc))
 where rnum between 6 and 10;          
-- 급여가 높은 순으로 내림차순 한 가상테이블 생성하여 위의 from의 가상 테이블에 삽입 하여 alias   
select rownum rnum, last_name, salary
  from (select * from employees order by salary desc); 
 
-- 서브쿼리를 이용하는 테이블 생성 (현재 상태를 백업 시키는 기능을 구현하려고 함)
-- 테이블에서 원하는 조건만 select 하여 테이블을 새로 만들수 있음.
create table employees_copy  
as
select * from employees;
  
select * from employees_copy; 

-- 테이블의 칼럼과 칼럼의 데이타 형식만 복사하고 싶을때 사용  
create table employees_copy2  
as
select * from employees
 where 1 != 1;  
 
select * from employees_copy2; 
 
-- 입력시 SubQuery 활용
insert into employees_copy2
select * from employees;
  
  
                    
                    