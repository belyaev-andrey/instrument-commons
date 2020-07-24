-- begin PROPOSALS_INSTRUMENT
create table PROPOSALS_INSTRUMENT (
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
    --
    primary key (ID)
)^
-- end PROPOSALS_INSTRUMENT
-- begin PROPOSALS_PROPOSAL
create table PROPOSALS_PROPOSAL (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INSTRUMENT_ID varchar(36) not null,
    PROJECT_TITLE varchar(255) not null,
    APPLICANT_ID varchar(36) not null,
    DELEGATE_ID varchar(36),
    PROPOSAL_STATUS varchar(50) not null,
    RESPONSIBLE_ID varchar(36) not null,
    DUE_DATE timestamp,
    --
    primary key (ID)
)^
-- end PROPOSALS_PROPOSAL
