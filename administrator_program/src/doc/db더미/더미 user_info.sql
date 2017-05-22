drop table User_info;
drop SEQUENCE USER_NUM_SEQ; 
CREATE SEQUENCE USER_NUM_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;

-- User_Info
CREATE TABLE User_Info (
	user_num       INTEGER     NOT NULL, -- 회원번호
	user_name      VARCHAR(20) NOT NULL, -- 회원이름
	user_id        VARCHAR(20) NOT NULL, -- 아이디
	user_pw        VARCHAR(20) NOT NULL, -- 비밀번호
	user_hp        VARCHAR(20) NOT NULL, -- 핸드폰번호
	user_email     VARCHAR(30) NULL,     -- 이메일주소
	user_accu_time VARCHAR(9)  NULL,     -- 누적사용시간
	user_left_time VARCHAR(9)  NULL,     -- 잔여시간
	user_join_date DATE        NULL,     -- 가입일
	user_birth     VARCHAR(10) NULL,     -- 생년월일
	is_male        VARCHAR(2)  NULL,      -- 성별
	user_blacklist VARCHAR(2)  NULL      -- 블랙리스트
	
);

select * from User_info;
insert into user_info values(user_num_seq.nextval,'황혜정','hhj23','123123123','01012121212','hhj23@naver.com','null','null',sysdate,'1990-09-22', 0, 1);
insert into user_info values(user_num_seq.nextval,'양호민','yhm23','123123123','01011112222','yhm23@naver.com','null','null',sysdate,'1997-05-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'엄호진','yhj23','123123123','01022223333','yhm23@naver.com','null','null',sysdate,'1993-02-22', 1, 1);
insert into user_info values(user_num_seq.nextval,'정현우','jhy23','123123123','01033334444','jhy23@naver.com','null','null',sysdate,'1994-04-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'안지은','aje23','123123123','01033335555','aje23@naver.com','null','null',sysdate,'1995-06-22', 1, 1);
insert into user_info values(user_num_seq.nextval,'권성준','ksj23','123123123','01044445555','ksj23@naver.com','null','null',sysdate,'1993-06-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'윤상동','ysd23','123123123','01044446666','ysd23@naver.com','null','null',sysdate,'1982-10-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'김주희','kjh23','123123123','01042226666','kjh23@naver.com','null','null',sysdate,'1998-06-22', 0, 0);
insert into user_info values(user_num_seq.nextval,'황예인','hyy23','123123123','01042216666','hyy23@naver.com','null','null',sysdate,'1989-03-22', 1, 1);
insert into user_info values(user_num_seq.nextval,'강상국','ksk23','123123123','01011116666','ksk23@naver.com','null','null',sysdate,'1989-03-22', 1, 0);
select * from User_info;