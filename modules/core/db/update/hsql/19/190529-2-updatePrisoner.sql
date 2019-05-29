alter table PROJECTTEST_PRISONER alter column CELL_ID rename to CELL_ID__U22374 ^
drop index IDX_PROJECTTEST_PRISONER_ON_CELL ;
alter table PROJECTTEST_PRISONER add column CELL_ID varchar(36) ;
