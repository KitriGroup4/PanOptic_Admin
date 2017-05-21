package com.kitri.admin.main.Login;

import javax.swing.JOptionPane;

public class AdminLoginServiceImpl implements AdminLoginService {
	AdminLogin login;
	AdminLoginDao dao;

	public AdminLoginServiceImpl() {

	}

	public AdminLoginServiceImpl(AdminLogin login) {
		this.login = login;
		dao = new AdminLoginDaoImpl(login);
	}

	@Override
	public void viewMain() {
//		clearTf();
		login.pcMain.setVisible(true);
	}

	@Override
	public void closeLogin() {
		clearTf();
		login.setVisible(false);
	}

	@Override
	public void existEmp (String id, String pw) {
		boolean idcheck = false;
		boolean pwcheck = true;
		
//		idcheck = true;
//		pwcheck = dao.matchPw(id, pw);
		
		if (id.isEmpty()) {
			JOptionPane.showMessageDialog(login, "id를 입력해 주세요");
			return;
		} 
		if (pw.isEmpty()) {
			JOptionPane.showMessageDialog(login, "password를 입력해 주세요");
			return;
		} 
		if (idcheck) {
			JOptionPane.showMessageDialog(login, "id가 존재하지 않습니다.");
			clearTf();
			return;
		} 
		if (pwcheck)
			login.pcMain.setVisible(true);
		else {
			JOptionPane.showMessageDialog(login, "비밀번호가 틀렸습니다.");
			return;
		}
		clearTf();
	}

	private void clearTf() {
//		login.idTf.setText("");
//		login.pwTf.setText("");
		login.idTf.requestFocus();
	}
}
