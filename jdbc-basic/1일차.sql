select * from tab;

-- 테이블 생성 : CREATE
-- 이름 규칙   : t_이름, 단어가 여러개 이어질 경우 "_"로 구분한다.
--            : tb_이름, tc_이름, th_이름....
--            : t기수번호_테이블명 
-- CLOB : 4g
-- BLOB : 4g
create table t86_board (
	no number(6),
	title varchar2(300),
	writer varchar2(30),
	content varchar2(4000),
	reg_date date
);

-- 테이블 구조 확인하기
desc t86_board;

-- 테이블 삭제하기
drop table t86_board;

-- 데이터 입력
insert into t86_board values(1, 'title1', 'w1', '내용1', sysdate);

-- 데이터 자르기
truncate table t86_board;

-- 데이터 삭제 : delete, truncate, drop
/*
 	  drop     :  데이터 + 구조
      truncate :  데이터, 삭제된 데이터 복구 불가
      delete   :  데이터, 삭제된 데이터 복구 가능 
 */
rename t86_board to t86_board_back;

-- 테이블 제약조건 설정
/*
 *  1. primary key    :   값이 고유하고 반드시 입력되어야 함
 *                        ( unique + not null )
 *  2. unique         :   값이 고유하다
 *  3. not null       :   반드시 입력되어야 함
 *  4. check          :   값에 대한 제약
 *  5. foreign key    :   값이 다른 테이블의 값을 참조
 */

-- 제약조건 설정 전 테이블 삭제
drop table t86_board;

create table t86_board (
	no number(6) primary key,
	title varchar2(300) not null,
	writer varchar2(30) not null,
	content varchar2(4000) not null,
	reg_date date default sysdate
);

-- 데이터 입력
insert into t86_board(no, title, writer, content, reg_date)
values(1, '연습', '홍길동', 'sQL 첫번째날...', sysdate);

-- 입력시 오류 발생함 : no는 pk 컬럼이기 때문에 동일값 입력이 불가능
insert into t86_board(no, title, writer, content, reg_date)
values(1, '연습2', '홍길동2', 'sQL 첫번째날...2', sysdate);

-- 값의 수가 충분하지 않습니다 : 오류발생
insert into t86_board(no, title, writer, content, reg_date)
values(2, '연습2', '홍길동2', 'sQL 첫번째날...2');

-- default 확인 : reg_date
insert into t86_board(no, title, writer, content)
values(2, '연습2', '홍길동2', 'sQL 첫번째날...2');

-- not null 제약 확인 :  
-- ORA-01400 : NULL을 ("HR"."T86_BOARD"."CONTENT") 안에 삽입할 수 없습니다
insert into t86_board(no, title, writer)
values(3, '연습2', '홍길동2');

-- 권장하지 않는다 ::: 전체 데이터 입력시...
insert into t86_board
values(3, '연습3', '홍길동3', 'sQL 첫번째날...3', sysdate);

-- 데이터 수정 : update (기존 변경)
update t86_board
   set title = '변경',
       content = '내용 수정함';
   
-- 특정 데이터 수정 : where 조건절
update t86_board
   set title = '제목변경',
       content = 'where 사용'
 where no = 3;       

-- 글번호가 3번보다 작은 게시글의 내용을 조회
select *
  from t86_board
 where no < 3;

-- 글번호가 3번보다 작은 게시글의 내용을 조회
-- 단, 조회시 글번호와 글쓴이만 조회
select no, writer
  from t86_board
 where no < 3;


-- delete : 데이터 삭제
 delete 
   from t86_board;

-- 3번 게시글 삭제
 delete 
   from t86_board
  where no = 3; 

-- Employees, Departments
-- 구조 파악하기


-- 사원의 사번과 이름, 입사일 출력
select employee_id, last_name, hire_date
  from employees;
  
-- alias(별칭) 사용하기  
select employee_id as eid, 
       last_name name, hire_date hdate
  from employees;  

-- alias 주의 사항 : 공백 또는 대소문자 구분, 특수문자 이용시에는
--                  ""로 묶는다.  
select last_name 사원의 이름
  from employees;
  
select last_name "사원의 이름"
  from employees;  
  
-- select 산술연산자 사용
-- 연봉 : 급여 * 15
select salary 급여, salary * 15 연봉 
  from employees
  
-- 합성연산자 : ||
-- 사원명 : 홍길동
select '사원명 : ' || last_name
  from employees;

-- Q> 사원의 정보를 아래의 형식에 맞게 출력하시오
--    급여 > salary, 이름 > last_name
--    100번 사원의 이름은 King 이고, 급여는 24000000입니다.  
--    employee_id        last_name        salary * 1000
select employee_id || '번 사원의 이름은' || last_name || 
       ' 이고, 급여는 ' || salary * 1000 || '입니다.'
       as "사원의 정보"
  from employees;
  
-- 비교연산자
-- 사원의 급여가 10000이상인 사원의 정보를 출력하시오  
select *
  from employees
 where salary >= 10000;
 
-- 사원의 정보를 출력합니다. 단, 100번 부서가 아닌 사원들만 
-- 출력하시오 
select *  
  from employees
 where department_id != 100; 
  
-- 사원의 부서가 90번 이거나 또는 100번인 사원의 정보를 출력
select *
  from employees
 where department_id = 90
    or department_id = 100;
    
-- 사원의 부서가 90번 이면서 급여가 10000 이하인 사원의 정보 출력    
select *
  from employees  
 where department_id = 90
   and salary <= 10000;
   
-- 사원의 부서 번호가 90번 또는 100번인 사원중에서
-- 급여가 10000이하인 사원의 정보를 출력  
-- 연산자 우선순위 문제 발생....  
select *
  from employees 
 where department_id = 90
    or department_id = 100
   and salary <= 10000; 
  
  
select *
  from employees 
 where (department_id = 90 or department_id = 100)
   and salary <= 10000;    
  
   
-- SQL 연산자
-- 사원의 급여가 10000이상 15000이하인 사원의 정보를 출력
select
  from employees
 where salary >= 10000
   and salary <= 15000;
   
select
  from employees
 where salary between 10000 
                  and 15000;
                  
                  
-- 사원의 부서가 50번, 70번, 90번, 100번 중에 
-- 포함된 사원의 정보를 출력 
select *  
  from employees
 where (department_id = 50
    or department_id = 70
    or department_id = 90
    or department_id = 100);

-- IN 연산자
select *  
  from employees
 where department_id in (50, 70, 90, 100);
  
-- Like 연산자 : %(0개 이상 문자), _(한개 문자)
-- 이름 : last_name
-- 사원의 이름이 'L'로 시작하는 사원 정보 출력
select *
  from employees
 where last_name like 'L%';

-- 이름이 4자인 사원의 정보 출력 
select *
  from employees
 where last_name like '____';   
  
-- 이메일이 D로 시작하고 T로 끝나는 사원의 정보 
select *
  from employees
 where email like 'D%T';   
    
-- 이름에 D 가 포함되는 사원의 정보를 출력  
select *
  from employees
 where last_name like '%D%';   
 
-- 이름이 'King' 인 사원의 정보를 출력
select *
  from employees
 where last_name = 'King';
 
-- null 에 대한 개념 
-- null 은 미정의 값이다.(무한대...)
-- null과의 산술연산은 null을 반환한다.
-- null + 100
-- null과의 비교연산은 false를 반환한다.
-- null > 100

-- IS null : 널값 비교 연산 
-- 커미션을 받지 않는 사원의 정보를 출력
select *
  from employees
 where commission_pct = null; 
 
select *
  from employees
 where commission_pct is null; 
 
-- 커미션을 받는 사람만 출력
select *
  from employees
 where commission_pct is not null;  
 
-- 사원의 연봉을 화면에 출력합니다.
-- 단, 연봉은 salary * 15 + salary * commission_pct 
select salary * 15 + salary * commission_pct
  from employees;
 
select salary * 15 + salary * nvl(commission_pct, 0)
  from employees;
 
-- 사원의 정보 중에서 이름과 커미션을 출력한다.
-- 단, 커미션이 널인 경우 0으로 출력한다.  
select last_name, nvl(commission_pct, 0)
  from employees;
  

-- 사원의 정보 중에서 이름과 커미션을 출력한다.
-- 단, 커미션이 널인 경우 '커미션 없음'으로 출력한다.  
select last_name, nvl(commission_pct || '', 0)
  from employees;  
  
-- 사원의 급여 순으로 출력
select last_name, salary
  from employees
 order by salary;
 
select last_name, salary
  from employees
 order by salary desc;

-- 권장하지 않음
select last_name, salary
  from employees
 order by 2 desc;
 
-- 컬럼의 Alias 사용 가능함 
-- 연봉 순으로 정렬(desc)
select last_name, 
       salary * 15 + salary * nvl(commission_pct, 0) as year_sal
  from employees
 order by year_sal desc;
 
-- 사원의 정보(부서번호, 사원명)를 출력하시오 
-- 단, 부서번호 순으로 출력
select department_id, last_name
  from employees
 order by department_id; 
 
-- 사원의 정보(부서번호, 사원명)를 출력하시오 
-- 단, 부서번호 순으로 출력, 부서번호가 같을 경우 사원명으로 정렬
select department_id, last_name
  from employees
 order by department_id, last_name; 
  
-- 사원이 소속된 부서의 번호
-- 중복된 정보 제거
select department_id
  from employees;

select distinct department_id
  from employees;
 
 
 
  
  
  
  
  
 