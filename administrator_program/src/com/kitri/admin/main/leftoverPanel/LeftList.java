package com.kitri.admin.main.leftoverPanel;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.Color;

public class LeftList extends JInternalFrame {

	private JPanel contentPane;
	public JTextField searchTf;
	private JPanel backgroundPanel;
	public JButton searchBtn;
	public JScrollBar sb1;
	public JScrollBar sb2;
	private JLabel leftFoodL;
	public DefaultTableCellRenderer tScheduleCellRenderer;
	public TableColumnModel tcmSchedule;
	
//	public CardLayout card = new CardLayout();
//	JPanel cardP;
	public JPanel leftListP;
	DefaultTableModel model;
	JTable leftJtable;
	JScrollPane leftScrollPane;
//	public JPanel searchListP;
//	public JTable searchListJtable;
//	public JScrollPane searchListScrollPane;
	JFrame jFrame = new JFrame();

	public Vector<String> column = new Vector<>();
	public Vector<Vector> rows = new Vector<>();
	
	public LeftList() {

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		backgroundPanel = new JPanel();
		backgroundPanel.setBounds(0, 0, 685, 555);
		contentPane.add(backgroundPanel);
		backgroundPanel.setLayout(null);
		backgroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		searchBtn = new JButton("");
		searchBtn.setIcon(new ImageIcon("C:\\java\\workspace\\javase\\PanOptic\\src\\img\\q1.png"));
		searchBtn.setForeground(Color.WHITE);
		searchBtn.setBorder(null);
		searchBtn.setBackground(Color.WHITE);
		searchBtn.setBounds(631, 25, 30, 27);
		backgroundPanel.add(searchBtn);
		
		searchTf = new JTextField();
		searchTf.setColumns(10);
		searchTf.setBounds(436, 25, 186, 27);
		backgroundPanel.add(searchTf);
		
//		cardP = new JPanel(card);
		sb1 = new JScrollBar();
//		sb2 = new JScrollBar();
	
		leftListP = new JPanel();
		leftListP.setLayout(new BorderLayout(0, 0));
		leftListP.setBounds(72, 74, 550, 430);
		leftListP.add(sb1, BorderLayout.EAST);

		backgroundPanel.add(leftListP);
		
		model = new DefaultTableModel(rows, column);
		leftJtable = new JTable(model);
		model.fireTableDataChanged();
		leftScrollPane = new JScrollPane(leftJtable);
		leftListP.add(leftScrollPane, BorderLayout.CENTER);
		leftJtable.setEnabled(false);
		
		// ������ ���̺��� ColumnModel�� ������
		tcmSchedule = leftJtable.getColumnModel();
		
		leftFoodL = new JLabel("\uC7AC\uACE0\uB7C9");
		leftFoodL.setHorizontalAlignment(SwingConstants.CENTER);
		leftFoodL.setBounds(50, 31, 109, 21);
		backgroundPanel.add(leftFoodL);
		
		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		tScheduleCellRenderer = new DefaultTableCellRenderer();
		 
		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		 
		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
		tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}
		
//		tcmSchedule = searchListJtable.getColumnModel();
//		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
//		tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
//		}
	}
}
