package com.kitri.admin.main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.kitri.admin.main.controlPanel.ControlAgeRestriction;
import com.kitri.admin.main.controlPanel.ControlBlockedSite;
import com.kitri.admin.main.controlPanel.ControlDelBlockedSite;
import com.kitri.admin.main.controlPanel.ControlMain;
import com.kitri.admin.main.controlPanel.ControlRegBlockedSite;
import com.kitri.admin.main.customerPanel.CusBlacklist;
import com.kitri.admin.main.customerPanel.CusList;
import com.kitri.admin.main.customerPanel.CusMain;
import com.kitri.admin.main.employeePanel.EmpDetailInfo;
import com.kitri.admin.main.employeePanel.EmpList;
import com.kitri.admin.main.employeePanel.EmpMain;
import com.kitri.admin.main.leftoverPanel.LeftList;
import com.kitri.admin.main.leftoverPanel.LeftMain;
import com.kitri.admin.main.managementPanel.ManageEmpDel;
import com.kitri.admin.main.managementPanel.ManageEmpReg;
import com.kitri.admin.main.managementPanel.ManageMain;
import com.kitri.admin.main.managementPanel.ManageWageInfo;
import com.kitri.admin.main.statPanel.StatMain;
//import com.kitri.admin.main.leftoverPanel.LeftMain;
//import com.kitri.admin.main.managementPanel.ManageMain;
//import com.kitri.admin.main.statPanel.StatMain;
//import com.kitri.admin.main.storePanel.StoreMain;
import com.kitri.admin.main.storePanel.StoreMain;
import com.kitri.admin.main.storePanel.StoreSettle;
import com.kitri.admin.server.ServerThread;

public class PcMain extends JFrame {

	public JPanel contentPane;

	int topMenuNum = 8;

	int comRowNum = 10;
	int comNum = 27;
	int totalCom = comRowNum * comRowNum;

	String topMenuTitle[] = { "매장", "고객", "재고", "직원", "통계", "제어", "관리" };

	//////////////////////////////////////////////////////////////
	// cards component
	Panel cardPanel = new Panel();
	Panel top = new Panel();

	JLabel lblNewLabel = new JLabel("PAN-OPTIC");
	public ArrayList<ComInfo> comInfos;
	public ArrayList<JTextArea> coms;
	// public JTextArea buttonCenter[] = new JTextArea[comNum];
	public PcMainController controller;
	public JButton[] topMenuButton = new JButton[topMenuNum - 1];
	public ArrayList<ComDetailView> detailViews;

	private CardLayout cl = new CardLayout();
	StoreMain storeJPanel = new StoreMain();
	CusMain customerJPanel = new CusMain();
	LeftMain leftOverJPanel = new LeftMain();
	EmpMain employeeJPanel = new EmpMain();
	StatMain statJPanel = new StatMain();
	ControlMain controllMain = new ControlMain();
	ManageMain managementJPanel = new ManageMain();

	public ServerThread server;
	public ArrayList<String> userTimes;
	public ArrayList<String> leftTimes;
	////////////////////////////////////////////////////////////

	// JinternalFrame 객체 생성
	public ControlAgeRestriction ageRestriction;
	public ControlBlockedSite blockedSite;
	public ControlDelBlockedSite delBlockedSite;
	public ControlRegBlockedSite regBlockedSite;
	public CusBlacklist blackList;
	public CusList cusList;
	public EmpDetailInfo empDetailInfo;
	public EmpList empList;
	public LeftList leftList;
	public ManageEmpDel delEmp;
	public ManageEmpReg regEmp;
	public ManageWageInfo wageInfo;
	public StoreSettle settle;

	public PcMain(ServerThread server) {
		this.server = server;

		ageRestriction = new ControlAgeRestriction();
		blockedSite = new ControlBlockedSite();
		delBlockedSite = new ControlDelBlockedSite();
		regBlockedSite = new ControlRegBlockedSite();
		blackList = new CusBlacklist();
		cusList = new CusList();
		empDetailInfo = new EmpDetailInfo();
		empList = new EmpList();
		leftList = new LeftList();
		delEmp = new ManageEmpDel();
		regEmp = new ManageEmpReg();
		wageInfo = new ManageWageInfo();
		settle = new StoreSettle();

		comInfos = new ArrayList<>();
		userTimes = new ArrayList<>();
		leftTimes = new ArrayList<>();
		detailViews = new ArrayList<>();
		coms = new ArrayList<>();
		controller = new PcMainController(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 645, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(20, 20));

		contentPane.add(ageRestriction);
		contentPane.add(blockedSite);
		contentPane.add(delBlockedSite);
		contentPane.add(regBlockedSite);
		contentPane.add(blackList);
		contentPane.add(cusList);
		contentPane.add(empDetailInfo);
		contentPane.add(empList);
		contentPane.add(leftList);
		contentPane.add(delEmp);
		contentPane.add(regEmp);
		contentPane.add(wageInfo);
		contentPane.add(settle);

		// 센터 pc 자리 채우기
		for (int i = 0; i < comNum; i++) {
			userTimes.add("");
			leftTimes.add("");
			detailViews.add(new ComDetailView(this));
			contentPane.add(detailViews.get(i));
		}
		// contentPane.add(detailView);
		JPanel center = new JPanel();
		contentPane.add(center, BorderLayout.CENTER);
		center.setLayout(new GridLayout(comRowNum, comRowNum, 30, 30));

		comInfos.add(new ComInfo());
		coms.add(new JTextArea(""));
		for (int i = 1; i <= comNum; i++) {
			comInfos.add(new ComInfo(i));
			coms.add(new JTextArea(comInfos.get(i).toString()));
			coms.get(i).setEditable(false);
			coms.get(i).setFocusable(false);
			// coms.get(i).setEnabled(false);
			coms.get(i).addMouseListener(controller);
			center.add(coms.get(i));
			// buttonCenter[i] = new JTextArea("pc " + (i + 1));
			// buttonCenter[i].setEditable(false);
			// center.add(buttonCenter[i]);
		}

		for (int i = comNum + 21; i <= totalCom - comNum + 20; i++) {
			JLabel LabelCenter = new JLabel(i + "");
			center.add(LabelCenter);
		}

		contentPane.add(cardPanel, BorderLayout.WEST);
		cardPanel.setLayout(new GridLayout(1, 1, 0, 0));

		// 상단 메뉴
		contentPane.add(top, BorderLayout.NORTH);
		top.setLayout(new GridLayout(1, topMenuNum, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		top.add(lblNewLabel);

		int len = topMenuButton.length;
		for (int i = 0; i < len; i++) {
			topMenuButton[i] = new JButton(topMenuTitle[i]);
			top.add(topMenuButton[i]);
		}

		cardPanel.setLayout(cl);

		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice device = environment.getDefaultScreenDevice();
		// this.setUndecorated(true);
		// device.setFullScreenWindow(this);

		cardPanel.add(storeJPanel, topMenuTitle[0]);
		cardPanel.add(customerJPanel, topMenuTitle[1]);
		cardPanel.add(leftOverJPanel, topMenuTitle[2]);
		cardPanel.add(employeeJPanel, topMenuTitle[3]);
		cardPanel.add(statJPanel, topMenuTitle[4]);
		cardPanel.add(controllMain, topMenuTitle[5]);
		cardPanel.add(managementJPanel, topMenuTitle[6]);

		setLocationRelativeTo(null);
		topMenuButton[0].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, topMenuTitle[0]);
			}
		});
		topMenuButton[1].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, topMenuTitle[1]);
			}
		});
		topMenuButton[2].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, topMenuTitle[2]);
			}
		});
		topMenuButton[3].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, topMenuTitle[3]);
			}
		});
		topMenuButton[4].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, topMenuTitle[4]);
			}
		});
		topMenuButton[5].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, topMenuTitle[5]);
			}
		});
		topMenuButton[6].addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, topMenuTitle[6]);
			}
		});
	}

	public class ComInfo {
		public int num;
		public String name;
		public String useTime;

		public ComInfo() {
			num = 0;
			name = "";
			useTime = "";
		}

		public ComInfo(int num) {
			this.num = num;
			name = "";
			useTime = "";
		}

		public ComInfo(int num, String name, String useTime) {
			this.num = num;
			this.name = name;
			this.useTime = useTime;
		}

		@Override
		public String toString() {
			return "PC\t" + num + "\n이름\t" + name + "\n사용시간\t" + useTime;
		}
	}
}
