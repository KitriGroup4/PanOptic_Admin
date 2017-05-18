package com.kitri.admin.main.managementPanel;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ManageMain extends JPanel {
	ManageEmpReg regEmp;
	ManageWageInfo wageInfo;
	JButton wageManBtn;
	JButton regEmpBtn;

	/**
	 * Create the panel.
	 */
	public ManageMain() {
		regEmp = new ManageEmpReg();
		wageInfo = new ManageWageInfo();

		setLayout(new GridLayout(10, 1, 0, 0));

		wageManBtn = new JButton("\uAE09\uC5EC\uAD00\uB9AC");
		add(wageManBtn);

		regEmpBtn = new JButton("\uC9C1\uC6D0\uB4F1\uB85D");
		add(regEmpBtn);

		JButton assetManagement = new JButton("\uC790\uC0B0\uAD00\uB9AC");
		add(assetManagement);

		wageManBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wageInfo.setVisible(true);
			}
		});
		
		regEmpBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				regEmp.setVisible(true);
			}
		});

	}

}
