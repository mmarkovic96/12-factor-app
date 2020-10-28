DROP TABLE IF EXISTS BOOKS;

CREATE TABLE BOOKS (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,
                               author VARCHAR(250) NOT NULL,
                               publisher VARCHAR(250) DEFAULT NULL
);