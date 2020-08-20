-- 1.t86_text 테이블 생성
create table t86_text(
    text_no		number(5)		not null,
    title		varchar2(500)	not null,
    content		varchar2(4000)	not null,
    user_id		varchar2(16)    ,
    reg_time	date			not null,
    read_count	number(5)		not null,
    recom_count number(5)		not null
);

-- 1.t86_user 테이블 생성
create table t86_user(
    user_id		varchar2(16)	not null,
    password	varchar2(16)	not null,
    email		varchar2(60)
);

-- 1.t86_read_recom 테이블 생성
create table t86_read_recom(
	text_no		number(5)		not null,
	user_id		varchar2(16)	not null,
	the_time	date			not null
);

-- 2.t86_user 데이터 삽입
insert into t86_user
values ('root', 'abcd1234', 'root@noname.com');

insert into t86_user
values ('user1', 'abcd1234', 'user1@noname.com');

insert into t86_user (user_id, password)
values ('user2', 'abcd1234');

insert into t86_user (user_id, password)
values ('user3', 'abcd1234');

-- 3.user1 암호를 12341234 변경
update t86_user
set password = '12341234'
where user_id = 'user1';

-- 4.이메일을 입력하지 않은 사람들의 id 출력
select user_id
from t86_user
where email is null;

-- 5.user3 의 이메일을 user3@noname.com 변경
update t86_user
set email = 'user3@noname.com'
where user_id = 'user3';


select * from t86_user;

-- 6.user1 이 글을 입력
--  제목 : 오늘하루 , 내용 : 할 일 없었다
insert into t86_text (text_no, title, content, user_id, reg_time, read_count, recom_count)
values (1, '오늘하루', '할 일 없었다', 'user1', sysdate, 0, 0);

-- 7.
insert into t86_text (text_no, title, content, user_id, reg_time, read_count, recom_count)
values (2, '오늘하루', '할 일 많았다', 'user2', sysdate, 0, 0);

-- 8.
insert into t86_text (text_no, title, content, user_id, reg_time, read_count, recom_count)
values (3, '오늘하루', '할 일이란 과연 무엇일까', 'user3', sysdate, 0, 0);

-- 9. user3 이 1 번 글을 조회합니다.( 한문장 또는 2 문장으로 작성합니다)
-- 자신이 쓴 글인지 아닌지를 조사합니다. 자신이 쓴 글이 아닌 경우에만 조회수를 1 증가시킵니다.
update t86_text 
set read_count = read_count + 1
where text_no = 1
  and user_id != 'user3';

  
-- 10.user1 이 1 번 글을 조회합니다.( 한문장 또는 2 문장으로 작성합니다)
-- 자신이 쓴 글인지 아닌지를 조사합니다. 자신이 쓴 글이 아닌 경우에만 조회수를 1 증가시킵니다  
update t86_text
set read_count = read_count + 1
where text_no = 1
  and user_id <> 'user1';
  
-- 11. user2 사용자가 1 번 글을 추천합니다.
-- 자신이 쓴 글인지 아닌지를 조사합니다. 자신이 쓴 글은 추천할 수 없습니다.
-- 기존에 추천한 기록이 있는지 조사합니다.
-- 없을 경우 추천 횟수를 증가시키고 추천 기록을 테이블에 입력합니다.

  
  
  
-- 12. user3 사용자가 1 번글을 추천합니다.
-- 자신이 쓴 글인지 아닌지를 조사합니다. 자신이 쓴 글은 추천할 수 없습니다.
-- 기존에 추천한 기록이 있는지 조사합니다.
-- 없을 경우 추천 횟수를 증가시키고 추천 기록을 테이블에 입력합니다.

  
  
-- 13.오늘 작성된 글의 목록만 보여주는 쿼리문을 작성  
select text_no, title
  from t86_text
  where reg_time like sysdate;
  
-- 14.이번달에 작성된 글의 목록만 보여주는 쿼리문을 작성하세요
select *
  from t86_text
  where to_char(reg_time, 'yyyymm') = to_char(sysdate, 'yyyymm');
  
  
-- 15. 제목에 '오늘' 이라는 단어가 들어있는 글의 목록을 보여주는 쿼리문을 작성하세요 
 select *
  from t86_text
  where title like '%오늘%'; 
  
-- 16. user1 이 작성한 글의 목록을 보여주는 쿼리문을 작성  
  select *
  from t86_text
  where user_id = 'user1'; 

-- 17. 내용에 '할일'이라는 단어가 들어있는 글의 목록을 보여주는 쿼리문을 작성
  select *
  from t86_text
  where content like '%할%일%';  
  