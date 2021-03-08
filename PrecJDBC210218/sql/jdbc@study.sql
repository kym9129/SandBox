--study 계정 생성
create user study
identified by study
default tablespace users;

--접속권한부여/객체생성 권한 부여
grant connect to study;
grant resource to study;

--stock 테이블 생성
create table stock(
    no number, --pk --시퀀스처리. 1번부터 1씩 증가
    product varchar2(100) not null,
    quantity number default 0,
    constraint pk_stock_no primary key(no)
);

--insert comments
comment on table stock is '재고관리테이블';
comment on column stock.no is '품목번호';
comment on column stock.product is '품목';
comment on column stock.quantity is '현재재고';

--check column comments of stock table
select * from user_col_comments where table_name = 'STOCK';

--upsert 테이블 생성
create table upsert_stock(
    no number, --pk, sequence
    product_no number,
    product varchar2(100) not null,
    quantity number default 0,
    modification_date date default sysdate,
    constraint pk_upsert_stock_no primary key(no)
);

--create sequence of stock table
create sequence seq_stock_no;

--insert values into stock table with sequence
insert into stock
values (seq_stock_no.nextval, '커피', 10);
insert into stock
values (seq_stock_no.nextval, '손소독제', 100);
insert into stock(no, product)
values (seq_stock_no.nextval, '충전기');
insert into stock
values (seq_stock_no.nextval, 'Galaxy Note 9', 30);
insert into stock
values (seq_stock_no.nextval, '노트북가방', 150);

--create trigger
--When STOCK values got changed(update/insert), 
--insert that values into UPSERT_STOCK



--1. 현재 상품 및 재고 현황 보기
select * from stock order by no;

--2. 품목번호로 조회
select * from stock where no = ?;
--3. 품목으로 조회
select * from stock where product = ?;
--4. 상품 추가
insert into stock
values (seq_stock_no.nextval, ?, ?);
--5. 상품 재고 변경(품목번호로 검색해서 변경)
update stock
set quantity = ?
where no = ?;
--6. 변경기록 확인 upsert_stock
select * from upsert_stock;

update stock
set product = 'GalaxyNote9'
where no = 3;

--commit; --이걸 안하니까 이클립스에서 안뜨잖아...ㅡㅡ
--rollback;