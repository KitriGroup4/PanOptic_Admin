package com.kitri.admin.main.storePanel;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.kitri.admin.main.employeePanel.EmpConstant;
import com.kitri.admin.main.employeePanel.EmpDto;

public class StoreServiceImpl implements StoreService {
	StoreMain storeMain;
	StoreDao dao;

	public StoreServiceImpl(StoreMain storeMain) {
		this.storeMain = storeMain;
		dao = new StoreDaoImpl(storeMain);
	}

	@Override
	public void viewSettleAccount() {
		updateSettleJTable();
		storeMain.settleAccount.setVisible(true);
	}

	@Override
	public ArrayList<SettleAccountDto> search(String yyyy, String mm, String dd) {
		ArrayList<SettleAccountDto> dtos;
		dtos = dao.search(yyyy, mm, dd);
		return dtos;
	}

	@Override
	public void updateSettleJTable() {

		insertColumnNames();

		ArrayList<SettleAccountDto> dtos = dao.selectAll();
		Vector<Vector> rows = new Vector<>();
		int size = dtos.size();
		Vector temp;
		SettleAccountDto tempDto;
		for (int i = 0; i < size; i++) {
			tempDto = dtos.get(i);
			temp = new Vector<>();
			temp.add(tempDto.getSettleAccountNum());
			temp.add(tempDto.getSettleDate());
			temp.add(tempDto.getOrderMoney());
			temp.add(tempDto.getPayMoney());
			temp.add(tempDto.getSettleTotal());
			rows.addElement(temp);
		}
		storeMain.settleAccount.rows = rows;
		DefaultTableModel model = new DefaultTableModel(storeMain.settleAccount.rows, storeMain.settleAccount.column) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		// conMain.blockedsite.jTable = new JTable(model);
		storeMain.settleAccount.jTable.removeAll();
		// conMain.blockedsite.jTable.remove
		storeMain.settleAccount.jTable.setModel(model);
		model.fireTableDataChanged();
	}

	@Override
	public void updateSettleInfo(String name) {

	}

	private void insertColumnNames() {
		int len = StoreConstant.COLUMN.length;
		Vector<String> column = new Vector<>();
		for (int i = 0; i < len; i++) {
			column.add(StoreConstant.COLUMN[i]);
		}
		storeMain.settleAccount.column = column;
	}
}