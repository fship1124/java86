-- Group By : 데이터의 소그룹화
-- 그룹 함수(통계에 많이 쓰임): count(컬럼|표현식), max(..), min(..), sum(..), 
--                              avg(..)
-- 사원의 총 수를 출력하시오
select employee_id
  from employees;
 
select count(employee_id)
  from employees;

-- 사원중에서 가장 많은 급여를 출력
select max(salary)
  from employees;
  
select min(salary), sum(salary), avg(salary)
  from employees;

 /*
  * 어떤 집합 접근?? (테이블...)      사원들
  * 어떤 조건 인지??                  10번 부서의 사원
  * 화면에 출력은 누구??              가장 많은 급여가 얼마인지 출력
  */
-- 10번 부서의 사원들의 급여중에서 가장 많은 급여가 얼마인지 출력
select max(salary)  
  from employees
 where department_id = 10; 
 
-- 10번 부서와 20번 부서의 사원들의 급여중에서
-- 부서별 가장 많은 급여가 얼마인지 출력 
select max(salary)
  from employees
 where department_id in (10, 20)
 group by department_id;
 
-- 그룹핑 원리 이해....
create table t86_group (
	id varchar2(3),
	sal number,
	job_id varchar2(2),
	dept_id number
); 

insert into t86_group values('a', 1000, 'SA', 10);
insert into t86_group values('b', 2000, 'CM', 30);
insert into t86_group values('c', 3000, 'CM', 20);
insert into t86_group values('d', 4000, 'LA', 10);
insert into t86_group values('e', 3000, 'SA', 30);
insert into t86_group values('f', 2000, 'SA', 10);
 
select * from t86_group; 
 
select dept_id, max(sal)
  from t86_group
 group by dept_id;
 
select dept_id, job_id, max(sal)
  from t86_group
 group by dept_id, job_id; 
 
 -- 그룹 함수와 같이 select 절에 출력하려는 컬럼은 그룹핑 되어야 한다.
 -- 오류 발생 : job_id 때문.
select dept_id, job_id, max(sal)
  from t86_group
 group by dept_id;
 
 -- 각 부서별 최대 급여를 출력하라. 
 -- 출력시 최대급여, 부서번호, 사원의 이름을 출력
 -- 오류 발생
 select max(salary), department_id, last_name
   from employees
  group by department_id;
 
 -- 각 부서별 부서번호, 사원수를 출력하시오
 select department_id, count(employee_id)
   from employees
  group by department_id;
  
 -- 각 부서별 최대급여를 출력합니다.
 -- 단, 최대급여가 높은 부서부터 출력 
 select department_id, max(salary) max_sal
  from employees
 group by department_id 
 order by max_sal desc;
  
-- 부서별 평균 급여를 출력합니다.
-- 단, 100번보다 큰 부서는 제외하고 부서의 평균 급여가
-- 5000 이상인 부서만 출력합니다.
-- 출력은 부서번호 순으로 : 오류
select department_id, avg(salary) avg_sal
  from employees
 where department_id <= 100 
   and avg(salary) >= 5000
 group by department_id 
 order by department_id;
 
 -- 그룹함수에 대한 제약은 having 절에서 처리한다.
 -- where 절에서는 허용되지 않기 때문에 오류가 발생한다.
 select department_id, avg(salary) avg_sal
  from employees
 where department_id <= 100 
 group by department_id 
having avg(salary) >= 5000
 order by department_id;
 -- 실행절 순서 : FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY
 
 
 --------------------------------------------------------------------------
 -- 함수 
 --------------------------------------------------------------------------
-- 소문자로 변환 : lower(변환대상 컬럼)
 select last_name, lower(last_name)
   from employees;
   
-- 대문자로 변환 : upper(변환대상 컬럼)
 select last_name, upper(last_name)
   from employees; 
   
-- 문자열 결합   
 select last_name, first_name, concat(last_name, first_name)
   from employees;
   
 select last_name, first_name, 
        concat(upper(last_name), first_name)
   from employees;
 
-- 문자열 가져오기 : substr(문자열, 스타트위치, 문자길이)   
 select last_name, 
        substr(last_name, 1, 2), substr(last_name, 3, 2)
        substr('19991010', 1, 4) as birth_year
        substr('19991010', 5, 2) as birth_month
   from employees;

 -- length, trim(, lpad(왼쪽 자리수 변경), rpad(오른쪽 자리수 변경)
 select last_name,
        length (last_name),
        trim('A' from last_name),
        lpad(last_name, 10, '*'),
        rpad(last_name, 10, '*')
    from employees;
  
 -- translate(문자열1, 문자열2, 문자열3) :문자열1중에 문자열2를 문자열3으로 교체한다. 단, 문자열2를 한자리씩 비교하여 변경 
 -- replace(문자열1, 문자열2, 문자열3) : 문자열1에서 문자열2를 찾아서 문자열3로 교체한다. 문자열3가 생략되면 문자열2가 제거 - 단어
 select last_name,
        translate (last_name, 'Ab', 'uk'),            --한단어씩
        replace (last_name, 'Ab', 'uk')               --특정단어
    from employees;       
 
 
 -- 
 select 'a'
   from employees
  where department_id = 10;   
 
 --ceil, floor, abs
 -- sign : 음수냐 양수냐 따질때 사용
 select ceil(1.1), floor(1.1), abs(-99),
        sign(-12), sign(0), sign(15)              
   from dual;
 
 -- round:     반올림,   소수 2자리유지,  10단위만 출력(음수는 소숫점앞으로), 100단위만 출력
    trunc: 절사(버림)
 select round(73.737), round(73.737, 2),  round(73.737, -1),                  round(73.737, -2),         
        trunc(73.737), trunc(73.737, 2),  trunc(73.737, -1),                  trunc(73.737, -2)        
   from dual;   

-- 날짜 함수
select sysdate, add_months(sysdate, 1)
  from dual;
  
-- 각 사원의 장기 휴가는 10년째 입사일로부터 10년째 되는 날에 발생한다.
-- 각 사원의 장기 휴가일이 언제 발생하는지 화면에 출력하시오.
select hire_date, add_months(hire_date, 10 * 12) as vacation
  from employees;

-- 각 사원의 근무개월을 출력하시오
select last_name, months_between(sysdate, hire_date) 
  from employees;  

-- 현재 날짜를 포함한 달의 마지막 날  
select last_day( sysdate )
  from dual;
  
-- 날짜 + 숫자 -> 날짜
-- 날짜 - 날짜 -> 숫자 
-- 현재날짜에서 일주일후, 일주일전 날짜값 계산  
select sysdate, sysdate + 7, sysdate -7, sysdate + 1 / 24
  from dual;
 
-- 각 사원의 근무 일수를 출력
select sysdate, round(sysdate - hire_date) as "근무일수"
  from employees;
  
-- 변환형 함수 ::: format(날짜 -> 문자), parse(문자 -> 날짜)
-- to_char   : 날짜 -> 문자, 숫자 -> 문자
-- to_date   : 문자 -> 날짜
-- to_number : 문자 -> 숫자

select to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss')
  from dual; 
  
select to_date('20160721', 'yyyymmdd')
  from dual; 
  
  
-- 변환형 함수에서 
-- 날짜형식이 부적합함 오류
select to_char(sysdate, 'yyyy년 mm월')   
  from dual;  
  
select to_char(sysdate, 'yyyy"년" mm"월"')   
  from dual;  

select to_char(1000000000),  
       to_char(1000000000, '9,999,999,999'),
       to_char(10000000000, '9,999,999,999')      -- 자릿수 동일하게 하지 않으면 오류
  from dual;  

  
select to_number('900000'),
       to_number('900,000', '999,999') 
  from dual; 
  
-- 사원중에서 5월에 입사한 사원들의 정보만 출력하시오  
select last_name, hire_date
  from employees
 where to_char(hire_date, 'mm') = '05';
  
-- 현재 월과 동일한 월에 입사한 사원의 정보를 출력하시오
select last_name, hire_date
  from employees
 where to_char(sysdate, 'mm') = to_char(hire_date, 'mm');
  
-- 기타함수 : decode, case, 일반적으로 통계 쿼리에 많이 사용됨...  
/* decode 와 String 비슷
 * 	String job_id = ...
 * 	switch (job_id) {
 *    case 'IT_PROG' :
 *    sysout....
 *    case 'SA_MAN' :
 *    sysout....
 *    default 
 */ 
--  decode : (표현식, 기준1, 값1, 기준2, 값2)
디폴트값
select decode(job_id, 'IT_PROG', '위대한 개발자'
                    , 'SA_MAN' , '말잘하는 영업맨'
                    , '평범한 직원')
       as job_type
  from employees;

  
select job_id
  from employees;
  
 -- case 절 : case when then end 
select case job_id when 'IT_PROG' then '위대한 개발자'
                   when 'SA_MAN' then '말잘하는 영업맨'
                   else '평범한 직원'
       end as job_type
  from employees;
  
 -- case 절 : case  when(조건이 같다일경우에는 when절에 조건을 둔다) then end   
select case when job_id = 'IT_PROG' then '위대한 개발자'
            when job_id = 'SA_MAN' then '말잘하는 영업맨'
                   else '평범한 직원'
       end as job_type
  from employees;  
  
-- 사원의 급여에 따라서 다음과 같이 출력하는 쿼리 작성
-- 급여가 10000 이상일 경우 "우후..."
-- 급여가 5000 이상일 경우 "아이..."
-- 급여가 5000 미만일 경우 "에이..."
select case when salary >= 10000 then '우후...'
            when salary >= 5000  then '아이...'
            else '에이...'
       end as salare_msg
  from employees;
  
-----------------------------------------------
-- 조인
-----------------------------------------------
-- 결과행의 수 : M X N,
--카테시안 프로덕트(Cartesian Product)  
select employees.employee_id, employees.department_id, 
       departments.department_name
  from employees, departments;
   
select employees.last_name, employees.department_id, 
       departments.department_name
  from employees , departments 
where  employees.department_id =  departments.department_id;

-- 테이블 Alias 사용 : from 절에 선언. 또한 컬럼 과 달리 as 사용 불가
-- 실행순서가 from -> where -> select
select e.last_name, e.department_id, 
       d.department_name
  from employees e, departments d 
where  e.department_id =  d.department_id;

-- 테이블명 생략 : 양쪽 테이블 연결 컬럼은 테이블명 생략 불가
-- 알아보기 힘드므로 비추천
select last_name, e.department_id, 
       department_name
  from employees e, departments d 
where  e.department_id =  d.department_id;

select *
 from departments
 
select * from tab; 
   
select * from locations;   
  
select e.last_name, d.department_name, l.city
  from employees e, departments d , locations l
 where e.department_id = d.department_id 
   and d.location_id = l.location_id;

-- Canada에 근무하는 사원의 지역명, 부서명, 사원명 출력하시오
select *
 from locations;  --지역명
 
select *
 from countries;  --나라명
 
select *
 from departments;  --부서명 

 select *
 from employees;  --사원명
 
select  d.department_name, e.last_name, c.country_name
  from employees e, departments d, locations l, countries c
 where e.department_id = d.department_id
   and d.location_id = l.location_id
   and l.country_id = c.country_id
   and c.country_name = 'Canada';
   
 select * from tab;  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 commit;  
 desc employees;
 select * from tab;
 select * from employees;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 