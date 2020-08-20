create sequence s86_comment_no;

create table t86_comment (
	comment_no int(20) primary key,
	no int(6) not null,
	content varchar2(200) not null,
	id varchar2(20) not null,
	reg_date datetime default sysdate
);
