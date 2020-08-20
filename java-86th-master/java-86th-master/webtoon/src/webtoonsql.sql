create table t86_4_webtoon(
webtoon_id number(20) primary key,
genre_id number(4) not null,
writer_id varchar2(100) not null,
week_day number(1) not null,
age_limit number(3) not null,
webtoon_summary varchar2(500),
start_date date default sysdate,
end_date date
);

create table t86_4_webtoon_sub(
webtoon_id number(20) not null,
webtoon_title varchar2(100) not null,
webtoon_sub_no number(10) not null,
webtoon_sub_title varchar2(100) not null,
webtoon_sub_content varchar2(100) not null,
reg_date date default sysdate,
recom_count number(10) default 0,
view_count number(10) default 0
);

create table t86_4_member(
member_id varchar2(100) primary key,
member_password varchar2(100) not null,
member_birth_date date not null,
member_name varchar2(100) not null,
member_sex number(1) not null,
member_email varchar2(100) unique,
member_grade_id number(3) not null
);

create table t86_4_writer(
writer_id varchar2(100) primary key,
writer_nickname varchar2(100) unique
);

create table t86_4_genre(
genre_id number(3) primary key,
genre_type varchar(100) unique
);

create table t86_4_member_grade(
member_grade_id number(3) primary key,
member_grade_name varchar(100) unique
);