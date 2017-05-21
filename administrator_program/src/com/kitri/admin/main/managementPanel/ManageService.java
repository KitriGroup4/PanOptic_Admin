package com.kitri.admin.main.managementPanel;

public interface ManageService {
	void viewRegEmp();
	void viewWageInfo();
	void updateWageJTable ();

	void checkId (String id);
	boolean isIdTfEmpty (String id);
}
