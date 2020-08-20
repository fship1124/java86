select * from tab;
select * from jobs;
select * from employees;


--1. 담당업무별 최대 급여와 최소 급여를 출력하시오. 단, 담당업무는 영업 부서로 제한.
--   (영업부서 - 영업대표(SA_REP), 영업관리자(SA_MAN)
select job_id, min(salary), max(salary)
  from employees
 where job_id in (select job_id
                    from employees
                   where job_id in ('SA_MAN', 'SA_REP'))
  group by job_id;
 
--2. 담당업무별로 최대 급여가 얼마인지 출력하시오(급여가 높은 순 출력)
select job_id, max(salary) as max_sal
  from employees
 group by job_id
 order by max_sal desc;
 
--3. 사원의 월급이 Programmer 업무에 해당하는 연봉의 상한과 하한에 포함되는 사원의 정보를 출력
--   연봉의 상한과 하한은 JOBS 테이블 참고 
select employee_id, first_name, salary 
  from employees 
 where salary between (select min_salary 
			             from jobs
			            where job_title = 'Programmer') 
			      and (select max_salary 
			             from jobs
			            where job_title = 'Programmer');
			            
			            
--4. 업무명(job_title)이 ‘Sales Representative’ 인 직원 중에서 
--연봉(salary)이 9,000 이상,10,000 이하인 
--직원들의 이름(first_name), 성(last_name)과 연봉(salary)을 출력 
select  e.first_name as "이름", e.last_name as "성", e.salary as "연봉"
 from employees e
where  job_id in (select job_id 
		            from jobs
		           where job_title = 'Sales Representative') 
 and e.salary between 9000 and 10000;

--5.각 사원(employee)에 대해서 
--사번(employee_id), 이름(first_name), 업무명(job_title), 부서명(department_name)를 조회
--단, 도시명(city)이 ‘Seattle’ 인 지역(location)의 부서(department)에 근무하는 직원만 출력 
select employee_id as 사번, first_name as 이름, job_title as 업무명, department_name as 부서명
  from employees e, jobs j, departments d, 
       (select location_id
          from locations
         where city = 'Seattle') lo
 where lo.location_id = d.location_id
   and d.department_id = e.department_id
   and e.job_id = j.job_id;
 
 --6.각 업무(job) 별로 연봉(salary)의 총합을 구하고자 한다. 
 --  연봉 총합이 가장 높은 업무부터 업무명(job_title)과 연봉 총합을 조회하시오. 
 --  단 연봉총합이 30,000보다 큰 업무만 출력합니다.
select j.job_title as 업무명, sum(salary) as 연봉   
  from employees e, jobs j
 where j.job_id = e.job_id
 group by j.job_title 
having sum(salary) > 30000
 order by sum(salary) desc;
 
 
--7. 자신의 매니저보다 연봉(salary)을 많이 받는 직원들의 성(last_name)과 연봉(salary)을 출력
select e.last_name, e.salary
  from employees e, employees m
 where e.employee_id = m.manager_id
   and e.salary > m.salary;
   
   
select e.last_name 이름, e.salary 연봉
  from employees e, employees m
 where  (e.salary, m.salary) in 
        (select e.salary , m.salary
           from employees e, employees m
          where e.manager_id = m.employee_id)
   and e.manager_id = m.employee_id
   and e.salary > m.salary; 
   
 select e.last_name 이름, e.salary 연봉
  from employees e, employees m
 where e.manager_id = m.employee_id
   and e.salary > m.salary;   
   
   
--8. 각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 부서명(department_name),
--   매니저(manager)의 이름(first_name)을 조회
select e.employee_id 사번, e.first_name 이름, d.department_name 부서명, m.first_name 매니저이름
  from employees e, employees m, departments d
 where (e.employee_id, m.employee_id) in
	    (select e.employee_id, m.employee_id
	       from employees e, employees m
	      where e.manager_id = m.employee_id)
   and e.manager_id = m.employee_id
   and d.department_id = e.department_id;
   
select e.employee_id 사번, e.first_name 이름, d.department_name 부서명, m.first_name 매니저이름
  from employees e, employees m, departments d
 where e.manager_id = m.employee_id
   and d.department_id = e.department_id;   
 
--9. 특정 사원의 사원 번호(employee_id)가 다른 사원의 관리자 번호(manager_id)에 있는 사원인 경우, 
--   이 사원을 관리자라고 가정합니다. 이름(FIRST_NAME)에 "v"(소문자)가 들어간 사원들에 대해
--   사원 번호(EMPLOYEE_ID), 이름(FIRST_NAME), 관리자 이름(관리자의 FIRST_NAME)을 조회하고 
--   관리자가 없는 경우에는 관리자 이름에 "관리자 없음"라고 출력하도록 SQL 쿼리를 작성   
 select e.employee_id 사번, e.first_name 이름, nvl(m.first_name, '관리자 없음') 관리자명
  from employees e, employees m
 where e.manager_id = m.employee_id(+)
   and e.first_name like '%v%';
    
--10. 자신의 매니저보다 채용일(hire_date)이 빠른 
--    사원의 사번(employee_id), 성(last_name)과 채용일(hire_date)을 조회하라. 
--    단, 사원입사일 순으로 출력한다.
select e.employee_id 사번, e.last_name 이름, e.hire_date 사원입사일, m.hire_date 매니저입사일
  from employees e, employees m
 where e.manager_id = m.employee_id
   and e.hire_date < m.hire_date
 order by e.hire_date;
   
--11. 자신을 관리자 ID(manager_id)로 지정하고 있는 직원수(직속부하직원수)를 
--    다음과 같이 출력 되도록 쿼리문을 작성하시오. 
--   단, 직속부하직원 수가 8이상인 경우만 출력하도록 하고, 직속부하직원수 순으로 내림차순 정렬   

 --성공
 select b.manager_id, e.last_name, b.countempl  
   from employees e, (select manager_id , count(employee_id) countempl
                        from employees
                       group by manager_id
                       order by countempl desc) b
  where b.manager_id = e.employee_id
    and countempl >= 8;


-- 이건왜안될까?  
 select manager_id 사번, 
--        (select last_name
--          from employees e, employees m
--         where e.employee_id = m.manager_id) 이름,
        count(employee_id) 직속부하직원수
   from employees 
  group by manager_id
 having count(employee_id) >= 8
  order by count(employee_id) desc;   
 
--성공  
select b.manager_id, e.last_name, b.ct 
 from employees e, (select manager_id, count(employee_id) ct
                      from employees
                     group by manager_id   
                    having count(employee_id) >= 8) b
 where b.manager_id = e.employee_id
 order by b.ct desc;
 
-- 12.자신의 부서 평균 급여보다 연봉이 많은 사원의 사번(employee_id), 성(last_name)과 
-- 연봉(salary)을 조회 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  

   
   
 
 
 
 select * from job_id;
 select * from locations;
 select * from departments;
 select * from employees;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 