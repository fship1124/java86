-- 문제 1.
-- 담당업무별 최대 급여와 최소 급여를 출력하시오. 단, 담당업무는 영업 부서로 제한.
-- (영업부서 - 영업대표(SA_REP), 영업관리자(SA_MAN)
select JOB_ID, MAX(SALARY), MIN(SALARY)
  from employees
 where job_id in ('SA_REP', 'SA_MAN')
 group by job_id;
 
-- 문제. 2
-- 담당업무별로 최대 급여가 얼마인지 출력하시오(급여가 높은 순 출력)
select JOB_ID, MAX(SALARY) MAX_SAL
from employees
group by job_id
order by max_sal desc;

-- 문제. 3
-- 사원의 월급이 Programmer 업무에 해당하는 연봉의 상한과 하한에 포함되는 사원의 정보를 출력하시오.
-- - 연봉의 상한과 하한은 JOBS 테이블 참고
select E.EMPLOYEE_ID, E.FIRST_NAME, E.SALARY
from (select min_salary, max_salary
	  from jobs
	  where job_title = 'Programmer') s, employees e
where e.salary between s.min_salary and s.max_salary;

-- 문제. 4
-- 업무명(job_title)이 ‘Sales Representative’인 직원 중에서 연봉(salary)이 9,000 이상,
-- 10,000 이하인 직원들의 이름(first_name), 성(last_name)과 연봉(salary)을 출력하시오.
select e.first_name 이름, e.last_name 성, e.salary 연봉
from jobs j, employees e
where j.job_id = e.job_id
	  and j.job_title = 'Sales Representative'
	  and e.salary between 9000 and 10000
order by first_name;

-- 문제. 5
-- 각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 업무명(job_title), 부서명
-- (department_name)를 조회하시오. 단 도시명(city)이 ‘Seattle’인 지역(location)의 부서
-- (department)에 근무하는 직원만 출력하시오.
select e.employee_id 사번, e.first_name 이름, j.job_title 업무명, d.department_name 부서명
from employees e, departments d, locations l, jobs j
where e.department_id = d.department_id
	  and d.location_id = l.location_id
	  and e.job_id = j.job_id
	  and l.city = 'Seattle';

-- 문제. 6
-- 각 업무(job) 별로 연봉(salary)의 총합을 구하고자 한다. 연봉 총합이 가장 높은 업무부터 업무
-- 명(job_title)과 연봉 총합을 조회하시오. 단 연봉총합이 30,000보다 큰 업무만 출력합니다.
select j.job_title 업무명, sum(salary) 연봉
from employees e, jobs j
where e.job_id = j.job_id
group by j.job_title
having sum(salary) > 30000
order by sum(salary) desc;


-- 문제. 7
-- 자신의 매니저보다 연봉(salary)을 많이 받는 직원들의 성(last_name)과 연봉(salary)을 출력하시오. 
select e1.last_name 이름, e1.salary 연봉
from employees e1, employees e2
where e1.manager_id = e2.employee_id
	  and e1.salary > e2.salary;

-- 문제. 8
-- 각 사원(employee)에 대해서 사번(employee_id), 이름(first_name), 부서명(department_name),
-- 매니저(manager)의 이름(first_name)을 조회하시오.
select e1.employee_id 사번, e1.first_name 이름, d.department_name 부서명, e2.first_name 매니저이름
from employees e1, employees e2, departments d
where e1.manager_id = e2.employee_id(+)
	  and e1.department_id = d.department_id;

-- 문제. 9
-- 특정 사원의 사원 번호(employee_id)가 다른 사원의 관리자 번호(manager_id)에 있는 사원인 경
-- 우, 이 사원을 관리자라고 가정합니다. 이름(FIRST_NAME)에 "v"(소문자)가 들어간 사원들에 대해
-- 사원 번호(EMPLOYEE_ID), 이름(FIRST_NAME), 관리자 이름(관리자의 FIRST_NAME)을 조회하고 관리
-- 자가 없는 경우에는 관리자 이름에 "관리자 없음"라고 출력하도록 SQL 쿼리를 작성하세요.
select e1.employee_id 사번, e1.first_name 이름, nvl(e2.first_name, '관리자 없음') "관리자 이름"
from employees e1, employees e2
where e1.manager_id = e2.employee_id(+)
	  and e1.first_name like '%v%'
order by e1.employee_id;

-- 문제. 10
-- 자신의 매니저보다 채용일(hire_date)이 빠른 사원의 사번(employee_id), 성(last_name)과 채용
-- 일(hire_date)을 조회하라. 단, 사원입사일 순으로 출력한다.
select e1.employee_id 사번, e1.last_name 이름, e1.hire_date 사원입사일, e2.hire_date 매니저입사일
from employees e1, employees e2
where e1.manager_id = e2.employee_id
	  and e1.hire_date < e2.hire_date
order by e1.hire_date;

-- 문제. 11
-- 자신을 관리자 ID(manager_id)로 지정하고 있는 직원수(직속부하직원수)를 다음과 같이 출력 되
-- 도록 쿼리문을 작성하시오. 단 직속부하직원 수가 8이상인 경우만 출력하도록 하고, 직속부하직
-- 원수 순으로 내림차순 정렬한다. 
select m.manager_id 사번, e.last_name 이름, m.cnt 직속부하직원수
from (select manager_id, count(manager_id) cnt
	  from employees
	  group by manager_id
	  having count(manager_id) >= 8) m, employees e
where m.manager_id = e.employee_id
order by m.cnt desc;

-- 문제. 12
-- 자신의 부서 평균 급여보다 연봉이 많은 사원의 사번(employee_id), 성(last_name)과 연봉
-- (salary)을 조회하라.
select e.employee_id 사번, e.last_name 이름, e.salary 급여, e.department_id 부서번호, d.salary_avg 부서평균급여
from (select department_id, avg(salary) salary_avg
	   from employees
	   group by department_id) d, employees e
where e.department_id = d.department_id
	  and d.salary_avg < e.salary
order by e.employee_id;

-- 문제. 13
-- ‘Sales’부서에 속한 직원의 이름(first_name), 급여(salary) 을 조회하시오. 단, 급여는 100번
-- 부서의 평균보다 적게 받는 직원 정보만 출력되어야 합니다. 
select s.first_name 이름, s.salary 급여, d.department_name 부서명
from employees s, departments d
where s.department_id = d.department_id
	  and d.department_name = 'Sales'
	  and s.salary < (select avg(salary)
					  from employees
					  where department_id = 100)
order by s.first_name;

-- 문제. 14
-- 각 도시(city)에 있는 모든 부서 직원들의 평균급여를 조회하고자 한다. 평균급여가 가장 낮은
-- 도시부터 도시명(city)과 평균연봉을 출력하시오. 단, 도시에 근무하는 직원이 10명 이하인 곳은
-- 제외하고 조회한다.
select l.city 도시, avg(e.salary) 급여, count(*) 근무인원수
from employees e, departments d, locations l
where e.department_id = d.department_id
	  and d.location_id = l.location_id
group by l.city
having count(*) > 10
order by avg(e.salary);

-- 문제. 15
-- 각 부서(department_id)별로 최고 연봉(salary)를 받는 사원의 사번(employee_id), 성
-- (last_name)과 연봉(salary)을 조회하시오. 단 조회결과는 연봉의 내림차순으로 정렬되어 나타나
-- 야 합니다.
select employee_id, last_name, salary
from employees
where (department_id, salary) in (select e.department_id, max(e.salary)
								  from employees e, departments d
								  group by e.department_id)
order by salary desc;

-- 문제. 16
-- 각 업무(job) 별로 연봉(salary)의 총합을 구하고자 한다. 연봉 총합이 가장 높은 업무부터 업무
-- 명(job_title)과 연봉 총합을 조회하시오.
select j.job_title, s.sum_salary
from jobs j, (select job_id, sum(salary) sum_salary
			  from employees
			  group by job_id) s
where j.job_id = s.job_id
order by s.sum_salary desc;

-- 문제. 17
-- 각 업무(job_title)가 어느 부서(department_name)에서 수행되는지 조회하는 SQL 쿼리문을 작성
-- 하세요. 화면 출력은 JOB_TITLE 순으로 출력합니다(단, 수행하지 않는 업무는 표시하지 않고 중
-- 복되는 정보는 하나만 표시합니다.)
select distinct j.job_title, d.department_name
from jobs j, departments d, employees e
where j.job_id = e.job_id
	  and d.department_id = e.department_id
order by j.job_title;

-- 문제. 18
-- 사원이 입사한 연도별 입사자 수를 출력하시오.(입사년도가 빠른 순 출력)
select to_char(hire_date, 'yyyy') "입사 년도", count(*) "입사자 인원"
from employees
group by to_char(hire_date, 'yyyy')
order by to_char(hire_date, 'yyyy');

-- 문제. 19
-- 월 별 입사자 수를 조회하는 SQL 쿼리문을 작성하세요. 월 순으로 정렬하세요.
select to_char(hire_date, 'mm') "입사 월", count(*) "입사자 인원"
from employees
group by to_char(hire_date, 'mm')
order by to_char(hire_date, 'mm');

-- 문제 20
-- 부서 이름(department_name) 별 직원들의 평균연봉(salary) 을 조회하시오.
-- 단, ‘30번’ 부서의 직원 평균 연봉보다 평균 연봉이 이하인 부서 정보만 출력되어야 합니다. 
order by avg(e.salary)
select d.department_name 부서명, avg(e.salary) 평균연봉
from employees e, departments d
where d.department_id = e.department_id
group by d.department_name
having avg(e.salary) <= (select avg(e.salary)
						 from employees e, departments d
						 where d.department_id = e.department_id
						 		and d.department_id = 30)
order by avg(e.salary);

-- 문제 21
-- 1999년 입사한(h i r e _ da t e) 직원들의 사번(employee_id), 이름(first_name), 성
-- (last_name), 부서명(d ep a r t m e n t _ n a m e )을 조회합니다. 이때, 부서에 배치되지 않은 직원의
-- 경우, ‘<NOT ASSIGNED>’로 보여줍니다.
select e.employee_id, e.first_name, e.last_name, nvl(d.department_name, 'NOT ASSIGNED') department_name
from employees e, departments d
where e.department_id = d.department_id(+)
	  and to_char(e.hire_date, 'yyyy') = '1999'
order by e.employee_id;

-- 문제. 22
-- 특정 사원의 사원 번호(employee_id)가 다른 사원의 관리자 번호(manager_id)에 있는 사원인 경
-- 우, 이 사원을 관리자라고 가정합니다. 관리자가 있는 국가(country_name)와 해당 국가에 있는
-- 관리자 수를 국가 이름 순으로 조회하세요.
select c.country_name, count(e.employee_id) cnt
from (select manager_id
	  from employees
	  group by manager_id) m, employees e, departments d, locations l, countries c
where m.manager_id = e.employee_id
	  and e.department_id = d.department_id
	  and d.location_id = l.location_id
	  and l.country_id = c.country_id
group by c.country_name
order by c.country_name;

-- 문제. 23
-- 도시명(city)이 'Southlake'인 지역에 근무하는 직원 중에 연봉을 가장 많이 받는 직원의 사번
-- (employee_id), 이름(first_name), 연봉(salary)을 출력하시오.
select employee_id, first_name, salary
from employees e, departments d, locations l
where e.department_id = d.department_id
	  and d.location_id = l.location_id
	  and l.city = 'Southlake'
	  and salary = (select max(salary)
	  				from employees e, departments d, locations l
	  				where e.department_id = d.department_id
	  					  and d.location_id = l.location_id
	  					  and l.city = 'Southlake'
	  				group by l.city);