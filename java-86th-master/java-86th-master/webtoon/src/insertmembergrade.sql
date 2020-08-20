-- 회원등급 테이블 입력
insert into t86_4_member_grade values (10, '최고관리자');
insert into t86_4_member_grade values (20, '중간관리자');
insert into t86_4_member_grade values (30, '작가');
insert into t86_4_member_grade values (40, '유료회원');
insert into t86_4_member_grade values (50, '무료회원');
insert into t86_4_member_grade values (60, '손님');

-- 장르 테이블 입력
create sequence s86_4_genre;
insert into t86_4_genre 
values (s86_4_genre.nextval, '일상');
insert into t86_4_genre 
values (s86_4_genre.nextval, '개그');
insert into t86_4_genre 
values (s86_4_genre.nextval, '판타지');
insert into t86_4_genre 
values (s86_4_genre.nextval, '액션');
insert into t86_4_genre 
values (s86_4_genre.nextval, '드라마');
insert into t86_4_genre 
values (s86_4_genre.nextval, '순정');
insert into t86_4_genre 
values (s86_4_genre.nextval, '감성');
insert into t86_4_genre 
values (s86_4_genre.nextval, '스릴러');
insert into t86_4_genre 
values (s86_4_genre.nextval, '시대극');
insert into t86_4_genre 
values (s86_4_genre.nextval, '스포츠');

-- 회원 정보 테이블 입력
insert into t86_4_member
values ('admin', 'admin', to_date('01-01-1900','dd-mm-yyyy'), '최고관리자', 3, 'admin@t86group4.com', 10);
insert into t86_4_member
values ('admin01', 'admin01', to_date('01-01-1900','dd-mm-yyyy'), '중간관리자', 3, null, 20);
insert into t86_4_member
values ('khmnim84', 'khmnim84', to_date('22-10-1984','dd-mm-yyyy'), '김희민', 1, 'khmnim84@naver.com', 30);

-- 작가 정보 테이블 입력
insert into t86_4_writer
values ('khmnim84', '기안84');

-- 웹툰 테이블 입력
delete 
create sequence s86_4_webtoon;
insert into t86_4_webtoon values 
(1, 5, 'khmnim84', '수요일', 0, '패션왕 우기명이 돌아왔다!
즐거운 대학 생활?! 과연?!', to_date('10-06-2014','dd-mm-yyyy'), null, '복학왕');
insert into t86_4_webtoon values 
(s86_4_webtoon.nextval, 8, 'khmnim84', '화요일', 0, '820년간의 긴 수면기. 드디어 새로운 세상에 눈을 뜨다.
그리고 새로운 세상의 새로운 사람들을 만나다.', to_date('11-04-2004','dd-mm-yyyy'), null, '노블레스');
insert into t86_4_webtoon values 
(s86_4_webtoon.nextval, 4, 'admin01', '화요일', 0, '자신의 모든 것이었던 소녀를 쫓아 탑에 들어온 소년
그리고 그런 소년을 시험하는 탑', to_date('11-03-2003','dd-mm-yyyy'), null, '신의 탑');

-- 웹툰 서브 테이블 입력
insert into t86_4_webtoon_sub values
(1, '복학왕', 1, '프롤로그', '복학왕 프롤로그 웹툰', to_date('10-06-2014','dd-mm-yyyy'), null, null);
insert into t86_4_webtoon_sub values
(2, '복학왕', 1, '프롤로그', '복학왕 프롤로그 웹툰', to_date('10-06-2014','dd-mm-yyyy'), null, null);
insert into t86_4_webtoon_sub values
(3, '복학왕', 1, '프롤로그', '복학왕 프롤로그 웹툰', to_date('10-06-2014','dd-mm-yyyy'), null, null);
