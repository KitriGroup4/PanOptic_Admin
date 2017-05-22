package com.kitri.admin.main.managementPanel;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

public class ManageEmpReg extends JFrame {

	private JPanel contentPane;
	public JPanel RadionButPanel;
	public JLabel infoLabel;
	public JPanel subInfoCbTfPanel2;

	private JLabel addinfoLabel;
	private JPanel subInfoTfPanel;
	private JPanel backgroundPanel;
	private JPanel joinBasicPanel;
	private JLabel IdLabel;
	private JLabel nameLabel;
	private JLabel pwLabel;
	private JLabel pwCheckLabel;
	private JLabel birthLabel;
	private JLabel hireDateL;
	private JPanel joinBasicTfPanel;
	private JPanel subInfoLabelPanel2;
	private JLabel jobLabel;
	private JLabel phoneLabel;
	private JPanel subinfoLabelPanel;
	private JLabel eMailLabel;
	private JLabel wageL;
	
	public JButton joinBtn;
	public JButton closeBtn;
	public JButton checkBtn;

	public JComboBox position;
	
	CheckboxGroup isMale;
	Checkbox manCheck;
	Checkbox womanCheck;
	
	public JTextField empJoinTf;
	public JTextField idTf;
	public JTextField nameTf;
	public JTextField eMailTf;
	public JTextField hourPayTf;
	public JTextField hpTf;
	public JPasswordField pwTf;
	public JPasswordField pwCheckTf;
	
	public JPanel hireyymmdd;
	public JComboBox hireYear;
	public JComboBox hireMonth;
	public JComboBox hireDay;
	
	public JPanel yymmdd;
	public JComboBox yy;
	public JComboBox mm;
	public JComboBox dd;
	
	public ManageEmpReg() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		backgroundPanel = new JPanel();
		backgroundPanel.setLayout(null);
		backgroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		backgroundPanel.setBounds(0, 0, 478, 545);
		contentPane.add(backgroundPanel);
		
		empJoinTf = new JTextField();
		empJoinTf.setText("직원등록");
		empJoinTf.setHorizontalAlignment(SwingConstants.CENTER);
		empJoinTf.setEditable(false);
		empJoinTf.setColumns(10);
		empJoinTf.setBounds(17, 25, 444, 50);
		backgroundPanel.add(empJoinTf);
		
		joinBasicPanel = new JPanel();
		joinBasicPanel.setBounds(17, 116, 91, 245);
		backgroundPanel.add(joinBasicPanel);
		joinBasicPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		IdLabel = new JLabel("* \uC544\uC774\uB514");
		IdLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		IdLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinBasicPanel.add(IdLabel);
		
		nameLabel = new JLabel("* \uC774\uB984");
		nameLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinBasicPanel.add(nameLabel);
		
		pwLabel = new JLabel("* \uBE44\uBC00\uBC88\uD638");
		pwLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		pwLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinBasicPanel.add(pwLabel);
		
		pwCheckLabel = new JLabel("* \uBE44\uBC00\uBC88\uD638\uD655\uC778");
		pwCheckLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		pwCheckLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinBasicPanel.add(pwCheckLabel);
		
		birthLabel = new JLabel("* \uC0DD\uB144\uC6D4\uC77C");
		birthLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		birthLabel.setHorizontalAlignment(SwingConstants.LEFT);
		joinBasicPanel.add(birthLabel);
		
		hireDateL = new JLabel("* \uC785\uC0AC\uC77C");
		hireDateL.setHorizontalAlignment(SwingConstants.LEFT);
		joinBasicPanel.add(hireDateL);
		
		joinBasicTfPanel = new JPanel();
		joinBasicTfPanel.setBounds(114, 116, 234, 245);
		backgroundPanel.add(joinBasicTfPanel);
		joinBasicTfPanel.setLayout(new GridLayout(6, 0, 5, 5));
		
		idTf = new JTextField();
		idTf.setColumns(10);
		joinBasicTfPanel.add(idTf);
		
		nameTf = new JTextField();
		nameTf.setColumns(10);
		joinBasicTfPanel.add(nameTf);
		
		pwTf = new JPasswordField();
		joinBasicTfPanel.add(pwTf);
		
		pwCheckTf = new JPasswordField();
		joinBasicTfPanel.add(pwCheckTf);
		
		yymmdd = new JPanel();
		joinBasicTfPanel.add(yymmdd);
		yymmdd.setLayout(new GridLayout(1, 3, 5, 5));
		
		yy = new JComboBox();
		addComboBoxItems(yy, 1980, 2010);
		yymmdd.add(yy);
		
		mm = new JComboBox();
		addComboBoxItems(mm, 1, 12);
		yymmdd.add(mm);
		
		dd = new JComboBox();
		addComboBoxItems(dd, 1, 31);
		yymmdd.add(dd);
		
		hireyymmdd = new JPanel();
		joinBasicTfPanel.add(hireyymmdd);
		hireyymmdd.setLayout(new GridLayout(1, 3, 3, 3));
		
		hireYear = new JComboBox();
		addComboBoxItems(hireYear, 1980, 2017);
		hireyymmdd.add(hireYear);
		
		hireMonth = new JComboBox();
		addComboBoxItems(hireMonth, 1, 12);
		hireyymmdd.add(hireMonth);
		
		hireDay = new JComboBox();
		addComboBoxItems(hireDay, 1, 31);
		hireyymmdd.add(hireDay);
		
		checkBtn = new JButton("\uC911\uBCF5\uD655\uC778");
		checkBtn.setBounds(356, 116, 105, 35);
		backgroundPanel.add(checkBtn);
		
		RadionButPanel = new JPanel();
		RadionButPanel.setBounds(356, 324, 105, 43);
		backgroundPanel.add(RadionButPanel);
		
		isMale = new CheckboxGroup();
		manCheck = new Checkbox("남자", isMale, true);
		womanCheck = new Checkbox("여자", isMale, false);
		RadionButPanel.add(manCheck);
		RadionButPanel.add(womanCheck);
		
		infoLabel = new JLabel("\uAE30\uBCF8\uC815\uBCF4");
		infoLabel.setHorizontalAlignment(SwingConstants.LEFT);
		infoLabel.setBounds(17, 90, 91, 21);
		backgroundPanel.add(infoLabel);
		
		addinfoLabel = new JLabel("\uBD80\uAC00\uC815\uBCF4");
		addinfoLabel.setHorizontalAlignment(SwingConstants.LEFT);
		addinfoLabel.setBounds(17, 376, 91, 21);
		backgroundPanel.add(addinfoLabel);
		
		subInfoTfPanel = new JPanel();
		subInfoTfPanel.setBounds(79, 404, 156, 74);
		backgroundPanel.add(subInfoTfPanel);
		subInfoTfPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		eMailTf = new JTextField();
		eMailTf.setHorizontalAlignment(SwingConstants.LEFT);
		eMailTf.setColumns(10);
		subInfoTfPanel.add(eMailTf);
		
		hourPayTf = new JTextField();
		hourPayTf.setHorizontalAlignment(SwingConstants.LEFT);
		hourPayTf.setColumns(10);
		subInfoTfPanel.add(hourPayTf);
		
		subInfoCbTfPanel2 = new JPanel();
		subInfoCbTfPanel2.setBounds(291, 404, 170, 74);
		backgroundPanel.add(subInfoCbTfPanel2);
		subInfoCbTfPanel2.setLayout(new GridLayout(0, 1, 5, 5));
		
		position = new JComboBox();
		subInfoCbTfPanel2.add(position);
		position.addItem("관리자");
		position.addItem("직원");
		
		hpTf = new JTextField();
		hpTf.setColumns(10);
		subInfoCbTfPanel2.add(hpTf);
		
		subInfoLabelPanel2 = new JPanel();
		subInfoLabelPanel2.setBounds(239, 404, 61, 74);
		backgroundPanel.add(subInfoLabelPanel2);
		subInfoLabelPanel2.setLayout(new GridLayout(0, 1, 5, 5));
		
		jobLabel = new JLabel("* \uC9C1\uAE09");
		jobLabel.setHorizontalAlignment(SwingConstants.LEFT);
		subInfoLabelPanel2.add(jobLabel);
		
		phoneLabel = new JLabel("* \uD578\uB4DC\uD3F0");
		phoneLabel.setHorizontalAlignment(SwingConstants.LEFT);
		subInfoLabelPanel2.add(phoneLabel);
		
		subinfoLabelPanel = new JPanel();
		subinfoLabelPanel.setBounds(17, 404, 72, 74);
		backgroundPanel.add(subinfoLabelPanel);
		subinfoLabelPanel.setLayout(new GridLayout(0, 1, 5, 5));
		
		eMailLabel = new JLabel("* E-Mail");
		eMailLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		eMailLabel.setHorizontalAlignment(SwingConstants.LEFT);
		subinfoLabelPanel.add(eMailLabel);
		
		wageL = new JLabel("* \uC2DC\uAE09");
		wageL.setHorizontalTextPosition(SwingConstants.LEFT);
		wageL.setHorizontalAlignment(SwingConstants.LEFT);
		subinfoLabelPanel.add(wageL);
		
		closeBtn = new JButton("\uB2EB\uAE30");
		closeBtn.setBounds(336, 495, 125, 35);
		backgroundPanel.add(closeBtn);
		
		joinBtn = new JButton("\uAC00\uC785\uC694\uCCAD");
		joinBtn.setBounds(194, 496, 125, 34);
		backgroundPanel.add(joinBtn);
		
		this.setLocationRelativeTo(null);
	}

	private void addComboBoxItems(JComboBox box, int start, int end) {
		for (int i = start; i <= end; i++) {
			box.addItem(i);
		}
	}
}
