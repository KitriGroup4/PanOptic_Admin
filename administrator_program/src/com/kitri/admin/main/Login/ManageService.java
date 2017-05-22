package com.kitri.admin.main.Login;

public interface ManageService {
	void updateWageJTable ();
	void viewRegEmp();
	void closeRegEmp();
	void viewWageInfo();

	void checkId (String id);
	void registerEmp ();
	void searchWage (String str);
}
