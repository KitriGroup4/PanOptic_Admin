package com.kitri.admin.main.employeePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CusCon implements ActionListener {
	CusMain cusMain;
	CusService service;

	public CusCon(CusMain cusMain) {
		this.cusMain = cusMain;
		service = new CusServiceImpl(cusMain);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == cusMain.cusListBtn) {
			service.updateUserJTable();
			service.updateBlackUserJTable();
			service.viewCusList();
		}
		else if (ob == cusMain.cusList.searchTf || ob == cusMain.cusList.searchBut) {
			service.searchCustomer (cusMain.cusList.searchTf.getText().trim());

		} 
		else if (ob == cusMain.cusList.listCombo) {
			String str = "";
			str = (String) cusMain.cusList.listCombo.getSelectedItem();
			if (str.equals("고객리스트")) {
				cusMain.cusList.card.show(cusMain.cusList.jTablePanel, "user");
			} else if (str.equals("블랙리스트")) {
				cusMain.cusList.card.show(cusMain.cusList.jTablePanel, "black");
			}
		}
	}

}
