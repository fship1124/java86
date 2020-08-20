-- 1.
create table t86_text (
	text_no number(5) not null,
	title varchar2(500) not null,
	content varchar2(4000) not null,
	user_id varchar2(16),
	reg_time date not null,
	read_count number(5) not null,
	recom_count number(5) not null
)

create table t86_user (
	user_id varchar2(16) not null,
	password varchar2(16) not null,
	email varchar2(60)
)

create table t86_read_recom (
	text_no number(5) not null,
	user_id varchar2(16) not null,
	the_time date not null
);

-- 2.
insert into t86_user(user_id, password, email)
values('root', 'abcd1234', 'root@noname.com');

insert into t86_user(user_id, password, email)
values('user1', 'abcd1234', 'user1@noname.com');

insert into t86_user(user_id, password)
values('user2', 'abcd1234');

insert into t86_user(user_id, password)
values('user3', 'abcd1234');

-- 3.
update t86_user
set password = '12341234'
where user_id = 'user1';

-- 4.
select user_id
from t86_user
where email is null;

-- 5.
update t86_user
set email = 'user3@noname.com'
where user_id = 'user3';

-- 6.
insert into t86_text(text_no, title, content, user_id, reg_time, read_count, recom_count)
values(1, '오늘하루', '할 일 없었다', 'user1', sysdate, 0, 0);

-- 7.
insert into t86_text(text_no, title, content, user_id, reg_time, read_count, recom_count)
values(2, '오늘하루', '할 일 많았다', 'user2', sysdate, 0, 0);

-- 8.
insert into t86_text(text_no, title, content, user_id, reg_time, read_count, recom_count)
values(3, '오늘하루', '할 일이란 과연 무엇일까?', 'user3', sysdate, 0, 0);

-- 9.
update t86_text
set read_count = read_count + 1
where ( select user_id
		from t86_text
		where text_no = 1; ) != 'user3';
-- 9.
update t86_text
set read_count = read_count + 1
where text_no = 1
and 'user3' != (select user_id
               from t86_text
               where text_no = 1);

-- 10.
update t86_text
set read_count = read_count + 1
where text_no = 1
and 'user1' != (select user_id
               from t86_text
               where text_no = 1);

-- 11.
update t86_text
set recom_count = recom_count + 1
where text_no = 1
and 'user2' != (select user_id
               from t86_text
               where text_no = 1)
and (select text_no
     from t86_read_recom
     where text_no = 1
     and user_id = 'user2') is null;
     
insert into t86_read_recom(text_no, user_id, the_time)
values(1, 'user2', sysdate);

-- 12.
update t86_text
set recom_count = recom_count + 1
where text_no = 1
and 'user3' != (select user_id
               from t86_text
               where text_no = 1)
and (select text_no
     from t86_read_recom
     where text_no = 1
     and user_id = 'user3') is null;
     
insert into t86_read_recom(text_no, user_id, the_time)
values(1, 'user3', sysdate);

-- 13.
select *
from t86_text
where trunc(reg_time - sysdate) = 0;

-- 14.
select *
from t86_text
where floor(months_between(reg_time, sysdate)) = 0;

-- 15.
select *
from t86_text
where title like '%오늘%';

-- 16.
select *
from t86_text
where user_id = 'user1';

-- 17.
select *
from t86_text
where content like '%할 일%';
















