package com.kitri.admin.main.managementPanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

import java.awt.Color;

public class ManageWageInfo extends JFrame {

	private JPanel contentPane;
	private JTextField searchTf;
	private JPanel backgroundPanel;
	private JLabel empWageLaabel;
	public JButton searchBut;
	public JPanel JTablePanel;
	public JScrollBar wageScrollBar;
	public TableColumnModel tcmSchedule;
	public DefaultTableCellRenderer tScheduleCellRenderer;


	JFrame jFrame = new JFrame();

	String columnNames[] = { "�̸�", "�ѱٹ��ð�", "�ñ�", "�޿�" };

	Object rowData[][] = { { "�ڼ���", "20", "6500", "130000" }, { "�̵���", "35", "6800", "238000" },
			{ "�����", "40", "7000", "280000" } };
		
	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane WagejScollPane = new JScrollPane(jTable);
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageWageInfo frame = new ManageWageInfo();
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
	public ManageWageInfo() {
		jTable.setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		backgroundPanel = new JPanel();
		backgroundPanel.setLayout(null);
		backgroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		backgroundPanel.setBounds(0, 0, 678, 554);
		contentPane.add(backgroundPanel);

		empWageLaabel = new JLabel("\uC9C1\uC6D0\uAE09\uC5EC\uC870\uD68C");
		empWageLaabel.setBounds(17, 25, 78, 21);
		backgroundPanel.add(empWageLaabel);

		searchBut = new JButton("");
		searchBut.setIcon(new ImageIcon("C:\\java\\workspace\\javase\\PanOptic\\src\\img\\q1.png"));
		searchBut.setForeground(Color.WHITE);
		searchBut.setBorder(null);
		searchBut.setBackground(Color.WHITE);
		searchBut.setBounds(631, 25, 30, 27);
		backgroundPanel.add(searchBut);

		searchTf = new JTextField();
		searchTf.setColumns(10);
		searchTf.setBounds(436, 25, 186, 27);
		backgroundPanel.add(searchTf);

		JTablePanel = new JPanel();
		JTablePanel.setBounds(17, 60, 644, 479);
		backgroundPanel.add(JTablePanel);
		JTablePanel.setLayout(new BorderLayout(0, 0));

		wageScrollBar = new JScrollBar();
		JTablePanel.add(wageScrollBar, BorderLayout.EAST);

		// ������ ���̺��� ColumnModel�� ������
		tcmSchedule = jTable.getColumnModel();

		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);

		}
		
		JTablePanel.add(WagejScollPane);
		

	}

}
