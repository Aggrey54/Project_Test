-- begin PROJECTTEST_PRISONER
alter table PROJECTTEST_PRISONER add constraint FK_PROJECTTEST_PRISONER_ON_CELL foreign key (CELL_ID) references PROJECTTEST_CELLS(ID)^
create unique index IDX_PROJECTTEST_PRISONER_UNIQ_ID_NUMBER on PROJECTTEST_PRISONER (ID_NUMBER) ^
create index IDX_PROJECTTEST_PRISONER_ON_CELL on PROJECTTEST_PRISONER (CELL_ID)^
-- end PROJECTTEST_PRISONER
-- begin PROJECTTEST_PRISONERPROPERTY
create unique index IDX_PROJECTTEST_PRISONERPROPERTY_UNIQ_SERIALNUMBER on PROJECTTEST_PRISONERPROPERTY (SERIALNUMBER) ^
-- end PROJECTTEST_PRISONERPROPERTY
