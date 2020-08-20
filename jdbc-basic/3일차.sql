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

delete from salgrade;

select * 
  from salgrade;
  
-- 사원명, 급여, 급여 등급을 화면에 출력  
select e.last_name, e.salary, s.grade
  from employees e, salgrade s
 where e.salary between s.min_sal
                    and s.max_sal;

-- 각 사원의 job_id 에 해당하는 최대 받을 수 있는 급여와
-- 최소 급여가 얼마인지 출력하시오
-- 출력항목 : last_name, salary, job_id, 
--           직무명, 최대급여, 최소급여
select e.last_name, e.salary, e.job_id, 
       j.job_title, j.max_salary, j.min_salary
  from employees e, jobs j
 where e.job_id = j.job_id; 
 
-- 각 사원의 관리자 정보를 출력하시오
select e.last_name 사원명, m.last_name 관리자명
  from EMPLOYEES e, EMPLOYEES m
 where e.manager_id = m.employee_id;
 
-- 각 사원의 관리자 정보를 출력하시오
-- join 조건을 만족하지 않는 데이터 출력
select e.last_name 사원명, m.last_name 관리자명
  from EMPLOYEES e, EMPLOYEES m
 where e.manager_id = m.employee_id(+);
 
-- 각 사원의 관리자 정보를 출력하시오
-- join 조건을 만족하지 않는 데이터 출력
-- 관리자가 없는 사원의 경우 "관리자 없음" 출력
select e.last_name 사원명, 
       nvl(m.last_name, '관리자 없음') 관리자명
  from EMPLOYEES e, EMPLOYEES m
 where e.manager_id = m.employee_id(+);
 

-- SET 연산자
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

select no, data
  from tc_seta;

select no, data
  from tc_setb;
  
select no, data
  from tc_seta
 union all 
select no, data
  from tc_setb;
  
-- 중첩된 데이터는 한번만 사용, 자동 정렬됨 
select no, data
  from tc_seta
 union
select no, data
  from tc_setb;

select no, data
  from tc_seta
 minus
select no, data
  from tc_setb;

select no, data
  from tc_seta
 intersect
select no, data
  from tc_setb;

-- 에러 발생 : 결과 열의 수가 다르다..
select last_name, salary, department_id
  from employees
 union all
select department_id, department_name
  from departments;

-- 에러 발생 : 같은 위치의 열들은 데이터 타입이 같아야 함
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

-- 첫번째 select 절의 컬럼명이 사용됨 
select last_name, salary
  from employees
 union all
select department_name, department_id 
  from departments
 order by last_name;
  
-- 서브쿼리
-- Chen 사원이 속해있는 부서의 평균 급여를 구하시오
-- Chen 부서가 10번일 경우 같은 부서에 속했는 사원들의 평균 급여를 
-- 구하시오
select avg(salary)
  from employees
 where department_id = 10; 

-- Chen  부서번호 
select department_id
  from employees 
 where last_name = 'Chen'; 
 
-- 서브쿼리의 결과행이 하나인 경우 : Single Row SubQuery 
select avg(salary)
  from employees
 where department_id = (select department_id
						  from employees 
						 where last_name = 'Chen'); 
 
-- 결과행이 여러개인 경우 : Multi Row SubQuery 
select avg(salary)
  from employees
 where department_id in (select department_id
						  from employees 
						 where last_name = 'King'); 
  
-- 30번 부서의 평균 급여보다 급여를 많이 받는 사원의 정보를 출력
select *
  from employees
 where salary > (select avg(salary)
                   from emplyees
                  where department_id = 30);
  
-- 30번 부서의 사원들이 받는 급여보다 많은 급여를 받는 사원의 정보 출력
select *
  from employees
 where salary > (select max(salary)
                   from emplyees
                  where department_id = 30);

-- ALL : 서브쿼리의 결과 모두 만족해야 됨
select *
  from employees
 where salary >ALL (select salary
                      from emplyees
                     where department_id = 30);

-- ANY : 서브쿼리의 결과중에서 하나만 만족하면 됨
select *
  from employees
 where salary >ANY (select salary
                      from emplyees
                     where department_id = 30);
  
-- 각 부서에서 가장 작은 급여를 받는 사원의 정보를 출력하시오
select department_id, last_name, salary
  from employees
 where salary in (select min(salary)
                    from employees
                   group by department_id);
 
-- Multi Column SubQuery                   
select department_id, last_name, salary
  from employees
 where (department_id, salary) in 
                 (select department_id, min(salary)
                    from employees
                   group by department_id);
  
-- 위의 쿼리를 Join 문으로 변경 (Inline View 활용) 
select e1.department_id, last_name, salary
  from employees e1,
       (select department_id, min(salary) min_sal
                    from employees
                   group by department_id) e2
 where e1.department_id = e2.department_id
   and e1.salary        = e2.min_sal;
                   
-- 사원명, 부서번호, 부서명
select e.last_name, e.department_id, d.department_name
  from employees e, departments
 where e.department_id = d.department_id; 
 
select department_name
  from departments
 where department_id = 10; 

-- select 절에서 사용하는 SubQuery 
select e.last_name, e.department_id, 
       (select department_name from departments 
         where department_id = e.department_id)
  from employees e;
 
-- From 절에서 사용하는 SubQuery : Inline View
-- Inline View 에서는 Order by 사용 가능
select department_id, max_sal
  from (select department_id, max(salary) max_sal
          from employees
         group by department_id);

         
-- rownum 에 대한 이해...
select rownum, last_name, salary
  from employees;
  
select rownum, last_name, salary
  from employees
 where rownum < 11; 
  
-- rownum 이 1번인 데이터 출력        
select rownum, last_name, salary
  from employees
 where rownum = 1;                      

-- rownum 이 2번인 데이터 출력        
select rownum, last_name, salary
  from employees
 where rownum = 2;  
 
-- 사원 중에서 급여를 많이 받는 5명을 출력하시오
select last_name, salary
  from employees
 where rownum < 6
 order by salary desc;

 
select last_name, salary
  from (select * from employees order by salary desc)
 where rownum < 6;
 
select rnum, last_name, salary
  from (select rownum rnum, last_name, salary
          from (select * from employees order by salary desc))
 where rnum between 6 and 10; 

-- 서브쿼리를 이용하는 테이블 생성
create table employees_copy
as
select * from employees;

select * from employees_copy;
 
create table employees_copy2
as
select * from employees
 where 1 != 1;
 
select * from employees_copy2; 
 
-- 입력시 SubQuery 활용
insert into employees_copy2
select * from employees;
 
 
 
 
 
 
 
 
                     
                     
                     
                     
                     
                     
                  
 