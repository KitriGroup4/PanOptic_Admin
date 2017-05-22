package com.kitri.admin.main.fixCon;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Fix {
	public JFrame f;

	public Fix(JFrame f) {
		super();
		this.f = f;
	}
	
	public static void FIXFRAME (JInternalFrame f) {
		f.setResizable(false);
//		f.setLocation();
	}
	
}
