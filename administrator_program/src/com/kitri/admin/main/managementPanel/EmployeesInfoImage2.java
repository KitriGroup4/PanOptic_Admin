package com.kitri.admin.main.managementPanel;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.table.*;

public class EmployeesInfoImage2 extends JFrame {

	private JPanel contentPane;
	private JTextField searchTf;
	public JTable Table;
	private JLabel empListLabel;
	public JButton searchBut;
	private JPanel empListJTablePanel;
	public JScrollBar empscrollBar;
	public DefaultTableCellRenderer tScheduleCellRenderer;
	public JTable jtable;

	public fgfdgdfgdfgdf empinfo;

	JFrame jFrame = new JFrame();

	String columnNames[] = { "이름", "근무일", "직급" };

	Object rowData[][] = { { "박수진", "2017/04/01", "관리자" }, { "이동선", "2016/12/01", "직원" },
			{ "김수진", "2016/05/31", "직원" } };

	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane empjScollPane = new JScrollPane(jTable);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeesInfoImage2 frame = new EmployeesInfoImage2(new fgfdgdfgdfgdf());
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
	public EmployeesInfoImage2(fgfdgdfgdfgdf empInfo) {
		this.empinfo = empInfo;
//		jTable = new JTable();
		jTable.setFillsViewportHeight(true);
		setForeground(SystemColor.menu);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		empListLabel = new JLabel("\uC9C1\uC6D0\uB9AC\uC2A4\uD2B8");
		empListLabel.setBounds(17, 25, 78, 21);
		contentPane.add(empListLabel);

		searchBut = new JButton("");
		searchBut.setBorder(null);
		searchBut.setForeground(Color.WHITE);
		searchBut.setBackground(Color.WHITE);
		searchBut.setIcon(new ImageIcon("C:\\java\\workspace\\javase\\PanOptic\\src\\img\\q1.png"));
		searchBut.setBounds(631, 25, 30, 27);
		contentPane.add(searchBut);

		searchTf = new JTextField();
		searchTf.setBounds(436, 25, 186, 27);
		contentPane.add(searchTf);
		searchTf.setColumns(10);

		empListJTablePanel = new JPanel();
		empListJTablePanel.setBounds(17, 60, 644, 479);
		contentPane.add(empListJTablePanel);
		empListJTablePanel.setLayout(new BorderLayout(0, 0));

		empscrollBar = new JScrollBar();
		empListJTablePanel.add(empscrollBar, BorderLayout.EAST);

		empListJTablePanel.add(empjScollPane);

		jTable.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (jTable.getSelectedRow() > -1) {
//					javax.swing.JOptionPane.showMessageDialog(jTable, jTable.getSelectedRow(), "선택된 로우",
//							javax.swing.JOptionPane.OK_OPTION);
					 empinfo.setVisible(true);
					// empinfo.setVisible(true);
				}

			}
		});

		// jTable.addMouseListener(new MouseAdapter() {
		// public void mouseClicked(MouseEvent e){
		// if (e.getClickCount() == 1) {
		// empinfo.setVisible(true);
		// }
		// }
		// });

		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// 정렬할 테이블의 ColumnModel을 가져옴
		TableColumnModel tcmSchedule = jTable.getColumnModel();

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);

		}
	}
}
