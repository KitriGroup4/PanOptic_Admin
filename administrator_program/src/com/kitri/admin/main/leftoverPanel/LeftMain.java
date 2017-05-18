package com.kitri.admin.main.leftoverPanel;

import javax.swing.JPanel;

import com.kitri.admin.main.fixCon.Fix;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LeftMain extends JPanel {
	JButton leftOverBtn;
	
	LeftList leftList;
	LeftCon control;
	
	
	public LeftMain() {
		leftList = new LeftList();
		control = new LeftCon(this);
		
		leftList = new LeftList();
		setLayout(new GridLayout(10, 1, 0, 0));

		leftOverBtn = new JButton("\uC7AC\uACE0\uAD00\uB9AC");
		add(leftOverBtn);
		
//		LeftMain â
		leftOverBtn.addActionListener(control);
//		leftList â
		
	}
}
