-- 1.
select name, title, salary, dept_id
  from s_emp
 where dept_id in (112, 118)
	   and salary between 1500 and 4000
 order by salary desc;

-- 2.
select name, title, salary
  from s_emp
 where manager_id is null;

-- 3.
select name, title, salary
  from s_emp
 where title like '%부장'
	   and salary >= 3000;
	   
-- 4.
select name, title, salary
  from s_emp
 where (title like '%부장' or title like '%과장')
	   and dept_id in (112, 113, 117, 118)
	   and salary between 2300 and 3000;

-- 5.
select name, title, salary, start_date
  from s_emp
 where (title like '%부장' or title like '%과장')
 	   and to_char(start_date, 'mm') = '03';
 	   
-- 6.
select (salary * 16) + 1000 as "salary + 1000"
  from s_emp;
  
-- 7.
select name || ' ' || title || '의 급여 ' || salary
  from s_emp;

-- 8.
select *
from s_emp
where commission_pct is not null
	  and manager_id is not null
	  and salary >= 2500;
	  
-- 9.
select dept_id, min(salary) salary_min
from s_emp
group by dept_id
order by dept_id;

-- 10.
select title, min(salary) salary_min
from s_emp
where title not like '%부장'
group by title;

-- 11.
select title, avg(salary) salary_avg
from s_emp
group by title;

-- 12.
select title, count(*) count_emp
from s_emp
group by title;

-- 13.
select title, max(salary) salary_max
from s_emp
group by title
having max(salary) >= 2000;

--14.
select title, min(salary) salary_min
from s_emp
where title not like '%부장'
group by title
order by min(salary) desc;

-- 15.
select title, avg(salary) salary_avg
from s_emp
where title not like '사원'
group by title
order by min(salary);

-- 16.
select title, sum(salary) salary_sum
from s_emp
where title not like '사원'
group by title
having sum(salary) >= 2000
order by sum(salary) desc;

-- 17.
select upper(substr(mailid, 1, 1)) || lower(substr(mailid, 2)) as mailid
from s_emp;

-- 18.
select name
from s_emp
where length(name) > 2;

-- 19.
select trunc(months_between(sysdate, start_date)) * salary as all_salary, name
from s_emp;

-- 20.
select name, nvl(commission_pct||'', '커미션없음') as commission_pct
from s_emp;

-- 21.
select name, salary, 
	   case when title like '사원' then salary * 1.1
			when title like '과장' then salary * 1.2
			else salary * 1.1
	   end as new_salary
from s_emp;

-- 22.
select name, rpad(salary, trunc(salary/100) + length(salary), '*') as salary
from s_emp;

-- 23.
select dept_id as 부서번호,
	   nvl(sum(case when title = '사원' then salary end), 0) as "사원",
	   nvl(sum(case when title = '과장' then salary end), 0) as "과장",
	   nvl(sum(case when title != '사원' and title != '과장' then salary end), 0) as "직책",
	   sum(salary) as 부서합계
from s_emp
group by dept_id
order by dept_id;