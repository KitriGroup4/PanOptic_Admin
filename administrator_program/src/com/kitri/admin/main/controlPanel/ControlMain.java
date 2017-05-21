package com.kitri.admin.main.controlPanel;

import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControlMain extends JPanel {
	JButton blockedSitesBtn;
	JButton ageRestrictionBtn;

	ControlBlockedSite blockedsite;
	ControlAgeRestriction ageRestirction;
	ControlDelBlockedSite delBlockedsite;
	ControlRegBlockedSite regBlockedsite;
	ControlCon control;
	

	public ControlMain() {
		blockedsite = new ControlBlockedSite();
		ageRestirction = new ControlAgeRestriction();
		delBlockedsite = new ControlDelBlockedSite();
		regBlockedsite = new ControlRegBlockedSite();
		control = new ControlCon(this);
		
		setLayout(new GridLayout(10, 1, 0, 0));
		blockedSitesBtn = new JButton("\uC720\uD574\uC2F8\uC774\uD2B8\uCC28\uB2E8 \uAD00\uB9AC");
		add(blockedSitesBtn);
		
		ageRestrictionBtn = new JButton("\uB098\uC774\uC81C\uD55C");
		add(ageRestrictionBtn);

//		main 이벤트
		blockedSitesBtn.addActionListener(control);
		ageRestrictionBtn.addActionListener(control);
//		 blockedsite 이벤트
		blockedsite.regBtn.addActionListener(control);
		blockedsite.delBtn.addActionListener(control);
		blockedsite.edit.addActionListener(control);
		blockedsite.jTable.addMouseListener(control);
//		 reg 이벤트
		regBlockedsite.ok.addActionListener(control);
		regBlockedsite.siteNameTF.addActionListener(control);
		regBlockedsite.urlTF.addActionListener(control);
//		 del 이벤트
		delBlockedsite.ok.addActionListener(control);
		delBlockedsite.siteNameTF.addActionListener(control);
//		
	}
}
