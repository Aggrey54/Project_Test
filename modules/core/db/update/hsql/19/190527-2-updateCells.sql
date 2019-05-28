alter table PROJECTTEST_CELLS add column CELL_BLOCK varchar(255) ^
update PROJECTTEST_CELLS set CELL_BLOCK = '' where CELL_BLOCK is null ;
alter table PROJECTTEST_CELLS alter column CELL_BLOCK set not null ;
