package com.kitri.admin.main.storePanel;

import java.util.ArrayList;

public interface StoreService {
	void viewSettleAccount ();
	
	void updateSettleJTable ();
	void updateSettleInfo (String name);
	
	ArrayList<SettleAccountDto> search(String yy, String mm, String dd);
	
}
