package com.kitri.admin.main;

import com.kitri.admin.server.Main;

public class PcMainLogic {
    PcMain pcMain;

    public PcMainLogic(PcMain pcMain) {
	this.pcMain = pcMain;
    }

    public void showComDetail(Object o) {
	int size = pcMain.comNum;

	for (int i = 0; i <= size; i++) {
	    if(pcMain.coms.get(i) == o && !pcMain.comInfos.get(i).name.equals("")){
		pcMain.detailView.setTitle("PC " + i);
		pcMain.detailView.comViewId.setText(pcMain.server.socketList.get(i).userInfo.getUserId());
		pcMain.detailView.comViewName.setText(pcMain.comInfos.get(i).name);
		pcMain.detailView.setVisible(true);
	    }
	}
    }

}
