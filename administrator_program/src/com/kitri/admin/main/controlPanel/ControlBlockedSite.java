package com.kitri.admin.main.controlPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
import javax.swing.table.DefaultTableModel;

import com.kitri.admin.main.fixCon.Fix;

public class ControlBlockedSite extends JInternalFrame {
	public JPanel contentPane;
	public DefaultTableModel model;
	public JTable jTable;
	public JScrollPane jScrollPane;
	public JPanel mainPanel;
	public JPanel jtablePanel;
	public JButton delBtn;
	public JButton regBtn;
	public JButton edit;
	
	
	public Vector<String> column = new Vector<>();
	public Vector<Vector> rows = new Vector<>();

	public ControlBlockedSite() {
		super("차단 싸이트 관리");
//	check
//		System.out.println(rows);
		setBounds(100, 100, 700, 610);

		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		mainPanel = new JPanel();
		
		model = new DefaultTableModel(rows, column);
		jtablePanel = new JPanel();
		jtablePanel.setBounds(84, 25, 491, 437);
		jTable = new JTable(model);
		jScrollPane = new JScrollPane(jTable);
		jScrollPane.setBounds(19, 5, 452, 402);
		
		delBtn = new JButton("\uC0AD\uC81C");
		regBtn = new JButton("\uB4F1\uB85D");
		edit = new JButton("\uC218\uC815");
		
		jtablePanel.setLayout(null);
		jtablePanel.add(jScrollPane);
		mainPanel.setLayout(null);
		mainPanel.add(jtablePanel);
		contentPane.add(mainPanel, BorderLayout.CENTER);

		delBtn.setBounds(456, 473, 89, 23);
		mainPanel.add(delBtn);
		regBtn.setBounds(358, 473, 89, 23);
		mainPanel.add(regBtn);
		edit.setBounds(111, 473, 89, 23);
		mainPanel.add(edit);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Fix.FIXFRAME(this);
	}
}
