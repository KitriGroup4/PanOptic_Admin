
insert into point_info values(0, 1000, 1000);
insert into point_info values(1, 3000, 2500);
insert into point_info values(2, 5000, 4000);
insert into point_info values(3, 10000, 7000);
insert into point_info values(4, 15000, 10000);




insert into com_prepaid_info values(0, 1, 1000);
insert into com_prepaid_info values(1, 2, 1200);
insert into com_prepaid_info values(2, 3, 1500);
insert into com_prepaid_info values(3, 4, 20ins00);
insert into com_prepaid_info values(4, 5, 2500);
insert into com_prepaid_info values(5, 6, 3000);
insert into com_prepaid_info values(6, 7, 4000);
insert into com_prepaid_info values(7, 8, 5000);



insert into food_type values(0, '����');
insert into food_type values(1, '����');
insert into food_type values(2, '����');



insert into FOOD values(food_seq.nextval, '���', 0, 30, 3000, '���');

insert into FOOD values(food_seq.nextval, '���', 0, 10, 5000, '���ѱ�');
insert into FOOD values(food_seq.nextval, '����������', 0, 5, 6000, '���ѱ�');
insert into FOOD values(food_seq.nextval, '��ġ������', 0, 10, 6000, '���ѱ�');
insert into FOOD values(food_seq.nextval, 'ġŲ', 0, 10, 15000, '����');
insert into FOOD values(food_seq.nextval, '���θ�', 0, 10, 7000, '�ȵ�');

insert into FOOD values(food_seq.nextval, '�����', 1, 100, 1000, '������');
insert into FOOD values(food_seq.nextval, '����ٽ�', 1, 100, 2000, '����');
insert into FOOD values(food_seq.nextval, '�����', 1, 15, 3000, '���Ͽ�');
insert into FOOD values(food_seq.nextval, '��������', 1, 20, 1000, '������');
insert into FOOD values(food_seq.nextval, '������', 1, 10, 3000, '���');

insert into FOOD values(food_seq.nextval, '�Ƹ޸�ī��', 2, 20, 3500, 'spc');
insert into FOOD values(food_seq.nextval, '�����', 2, 30, 4000, 'spc');
insert into FOOD values(food_seq.nextval, '�����ī', 2, 15, 5000, 'spc');
insert into FOOD values(food_seq.nextval, '���̴�', 2, 20, 3500, 'spc');
insert into FOOD values(food_seq.nextval, '�ݶ�', 2, 30, 3500, 'spc');


select * from food_type;
insert into food_type values(0, '����1');
insert into food_type values(1, '����2');
insert into food_type values(2, '����3');

select * from food;

insert into FOOD values(1, '���', 0, 30, 3000, '���');

insert into FOOD values(2, '���', 0, 10, 5000, '���ѱ�');
insert into FOOD values(3, '����������', 0, 5, 6000, '���ѱ�');
insert into FOOD values(4, '��ġ������', 0, 10, 6000, '���ѱ�');
insert into FOOD values(5, 'ġŲ', 0, 10, 15000, '����');
insert into FOOD values(6, '���θ�', 0, 10, 7000, '�ȵ�');

insert into FOOD values(7, '�����', 1, 100, 1000, '������');
insert into FOOD values(8, '����ٽ�', 1, 100, 2000, '����');
insert into FOOD values(9, '�����', 1, 15, 3000, '���Ͽ�');
insert into FOOD values(10, '��������', 1, 20, 1000, '������');
insert into FOOD values(11, '������', 1, 10, 3000, '���');

insert into FOOD values(12, '�Ƹ޸�ī��', 2, 20, 3500, 'spc');
insert into FOOD values(13, '�����', 2, 30, 4000, 'spc');
insert into FOOD values(14, '�����ī', 2, 15, 5000, 'spc');
insert into FOOD values(15, '���̴�', 2, 20, 3500, 'spc');
insert into FOOD values(16, '�ݶ�', 2, 30, 3500, 'spc');



insert into employees values(employees_seq.nextval,'������','01028864780',sysdate,'yje23','123123123','youje92@naver.com','1992-12-22','manager','10000',0);
insert into employees values(employees_seq.nextval,'�赵��','01022228888',sysdate,'kdy23','123123123','kdy@naver.com','1990-11-22','worker','10000',0);
insert into employees values(employees_seq.nextval,'��â��','01011118888',sysdate,'ycs23','123123123','ycs@naver.com','1992-10-22','worker',10000,1);
insert into employees values(employees_seq.nextval,'����','01033338888',sysdate,'yt23','123123123','ycs@naver.com','1989-10-22','worker',10000,1);
insert into employees values(employees_seq.nextval,'�ڼ���','01022227777',sysdate,'psj23','123123123','psj@naver.com','1992-09-22','worker',10000,0);

insert into user_info values(user_num_seq.nextval,'Ȳ����','hhj23','123123123','01012121212','hhj23@naver.com','null','null',sysdate,'1990-09-22',0);
insert into user_info values(user_num_seq.nextval,'��ȣ��','yhm23','123123123','01011112222','yhm23@naver.com','null','null',sysdate,'1997-05-22',1);
insert into user_info values(user_num_seq.nextval,'��ȣ��','yhj23','123123123','01022223333','yhm23@naver.com','null','null',sysdate,'1993-02-22',1);
insert into user_info values(user_num_seq.nextval,'������','jhy23','123123123','01033334444','jhy23@naver.com','null','null',sysdate,'1994-04-22',1);
insert into user_info values(user_num_seq.nextval,'������','aje23','123123123','01033335555','aje23@naver.com','null','null',sysdate,'1995-06-22',1);
insert into user_info values(user_num_seq.nextval,'�Ǽ���','ksj23','123123123','01044445555','ksj23@naver.com','null','null',sysdate,'1993-06-22',1);
insert into user_info values(user_num_seq.nextval,'����','ysd23','123123123','01044446666','ysd23@naver.com','null','null',sysdate,'1982-10-22',1);
insert into user_info values(user_num_seq.nextval,'������','kjh23','123123123','01042226666','kjh23@naver.com','null','null',sysdate,'1998-06-22',0);
insert into user_info values(user_num_seq.nextval,'Ȳ����','hyy23','123123123','01042216666','hyy23@naver.com','null','null',sysdate,'1989-03-22',1);
insert into user_info values(user_num_seq.nextval,'����','ksk23','123123123','01011116666','ksk23@naver.com','null','null',sysdate,'1989-03-22',1);
CREATE SEQUENCE FOOD_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;

CREATE SEQUENCE USER_NUM_SEQ INCREMENT BY 1 START WITH 0 MINVALUE 0;
