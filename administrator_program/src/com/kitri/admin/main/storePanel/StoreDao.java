package com.kitri.admin.main.storePanel;

import java.util.ArrayList;

public interface StoreDao {
	ArrayList<SettleAccountDto> search(String yyyy, String mm, String dd);
	ArrayList<SettleAccountDto> selectAll();

}
