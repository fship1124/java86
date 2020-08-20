-- 트랜잭션 처리하기
create table t86_tran (
    no number,
    data varchar2(10)
);

select * from t86_tran;

-- commit(데이터베이스에 완전하게 적용 )
-- rollback(이전 커밋위치까지 되돌리기)
-- 데이터에 대한 DML 작업 후 commit 하기 전에는
-- 작업을 진행한 유저만 해당 데이터를 볼 수 있다.

-- 롤락 commit전 수정하고 있는 상태에서 
-- 다른 사용자가 수정하게되면 락으로 해당행을 잡고있다.
-- 이때 commit 하는 순간 동시에 잡고있던 락을 실행시킨다.

-- DDL 문장들은 자동 커밋이 발생한다.

-- 데이터를 수정하고 커밋하기 전에 다른 사용자가
-- 동일한 데이터에 대해서 수정하면 데이터락이 발생해서
-- 커밋전까지 무한 대기상태로 빠진다.

-- rollback 하면 전에 commit한 위치까지 가지만
-- 중간중간 savepoint 를 주면 해당 위치로 돌아감(대용량)
-- rollback시 특정한 지점(savepoint)까지 되돌릴 수 있다.
-- 사용법 : savepoint 이름;
--         rollback to 이름;

-- 자바는 자동컴밋

-- 트랜잭션 단위 : 묶어서 관리 예를들어 계좌 입출금

-- jdbc 트랜잭션 처리 연습 테이블
create table t86_account (
    id varchar2(10),
    money number(9)
);


insert into t86_account values ('hong', 100000);
insert into t86_account values ('kim', 50000);

select * from t86_account;
