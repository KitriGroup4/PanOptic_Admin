package com.kitri.admin.main.employeePanel;

import javax.swing.JPanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpMain extends JPanel {
	JButton empList;
	EmpList empDetail;
	/**
	 * Create the panel.
	 */
	public EmpMain() {
		empDetail = new EmpList();
		setLayout(new GridLayout(10, 1, 0, 0));
		empList = new JButton("\uC9C1\uC6D0\uB9AC\uC2A4\uD2B8");
		add(empList);
		
		empList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				empDetail.setVisible(true);
			}
		});
	}

}
