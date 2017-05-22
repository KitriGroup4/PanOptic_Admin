package com.kitri.admin.main.employeePanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.*;

public class CusList extends JFrame {
	JFrame jFrame = new JFrame();

	public JPanel contentPane;
	public JButton searchBut;
	public JComboBox listCombo;
	public JComboBox searchCombo;
	public JTextField searchTf;
	
	public JPanel mainPanel;

	public CardLayout card = new CardLayout();
	public JPanel jTablePanel;
	
	public DefaultTableModel userModel;
	public DefaultTableModel blackModel;
	
	public JTable userListJTable;
	public JTable blackListJTable;
	
	public JScrollPane blackListScrollPane;
	public JScrollPane userListScrollPane;
	
	private JScrollBar blackScroll;
	private JScrollBar userScroll;
	
	public JPanel userListPanel;
	public JPanel blackListPanel;
		
	public TableColumnModel tcmSchedule;
	public TableColumnModel tcmSchedule2;
	
	public DefaultTableCellRenderer tScheduleCellRenderer;
	public DefaultTableCellRenderer tScheduleCellRenderer2;

	public Vector<String> column = new Vector<>();
	public Vector<Vector> rows = new Vector<>();
//
//	Object rowData[][] = { { "���϶�", "HaRam", "HaRam1@naver.com", "010-3333-2222" },
//			{ "������", "ParkHS", "ParkHS@naver.com", "010-3333-2222" } };
//
//	Object rowData2[][] = { { "������", "Jung1", "Jung1@naver.com", "010-3333-2222" },
//			{ "�赵��", "doyoung", "young@naver.com", "010-3333-2222" },
//			{ "��â��", "Lee234", "Lee234@gamil.com", "010-3333-2222" } };


	public CusList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		mainPanel = new JPanel();

		mainPanel.setBounds(0, 0, 678, 545);
		mainPanel.setLayout(null);
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.add(mainPanel);
				
		searchBut = new JButton("");
		searchBut.setIcon(new ImageIcon("C:\\java\\workspace\\javase\\PanOptic\\src\\img\\q1.png"));
		searchBut.setForeground(Color.WHITE);
		searchBut.setBorder(null);
		searchBut.setBackground(Color.WHITE);
		searchBut.setBounds(631, 25, 30, 27);
		mainPanel.add(searchBut);

		searchTf = new JTextField();
		searchTf.setColumns(10);
		searchTf.setBounds(436, 25, 186, 27);
		mainPanel.add(searchTf);

		listCombo = new JComboBox();
		listCombo.setBounds(17, 25, 171, 27);
		listCombo.addItem("������Ʈ");
		listCombo.addItem("������Ʈ");
		mainPanel.add(listCombo);

		searchCombo = new JComboBox();
		searchCombo.setBounds(353, 25, 75, 27);
		searchCombo.addItem("��ü");
		searchCombo.addItem("�̸�");
		mainPanel.add(searchCombo);
		
		userModel = new DefaultTableModel(rows, column);
		userListJTable = new JTable(userModel);
		userListScrollPane = new JScrollPane(userListJTable);
		userListScrollPane.setBounds(96, 5, 452, 427);
		userScroll = new JScrollBar();
		userScroll.setBounds(546, 5, 17, 427);
		userListPanel = new JPanel();
		userListPanel.setLayout(null);
		userListPanel.add(userListScrollPane);
		userListPanel.add(userScroll);

		blackModel = new DefaultTableModel(rows, column);
		blackListJTable = new JTable(blackModel);
		blackListScrollPane = new JScrollPane(blackListJTable);
		blackListScrollPane.setBounds(96, 5, 452, 427);
		blackScroll = new JScrollBar();
		blackScroll.setBounds(547, 5, 17, 427);
		blackListPanel = new JPanel();
		blackListPanel.setLayout(null);
		blackListPanel.add(blackListScrollPane);
		blackListPanel.add(blackScroll);
		
		jTablePanel = new JPanel();
		jTablePanel.setBounds(17, 60, 644, 479);
		jTablePanel.setLayout(card);
		jTablePanel.add(userListPanel, "user");
		jTablePanel.add(blackListPanel, "black");
		
		mainPanel.add(jTablePanel);

//		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
//		tScheduleCellRenderer = new DefaultTableCellRenderer();
//
//		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
//		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

//		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
//		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
//			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
//		}
//
//		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
//		tScheduleCellRenderer2 = new DefaultTableCellRenderer();
//
//		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
//		tScheduleCellRenderer2.setHorizontalAlignment(SwingConstants.CENTER);
//
//		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
//		for (int i = 0; i < tcmSchedule2.getColumnCount(); i++) {
//			tcmSchedule2.getColumn(i).setCellRenderer(tScheduleCellRenderer2);

//		}
	}
}
