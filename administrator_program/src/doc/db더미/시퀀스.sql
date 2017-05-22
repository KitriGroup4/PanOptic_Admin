CREATE SEQUENCE FOOD_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;


--table�� �⺻Ű�� �� (���̺� ��_num) ������ ����� food, user_info, order_info ����
--employees���̺� ���̵����� ����� 5;
--user���̺� ���̵����� ����� 15;


CREATE SEQUENCE BLOCKEDSITE_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE COM_USE_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE FOOD_TYPE_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE GAME_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE GAME_TYPE_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE GAME_USAGE_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE LIMITED_AGE_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE PAY_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;

CREATE SEQUENCE POINT_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE SETTLE_ACCOUNT_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE USER_BLACKLIST_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE USER_POINT_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE WAGE_ACCU_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE WAGE_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE WORK_INFO_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
CREATE SEQUENCE EMPLOYEES_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;

CREATE SEQUENCE USER_NUM_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;


insert into employees values(employees_seq.nextval,'������','01028864780',sysdate,'yje23','123123123','youje92@naver.com','1992-12-22','manager','10000',0);
insert into employees values(employees_seq.nextval,'�赵��','01022228888',sysdate,'kdy23','123123123','kdy@naver.com','1990-11-22','worker','10000',0);
insert into employees values(employees_seq.nextval,'��â��','01011118888',sysdate,'ycs23','123123123','ycs@naver.com','1992-10-22','worker',10000,1);
insert into employees values(employees_seq.nextval,'����','01033338888',sysdate,'yt23','123123123','ycs@naver.com','1989-10-22','worker',10000,1);
insert into employees values(employees_seq.nextval,'�ڼ���','01022227777',sysdate,'psj23','123123123','psj@naver.com','1992-09-22','worker',10000,0);

insert into user_info values(user_num_seq.nextval,'Ȳ����','hhj23','123123123','01012121212','hhj23@naver.com','200','20',sysdate,1990-09-22',0);
insert into user_info values(user_num_seq.nextval,'��ȣ��','yhm23','123123123','01011112222','yhm23@naver.com','150','50',sysdate,1997-05-22',1);
insert into user_info values(user_num_seq.nextval,'��ȣ��','yhj23','123123123','01022223333','yhm23@naver.com','500','100',sysdate,1993-02-22',1);
insert into user_info values(user_num_seq.nextval,'������','jhy23','123123123','01033334444','jhy23@naver.com','400','200',sysdate,1994-04-22',1);
insert into user_info values(user_num_seq.nextval,'������','aje23','123123123','01033335555','aje23@naver.com','50','10',sysdate,1995-06-22',1);
insert into user_info values(user_num_seq.nextval,'�Ǽ���','ksj23','123123123','01044445555','ksj23@naver.com','500','100',sysdate,1993-06-22',1);
insert into user_info values(user_num_seq.nextval,'����','ysd23','123123123','01044446666','ysd23@naver.com','600','200',sysdate,1982-10-22',1);
insert into user_info values(user_num_seq.nextval,'������','kjh23','123123123','01042226666','kjh23@naver.com','600','400',sysdate,1998-06-22',0);
insert into user_info values(user_num_seq.nextval,'Ȳ����','hyy23','123123123','01042216666','hyy23@naver.com','600','300',sysdate,1989-03-22',1);
insert into user_info values(user_num_seq.nextval,'����','ksk23','123123123','01011116666','ksk23@naver.com','600','200',sysdate,1989-03-22',1);