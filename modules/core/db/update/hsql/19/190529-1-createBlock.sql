create table PROJECTTEST_BLOCK (
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
    WARDEN_ID varchar(36),
    --
    primary key (ID)
);
