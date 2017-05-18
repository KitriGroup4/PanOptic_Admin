package com.kitri.admin.main.customerPanel;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CusMain extends JPanel {
	CusList cusList;
	JButton cusListBtn;
	/**
	 * Create the panel.
	 */
	public CusMain() {
		cusList = new CusList();
		setLayout(new GridLayout(10, 1, 0, 0));
		
		cusListBtn = new JButton("\uD68C\uC6D0\uB9AC\uC2A4\uD2B8");
		add(cusListBtn);
		
		cusListBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cusList.setVisible(true);
			}
		});
		
	}

}
