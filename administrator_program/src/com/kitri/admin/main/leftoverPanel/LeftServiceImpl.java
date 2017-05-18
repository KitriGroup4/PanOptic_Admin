package com.kitri.admin.main.leftoverPanel;



public class LeftServiceImpl implements LeftService {
	LeftMain leftMain;
	LeftDaoServiceImpl leftDaoSerImpl;
			
	public LeftServiceImpl() {
		super();
	}

	public LeftServiceImpl(LeftMain leftMain) {
		super();
		this.leftMain = leftMain;
	}
	
}
