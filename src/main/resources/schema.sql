CREATE TABLE IF NOT EXISTS students (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(100) NOT NULL,
  registration bigint NOT NULL,
  course varchar(100) NOT NULL,
  email varchar(100) NOT NULL,
  phone varchar(100) NOT NULL,
  PRIMARY KEY (id)
);