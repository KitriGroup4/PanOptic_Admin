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

	String columnNames[] = { "이름", "ID", "E-mail", "휴대폰" };

	Object rowData[][] = { { "김하람", "HaRam", "HaRam1@naver.com", "010-3333-2222" },
			{ "박형선", "ParkHS", "ParkHS@naver.com", "010-3333-2222" } };

	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane blackScollPane = new JScrollPane(jTable);

	Object rowData2[][] = { { "유정은", "Jung1", "Jung1@naver.com", "010-3333-2222" },
			{ "김도영", "doyoung", "young@naver.com", "010-3333-2222" },
			{ "이창선", "Lee234", "Lee234@gamil.com", "010-3333-2222" } };

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
		userListL.addItem("고객리스트");
		userListL.addItem("블랙리스트");

		searchCombo = new JComboBox();
		searchCombo.setBounds(353, 25, 75, 27);
		userListPanel.add(searchCombo);

		searchCombo.addItem("전체");
		searchCombo.addItem("이름");

		userListL.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == userListL) {
					String str = (String) userListL.getSelectedItem();
					if (str.equals("고객리스트")) {
						cl_tableListPanel.show(tableListPanel, "user");
					} else if (str.equals("블랙리스트")) {
						cl_tableListPanel.show(tableListPanel, "black");
					}

				}
			}
		});

		// 정렬할 테이블의 ColumnModel을 가져옴
		tcmSchedule = jTable.getColumnModel();

		// 정렬할 테이블의 ColumnModel을 가져옴
		tcmSchedule2 = jTable2.getColumnModel();

		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);

		}

		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		tScheduleCellRenderer2 = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer2.setHorizontalAlignment(SwingConstants.CENTER);

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule2.getColumnCount(); i++) {
			tcmSchedule2.getColumn(i).setCellRenderer(tScheduleCellRenderer2);

		}
	}
}
