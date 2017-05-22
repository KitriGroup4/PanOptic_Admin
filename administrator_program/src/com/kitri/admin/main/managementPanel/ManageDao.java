package com.kitri.admin.main.managementPanel;

import java.util.ArrayList;

import com.kitri.admin.main.customerPanel.CusDto;

public interface ManageDao {
	ArrayList<WageInfoDto> selectAll ();
	int findId (String id);
	int registerEmp ();
	
}
