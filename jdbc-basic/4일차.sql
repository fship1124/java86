-- 시퀀스 : 고유번호 생성기
create sequence s86_board_no;

-- 번호를 추출하기 : s86_board_no.nextval
select s86_board_no.nextval
  from dual;
  
select *
  from t86_board;
  
-- 시퀀스를 이용한 데이터 입력
insert into t86_board(no, title, writer, content)
values(s86_board_no.nextval, 't', 'w', 'c');

-- 서브쿼리를 이용한 데이터 입력
insert into t86_board(no, title, writer, content)
values((select nvl(max(no), 0) + 1 from t86_board), 't', 'w', 'c');

-- 시퀀스 삭제
drop sequence s86_board_no;

select s86_board_no.nextval
  from dual;  
  
-- 테이블 변경 : alter
-- 컬럼 추가, 컬럼 삭제, 컬럼 변경(타입, 크기, default, null)
-- 추가 : add
-- 삭제 : drop
-- 변경 : modify 
-- 컬럼명 변경 : rename column 
-- alter table 테이블명 
-- 작업종류(추가, 삭제, 변경)
   
-- 1. 추가
alter table t86_board
add (view_cnt number default 0);

select * from t86_board;

-- 2. 삭제
alter table t86_board
drop (view_cnt);

select * from t86_board;
  
-- 컬럼명 변경
alter table t86_board
rename column title to title2;

select * from t86_board;
  
alter table t86_board
rename column title2 to title;

-- 컬럼 변경
alter table t86_board
add (view_cnt number(3));

-- 컬럼 크기 변경
-- 크기를 늘리는 것은 제약이 없지만 줄이는 것은 데이터가 없을 경우만 가능
alter table t86_board
modify (view_cnt number(6));

/*
create table t86_board_copy
as
select * from t86_board;

drop table t86_board;

creat ....

insert into t86_board
select * from t86_board_copy;
*/

  