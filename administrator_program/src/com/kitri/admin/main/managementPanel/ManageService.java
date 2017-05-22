package com.kitri.admin.main.managementPanel;

public interface ManageService {
	void updateWageJTable ();
	void viewRegEmp();
	void closeRegEmp();
	void viewWageInfo();

	void checkId (String id);
	void registerEmp ();
	void searchWage (String str);
}
