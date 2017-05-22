package com.kitri.admin.main.controlPanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.kitri.admin.main.fixCon.Fix;

public class ControlRegBlockedSite extends JInternalFrame {
	JPanel contentPane;
	JTextField urlTF;
	JTextField siteNameTF;
	JLabel siteNameL;
	JLabel urlL;
	JButton ok;

	public ControlRegBlockedSite() {
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		getContentPane().setLayout(null);
		
		urlL = new JLabel("URL");
		urlL.setBounds(100, 85, 60, 14);
		getContentPane().add(urlL);
		
		siteNameL = new JLabel("\uC2F8\uC774\uD2B8\uBA85");
		siteNameL.setBounds(100, 125, 60, 14);
		getContentPane().add(siteNameL);
		
		urlTF = new JTextField();
		urlTF.setBounds(210, 80, 150, 20);
		getContentPane().add(urlTF);
		urlTF.setColumns(10);
		urlTF.requestFocus();
		
		siteNameTF = new JTextField();
		siteNameTF.setBounds(210, 120, 150, 20);
		getContentPane().add(siteNameTF);
		siteNameTF.setColumns(10);
		
		ok = new JButton("Ȯ��");
		ok.setBounds(180, 170, 90, 23);
		getContentPane().add(ok);
		
		Fix.FIXFRAME(this);
	}
}
