package com.kitri.admin.main.employeePanel;

import java.util.ArrayList;

public interface EmpDao {
	ArrayList<EmpDto> selectAll();
	EmpDto findUser(String name);
	int updateEmpInfo (String id);
	ArrayList<EmpDto> searchEmp (String name);
}
