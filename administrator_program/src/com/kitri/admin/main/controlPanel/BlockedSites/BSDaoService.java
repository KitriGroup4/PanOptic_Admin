package com.kitri.admin.main.controlPanel.BlockedSites;

import java.util.ArrayList;
import java.util.Vector;

public interface BSDaoService {
	public Vector<Vector> selectAll();
	public boolean register(int num, String url, String name) ;
	public boolean update(BSDto dto);
	public boolean delete(String name);
	public BSDto getSite (String name);
}
