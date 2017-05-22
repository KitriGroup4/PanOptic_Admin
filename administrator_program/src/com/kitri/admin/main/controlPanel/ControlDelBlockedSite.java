package com.kitri.admin.main.controlPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.kitri.admin.main.fixCon.Fix;

public class ControlDelBlockedSite extends JInternalFrame {
	JPanel contentPane;
	JTextField siteNameTF;
	JButton ok;
	JLabel siteName;

	public ControlDelBlockedSite() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		getContentPane().setLayout(null);
		
		siteName = new JLabel("\uC2F8\uC774\uD2B8\uBA85");
		siteName.setBounds(100, 105, 80, 14);
		getContentPane().add(siteName);
		
		siteNameTF = new JTextField();
		siteNameTF.setBounds(200, 102, 150, 20);
		getContentPane().add(siteNameTF);
		siteNameTF.setColumns(10);
		siteNameTF.requestFocus();
		
		ok = new JButton("»Æ¿Œ");
		ok.setBounds(170, 160, 90, 21);
		getContentPane().add(ok);
		
		Fix.FIXFRAME(this);
	}

}
