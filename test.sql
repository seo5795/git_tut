
SELECT * FROM ALL_ALL TABLES;


CREATE TABLE USERS(
	ID VARCHAR(30) PRIMARY KEY,
	PW VARCHAR(30),
	NAME VARCHAR(30),
	ROLE VARCHAR(30),
	MAIL VARCHAR(100)
);


CREATE TABLE BOARD(
	BID INT PRIMARY KEY,
	TITLE VARCHAR(50),
	THEME VARCHAR(30),
	CONTENT VARCHAR(100),
	FILENAME VARCHAR(50),
	WDATE DATE DEFAULT SYSDATE
);


CREATE TABLE REPLY(
	PID INT PRIMARY KEY,
	WRITER VARCHAR(30),
	RCONTENT VARCHAR(100),
	CNT INT
);

SELECT * FROM BOARD;
SELECT * FROM USERS;

DROP TABLE USERS;
DROP TABLE BOARD;
DROP TABLE REPLY;


INSERT INTO BOARD VALUES(1,'12','talk','123','bag','2021-7-28');
INSERT INTO USERS VALUES('admin','1234','어드민','admin','seo5795@naver.com');