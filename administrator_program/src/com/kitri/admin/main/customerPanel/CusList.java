package com.kitri.admin.main.customerPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

public class CusList extends JFrame {

	private JPanel contentPane;
	public JComboBox combobox;
	private JPanel tableListPanel;
	public JButton searchBut;
	private JComboBox userListL;
	public JComboBox searchCombo;
	public JTextField searchTf;
	private JPanel userListPanel;
	public TableColumnModel tcmSchedule;
	public TableColumnModel tcmSchedule2;
	public DefaultTableCellRenderer tScheduleCellRenderer;
	public DefaultTableCellRenderer tScheduleCellRenderer2;

	JFrame jFrame = new JFrame();

	String columnNames[] = { "�̸�", "ID", "E-mail", "�޴���" };

	Object rowData[][] = { { "���϶�", "HaRam", "HaRam1@naver.com", "010-3333-2222" },
			{ "������", "ParkHS", "ParkHS@naver.com", "010-3333-2222" } };

	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane blackScollPane = new JScrollPane(jTable);

	Object rowData2[][] = { { "������", "Jung1", "Jung1@naver.com", "010-3333-2222" },
			{ "�赵��", "doyoung", "young@naver.com", "010-3333-2222" },
			{ "��â��", "Lee234", "Lee234@gamil.com", "010-3333-2222" } };

	JTable jTable2 = new JTable(rowData2, columnNames);
	JScrollPane userjScollPane = new JScrollPane(jTable2);

	CardLayout cl_tableListPanel = new CardLayout();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CusList frame = new CusList();
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
	public CusList() {
		jTable2.setEnabled(false);
		jTable.setEnabled(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		userListPanel = new JPanel();
		userListPanel.setBounds(0, 0, 678, 545);
		contentPane.add(userListPanel);
		userListPanel.setLayout(null);
		userListPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		searchBut = new JButton("");
		searchBut.setIcon(new ImageIcon("C:\\java\\workspace\\javase\\PanOptic\\src\\img\\q1.png"));
		searchBut.setForeground(Color.WHITE);
		searchBut.setBorder(null);
		searchBut.setBackground(Color.WHITE);
		searchBut.setBounds(631, 25, 30, 27);
		userListPanel.add(searchBut);

		searchBut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		searchTf = new JTextField();
		searchTf.setColumns(10);
		searchTf.setBounds(436, 25, 186, 27);
		userListPanel.add(searchTf);

		tableListPanel = new JPanel();
		tableListPanel.setBounds(17, 60, 644, 479);
		userListPanel.add(tableListPanel);
		tableListPanel.setLayout(cl_tableListPanel);

		tableListPanel.add("user", userjScollPane);
		tableListPanel.add("black", blackScollPane);

		// panel_2.add(jScollPane, BorderLayout.NORTH);
		//
		// panel_2.add(userjScollPane);
		//

		userListL = new JComboBox();
		userListL.setBounds(17, 25, 171, 27);
		userListPanel.add(userListL);
		userListL.addItem("������Ʈ");
		userListL.addItem("������Ʈ");

		searchCombo = new JComboBox();
		searchCombo.setBounds(353, 25, 75, 27);
		userListPanel.add(searchCombo);

		searchCombo.addItem("��ü");
		searchCombo.addItem("�̸�");

		userListL.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == userListL) {
					String str = (String) userListL.getSelectedItem();
					if (str.equals("������Ʈ")) {
						cl_tableListPanel.show(tableListPanel, "user");
					} else if (str.equals("������Ʈ")) {
						cl_tableListPanel.show(tableListPanel, "black");
					}

				}
			}
		});

		// ������ ���̺��� ColumnModel�� ������
		tcmSchedule = jTable.getColumnModel();

		// ������ ���̺��� ColumnModel�� ������
		tcmSchedule2 = jTable2.getColumnModel();

		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);

		}

		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		tScheduleCellRenderer2 = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer2.setHorizontalAlignment(SwingConstants.CENTER);

		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule2.getColumnCount(); i++) {
			tcmSchedule2.getColumn(i).setCellRenderer(tScheduleCellRenderer2);

		}
	}
}
