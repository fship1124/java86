
-- # 데이터 삭제
DELETE FROM COMPANY;
DELETE FROM MATERIAL;
DELETE FROM WAREHOUSE;
DELETE FROM FACTORY;
DELETE FROM CUSTOMER_ORDER;
DELETE FROM PRODUCTION_ORDER;
DELETE FROM PROCESS;
DELETE FROM EACH_PROCESS;
DELETE FROM RAW_MATERIAL_ORDER;
DELETE FROM ACCOUNT;
DELETE FROM INVENTORY;
DELETE FROM SHIPMENT;
DELETE FROM CODE_MANAGEMENT;


-- COMPANY TABLE
insert into COMPANY    (company_id, company_name, company_adress, company_reg_no, company_type, payment_method) 
values (S_COMPANY_NO.NEXTVAL, '에이스 침대', '경기도 용인시', '1111111111', '0', '0');
insert into COMPANY    (company_id, company_name, company_adress, company_reg_no, company_type, payment_method) 
values (S_COMPANY_NO.NEXTVAL, '이케아', '경기도 수원시', '1111111112', '0', '0');
insert into COMPANY    (company_id, company_name, company_adress, company_reg_no, company_type, payment_method) 
values (S_COMPANY_NO.NEXTVAL, '목재 회사', '충청남도 아산시', '1111111113', '1', '1');
insert into COMPANY    (company_id, company_name, company_adress, company_reg_no, company_type, payment_method) 
values (S_COMPANY_NO.NEXTVAL, '못 회사', '충청남도 아산시', '1111111114', '1', '1');
insert into COMPANY    (company_id, company_name, company_adress, company_reg_no, company_type, payment_method) 
values (S_COMPANY_NO.NEXTVAL, '니스 회사', '충청북도 청주시', '1111111115', '1', '1');
insert into COMPANY    (company_id, company_name, company_adress, company_reg_no, company_type, payment_method) 
values (S_COMPANY_NO.NEXTVAL, '포장지 회사', '충청북도 청주시', '1111111116', '1', '1');


-- MATERIAL TABLE
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '포장된 테이블', '1', '100000', 'pcs');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '니스칠한 테이블', '2', '80000', 'pcs');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '조립 테이블', '2', '50000', 'pcs');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '테이블 원판', '2', '10000', 'pcs');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '테이블 다리', '2', '2000', 'pcs');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '목재', '3', '5000', 'pcs');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '니스', '4', '1000', 'ml');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '못', '4', '100', 'pcs');
insert into MATERIAL (material_id, material_name, material_type, material_cost, material_unit) 
values (S_MATERIAL_NO.NEXTVAL, '포장지', '4', '100', 'mm');


-- FACTORY TABLE
insert into FACTORY (factory_id, factory_name, factory_adress) 
values (S_FACTORY_NO.NEXTVAL, '수원 테이블 공장', '경기도 수원시 팔달구');
insert into FACTORY (factory_id, factory_name, factory_adress) 
values (S_FACTORY_NO.NEXTVAL, '용인 조명 공장', '경기도 용인시 처인구');


-- WAREHOUSE TABLE
insert into WAREHOUSE (warehouse_id, warehouse_name, warehouse_type, inventory_management_algorism, factory_id) 
values (S_WAREHOUSE_NO.NEXTVAL, '원자재 창고', '1', '0', '1');
insert into WAREHOUSE (warehouse_id, warehouse_name, warehouse_type, inventory_management_algorism, factory_id) 
values (S_WAREHOUSE_NO.NEXTVAL, '부자재 창고', '2', '0', '1');
insert into WAREHOUSE (warehouse_id, warehouse_name, warehouse_type, inventory_management_algorism, factory_id) 
values (S_WAREHOUSE_NO.NEXTVAL, '완제품 창고', '3', '0', '1');
insert into WAREHOUSE (warehouse_id, warehouse_name, warehouse_type, inventory_management_algorism, factory_id) 
values (S_WAREHOUSE_NO.NEXTVAL, '물류 창고', '4', '0', '1');


-- CUSTOMER_ORDER TABLE
insert into CUSTOMER_ORDER (customer_order_id, customer_order_name, company_id, customer_order_deadline) 
values (S_CUSTOMER_ORDER_NO.NEXTVAL, '테이블 100개 주문', '1', to_date('2002-09-05', 'yyyy-mm-dd'));
insert into CUSTOMER_ORDER (customer_order_id, customer_order_name, company_id, customer_order_deadline) 
values (S_CUSTOMER_ORDER_NO.NEXTVAL, '테이블 500개 주문', '2', to_date('2016-04-20', 'yyyy-mm-dd'));


-- PRODUCTION_ORDER TABLE
insert into PRODUCTION_ORDER (production_order_id, production_order_name, material_id, customer_order_id, company_id) 
values (S_PRODUCTION_ORDER_NO.NEXTVAL, '테이블 100개 생산 주문', '1', '1', '1');
insert into PRODUCTION_ORDER (production_order_id, production_order_name, material_id, customer_order_id, company_id) 
values (S_PRODUCTION_ORDER_NO.NEXTVAL, '테이블 500개 생산 주문', '1', '2', '2');



-- PROCESS TABLE
insert into PROCESS (process_id, process_name, material_id) 
values (S_PROCESS_NO.NEXTVAL, '테이블 100개 생산 공정', '1');
insert into PROCESS (process_id, process_name, material_id) 
values (S_PROCESS_NO.NEXTVAL, '테이블 500개 생산 공정', '1');


-- EACH_PROCESS TABLE
insert into EACH_PROCESS (ep_id, ep_name) 
values (S_EACH_PROCESS_NO.NEXTVAL, '포장 공정');
insert into EACH_PROCESS (ep_id, ep_name) 
values (S_EACH_PROCESS_NO.NEXTVAL, '니스칠 공정');
insert into EACH_PROCESS (ep_id, ep_name) 
values (S_EACH_PROCESS_NO.NEXTVAL, '못박는 공정');
insert into EACH_PROCESS (ep_id, ep_name) 
values (S_EACH_PROCESS_NO.NEXTVAL, '목재 재단 공정');

-- RAW_MATERIAL_ORDER TABLE
insert into RAW_MATERIAL_ORDER (raw_material_order_id, material_id, raw_material_quantity, company_id) 
values (S_RAW_MATERIAL_ORDER_NO.NEXTVAL, '6', '1000', '3');
insert into RAW_MATERIAL_ORDER (raw_material_order_id, material_id, raw_material_quantity, company_id) 
values (S_RAW_MATERIAL_ORDER_NO.NEXTVAL, '8', '1000', '4');
insert into RAW_MATERIAL_ORDER (raw_material_order_id, material_id, raw_material_quantity, company_id) 
values (S_RAW_MATERIAL_ORDER_NO.NEXTVAL, '7', '1000', '5');
insert into RAW_MATERIAL_ORDER (raw_material_order_id, material_id, raw_material_quantity, company_id) 
values (S_RAW_MATERIAL_ORDER_NO.NEXTVAL, '9', '1000', '6');


-- ACCOUNT TABLE
insert into ACCOUNT (system_authority_id, id, password, authority) 
values (S_ACCOUNT_NO.NEXTVAL, 'a', '1', '0');
insert into ACCOUNT (system_authority_id, id, password, authority) 
values (S_ACCOUNT_NO.NEXTVAL, 'admin', '1', '1');


-- INVENTORY TABLE
insert into INVENTORY (inventory_id, warehouse_id, material_id, material_quantity) 
values (S_INVENTORY_NO.NEXTVAL, '1', '6', '0');
insert into INVENTORY (inventory_id, warehouse_id, material_id, material_quantity) 
values (S_INVENTORY_NO.NEXTVAL, '1', '8', '1000');
insert into INVENTORY (inventory_id, warehouse_id, material_id, material_quantity) 
values (S_INVENTORY_NO.NEXTVAL, '1', '7', '1000');
insert into INVENTORY (inventory_id, warehouse_id, material_id, material_quantity) 
values (S_INVENTORY_NO.NEXTVAL, '1', '9', '1000');


-- SHIPMENT TABLE
insert into SHIPMENT (SHIPMENT_ID, material_id, cp_warehouse_id, logistic_warehouse_id, company_id, material_quantity) 
values (S_SHIPMENT_NO.NEXTVAL, '1', '3', '4', '1', '100');
insert into SHIPMENT (SHIPMENT_ID, material_id, cp_warehouse_id, logistic_warehouse_id, company_id, material_quantity) 
values (S_SHIPMENT_NO.NEXTVAL, '1', '3', '4', '2', '500');


-- CODE_MANAGEMENT TABLE

insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'ordertype', '0', '발주');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'ordertype', '1', '수주');

insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'product', '1', '완제품');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'product', '2', '중간재');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'product', '3', '원자재');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'product', '4', '부자재');

insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'algorithm', '0', 'FIFO');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'algorithm', '1', 'LIFO');

insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'storage', '1', '완제품 저장');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'storage', '2', '원자재 저장');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'storage', '3', '부자재 저장');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'storage', '4', '완제품 출하');

insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'payment', '0', '전신송금방식 T/T');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'payment', '1', '기한부신용장 L/C');

insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'authority', '0', '작업자');
insert into CODE_MANAGEMENT (code_id, type_name, type_id, code_name) 
values (S_CODE_MANAGEMENT_NO.NEXTVAL, 'authority', '1', '관리자');



