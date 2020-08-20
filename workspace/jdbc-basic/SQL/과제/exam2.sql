select * from s_emp;

-- 1. 112, 118부서를 대상으로 과장과 사원의 이름, 직급, 급여, 부서ID를 조회하되, 
-- 급여는 1500 이상 4000 이하인 직원만 출력 
-- 단, 급여가 많은 사람부터 화면에 출력합니다.   =>15명?
select name, title, salary, dept_id
  from s_emp
 where salary between 1500 and 4000
 order by salary desc;

-- 2. 관리자가 없는 직원의 이름, 직급, 급여를 조회
-- => 1명?
select name, title, salary
  from s_emp
 where manager_id is null;
 
-- 3. 직급이 부장이어야 하고 급여는 3000 이상을 받는 직원의 이름, 직급, 급여를 조회
-- => 4명?
select name, title, salary
  from s_emp
 where title like '%부장'
   and salary >= 3000;
   
-- 4. 직급이 부장과 과장인 사람들을 대상을 이름, 직급, 급여를 조회 
-- 단, 부서는 112, 113, 117, 118 부서중에서 조회해야 하며, 
-- 급여는 2300 이상 3000 사이인 직원만 조회  => 2명?
select name, title, salary
  from s_emp
 where dept_id in (112, 113, 117, 118)
   and salary between 2300 and 3000;
   

--5. 직급이 부장 혹은 과장이면서 03월에 입사한 직원의 이름, 직급, 급여, 입사일을 조회
select name, title, salary, start_date
  from s_emp
 where (title like '%부장' or title like '과장') 
   and to_char(start_date, 'mm') = '03';
    
--6. 직원의 연봉에 1000 을 더한 값을 조회하시오. 연봉은 급여에 16을 곱하면 된다.
--단, 연봉은 ALIAS를 지정하여 출력되도록 한다.
select salary, salary * 16 + 1000 as "총 연봉"
  from s_emp;

--7. 출력결과가 다음과 같도록 조회하시오.
--직원 급여
---------------------------------
--박구곤 사장의 급여 5000
--손명성 기획부장의 급여 3000
--이은선 영업부장의 급여 3500
--서의홍 총무부장의 급여 3000
--김심선 인사부장의 급여 3200
select name||' '||title||'의'||' 급여 '|| salary
  from s_emp;

--8. 커미션을 받는 직원과 관리자가 있는 직원을 대상으로 급여를 2500이상 받는 직원만 조회
select *
  from s_emp
 where (commission_pct is not null
    or manager_id is null)
   and salary >= 2500;
  
--9. 각 부서별 월급의 최소값 구하기
select dept_id, min(salary)
  from s_emp
 group by dept_id
 order by dept_id; 
   
--10. 직책별 최소 월급을 구하는데 부장(기획, 영업, 총무, 인사)은 제외하고 구하시오
select title, min(salary)
  from s_emp
 where title not like '%부장' 
 group by title;
 
--11. 직책별 평균 월급 구하기
select title, avg(salary)
  from s_emp
 group by title;
 
select * from  s_emp;

select title, avg(salary)
  from s_emp
 group by case title when '%부장' then '부장'
                     when '사장'  then '사장'
                     when '과장'  then '과장'
                     when '사원'  then '사원'
                     when '영업대표이사'  then '영업대표이사'
         end as title;           
                      
--12. 직책별 인원수 구하기
select title, count(title)
  from s_emp
 group by title; 

--13. 직책별 최대 월급을 구하는데 그 최대 월급이 2000 이상인 것만 출력
select title, max(salary)
  from s_emp
 where salary >= 2000
 group by title;

--14. 직책별 최소 월급을 구하는데 부장(기획, 영업, 총무, 인사)은 제외하고 월급이 높은사람부터 출력
select title, min(salary) 
  from s_emp
 where title not like '%부장'
 group by title
 order by min(salary) desc;

--15. 직책별 평균 월급을 구하는데 사원은 제외하고 월급이 낮은 사람부터 출력하시오
select title, avg(salary)
  from s_emp
 where title != '사원'
 group by title 
 order by avg(salary);

--16. 직책별 토탈 월급을 출력하는데 
--사원은 제외하고 또 그 토탈 월급이 2000 이상인 것만 나오게 하고 
--직책별 토탈 월급을 높은 순으로 출력하시오
select title, sum(salary)
  from s_emp
 where title != '사원'
 group by title 
 having sum(salary) >= 2000
 order by sum(salary);
 
--17. lower, upper, substr, || 연산자를 사용하여 
--각 사원의 메일아이디(mailid)의 첫글자는 대문자 나머지는 소문자로 출력
select mailid, upper(substr(mailid,1,1))||lower(substr(mailid,2))
  from s_emp;
 
--18. 이름의 길이가 2보다 큰 사람들의 이름을 출력
select name
  from s_emp
 where length(name) > 2;
 
--19. 각 사원의 입사한 날부터 지금까지 받은 총급여와 이름을 출력
select name, start_date, salary, to_char((ceil(months_between (sysdate, start_date)) * salary), '9,999,999')  as "입사이후 총급여"
  from s_emp;

 
--20. 각사원의 이름과 커미션을 출력하시오
--단, 커미션이 없는 사원에 대하여 아래와 같은 형식으로 출력하시오
--박구곤 커미션없음
--최정선 10
select name, nvl(commission_pct||'', '커미션없음')
  from s_emp;

 
--21. 각 사원의 원급을 출력하시오
--단, 직책이 사원이면 10% 인상, 과장이면 20% 인상 나머지는 그냥 10% 인상.
select name, title, salary,
       case title when '사원' then (salary * 0.1)+salary
                  when '과장' then (salary * 0.2)+salary
                  else (salary * 0.1)+salary
       end as "인상된 월급" 
  from s_emp;
 
--22. 각사원의 월급을 * 로 표시하시오( * 하나가 100을 표시)
--예> 사원의 월급이 1000 이면 별이 10개 표시
--만약, 월급이 2350이면 23개 표시
--아래와 같이 출력
--박구곤 1200 ************
--손명성 350 ***
select name, salary, rpad('*', salary/100, '*')
  from s_emp;
  

--23번
--<< decode 또는 case 함수 이용하여 풀이하시오 >>
--각 직책별 급여의 합계를 부서별로 구하시오, 단 사원, 과장을 제외한 직책은 기타로 구하시오
   
select dept_id "부서번호",
       to_char(nvl(sum(case title when '사원' then salary end),0), '999,999') as "사원",
       to_char(nvl(sum(case title when '과장' then salary end),0), '999,999') as "과장",
       to_char(nvl(sum(case when (title != '과장') and (title != '사원') then salary end), 0), '999,999') as "기타",
       to_char(sum(salary), '999,999') as "부서합계"
  from s_emp
 group by dept_id
 order by dept_id;


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
   
   
   
   
   
   
   
   
   
  