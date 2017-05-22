package com.kitri.admin.main.storePanel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Component;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.*;
import java.awt.GridLayout;
import java.io.ObjectStreamConstants;
import java.util.Vector;

public class StoreSettleAccount extends JFrame {
	
	private JPanel backGroundPanel;
	private JPanel datePanel;
	private JLabel calculateL;
	private JPanel jTablePanel;
	public JScrollBar calculateSb;
	public DefaultTableCellRenderer tScheduleCellRenderer;
	public TableColumnModel tcmSchedule;
	
	public JButton searchBtn;
	public JComboBox yy;
	public JComboBox mm;
	public JComboBox dd;
	
	private JPanel contentPane;

	public Vector<String> column;
	public Vector<Vector> rows;
	
	JFrame jFrame = new JFrame();

	String columnNames[] = { "날짜", "결제총액", "주문총액", "총매출액" };

	Object rowData[][] = { { "2017/05/14", "1,000,000", "1,500,000", "2,500,000" },
			{ "2017/05/15", "400,000", "600,000", "1,000,000" }, { "2017/05/16", "600,000", "800.000", "1,400,000" } };

	DefaultTableModel model;
	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane calculatejScollPane = new JScrollPane(jTable);

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreSettleAccount frame = new StoreSettleAccount();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public StoreSettleAccount() {
		column = new Vector<>();
		rows = new Vector<>();
	
		jTable.setEnabled(false);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		backGroundPanel = new JPanel();
		backGroundPanel.setLayout(null);
		backGroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		backGroundPanel.setBounds(0, 0, 678, 554);
		contentPane.add(backGroundPanel);

		calculateL = new JLabel("\uC815\uC0B0");
		calculateL.setBounds(17, 25, 78, 21);
		backGroundPanel.add(calculateL);

		searchBtn = new JButton("");
		searchBtn.setIcon(new ImageIcon("C:\\java\\workspace\\javase\\PanOptic\\src\\img\\q1.png"));
		searchBtn.setForeground(Color.WHITE);
		searchBtn.setBorder(null);
		searchBtn.setBackground(Color.WHITE);
		searchBtn.setBounds(631, 26, 30, 27);
		backGroundPanel.add(searchBtn);

		jTablePanel = new JPanel();
		jTablePanel.setBounds(17, 60, 644, 479);
		backGroundPanel.add(jTablePanel);
		jTablePanel.setLayout(new BorderLayout(0, 0));

		jTablePanel.add(calculatejScollPane, BorderLayout.CENTER);

		calculateSb = new JScrollBar();
		calculateSb.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		jTablePanel.add(calculateSb, BorderLayout.EAST);

		datePanel = new JPanel();
		datePanel.setBounds(387, 25, 234, 26);
		backGroundPanel.add(datePanel);
		datePanel.setLayout(new GridLayout(1, 3, 3, 3));

		yy = new JComboBox();
		addComboBoxItems(yy, 1980, 2017);
		datePanel.add(yy);


		mm = new JComboBox();
		addComboBoxItems(mm, 1, 12);
		datePanel.add(mm);

		dd = new JComboBox();
		addComboBoxItems(dd, 0, 31);
		datePanel.add(dd);

		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// 정렬할 테이블의 ColumnModel을 가져옴
		tcmSchedule = jTable.getColumnModel();

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}
	}

	private void addComboBoxItems(JComboBox box, int start, int end) {
		for (int i = start; i <= end; i++) {
			box.addItem(i);
		}

	}
}
