
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

CREATE TABLE IF NOT EXISTS borrows (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  registration varchar(36) NOT NULL,
  returnDate date NOT NULL,
  borrowDate date NOT NULL,
  student_id bigint(20) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (student_id) references students(id)
);

CREATE TABLE IF NOT EXISTS borrows_books (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  borrow_id bigint(20) NOT NULL,
  book_id bigint(20) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (book_id) references books(id),
  FOREIGN KEY (borrow_id) references borrows(id)
);
