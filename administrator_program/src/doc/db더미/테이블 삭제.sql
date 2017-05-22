-- User_Black_List
ALTER TABLE User_BlackList
	DROP CONSTRAINT FK_User_Info_TO_User_BlackList; -- User_Info -> User_Black_List

-- Food
ALTER TABLE Food
	DROP CONSTRAINT FK_Food_Type_TO_Food; -- Food_Type -> Food

-- Order_Info
ALTER TABLE Order_Info
	DROP CONSTRAINT FK_User_Info_TO_Order_Info; -- User_Info -> Order_Info

-- Order_Info
ALTER TABLE Order_Info
	DROP CONSTRAINT FK_Food_TO_Order_Info; -- Food -> Order_Info

-- Pay_Info
ALTER TABLE Pay_Info
	DROP CONSTRAINT FK_User_Info_TO_Pay_Info; -- User_Info -> Pay_Info

-- Pay_Info
ALTER TABLE Pay_Info
	DROP CONSTRAINT FK_Pay_Type_TO_Pay_Info; -- Pay_Type -> Pay_Info

-- Game
ALTER TABLE Game
	DROP CONSTRAINT FK_Game_Type_TO_Game; -- Game_Type -> Game

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	DROP CONSTRAINT FK_User_Info_TO_Game_Usage_Info; -- User_Info -> Game_Usage_Info

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	DROP CONSTRAINT FK_Game_TO_Game_Usage_Info; -- Game -> Game_Usage_Info

-- Work_Info
ALTER TABLE Work_Info
	DROP CONSTRAINT FK_Employees_TO_Work_Info; -- Employees -> Work_Info

-- Wage_Info
ALTER TABLE Wage_Info
	DROP CONSTRAINT FK_Employees_TO_Wage_Info; -- Employees -> Wage_Info

-- Wage_Accu_Info
ALTER TABLE Wage_Accu_Info
	DROP CONSTRAINT FK_Employees_TO_Wage_Accu_Info; -- Employees -> Wage_Accu_Info

-- Com
ALTER TABLE Com
	DROP CONSTRAINT FK_User_Info_TO_Com; -- User_Info -> Com

-- User_Point_Info
ALTER TABLE User_Point_Info
	DROP CONSTRAINT FK_User_Info_TO_User_Point_Info; -- User_Info -> User_Point_Info

-- Com_User_Info
ALTER TABLE Com_Use_Info
	DROP CONSTRAINT FK_User_Info_TO_Com_Use_Info; -- User_Info -> Com_User_Info

-- Com_User_Info
ALTER TABLE Com_Use_Info
	DROP CONSTRAINT FK_Com_TO_Com_Use_Info; -- Com -> Com_User_Info

-- User_Info
ALTER TABLE User_Info
	DROP CONSTRAINT PK_User_Info; -- User_Info 기본키

-- User_Black_List
ALTER TABLE User_BlackList
	DROP CONSTRAINT PK_User_BlackList; -- User_Black_List 기본키

-- Food
ALTER TABLE Food
	DROP CONSTRAINT PK_Food; -- Food 기본키

-- Food_Type
ALTER TABLE Food_Type
	DROP CONSTRAINT PK_Food_Type; -- Food_Type 기본키

-- Order_Info
ALTER TABLE Order_Info
	DROP CONSTRAINT PK_Order_Info; -- Order_Info 기본키

-- Pay_Info
ALTER TABLE Pay_Info
	DROP CONSTRAINT PK_Pay_Info; -- Pay_Info 기본키

-- Pay_Type
ALTER TABLE Pay_Type
	DROP CONSTRAINT PK_Pay_Type; -- Pay_Type 기본키

-- Employees
ALTER TABLE Employees
	DROP CONSTRAINT PK_Employees; -- Employees 기본키

-- Game
ALTER TABLE Game
	DROP CONSTRAINT PK_Game; -- Game 기본키

-- Game_Type
ALTER TABLE Game_Type
	DROP CONSTRAINT PK_Game_Type; -- Game_Type 기본키

-- Game_Usage_Info
ALTER TABLE Game_Usage_Info
	DROP CONSTRAINT PK_Game_Usage_Info; -- Game_Usage_Info 기본키

-- Work_Info
ALTER TABLE Work_Info
	DROP CONSTRAINT PK_Work_Info; -- Work_Info 기본키

-- Wage_Info
ALTER TABLE Wage_Info
	DROP CONSTRAINT PK_Wage_Info; -- Wage_Info 기본키

-- Wage_Accu_Info
ALTER TABLE Wage_Accu_Info
	DROP CONSTRAINT PK_Wage_Accu_Info; -- Wage_Accu_Info 기본키

-- Com
ALTER TABLE Com
	DROP CONSTRAINT PK_Com; -- Com 기본키

-- User_Point_Info
ALTER TABLE User_Point_Info
	DROP CONSTRAINT PK_User_Point_Info; -- User_Point_Info 기본키

-- Com_Prepaid_Info
ALTER TABLE Com_Prepaid_Info
	DROP CONSTRAINT PK_Com_Prepaid_Info; -- Com_Prepaid_Info 기본키

-- Com_User_Info
ALTER TABLE Com_Use_Info
	DROP CONSTRAINT PK_Com_Use_Info; -- Com_User_Info 기본키

-- Settle_Account_Info
ALTER TABLE Settle_Account_Info
	DROP CONSTRAINT PK_Settle_Account_Info; -- Settle_Account_Info 기본키

-- Point_Info
ALTER TABLE Point_Info
	DROP CONSTRAINT PK_Point_Info; -- Point_Info 기본키

-- BlockedSite
ALTER TABLE BlockedSite
	DROP CONSTRAINT PK_BlockedSite; -- BlockedSite 기본키

-- User_Info
DROP TABLE User_Info;

-- User_Black_List
DROP TABLE User_BlackList;

-- Food
DROP TABLE Food;

-- Food_Type
DROP TABLE Food_Type;

-- Order_Info
DROP TABLE Order_Info;

-- Pay_Info
DROP TABLE Pay_Info;

-- Pay_Type
DROP TABLE Pay_Type;

-- Employees
DROP TABLE Employees;

-- Game
DROP TABLE Game;

-- Game_Type
DROP TABLE Game_Type;

-- Game_Usage_Info
DROP TABLE Game_Usage_Info;

-- Work_Info
DROP TABLE Work_Info;

-- Wage_Info
DROP TABLE Wage_Info;

-- Wage_Accu_Info
DROP TABLE Wage_Accu_Info;

-- Com
DROP TABLE Com;

-- User_Point_Info
DROP TABLE User_Point_Info;

-- Com_Prepaid_Info
DROP TABLE Com_Prepaid_Info;

-- Com_User_Info
DROP TABLE Com_Use_Info;

-- Settle_Account_Info
DROP TABLE Settle_Account_Info;

-- Point_Info
DROP TABLE Point_Info;

-- BlockedSite
DROP TABLE BlockedSite;

-- Limited_Age
DROP TABLE Limited_Age;