create table t86_jun2 (
	name 		varchar2 (40) not null,     -user_name
	id			varchar2 (40) primary key,  -user_id
	password	varchar2 (16) not null,
	year		number (4) not null,    -- 생일에대한 년인지 컴럼명 수정
	month		number (2) not null,    -- 생일에대한 월인지 컴럼명 수정
	date		number (2) not null,    -- 컬럼명이 date 수정
	sex			varchar2 (6) not null,    -- true, flase 값으로 준다
	post_no1	number (3) not null,
	post_no2	number (3) not null,
	home_addr_main	varchar2 (200) not null,
	home_addr_sub	varchar2 (100) not null,
	home_tel	varchar2 (13) not null,   --home_tel_no
	email_id	varchar2 (40) not null,
	email_domain varchar2 (40) not null,
	mobile_phone	varchar2 (13),
	company_tel	varchar2 (13),
	company_post_no1	number (3),
	company_post_no2	number (3),
	company_addr		varchar2 (300)
	--가입일추가
	--탈퇴일, 여부, 사유
	
	--table 명이 33자 제한있음
);