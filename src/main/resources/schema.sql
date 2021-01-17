
CREATE TABLE IF NOT EXISTS students (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  registration bigint NOT NULL,
  course varchar(10) NOT NULL,
  email varchar(50) NOT NULL,
  phone char(11) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS books (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  isbn10 varchar(13) NOT NULL,
  isbn13 varchar(13) NOT NULL,
  genre varchar(10) NOT NULL,
  publisher varchar(20) NOT NULL,
  paperback int NOT NULL,
  language varchar(10) NOT NULL,
  PRIMARY KEY (id)
);
