package com.kitri.admin.main.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.ShutdownChannelGroupException;

import javax.swing.JOptionPane;

public class AdminLoginCon implements ActionListener {
	AdminLogin login;
	AdminLoginService service;

	public AdminLoginCon(AdminLogin login) {
		this.login = login;
		service = new AdminLoginServiceImpl(login);
	}

	public void actionPerformed(ActionEvent e) {
		service.loginProcess();
	}
}
