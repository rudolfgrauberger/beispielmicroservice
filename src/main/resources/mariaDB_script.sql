-- run in cli as root

DROP DATABASE sb_dev;
DROP DATABASE sb_prod;
CREATE DATABASE sb_dev;
CREATE DATABASE sb_prod;

DROP USER IF EXISTS 'sb_dev'@'localhost';
DROP USER IF EXISTS 'sb_prod'@'localhost';

CREATE USER 'sb_dev'@'localhost' identified BY 'knet-lol';
CREATE USER 'sb_prod'@'localhost' identified BY 'knet-lol';

GRANT ALL ON sb_dev.* TO 'sb_dev'@'localhost';
GRANT ALL ON sb_prod.* TO 'sb_prod'@'localhost';

USE sb_dev;

CREATE TABLE students (
  id INTEGER AUTO_INCREMENT,
  name VARCHAR(30),
  course VARCHAR(30),
  PRIMARY KEY(id)
);

INSERT INTO students (name, course)  VALUES ('dev', 'dev');
INSERT INTO students (name, course)  VALUES ('anna', 'dicks');
INSERT INTO students (name, course)  VALUES ('Simon', 'mathe');
INSERT INTO students (name, course)  VALUES ('lennart', 'ee');

USE sb_prod;

CREATE TABLE students (
  id INTEGER AUTO_INCREMENT,
  name VARCHAR(30),
  course VARCHAR(30),
  PRIMARY KEY(id)
);

INSERT INTO students (name, course)  VALUES ('prod', 'prod');
INSERT INTO students (name, course)  VALUES ('timo', 'ai');
INSERT INTO students (name, course)  VALUES ('anna', 'dicks');
INSERT INTO students (name, course)  VALUES ('Simon', 'mathe');
INSERT INTO students (name, course)  VALUES ('lennart', 'ee');
