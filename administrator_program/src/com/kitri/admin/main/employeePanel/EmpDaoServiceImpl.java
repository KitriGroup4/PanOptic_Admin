package com.kitri.admin.main.employeePanel;

public class EmpDaoServiceImpl implements BSService {
	// �ʿ��� �޼ҵ� ����
	BSMain bsFrame;
	StoreDaoServiceImpl daoDb;

	public EmpDaoServiceImpl(BSMain bsFrame) {
		super();
		this.bsFrame = bsFrame;
	}

	@Override
	public void writeCol() {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeRow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addToJtable() {
		// TODO Auto-generated method stub

	}

	@Override
	public String changeQuery(String query) {
		String temp = query;
		return temp;
	}

	@Override
	public void viewReg() {
		bsFrame.reg.setVisible(true);
	}

	@Override
	public void viewDel() {
		bsFrame.del.setVisible(true);
	}
	//
	// public boolean deleteBlockedSite (String siteName) {
	// boolean flag = false;
	// int size = rowData.size();
	// for (int i = 0; i < size; i++) {
	// System.out.println("=======================================" + i);
	// rowData.get(i);
	// System.out.println(rowData.get(i) + " �ε��� :" + i );
	// if (rowData.get(i).get(2).equals(siteName)) {
	// System.out.println("����Ʈ �̸� : " + rowData.get(i).get(2));
	// System.out.println("����Ʈ���� " + rowData.get(i).get(2) + "�� " + i + "��° ���ڵ带
	// ���� �Ͽ����ϴ�.");
	// rowData.remove(i);
	//// �������� Ȯ�� �� ������ ���� ��ȣ ������ ������ Ȯ�� ��
	//// size = rowData.size();
	//// for (int j = i; j < size; j++) {
	//// rowData.get(j).set(2, (j-1)+"");
	//// }
	//// for (int j = 0; j < size; j++) {
	//// System.out.println("=======================================" + j);
	//// rowData.get(j);
	//// System.out.println(rowData.get(j) + " �ε��� :" + j );
	//// }
	//
	// return true;
	// }
	// }
	// return flag;
	// }

}
