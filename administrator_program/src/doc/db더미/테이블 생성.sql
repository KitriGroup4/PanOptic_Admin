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
	is_male        VARCHAR(2)  NULL      -- 성별
);

-- User_Info
ALTER TABLE User_Info
	ADD
		CONSTRAINT PK_User_Info -- User_Info 기본키
		PRIMARY KEY (
			user_num -- 회원번호
		);

-- User_Black_List
CREATE TABLE User_BlackList (
	user_num INTEGER NOT NULL -- 회원번호
);

-- User_Black_List
ALTER TABLE User_BlackList
	ADD
		CONSTRAINT PK_User_BlackList -- User_Black_List 기본키
		PRIMARY KEY (
			user_num -- 회원번호
		);

-- Food
CREATE TABLE Food (
	food_num      INTEGER     NOT NULL, -- 음식번호
	food_name     VARCHAR(20) NOT NULL, -- 음식이름
	food_type_num INTEGER     NULL,     -- 음식구분번호
	food_left_num INTEGER     NOT NULL, -- 재고량
	food_price    INTEGER     NOT NULL, -- 음식가격
	food_order    VARCHAR(20) NOT NULL  -- 주문처
);

-- Food
ALTER TABLE Food
	ADD
		CONSTRAINT PK_Food -- Food 기본키
		PRIMARY KEY (
			food_num -- 음식번호
		);

-- Food_Type
CREATE TABLE Food_Type (
	food_type_num  INTEGER     NOT NULL, -- 음식구분번호
	food_type_name VARCHAR(20) NULL      -- 음식분류명
);

-- Food_Type
ALTER TABLE Food_Type
	ADD
		CONSTRAINT PK_Food_Type -- Food_Type 기본키
		PRIMARY KEY (
			food_type_num -- 음식구분번호
		);

-- Order_Info
CREATE TABLE Order_Info (
	order_num   INTEGER NOT NULL, -- 주문번호
	user_num    INTEGER NULL,     -- 회원번호
	food_num    INTEGER NULL,     -- 음식번호
	order_money INTEGER NOT NULL, -- 주문금액
	order_count INTEGER NOT NULL, -- 주문수량
	order_time  DATE    NOT NULL, -- 주문시간
	com_num     INTEGER NULL      -- 좌석번호
);

-- Order_Info
ALTER TABLE Order_Info
	ADD
		CONSTRAINT PK_Order_Info -- Order_Info 기본키
		PRIMARY KEY (
			order_num -- 주문번호
		);

-- Pay_Info
CREATE TABLE Pay_Info (
	pay_num      INTEGER NOT NULL, -- 결제번호
	user_num     INTEGER NULL,     -- 회원번호
	pay_money    INTEGER NOT NULL, -- 결제금액
	pay_type_num INTEGER NULL      -- 결제구분번호
);

-- Pay_Info
ALTER TABLE Pay_Info
	ADD
		CONSTRAINT PK_Pay_Info -- Pay_Info 기본키
		PRIMARY KEY (
			pay_num -- 결제번호
		);

-- Pay_Type
CREATE TABLE Pay_Type (
	pay_type_num  INTEGER     NOT NULL, -- 구매분류
	pay_type_name VARCHAR(20) NOT NULL  -- 구매구분명
);

-- Pay_Type
ALTER TABLE Pay_Type
	ADD
		CONSTRAINT PK_Pay_Type -- Pay_Type 기본키
		PRIMARY KEY (
			pay_type_num -- 구매분류
		);

-- Employees
CREATE TABLE Employees (
	employee_num           INTEGER     NOT NULL, -- 직원정보번호
	employee_name          VARCHAR(20) NOT NULL, -- 직원명
	employee_hp            VARCHAR(20) NOT NULL, -- 핸드폰번호
	employee_hire_date     DATE        NOT NULL, -- 입사일
	employee_id            VARCHAR(20) NOT NULL, -- 직원ID
	employee_pw            VARCHAR(20) NOT NULL, -- 직원PW
	employee_email         VARCHAR(20) NOT NULL, -- 직원Email
	employee_birth         VARCHAR(10) NOT NULL, -- 생년월일
	employee_position      VARCHAR(20) NOT NULL, -- 직급
	employee_hour_pay_rate INTEGER     NOT NULL, -- 시급
	employee_isMale        VARCHAR(1)  NULL      -- 성별
);

-- Employees
ALTER TABLE Employees
	ADD
		CONSTRAINT PK_Employees -- Employees 기본키
		PRIMARY KEY (
			employee_num -- 직원정보번호
		);

-- Game
CREATE TABLE Game (
	game_num      INTEGER     NOT NULL, -- 게임번호
	game_name     VARCHAR(20) NOT NULL, -- 게임명
	game_type_num VARCHAR(20) NULL      -- 게임구분번호
);

-- Game
ALTER TABLE Game
	ADD
		CONSTRAINT PK_Game -- Game 기본키
		PRIMARY KEY (
			game_num -- 게임번호
		);

-- Game_Type
CREATE TABLE Game_Type (
	game_type_num VARCHAR(20) NOT NULL, -- 게임구분번호
	game_genre    VARCHAR(20) NOT NULL  -- 게임장르
);

-- Game_Type
ALTER TABLE Game_Type
	ADD
		CONSTRAINT PK_Game_Type -- Game_Type 기본키
		PRIMARY KEY (
			game_type_num -- 게임구분번호
		);

-- Game_Usage_Info
CREATE TABLE Game_Usage_Info (
	game_usage_num INTEGER NOT NULL, -- 게임이용번호
	user_num       INTEGER NOT NULL, -- 회원번호
	game_num       INTEGER NOT NULL  -- 게임번호
);

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	ADD
		CONSTRAINT PK_Game_Usage_Info -- Game_Usage_Info 기본키
		PRIMARY KEY (
			game_usage_num -- 게임이용번호
		);

-- Work_Info
CREATE TABLE Work_Info (
	work_info_num INTEGER NOT NULL, -- 근무정보번호
	employee_num  INTEGER NULL,     -- 직원번호
	work_start    DATE    NULL,     -- 근무시작시간
	work_finish   DATE    NULL,     -- 근무마감시간
	work_hour     INTEGER NOT NULL  -- 근무시간
);

-- Work_Info
ALTER TABLE Work_Info
	ADD
		CONSTRAINT PK_Work_Info -- Work_Info 기본키
		PRIMARY KEY (
			work_info_num -- 근무정보번호
		);

-- Wage_Info
CREATE TABLE Wage_Info (
	employee_num    INTEGER NOT NULL, -- 직원번호
	work_hour_total INTEGER NULL,     -- 총근무시간
	work_wage_total INTEGER NULL      -- 급여합계
);

-- Wage_Info
ALTER TABLE Wage_Info
	ADD
		CONSTRAINT PK_Wage_Info -- Wage_Info 기본키
		PRIMARY KEY (
			employee_num -- 직원번호
		);

-- Wage_Accu_Info
CREATE TABLE Wage_Accu_Info (
	employee_num    INTEGER NOT NULL, -- 직원번호
	wage_month      DATE    NOT NULL, -- 월별
	work_hour_total INTEGER NULL,     -- 총근무시간
	work_wage_total INTEGER NULL      -- 급여합계
);

-- Wage_Accu_Info
ALTER TABLE Wage_Accu_Info
	ADD
		CONSTRAINT PK_Wage_Accu_Info -- Wage_Accu_Info 기본키
		PRIMARY KEY (
			employee_num, -- 직원번호
			wage_month    -- 월별
		);

-- Com
CREATE TABLE Com (
	com_num    INTEGER NOT NULL, -- 좌석번호
	user_num   INTEGER NULL,     -- 회원번호
	is_use     BOOLEAN NOT NULL, -- 사용여부
	is_booking BOOLEAN NOT NULL  -- 예약여부
);

-- Com
ALTER TABLE Com
	ADD
		CONSTRAINT PK_Com -- Com 기본키
		PRIMARY KEY (
			com_num -- 좌석번호
		);

-- User_Point_Info
CREATE TABLE User_Point_Info (
	user_num INTEGER NOT NULL, -- 회원번호
	point    INTEGER NOT NULL  -- 포인트
);

-- User_Point_Info
ALTER TABLE User_Point_Info
	ADD
		CONSTRAINT PK_User_Point_Info -- User_Point_Info 기본키
		PRIMARY KEY (
			user_num -- 회원번호
		);

-- Com_Prepaid_Info
CREATE TABLE Com_Prepaid_Info (
	prepaid_num   INTEGER NOT NULL, -- 정액번호
	prepaid_time  INTEGER NOT NULL, -- 정액시간
	prepaid_price INTEGER NOT NULL  -- 단가
);

-- Com_Prepaid_Info
ALTER TABLE Com_Prepaid_Info
	ADD
		CONSTRAINT PK_Com_Prepaid_Info -- Com_Prepaid_Info 기본키
		PRIMARY KEY (
			prepaid_num -- 정액번호
		);

-- Com_User_Info
CREATE TABLE Com_Use_Info (
	com_use_num     INTEGER NOT NULL, -- pc이용정보번호
	user_num        INTEGER NOT NULL, -- 회원번호
	com_num         INTEGER NOT NULL, -- 좌석번호
	com_start_time  DATE    NOT NULL, -- 사용시작시간
	com_use_time    DATE    NOT NULL, -- 사용시간
	com_finish_time DATE    NOT NULL  -- 종료시간
);

-- Com_User_Info
ALTER TABLE Com_Use_Info
	ADD
		CONSTRAINT PK_Com_Use_Info -- Com_User_Info 기본키
		PRIMARY KEY (
			com_use_num -- pc이용정보번호
		);

-- Settle_Account_Info
CREATE TABLE Settle_Account_Info (
	settle_account_num INTEGER    NOT NULL, -- 정산내역번호
	settle_date        VARCHAR(9) NOT NULL, -- 날짜
	order_money        INTEGER    NOT NULL, -- 주문금액
	pay_money          INTEGER    NOT NULL, -- 결제금액
	settle_total       INTEGER    NOT NULL  -- 합계
);

-- Settle_Account_Info
ALTER TABLE Settle_Account_Info
	ADD
		CONSTRAINT PK_Settle_Account_Info -- Settle_Account_Info 기본키
		PRIMARY KEY (
			settle_account_num -- 정산내역번호
		);

-- Point_Info
CREATE TABLE Point_Info (
	num   INTEGER NOT NULL, -- 포인트번호
	value INTEGER NULL,     -- 포인트값
	price INTEGER NULL      -- 가격
);

-- Point_Info
ALTER TABLE Point_Info
	ADD
		CONSTRAINT PK_Point_Info -- Point_Info 기본키
		PRIMARY KEY (
			num -- 포인트번호
		);

-- BlockedSite
CREATE TABLE BlockedSite (
	blockedsite_num  INTEGER     NOT NULL, -- 유해사이트번호
	blockedsite_url  VARCHAR(20) NULL,     -- 유해사이트URL
	blockedsite_name VARCHAR(30) NULL      -- 유해사이트이름
);

-- BlockedSite
ALTER TABLE BlockedSite
	ADD
		CONSTRAINT PK_BlockedSite -- BlockedSite 기본키
		PRIMARY KEY (
			blockedsite_num -- 유해사이트번호
		);

-- Limited_Age
CREATE TABLE Limited_Age (
	limitied_year INTEGER NULL -- 제한년생
);

-- User_Black_List
ALTER TABLE User_BlackList
	ADD
		CONSTRAINT FK_User_Info_TO_User_BlackList -- User_Info -> User_Black_List
		FOREIGN KEY (
			user_num -- 회원번호
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- 회원번호
		);

-- Food
ALTER TABLE Food
	ADD
		CONSTRAINT FK_Food_Type_TO_Food -- Food_Type -> Food
		FOREIGN KEY (
			food_type_num -- 음식구분번호
		)
		REFERENCES Food_Type ( -- Food_Type
			food_type_num -- 음식구분번호
		);

-- Order_Info
ALTER TABLE Order_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Order_Info -- User_Info -> Order_Info
		FOREIGN KEY (
			user_num -- 회원번호
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- 회원번호
		);

-- Order_Info
ALTER TABLE Order_Info
	ADD
		CONSTRAINT FK_Food_TO_Order_Info -- Food -> Order_Info
		FOREIGN KEY (
			food_num -- 음식번호
		)
		REFERENCES Food ( -- Food
			food_num -- 음식번호
		);

-- Pay_Info
ALTER TABLE Pay_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Pay_Info -- User_Info -> Pay_Info
		FOREIGN KEY (
			user_num -- 회원번호
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- 회원번호
		);

-- Pay_Info
ALTER TABLE Pay_Info
	ADD
		CONSTRAINT FK_Pay_Type_TO_Pay_Info -- Pay_Type -> Pay_Info
		FOREIGN KEY (
			pay_type_num -- 결제구분번호
		)
		REFERENCES Pay_Type ( -- Pay_Type
			pay_type_num -- 구매분류
		);

-- Game
ALTER TABLE Game
	ADD
		CONSTRAINT FK_Game_Type_TO_Game -- Game_Type -> Game
		FOREIGN KEY (
			game_type_num -- 게임구분번호
		)
		REFERENCES Game_Type ( -- Game_Type
			game_type_num -- 게임구분번호
		);

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Game_Usage_Info -- User_Info -> Game_Usage_Info
		FOREIGN KEY (
			user_num -- 회원번호
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- 회원번호
		);

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	ADD
		CONSTRAINT FK_Game_TO_Game_Usage_Info -- Game -> Game_Usage_Info
		FOREIGN KEY (
			game_num -- 게임번호
		)
		REFERENCES Game ( -- Game
			game_num -- 게임번호
		);

-- Work_Info
ALTER TABLE Work_Info
	ADD
		CONSTRAINT FK_Employees_TO_Work_Info -- Employees -> Work_Info
		FOREIGN KEY (
			employee_num -- 직원번호
		)
		REFERENCES Employees ( -- Employees
			employee_num -- 직원정보번호
		);

-- Wage_Info
ALTER TABLE Wage_Info
	ADD
		CONSTRAINT FK_Employees_TO_Wage_Info -- Employees -> Wage_Info
		FOREIGN KEY (
			employee_num -- 직원번호
		)
		REFERENCES Employees ( -- Employees
			employee_num -- 직원정보번호
		);

-- Wage_Accu_Info
ALTER TABLE Wage_Accu_Info
	ADD
		CONSTRAINT FK_Employees_TO_Wage_Accu_Info -- Employees -> Wage_Accu_Info
		FOREIGN KEY (
			employee_num -- 직원번호
		)
		REFERENCES Employees ( -- Employees
			employee_num -- 직원정보번호
		);

-- Com
ALTER TABLE Com
	ADD
		CONSTRAINT FK_User_Info_TO_Com -- User_Info -> Com
		FOREIGN KEY (
			user_num -- 회원번호
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- 회원번호
		);

-- User_Point_Info
ALTER TABLE User_Point_Info
	ADD
		CONSTRAINT FK_User_Info_TO_User_Point_Info -- User_Info -> User_Point_Info
		FOREIGN KEY (
			user_num -- 회원번호
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- 회원번호
		);

-- Com_User_Info
ALTER TABLE Com_Use_Info
	ADD
		CONSTRAINT FK_User_Info_TO_Com_Use_Info -- User_Info -> Com_User_Info
		FOREIGN KEY (
			user_num -- 회원번호
		)
		REFERENCES User_Info ( -- User_Info
			user_num -- 회원번호
		);

-- Com_User_Info
ALTER TABLE Com_Use_Info
	ADD
		CONSTRAINT FK_Com_TO_Com_Use_Info -- Com -> Com_User_Info
		FOREIGN KEY (
			com_num -- 좌석번호
		)
		REFERENCES Com ( -- Com
			com_num -- 좌석번호
		);