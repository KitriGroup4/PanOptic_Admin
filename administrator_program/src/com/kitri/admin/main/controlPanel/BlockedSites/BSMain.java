package com.kitri.admin.main.controlPanel.BlockedSites;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import com.kitri.admin.main.fixCon.Fix;

public class BSMain extends JFrame {
	public JPanel contentPane;
	public JTable jTable;
	public JScrollPane jScollPane;
	public JPanel mainPanel;
	public JPanel jtablePanel;
	public JButton delete;
	public JButton register;
	public JButton edit;
	
	public BSCon control;
	public RegBS reg;
	public DelBS del;
	public BSDaoServiceImpl daoDb;
	
	
	public Vector<String> columnNames;
	
	public Vector<String> rowdata;
	public Vector<Vector> rows;
//	public Vector<BSDto> rows;

	public BSMain() {
		super("���� ����Ʈ ����");
		
		control = new BSCon(this);
		daoDb = new BSDaoServiceImpl();
		reg = new RegBS();
		del = new DelBS();
		
		columnNames = new Vector<String>();
		rows = new Vector<Vector> ();
//		rows = new Vector<BSDto> ();
		daoDb = new BSDaoServiceImpl();
		rows = daoDb.selectAll();
		
		int len = BSConstant.column.length;
		for (int i = 0; i < len; i++) {
			columnNames.add(BSConstant.column[i]);
		}
		
		jTable= new JTable(rows, columnNames);
		jScollPane = new JScrollPane(jTable);	

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(null);
		
		jtablePanel = new JPanel();
		jtablePanel.setBounds(84, 25, 491, 437);
		mainPanel.add(jtablePanel);
		
		jtablePanel.add(jScollPane);
		
		delete = new JButton("\uC0AD\uC81C");
		delete.setBounds(456, 473, 89, 23);
		mainPanel.add(delete);
		
		register = new JButton("\uB4F1\uB85D");
		register.setBounds(358, 473, 89, 23);
		mainPanel.add(register);
		
		edit = new JButton("\uC218\uC815");
		edit.setBounds(111, 473, 89, 23);
		mainPanel.add(edit);
		Fix.FIXFRAME(this);
		
//		Frame �̺�Ʈ
		register.addActionListener(control);
		delete.addActionListener(control);
//		reg �̺�Ʈ
		reg.ok.addActionListener(control);
		reg.siteNameTF.addActionListener(control);
		reg.urlTF.addActionListener(control);
//		del �̺�Ʈ
		del.ok.addActionListener(control);
		del.siteNameTF.addActionListener(control);
	}
			
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BSMain frame = new BSMain();
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
}
