/*
	미사용 테이블
create table EMPLOYEE (		
	employee_id NUMBER(8) primary key,
	employee_name VARCHAR2(60) not null,
	job_grade VARCHAR2(20) not null,
	start_date DATE not null,
	employee_reg_date DATE default sysdate
)

create table EQUIPMENT(
	equipment_id NUMBER(8) primary key,
	equipment_name VARCHAR2(60) unique,
	ep_id number(8) not null,
	equipment_reg_date DATE default sysdate
)
*/


-- #생성된 테이블 확인
select * from user_tables;

-- #테이블 생성
create table COMPANY (
	company_id NUMBER(8) primary key,
	company_name VARCHAR2(60) not null,
	company_adress VARCHAR2(100) not null,
	company_reg_no	CHAR(10) not null,
	company_type	CHAR(1) not null,
	payment_method	CHAR(1) not null,
	company_reg_date DATE default sysdate
);

create table MATERIAL(
	material_id NUMBER(8) primary key,
	material_name VARCHAR2(100) unique,
	material_type CHAR(1) not null,
	material_cost NUMBER(8) not null,
	material_unit VARCHAR(16) not null,
	meterial_reg_date DATE default sysdate
);

create table WAREHOUSE(
	warehouse_id NUMBER(8) primary key,
	warehouse_name VARCHAR2(60) not null,
	warehouse_type CHAR(1) not null,
	inventory_management_algorism CHAR(1) not null,
	factory_id	NUMBER(8) not null,
	warehouse_reg_date	DATE default sysdate
);

create table FACTORY (
	factory_id NUMBER(8) primary key,
	factory_name VARCHAR2(60) unique,
	factory_adress VARCHAR2(100) not null,
	factory_reg_date DATE default sysdate
);

create table CUSTOMER_ORDER (
	customer_order_id	NUMBER(8) primary key,
	customer_order_name	VARCHAR2(60) unique,
	customer_order_deadline	DATE default sysdate,
	customer_order_reg_date	DATE default sysdate,
	company_id number(8) not null
);

create table PRODUCTION_ORDER (		
	production_order_id	NUMBER(8) primary key,
	production_order_name	VARCHAR2(60) unique,
	material_id	NUMBER(8) not null,
	customer_order_id	NUMBER(8) not null,
	company_id	NUMBER(8) not null,
	production_order_reg_date	DATE default sysdate
);

create table PROCESS (
	process_id NUMBER(8) primary key,
	process_name VARCHAR2(60) unique,
	material_id	NUMBER(8) not null,
	process_reg_date date default sysdate
);

create table EACH_PROCESS(
	ep_id NUMBER(8) primary key,
	ep_name VARCHAR2(60) unique,
	ep_reg_date DATE default sysdate
);

create table RAW_MATERIAL_ORDER(
	raw_material_order_id NUMBER(8) primary key,
	material_id	NUMBER(8) not null,
	raw_material_quantity NUMBER(8) not null,
	company_id	NUMBER(8) not null,
	raw_material_order_reg_date	DATE default sysdate
);

create table ACCOUNT(
	system_authority_id	NUMBER(8) primary key,
	id	VARCHAR2(30) unique,
	password VARCHAR2(30) not null,
	authority CHAR(1) not null
);

create table INVENTORY(
	inventory_id NUMBER(8) primary key,
	warehouse_id NUMBER(8) not null,
	material_id	NUMBER(8) not null,
	material_quantity NUMBER not null
);

create table SHIPMENT(
	SHIPMENT_ID	NUMBER(8) primary key,
	material_id	NUMBER(8) not null,
	cp_warehouse_id	NUMBER(8) not null,
	logistic_warehouse_id NUMBER(8) not null,
	company_id NUMBER(8) not null,
	material_quantity NUMBER not null,
	shipment_reg_date DATE default sysdate
);

create table CODE_MANAGEMENT(
    code_id    NUMBER(8) primary key,
    type_name VARCHAR2(60) NOT NULL,
    type_id    NUMBER(8) not null,
    code_name VARCHAR2(60) not null
);


-- #생성된 테이블 확인
select * from user_tables;



-- #외래키 생성

ALTER TABLE WAREHOUSE
ADD CONSTRAINT factory_id_fk_wh FOREIGN KEY(factory_id)
REFERENCES FACTORY(factory_id);

ALTER TABLE CUSTOMER_ORDER
ADD CONSTRAINT company_id_fk_po FOREIGN KEY(company_id)
REFERENCES COMPANY(company_id);

ALTER TABLE PRODUCTION_ORDER
ADD CONSTRAINT material_id_fk_po FOREIGN KEY(material_id)
REFERENCES MATERIAL(material_id);

ALTER TABLE PRODUCTION_ORDER
ADD CONSTRAINT customer_order_id_fk_po FOREIGN KEY(customer_order_id)
REFERENCES CUSTOMER_ORDER(customer_order_id);

ALTER TABLE PRODUCTION_ORDER
ADD CONSTRAINT company_id_fk_po FOREIGN KEY(company_id)
REFERENCES COMPANY(company_id);

ALTER TABLE PROCESS
ADD CONSTRAINT material_id_fk_pp FOREIGN KEY(material_id)
REFERENCES MATERIAL(material_id);

ALTER TABLE EACH_PROCESS
ADD CONSTRAINT factory_id_fk_epp FOREIGN KEY(factory_id)
REFERENCES FACTORY(factory_id);

ALTER TABLE RAW_MATERIAL_ORDER
ADD CONSTRAINT material_id_fk_rmo FOREIGN KEY(material_id)
REFERENCES MATERIAL(material_id);

ALTER TABLE RAW_MATERIAL_ORDER
ADD CONSTRAINT company_id_fk_rmo FOREIGN KEY(company_id)
REFERENCES COMPANY(company_id);

ALTER TABLE INVENTORY
ADD CONSTRAINT warehouse_id_fk_inven FOREIGN KEY(warehouse_id)
REFERENCES WAREHOUSE(warehouse_id);

ALTER TABLE INVENTORY
ADD CONSTRAINT material_id_fk_inven FOREIGN KEY(material_id)
REFERENCES MATERIAL(material_id);

ALTER TABLE SHIPMENT
ADD CONSTRAINT material_id_fk_ship FOREIGN KEY(material_id)
REFERENCES MATERIAL(material_id);

ALTER TABLE SHIPMENT
ADD CONSTRAINT cp_warehouse_id_fk_ship FOREIGN KEY(cp_warehouse_id)
REFERENCES WAREHOUSE(WAREHOUSE_id);

ALTER TABLE SHIPMENT
ADD CONSTRAINT logistic_warehouse_id_fk_ship FOREIGN KEY(logistic_warehouse_id)
REFERENCES WAREHOUSE(WAREHOUSE_id);

ALTER TABLE SHIPMENT
ADD CONSTRAINT company_id_fk_ship FOREIGN KEY(company_id)
REFERENCES COMPANY(company_id);


-- # 테이블 삭제
DROP TABLE COMPANY;
DROP TABLE MATERIAL;
DROP TABLE WAREHOUSE;
DROP TABLE FACTORY CASCADE CONSTRAINTS;
DROP TABLE CUSTOMER_ORDER;
DROP TABLE PRODUCTION_ORDER;
DROP TABLE PROCESS;
DROP TABLE EACH_PROCESS;
DROP TABLE RAW_MATERIAL_ORDER;
DROP TABLE ACCOUNT;
DROP TABLE INVENTORY;
DROP TABLE SHIPMENT;
DROP TABLE CODE_MANAGEMENT;


-- #시퀀스 번호 생성
CREATE SEQUENCE S_COMPANY_NO;
CREATE SEQUENCE S_MATERIAL_NO;
CREATE SEQUENCE S_WAREHOUSE_NO;
CREATE SEQUENCE S_FACTORY_NO;
CREATE SEQUENCE S_CUSTOMER_ORDER_NO;
CREATE SEQUENCE S_PRODUCTION_ORDER_NO;
CREATE SEQUENCE S_PROCESS_NO;
CREATE SEQUENCE S_EACH_PROCESS_NO;
CREATE SEQUENCE S_RAW_MATERIAL_ORDER_NO;
CREATE SEQUENCE S_ACCOUNT_NO;
CREATE SEQUENCE S_INVENTORY_NO;
CREATE SEQUENCE S_SHIPMENT_NO;
CREATE SEQUENCE S_CODE_MANAGEMENT_NO;

-- # 시퀀스 번호 삭제
DROP SEQUENCE S_COMPANY_NO;
DROP SEQUENCE S_MATERIAL_NO;
DROP SEQUENCE S_WAREHOUSE_NO;
DROP SEQUENCE S_FACTORY_NO;
DROP SEQUENCE S_CUSTOMER_ORDER_NO;
DROP SEQUENCE S_PRODUCTION_ORDER_NO;
DROP SEQUENCE S_PROCESS_NO;
DROP SEQUENCE S_EACH_PROCESS_NO;
DROP SEQUENCE S_RAW_MATERIAL_ORDER_NO;
DROP SEQUENCE S_ACCOUNT_NO;
DROP SEQUENCE S_INVENTORY_NO;
DROP SEQUENCE S_SHIPMENT_NO;
DROP SEQUENCE S_CODE_MANAGEMENT_NO;












 


