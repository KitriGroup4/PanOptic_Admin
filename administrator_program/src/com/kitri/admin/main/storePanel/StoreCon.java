package com.kitri.admin.main.storePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreCon implements ActionListener {
	StoreMain storeMain;
	StoreService service;
	public StoreCon(StoreMain storeMain) {
		this.storeMain = storeMain;
		service = new StoreServiceImpl (storeMain);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		String yyyy = storeMain.settleAccount.yy.getSelectedItem() + "";
		String mm = storeMain.settleAccount.mm.getSelectedItem() + "";
		String dd = storeMain.settleAccount.dd.getSelectedItem() + "";
		System.out.println(yyyy);
		System.out.println(mm);
		System.out.println(dd);
		if (ob == storeMain.settleBtn)
			service.viewSettleAccount ();
		else if (ob == storeMain.settleAccount.searchBtn)
			service.search (yyyy, mm, dd);
	}
	
	

}
