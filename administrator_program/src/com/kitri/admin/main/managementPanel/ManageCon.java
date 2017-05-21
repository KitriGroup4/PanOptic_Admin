package com.kitri.admin.main.managementPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageCon implements ActionListener {
	private ManageMain manageMain;
	private ManageService service;
	private ManageDao dao;

	public ManageCon(ManageMain manageMain) {
		super();
		this.manageMain = manageMain;
		service = new ManageServiceImpl(manageMain);
		dao = new ManageDaoImpl(manageMain);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String id = manageMain.regEmp.IdTf.getText().trim();
		Object ob = e.getSource();
		if (ob == manageMain.regEmpBtn) {
			service.viewRegEmp ();
		} else if (ob == manageMain.wageManBtn) {
			service.viewWageInfo();
		} else if (ob == manageMain.regEmp.checkBtn) {
			service.checkId(id);
		} else if (ob == manageMain.regEmp.closeBtn) {

		} else if (ob == manageMain.regEmp.joinBtn) {

		} else if (ob == manageMain.wageInfo.searchBtn) {

		} else if (ob == manageMain.wageInfo.searchTf) {

		}
	}
}
