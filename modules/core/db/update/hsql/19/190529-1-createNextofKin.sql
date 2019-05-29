create table PROJECTTEST_NEXTOF_KIN (
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
    ID_NUMBER integer not null,
    RELATIONSHIP varchar(50) not null,
    PHONE_NUMBER integer,
    PHYSICAL_ADDRESS longvarchar not null,
    --
    primary key (ID)
);
