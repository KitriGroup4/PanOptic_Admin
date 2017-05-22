package com.kitri.admin.main.managementPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ManageEmpDel extends JInternalFrame {

	private JPanel contentPane;
	private JTextField idTf;
	private JTextField nameTf;

	public ManageEmpDel() {
		setTitle("\uC9C1\uC6D0\uC815\uBCF4\uC0AD\uC81C");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 1, 0, 0));
		
		JLabel empty = new JLabel("");
		panel.add(empty);
		
		JPanel centerP = new JPanel();
		panel.add(centerP);
		centerP.setLayout(null);
		
		JLabel idL = new JLabel("ID :");
		idL.setHorizontalAlignment(SwingConstants.RIGHT);
		idL.setBounds(79, 2, 46, 25);
		centerP.add(idL);
		
		idTf = new JTextField();
		idTf.setBounds(149, 0, 165, 28);
		centerP.add(idTf);
		idTf.setColumns(10);
		
		JLabel nameL = new JLabel("Name :");
		nameL.setHorizontalAlignment(SwingConstants.RIGHT);
		nameL.setBounds(79, 36, 46, 26);
		centerP.add(nameL);
		
		nameTf = new JTextField();
		nameTf.setBounds(149, 36, 165, 26);
		centerP.add(nameTf);
		nameTf.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel bottomP = new JPanel();
		panel.add(bottomP);
		
		JButton deleteEmp = new JButton("\uC0AD\uC81C");
		bottomP.add(deleteEmp);
		
		JButton update = new JButton("\uC218\uC815");
		bottomP.add(update);
		
		JButton exit = new JButton("\uB098\uAC00\uAE30");
		bottomP.add(exit);
		
		setVisible(true);
		setResizable(false);
//		setLocation(null);
	}
	public static void main(String[] args) {
		new ManageEmpDel();
	}
}
