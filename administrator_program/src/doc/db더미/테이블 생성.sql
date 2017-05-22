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
	is_male        VARCHAR(2)  NULL      -- ����
);

-- User_Info
ALTER TABLE User_Info
	ADD
		CONSTRAINT PK_User_Info -- User_Info �⺻Ű
		PRIMARY KEY (
			user_num -- ȸ����ȣ
		);

-- User_Black_List
CREATE TABLE User_BlackList (
	user_num INTEGER NOT NULL -- ȸ����ȣ
);

-- User_Black_List
ALTER TABLE User_BlackList
	ADD
		CONSTRAINT PK_User_BlackList -- User_Black_List �⺻Ű
		PRIMARY KEY (
			user_num -- ȸ����ȣ
		);

-- Food
CREATE TABLE Food (
	food_num      INTEGER     NOT NULL, -- ���Ĺ�ȣ
	food_name     VARCHAR(20) NOT NULL, -- �����̸�
	food_type_num INTEGER     NULL,     -- ���ı��й�ȣ
	food_left_num INTEGER     NOT NULL, -- ���
	food_price    INTEGER     NOT NULL, -- ���İ���
	food_order    VARCHAR(20) NOT NULL  -- �ֹ�ó
);

-- Food
ALTER TABLE Food
	ADD
		CONSTRAINT PK_Food -- Food �⺻Ű
		PRIMARY KEY (
			food_num -- ���Ĺ�ȣ
		);

-- Food_Type
CREATE TABLE Food_Type (
	food_type_num  INTEGER     NOT NULL, -- ���ı��й�ȣ
	food_type_name VARCHAR(20) NULL      -- ���ĺз���
);

-- Food_Type
ALTER TABLE Food_Type
	ADD
		CONSTRAINT PK_Food_Type -- Food_Type �⺻Ű
		PRIMARY KEY (
			food_type_num -- ���ı��й�ȣ
		);

-- Order_Info
CREATE TABLE Order_Info (
	order_num   INTEGER NOT NULL, -- �ֹ���ȣ
	user_num    INTEGER NULL,     -- ȸ����ȣ
	food_num    INTEGER NULL,     -- ���Ĺ�ȣ
	order_money INTEGER NOT NULL, -- �ֹ��ݾ�
	order_count INTEGER NOT NULL, -- �ֹ�����
	order_time  DATE    NOT NULL, -- �ֹ��ð�
	com_num     INTEGER NULL      -- �¼���ȣ
);

-- Order_Info
ALTER TABLE Order_Info
	ADD
		CONSTRAINT PK_Order_Info -- Order_Info �⺻Ű
		PRIMARY KEY (
			order_num -- �ֹ���ȣ
		);

-- Pay_Info
CREATE TABLE Pay_Info (
	pay_num      INTEGER NOT NULL, -- ������ȣ
	user_num     INTEGER NULL,     -- ȸ����ȣ
	pay_money    INTEGER NOT NULL, -- �����ݾ�
	pay_type_num INTEGER NULL      -- �������й�ȣ
);

-- Pay_Info
ALTER TABLE Pay_Info
	ADD
		CONSTRAINT PK_Pay_Info -- Pay_Info �⺻Ű
		PRIMARY KEY (
			pay_num -- ������ȣ
		);

-- Pay_Type
CREATE TABLE Pay_Type (
	pay_type_num  INTEGER     NOT NULL, -- ���źз�
	pay_type_name VARCHAR(20) NOT NULL  -- ���ű��и�
);

-- Pay_Type
ALTER TABLE Pay_Type
	ADD
		CONSTRAINT PK_Pay_Type -- Pay_Type �⺻Ű
		PRIMARY KEY (
			pay_type_num -- ���źз�
		);

-- Employees
CREATE TABLE Employees (
	employee_num           INTEGER     NOT NULL, -- ����������ȣ
	employee_name          VARCHAR(20) NOT NULL, -- ������
	employee_hp            VARCHAR(20) NOT NULL, -- �ڵ�����ȣ
	employee_hire_date     DATE        NOT NULL, -- �Ի���
	employee_id            VARCHAR(20) NOT NULL, -- ����ID
	employee_pw            VARCHAR(20) NOT NULL, -- ����PW
	employee_email         VARCHAR(20) NOT NULL, -- ����Email
	employee_birth         VARCHAR(10) NOT NULL, -- �������
	employee_position      VARCHAR(20) NOT NULL, -- ����
	employee_hour_pay_rate INTEGER     NOT NULL, -- �ñ�
	employee_isMale        VARCHAR(1)  NULL      -- ����
);

-- Employees
ALTER TABLE Employees
	ADD
		CONSTRAINT PK_Employees -- Employees �⺻Ű
		PRIMARY KEY (
			employee_num -- ����������ȣ
		);

-- Game
CREATE TABLE Game (
	game_num      INTEGER     NOT NULL, -- ���ӹ�ȣ
	game_name     VARCHAR(20) NOT NULL, -- ���Ӹ�
	game_type_num VARCHAR(20) NULL      -- ���ӱ��й�ȣ
);

-- Game
ALTER TABLE Game
	ADD
		CONSTRAINT PK_Game -- Game �⺻Ű
		PRIMARY KEY (
			game_num -- ���ӹ�ȣ
		);

-- Game_Type
CREATE TABLE Game_Type (
	game_type_num VARCHAR(20) NOT NULL, -- ���ӱ��й�ȣ
	game_genre    VARCHAR(20) NOT NULL  -- �����帣
);

-- Game_Type
ALTER TABLE Game_Type
	ADD
		CONSTRAINT PK_Game_Type -- Game_Type �⺻Ű
		PRIMARY KEY (
			game_type_num -- ���ӱ��й�ȣ
		);

-- Game_Usage_Info
CREATE TABLE Game_Usage_Info (
	game_usage_num INTEGER NOT NULL, -- �����̿��ȣ
	user_num       INTEGER NOT NULL, -- ȸ����ȣ
	game_num       INTEGER NOT NULL  -- ���ӹ�ȣ
);

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	ADD
		CONSTRAINT PK_Game_Usage_Info -- Game_Usage_Info �⺻Ű
		PRIMARY KEY (
			game_usage_num -- �����̿��ȣ
		);

-- Work_Info
CREATE TABLE Work_Info (
	work_info_num INTEGER NOT NULL, -- �ٹ�������ȣ
	employee_num  INTEGER NULL,     -- ������ȣ
	work_start    DATE    NULL,     -- �ٹ����۽ð�
	work_finish   DATE    NULL,     -- �ٹ������ð�
	work_hour     INTEGER NOT NULL  -- �ٹ��ð�
);

-- Work_Info
ALTER TABLE Work_Info
	ADD
		CONSTRAINT PK_Work_Info -- Work_Info �⺻Ű
		PRIMARY KEY (
			work_info_num -- �ٹ�������ȣ
		);

-- Wage_Info
CREATE TABLE Wage_Info (
	employee_num    INTEGER NOT NULL, -- ������ȣ
	work_hour_total INTEGER NULL,     -- �ѱٹ��ð�
	work_wage_total INTEGER NULL      -- �޿��հ�
);

-- Wage_Info
ALTER TABLE Wage_Info
	ADD
		CONSTRAINT PK_Wage_Info -- Wage_Info �⺻Ű
		PRIMARY KEY (
			employee_num -- ������ȣ
		);

-- Wage_Accu_Info
CREATE TABLE Wage_Accu_Info (
	employee_num    INTEGER NOT NULL, -- ������ȣ
	wage_month      DATE    NOT NULL, -- ����
	work_hour_total INTEGER NULL,     -- �ѱٹ��ð�
	work_wage_total INTEGER NULL      -- �޿��հ�
);

-- Wage_Accu_Info
ALTER TABLE Wage_Accu_Info
	ADD
		CONSTRAINT PK_Wage_Accu_Info -- Wage_Accu_Info �⺻Ű
		PRIMARY KEY (
			employee_num, -- ������ȣ
			wage_month    -- ����
		);

-- Com
CREATE TABLE Com (
	com_num    INTEGER NOT NULL, -- �¼���ȣ
	user_num   INTEGER NULL,     -- ȸ����ȣ
	is_use     BOOLEAN NOT NULL, -- ��뿩��
	is_booking BOOLEAN NOT NULL  -- ���࿩��
);

-- Com
ALTER TABLE Com
	ADD
		CONSTRAINT PK_Com -- Com �⺻Ű
		PRIMARY KEY (
			com_num -- �¼���ȣ
		);

-- User_Point_Info
CREATE TABLE User_Point_Info (
	user_num INTEGER NOT NULL, -- ȸ����ȣ
	point    INTEGER NOT NULL  -- ����Ʈ
);

-- User_Point_Info
ALTER TABLE User_Point_Info
	ADD
		CONSTRAINT PK_User_Point_Info -- User_Point_Info �⺻Ű
		PRIMARY KEY (
			user_num -- ȸ����ȣ
		);

-- Com_Prepaid_Info
CREATE TABLE Com_Prepaid_Info (
	prepaid_num   INTEGER NOT NULL, -- ���׹�ȣ
	prepaid_time  INTEGER NOT NULL, -- ���׽ð�
	prepaid_price INTEGER NOT NULL  -- �ܰ�
);

-- Com_Prepaid_Info
ALTER TABLE Com_Prepaid_Info
	ADD
		CONSTRAINT PK_Com_Prepaid_Info -- Com_Prepaid_Info �⺻Ű
		PRIMARY KEY (
			prepaid_num -- ���׹�ȣ
		);

-- Com_User_Info
CREATE TABLE Com_Use_Info (
	com_use_num     INTEGER NOT NULL, -- pc�̿�������ȣ
	user_num        INTEGER NOT NULL, -- ȸ����ȣ
	com_num         INTEGER NOT NULL, -- �¼���ȣ
	com_start_time  DATE    NOT NULL, -- �����۽ð�
	com_use_time    DATE    NOT NULL, -- ���ð�
	com_finish_time DATE    NOT NULL  -- ����ð�
);

-- Com_User_Info
ALTER TABLE Com_Use_Info
	ADD
		CONSTRAINT PK_Com_Use_Info -- Com_User_Info �⺻Ű
		PRIMARY KEY (
			com_use_num -- pc�̿�������ȣ
		);

-- Settle_Account_Info
CREATE TABLE Settle_Account_Info (
	settle_account_num INTEGER    NOT NULL, -- ���곻����ȣ
	settle_date        VARCHAR(9) NOT NULL, -- ��¥
	order_money        INTEGER    NOT NULL, -- �ֹ��ݾ�
	pay_money          INTEGER    NOT NULL, -- �����ݾ�
	settle_total       INTEGER    NOT NULL  -- �հ�
);

-- Settle_Account_Info
ALTER TABLE Settle_Account_Info
	ADD
		CONSTRAINT PK_Settle_Account_Info -- Settle_Account_Info �⺻Ű
		PRIMARY KEY (
			settle_account_num -- ���곻����ȣ
		);

-- Point_Info
CREATE TABLE Point_Info (
	num   INTEGER NOT NULL, -- ����Ʈ��ȣ
	value INTEGER NULL,     -- ����Ʈ��
	price INTEGER NULL      -- ����
);

-- Point_Info
ALTER TABLE Point_Info
	ADD
		CONSTRAINT PK_Point_Info -- Point_Info �⺻Ű
		PRIMARY KEY (
			num -- ����Ʈ��ȣ
		);

-- BlockedSite
CREATE TABLE BlockedSite (
	blockedsite_num  INTEGER     NOT NULL, -- ���ػ���Ʈ��ȣ
	blockedsite_url  VARCHAR(20) NULL,     -- ���ػ���ƮURL
	blockedsite_name VARCHAR(30) NULL      -- ���ػ���Ʈ�̸�
);

-- BlockedSite
ALTER TABLE BlockedSite
	ADD
		CONSTRAINT PK_BlockedSite -- BlockedSite �⺻Ű
		PRIMARY KEY (
			blockedsite_num -- ���ػ���Ʈ��ȣ
		);

-- Limited_Age
CREATE TABLE Limited_Age (
	limitied_year INTEGER NULL -- ���ѳ��
);

-- User_Black_List
ALTER TABLE User_BlackList
	ADD
		CONSTRAINT FK_User_Info_TO_User_BlackList -- User_Info -> User_Black_List
		FOREIGN KEY (
			user_num -- ȸ����ȣ
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- ȸ����ȣ
		);

-- Food
ALTER TABLE Food
	ADD
		CONSTRAINT FK_Food_Type_TO_Food -- Food_Type -> Food
		FOREIGN KEY (
			food_type_num -- ���ı��й�ȣ
		)
		REFERENCES Food_Type ( -- Food_Type
			food_type_num -- ���ı��й�ȣ
		);

-- Order_Info
ALTER TABLE Order_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Order_Info -- User_Info -> Order_Info
		FOREIGN KEY (
			user_num -- ȸ����ȣ
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- ȸ����ȣ
		);

-- Order_Info
ALTER TABLE Order_Info
	ADD
		CONSTRAINT FK_Food_TO_Order_Info -- Food -> Order_Info
		FOREIGN KEY (
			food_num -- ���Ĺ�ȣ
		)
		REFERENCES Food ( -- Food
			food_num -- ���Ĺ�ȣ
		);

-- Pay_Info
ALTER TABLE Pay_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Pay_Info -- User_Info -> Pay_Info
		FOREIGN KEY (
			user_num -- ȸ����ȣ
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- ȸ����ȣ
		);

-- Pay_Info
ALTER TABLE Pay_Info
	ADD
		CONSTRAINT FK_Pay_Type_TO_Pay_Info -- Pay_Type -> Pay_Info
		FOREIGN KEY (
			pay_type_num -- �������й�ȣ
		)
		REFERENCES Pay_Type ( -- Pay_Type
			pay_type_num -- ���źз�
		);

-- Game
ALTER TABLE Game
	ADD
		CONSTRAINT FK_Game_Type_TO_Game -- Game_Type -> Game
		FOREIGN KEY (
			game_type_num -- ���ӱ��й�ȣ
		)
		REFERENCES Game_Type ( -- Game_Type
			game_type_num -- ���ӱ��й�ȣ
		);

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Game_Usage_Info -- User_Info -> Game_Usage_Info
		FOREIGN KEY (
			user_num -- ȸ����ȣ
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- ȸ����ȣ
		);

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	ADD
		CONSTRAINT FK_Game_TO_Game_Usage_Info -- Game -> Game_Usage_Info
		FOREIGN KEY (
			game_num -- ���ӹ�ȣ
		)
		REFERENCES Game ( -- Game
			game_num -- ���ӹ�ȣ
		);

-- Work_Info
ALTER TABLE Work_Info
	ADD
		CONSTRAINT FK_Employees_TO_Work_Info -- Employees -> Work_Info
		FOREIGN KEY (
			employee_num -- ������ȣ
		)
		REFERENCES Employees ( -- Employees
			employee_num -- ����������ȣ
		);

-- Wage_Info
ALTER TABLE Wage_Info
	ADD
		CONSTRAINT FK_Employees_TO_Wage_Info -- Employees -> Wage_Info
		FOREIGN KEY (
			employee_num -- ������ȣ
		)
		REFERENCES Employees ( -- Employees
			employee_num -- ����������ȣ
		);

-- Wage_Accu_Info
ALTER TABLE Wage_Accu_Info
	ADD
		CONSTRAINT FK_Employees_TO_Wage_Accu_Info -- Employees -> Wage_Accu_Info
		FOREIGN KEY (
			employee_num -- ������ȣ
		)
		REFERENCES Employees ( -- Employees
			employee_num -- ����������ȣ
		);

-- Com
ALTER TABLE Com
	ADD
		CONSTRAINT FK_User_Info_TO_Com -- User_Info -> Com
		FOREIGN KEY (
			user_num -- ȸ����ȣ
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- ȸ����ȣ
		);

-- User_Point_Info
ALTER TABLE User_Point_Info
	ADD
		CONSTRAINT FK_User_Info_TO_User_Point_Info -- User_Info -> User_Point_Info
		FOREIGN KEY (
			user_num -- ȸ����ȣ
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- ȸ����ȣ
		);

-- Com_User_Info
ALTER TABLE Com_Use_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Com_Use_Info -- User_Info -> Com_User_Info
		FOREIGN KEY (
			user_num -- ȸ����ȣ
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- ȸ����ȣ
		);

-- Com_User_Info
ALTER TABLE Com_Use_Info
	ADD
		CONSTRAINT FK_Com_TO_Com_Use_Info -- Com -> Com_User_Info
		FOREIGN KEY (
			com_num -- �¼���ȣ
		)
		REFERENCES Com ( -- Com
			com_num -- �¼���ȣ
		);