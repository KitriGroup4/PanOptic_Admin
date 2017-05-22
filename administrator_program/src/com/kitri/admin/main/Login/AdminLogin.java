package com.kitri.admin.main.Login;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.kitri.admin.main.PcMain;
import com.kitri.admin.main.fixCon.Fix;

public class AdminLogin extends JFrame {
	public JPanel contentPane;
	public JTextField idTf;
	public JTextField pwTf;
	JButton loginBtn;

	PcMain pcMain;
	AdminLoginCon control;
	
	public AdminLogin() {
		pcMain = new PcMain(null); //////////////////////////////////////////////////////////////////////////////////////////
		control = new AdminLoginCon(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel idL = new JLabel("I D :");
		idL.setHorizontalAlignment(SwingConstants.CENTER);
		idL.setBounds(28, 90, 75, 22);
		contentPane.add(idL);

		JLabel pwL = new JLabel("Password :");
		pwL.setHorizontalAlignment(SwingConstants.CENTER);
		pwL.setBounds(28, 123, 75, 27);
		contentPane.add(pwL);

		idTf = new JTextField();
		idTf.setBounds(109, 90, 135, 22);
		contentPane.add(idTf);
//		idTf.setcolsetColumns(10);

		pwTf = new JTextField();
//		pwTf.setColumns(10);
		pwTf.setBounds(109, 123, 135, 22);
		contentPane.add(pwTf);

		loginBtn = new JButton("Log in");
		loginBtn.setBounds(91, 184, 89, 34);
		contentPane.add(loginBtn);

		setLocationRelativeTo(null);
		
//		Fix.FIXFRAME(this);
//		login 이베트 등록
		loginBtn.addActionListener(control);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
