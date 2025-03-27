DROP TABLE IF EXISTS author;
DROP TABLE if EXISTS author_seq;

CREATE TABLE author (
    id bigint not null,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    primary key (id)

) engine=InnoDB;

CREATE TABLE author_seq (
    next_val bigint
) engine=InnoDB;

INSERT INTO author_seq values (1);