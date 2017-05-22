drop table User_info;
drop SEQUENCE USER_NUM_SEQ; 
CREATE SEQUENCE USER_NUM_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;

-- User_Info
CREATE TABLE User_Info (
	user_num       INTEGER     NOT NULL, -- ȸ����ȣ
	user_name      VARCHAR(20) NOT NULL, -- ȸ���̸�
	user_id        VARCHAR(20) NOT NULL, -- ���̵�
	user_pw        VARCHAR(20) NOT NULL, -- ��й�ȣ
	user_hp        VARCHAR(20) NOT NULL, -- �ڵ�����ȣ
	user_email     VARCHAR(30) NULL,     -- �̸����ּ�
	user_accu_time VARCHAR(9)  NULL,     -- �������ð�
	user_left_time VARCHAR(9)  NULL,     -- �ܿ��ð�
	user_join_date DATE        NULL,     -- ������
	user_birth     VARCHAR(10) NULL,     -- �������
	is_male        VARCHAR(2)  NULL,      -- ����
	user_blacklist VARCHAR(2)  NULL      -- ������Ʈ
	
);

select * from User_info;
insert into user_info values(user_num_seq.nextval,'Ȳ����','hhj23','123123123','01012121212','hhj23@naver.com','null','null',sysdate,'1990-09-22', 0, 1);
insert into user_info values(user_num_seq.nextval,'��ȣ��','yhm23','123123123','01011112222','yhm23@naver.com','null','null',sysdate,'1997-05-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'��ȣ��','yhj23','123123123','01022223333','yhm23@naver.com','null','null',sysdate,'1993-02-22', 1, 1);
insert into user_info values(user_num_seq.nextval,'������','jhy23','123123123','01033334444','jhy23@naver.com','null','null',sysdate,'1994-04-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'������','aje23','123123123','01033335555','aje23@naver.com','null','null',sysdate,'1995-06-22', 1, 1);
insert into user_info values(user_num_seq.nextval,'�Ǽ���','ksj23','123123123','01044445555','ksj23@naver.com','null','null',sysdate,'1993-06-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'����','ysd23','123123123','01044446666','ysd23@naver.com','null','null',sysdate,'1982-10-22', 1, 0);
insert into user_info values(user_num_seq.nextval,'������','kjh23','123123123','01042226666','kjh23@naver.com','null','null',sysdate,'1998-06-22', 0, 0);
insert into user_info values(user_num_seq.nextval,'Ȳ����','hyy23','123123123','01042216666','hyy23@naver.com','null','null',sysdate,'1989-03-22', 1, 1);
insert into user_info values(user_num_seq.nextval,'����','ksk23','123123123','01011116666','ksk23@naver.com','null','null',sysdate,'1989-03-22', 1, 0);
select * from User_info;