package com.kitri.admin.main.leftoverPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeftCon  implements ActionListener {
	LeftMain leftMain;
	LeftService leftSer;
	LeftDaoService leftDaoSerImpl;
	
	public LeftCon() {
		super();
	}

	public LeftCon (LeftMain leftMain) {
		super();
		this.leftMain = leftMain;
		leftSer = new LeftServiceImpl(leftMain);
		leftDaoSerImpl = new LeftDaoServiceImpl(leftMain);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		leftMain.leftList.setVisible(true);
	}

}
