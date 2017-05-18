package com.kitri.admin.main.employeePanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.Component;

public class EmpDetailInfo extends JFrame {

	private JPanel contentPane;
	private JTextField nameTf;
	private JTextField hpTf;
	private JTextField phoneTf;
	private JTextField wageTf;
	
	private JPanel joinInfoLabelPanel;
	private JPanel empinfoPanel;
	private JLabel nameLabel;
	private JLabel hpLabel;
	private JLabel phoneLabel;
	private JLabel hire_dateLabel;
	private JLabel jobLabel;
	private JLabel wageLabel;
	private JPanel joinInfoTfPanel;
	public JButton modifyInfoBut;
	public JButton closeBut;
	public JPanel yymmdd;
	private JPanel joinInfoCbTfPanel2;
	public JComboBox jobCb;
	public JComboBox yy;
	public JComboBox mm;
	public JComboBox dd;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpDetailInfo frame = new EmpDetailInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmpDetailInfo() {
		setTitle("\uC0C1\uC138\uC815\uBCF4\uC870\uD68C");
		setBounds(100, 100, 410, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		empinfoPanel = new JPanel();
		empinfoPanel.setBounds(0, 0, 388, 332);
		contentPane.add(empinfoPanel);
		empinfoPanel.setLayout(null);
		empinfoPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		joinInfoLabelPanel = new JPanel();
		joinInfoLabelPanel.setBounds(17, 25, 54, 237);
		empinfoPanel.add(joinInfoLabelPanel);
		joinInfoLabelPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		nameLabel = new JLabel("\uC774\uB984");
		nameLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinInfoLabelPanel.add(nameLabel);
		
		hpLabel = new JLabel("\uC5F0\uB77D\uCC98");
		hpLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		hpLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinInfoLabelPanel.add(hpLabel);
		
		phoneLabel = new JLabel("\uD578\uB4DC\uD3F0");
		phoneLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		phoneLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinInfoLabelPanel.add(phoneLabel);
		
		hire_dateLabel = new JLabel("\uC785\uC0AC\uC77C");
		hire_dateLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		hire_dateLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinInfoLabelPanel.add(hire_dateLabel);
		
		jobLabel = new JLabel("\uC9C1\uAE09");
		joinInfoLabelPanel.add(jobLabel);
		
		wageLabel = new JLabel("\uC2DC\uAE09");
		joinInfoLabelPanel.add(wageLabel);
		
		joinInfoTfPanel = new JPanel();
		joinInfoTfPanel.setBounds(78, 25, 290, 120);
		empinfoPanel.add(joinInfoTfPanel);
		joinInfoTfPanel.setLayout(new GridLayout(3, 0, 5, 5));
		
		nameTf = new JTextField();
		nameTf.setColumns(10);
		joinInfoTfPanel.add(nameTf);
		
		hpTf = new JTextField();
		hpTf.setColumns(10);
		joinInfoTfPanel.add(hpTf);
		
		phoneTf = new JTextField();
		phoneTf.setColumns(10);
		joinInfoTfPanel.add(phoneTf);
		
		modifyInfoBut = new JButton("\uC815\uBCF4\uC218\uC815");
		modifyInfoBut.setBounds(17, 278, 171, 40);
		empinfoPanel.add(modifyInfoBut);
		
		closeBut = new JButton("\uB098\uAC00\uAE30");
		closeBut.setBounds(197, 278, 171, 40);
		empinfoPanel.add(closeBut);
		
		yymmdd = new JPanel();
		yymmdd.setBounds(78, 151, 290, 29);
		empinfoPanel.add(yymmdd);
		yymmdd.setLayout(new GridLayout(1, 3, 5, 5));
		
		yy = new JComboBox();
		addComboBoxItems(yy, 1980, 2017);
		yymmdd.add(yy);
		
		mm = new JComboBox();
		addComboBoxItems(mm, 1, 12);
		yymmdd.add(mm);
		
		dd = new JComboBox();
		addComboBoxItems(dd, 1, 31);
		yymmdd.add(dd);
		
		joinInfoCbTfPanel2 = new JPanel();
		joinInfoCbTfPanel2.setBounds(78, 185, 290, 77);
		empinfoPanel.add(joinInfoCbTfPanel2);
		joinInfoCbTfPanel2.setLayout(new GridLayout(2, 0, 5, 5));
		
		jobCb = new JComboBox();
		joinInfoCbTfPanel2.add(jobCb);
		jobCb.addItem("관리자");
		jobCb.addItem("직원");
		
		wageTf = new JTextField();
		wageTf.setColumns(10);
		joinInfoCbTfPanel2.add(wageTf);
	}

	private void addComboBoxItems(JComboBox box, int start, int end) {
		for (int i = start; i <= end; i++) {
			box.addItem(i);
		}
	}
}
