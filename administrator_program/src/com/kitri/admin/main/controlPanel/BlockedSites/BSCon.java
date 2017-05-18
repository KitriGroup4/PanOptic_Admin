package com.kitri.admin.main.controlPanel.BlockedSites;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BSCon implements ActionListener {
	
	public BSMain bsMain;
	public BSService bsService;
	public BSDaoService daoSerImpl;
	
	public BSCon(BSMain bsMain) {
		super();
		this.bsMain = bsMain;
		bsService = new BSServiceImpl(bsMain);
		daoSerImpl = new BSDaoServiceImpl(bsMain);
//		int len = BSConstant.column.length;
//		for (int i = 0; i < len; i++) {
//			bsFrame.columnNames.add(BSConstant.column[i]);
//		}
	}

	// 필요한 listener 정리
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == bsMain.register) {
			bsMain.reg.setVisible(true);
		} 
		else if (ob == bsMain.delete) {
			bsMain.del.setVisible(true);
		}
		else if (ob == bsMain.reg.ok || ob == bsMain.reg.siteNameTF) {
//			System.out.println(bsMain.reg.urlTF.getText());
			daoSerImpl.register(300, bsMain.reg.urlTF.getText(), bsMain.reg.siteNameTF.getText());
		}
		else if (ob == bsMain.reg.urlTF) {
			bsMain.del.setVisible(true);
		}
		else if (ob == bsMain.del.ok || ob == bsMain.del.siteNameTF) {
			daoSerImpl.delete(bsMain.del.siteNameTF.getText());
				
		}
	}
}
