package com.kitri.admin.main.leftoverPanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import java.awt.Color;

public class LeftList extends JFrame {

	private JPanel contentPane;
	private JTextField searchTf;
	private JPanel backgroundPanel;
	public JButton searchBut;
	private JPanel foodLeft_numJtable;
	public JScrollBar FoodLeftNumscrollBar;
	private JLabel foodLeft_numLabel;
	public DefaultTableCellRenderer tScheduleCellRenderer;
	public TableColumnModel tcmSchedule;
	
	
	JFrame jFrame = new JFrame();

	String columnNames[] =
	{ "���Ĺ�ȣ", "���ı��й�ȣ", "�����̸�", "���", "�ֹ�ó" };

	Object rowData[][] =
	{
	{ "1", "3", "�����", "79", "���" },
	{ "7", "1", "�Ƹ޸�ī��", "21", "ŰƮ��Ŀ��" },
	{ "19", "2", "�ʱ���", "80", "���" } };

	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane FoodLeftNumjScollPane = new JScrollPane(jTable);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeftList frame = new LeftList();
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
	public LeftList() {
		jTable.setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		backgroundPanel = new JPanel();
		backgroundPanel.setBounds(0, 0, 678, 545);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		backgroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
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
		
		foodLeft_numJtable = new JPanel();
		foodLeft_numJtable.setBounds(17, 60, 644, 479);
		backgroundPanel.add(foodLeft_numJtable);
		foodLeft_numJtable.setLayout(new BorderLayout(0, 0));
		
		FoodLeftNumscrollBar = new JScrollBar();
		foodLeft_numJtable.add(FoodLeftNumscrollBar, BorderLayout.EAST);
		
		foodLeft_numLabel = new JLabel("\uC7AC\uACE0\uB7C9");
		foodLeft_numLabel.setBounds(17, 31, 109, 21);
		backgroundPanel.add(foodLeft_numLabel);
		
		foodLeft_numJtable.add(FoodLeftNumjScollPane);
		
		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		tScheduleCellRenderer = new DefaultTableCellRenderer();
		 
		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		 
		// ������ ���̺��� ColumnModel�� ������
		tcmSchedule = jTable.getColumnModel();
		 
		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
		tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}

	}
}
