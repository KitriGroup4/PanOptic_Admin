package com.kitri.admin.main.employeePanel;

import java.awt.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class EmpList extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	
	JFrame jFrame = new JFrame();

	String columnNames[] =
	{ "�̸�", "�ٹ���", "�ּ�" };

	Object rowData[][] =
	{
	{ "�ڼ���", "2017-04-01", "����� ���α� ���ε�" },
	{ "�̵���", "2016-12-01", "����� ����� ������" },
	{ "�����", "2016-05-31", "����� ���α� ���ε�" } };

	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane jScollPane = new JScrollPane(jTable);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpList frame = new EmpList();
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
	public EmpList() {
		setForeground(SystemColor.menu);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC9C1\uC6D0\uB9AC\uC2A4\uD2B8");
		lblNewLabel.setBounds(17, 25, 78, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\java\\workspace\\javase\\PanOptic\\src\\img\\q1.png"));
		btnNewButton.setBounds(631, 25, 30, 27);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(436, 25, 186, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(17, 60, 644, 479);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollBar scrollBar = new JScrollBar();
		panel.add(scrollBar, BorderLayout.EAST);
		
		panel.add(jScollPane);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JButton detail = new JButton("�ڼ���");
		detail.setBounds(510, 540, 100, 30);
		contentPane.add(detail);
		
		setResizable(false);
		setLocationRelativeTo(null);
	}
}
