drop database color_catalog_final;
drop database color_catalog_team;
drop database color_catalogue_one;

CREATE DATABASE color_catalog_db;

USE color_catalog_db;

CREATE TABLE user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

drop table user;

INSERT INTO User (username, password) VALUES ('siva', 'siva@123');
INSERT INTO User (username, password) VALUES ('saiteja', 'saiteja@123');
INSERT INTO User (username, password) VALUES ('sadhika', 'sadhika@123');
INSERT INTO User (username, password) VALUES ('hello', 'hello@123');



delete from user where id = 1;

select * from user;

CREATE TABLE color_selection (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    colors VARCHAR(255) NOT NULL
);

CREATE TABLE color_selection (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    colors TEXT NOT NULL
);


drop table color_selection;

select * from color_selection;

delete from color_selection where id = 11;

show tables;


