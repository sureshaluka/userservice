DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
  user_id varchar(250) PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);
