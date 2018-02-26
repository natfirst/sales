-- update SALES_ORDER_LINE set PRODUCT_ID = <default_value> where PRODUCT_ID is null ;
alter table SALES_ORDER_LINE alter column PRODUCT_ID set not null ;
update SALES_ORDER_LINE set QUANTITY = 0 where QUANTITY is null ;
alter table SALES_ORDER_LINE alter column QUANTITY set not null ;
