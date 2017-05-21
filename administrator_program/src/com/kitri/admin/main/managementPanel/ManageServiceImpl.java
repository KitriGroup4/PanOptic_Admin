package com.kitri.admin.main.managementPanel;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.kitri.admin.main.customerPanel.CusConstant;
import com.kitri.admin.main.customerPanel.CusDto;

public class ManageServiceImpl implements ManageService {
	private ManageMain manageMain;
	private ManageDao dao;

	public ManageServiceImpl(ManageMain manageMain) {
		super();
		this.manageMain = manageMain;
		dao = new ManageDaoImpl(manageMain);
	}

	@Override
	public void updateWageJTable() {
		insertColumnNames();

		ArrayList<WageInfoDto> dtos = dao.selectAll();
		Vector<Vector> rows = new Vector<>();
		int size = dtos.size();
		Vector temp;
		WageInfoDto tempDto;
		for (int i = 0; i < size; i++) {
			tempDto = dtos.get(i);
			temp = new Vector<>();
			temp.add(tempDto.getWageInfoNum());
			temp.add(tempDto.getWorkHourTotal());
			temp.add(tempDto.getWorkWageTotal());
			rows.addElement(temp);
		}
		updateTable();
	}

	private void insertColumnNames() {
		int len = ManageConstant.COLUMN.length;
		Vector<String> column = new Vector<>();
		for (int i = 0; i < len; i++) {
			column.add(ManageConstant.COLUMN[i]);
		}
		manageMain.wageInfo.column = column;
	}

	private void updateTable() {
		DefaultTableModel model = new DefaultTableModel(manageMain.wageInfo.rows, manageMain.wageInfo.column) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		// conMain.blockedsite.jTable = new JTable(model);
		manageMain.wageInfo.jTable.removeAll();
		// conMain.blockedsite.jTable.remove
		manageMain.wageInfo.jTable.setModel(model);
		model.fireTableDataChanged();
	}

	@Override
	public void viewRegEmp() {
		manageMain.regEmp.setVisible(true);
	}

	@Override
	public void viewWageInfo() {
		manageMain.wageInfo.setVisible(true);
		updateWageJTable();
	}

	@Override
	public void checkId(String id) {
		int count = 0;
		if (!isIdTfEmpty(id)) {
			return;
		}
		count = dao.findId(id);
		if (count == 0) {
			JOptionPane.showMessageDialog(manageMain.regEmp, "사용 가능한 ID 입니다.");
		} else {
			manageMain.regEmp.IdTf.setText("");
			JOptionPane.showMessageDialog(manageMain.regEmp, "중복된 ID, 다른 ID를 입력 하세요.");
		}
	}

	@Override
	public boolean isIdTfEmpty (String id) {
		boolean flag = false;
		if (id.isEmpty()) {
			JOptionPane.showMessageDialog(manageMain.regEmp, "ID를 입력해 주세요.");
			return flag;
		}
		flag = true;
		return flag;
	}
	
	
}
