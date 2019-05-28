-- begin PROJECTTEST_PRISONER
create table PROJECTTEST_PRISONER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    CELL_ID varchar(36),
    GENDER varchar(50) not null,
    ID_NUMBER integer not null,
    DATE_OF_BIRTH date not null,
    --
    primary key (ID)
)^
-- end PROJECTTEST_PRISONER
-- begin PROJECTTEST_CELLS
create table PROJECTTEST_CELLS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CELL_NUMBER varchar(255) not null,
    CELL_BLOCK varchar(255) not null,
    CELL_CAPACITY integer not null,
    --
    primary key (ID)
)^
-- end PROJECTTEST_CELLS
