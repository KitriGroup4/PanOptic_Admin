drop table blockedsite;
CREATE TABLE BlockedSite (
	blockedsite_num  number(3) NOT NULL constraint blockedsite_pk primary key, 
	blockedsite_url  VARCHAR(20) NULL,
	blockedsite_name VARCHAR(30) NULL
);

drop sequence blockedsite_seq;
CREATE SEQUENCE BLOCKEDSITE_SEQ 
INCREMENT BY 1 
START WITH 0 
MINVALUE 0;

select * from blockedsite;
insert into blockedsite values (blockedsite_seq.nextval, 'www.naver.com', '네이버');
insert into blockedsite values (blockedsite_seq.nextval, 'www.daum.net', '다음');
insert into blockedsite values (blockedsite_seq.nextval, 'www.google.com', '구글');
insert into blockedsite values (blockedsite_seq.nextval, 'www.hotmail.com', '핫메일');
insert into blockedsite values (blockedsite_seq.nextval, 'www.ddanzi.com', '딴지');

select * from blockedsite;