package com.kitri.admin.main.controlPanel.BlockedSites;

public class BSServiceImpl implements BSService {
	// 필요한 메소드 정리
	BSMain bsFrame;
	BSDaoServiceImpl daoDb;

	public BSServiceImpl(BSMain bsFrame) {
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
}
