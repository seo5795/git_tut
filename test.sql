select *from all_all tables;

create table users(
	id varchar(30) primary key,
	pw varchar(30),
	name varchar(30),
	role varchar(30),
	mail varchar(100)
);

create table board(
	bid int primary key,
	title varchar(50),
	theme varchar(30),
	content varchar(100),
	wdate date default sysdate
);

create table reply(
	pid int primary key,
	rcontent varchar(100)
);

select * from board;
select * from users;

drop table users;
drop table board;
drop table reply;

insert into users values('admin','1234','어드민','ADMIN','seo5795@naver.com');