package com.kitri.admin.main.storePanel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;

public class StoreMain extends JPanel {
	JButton settleBtn;
	StoreCon control;
	
	public StoreSettleAccount settleAccount;
		
	public StoreMain() {
		
		settleAccount = new StoreSettleAccount();
		control = new StoreCon(this);
		
		setLayout(new GridLayout(10, 1, 0, 0));
		settleBtn = new JButton("����");
		add(settleBtn);
		
//		store �̺�Ʈ
		settleBtn.addActionListener(control);
		
//		settle �̺�Ʈ
		settleAccount.searchBtn.addActionListener(control);
	}

}
