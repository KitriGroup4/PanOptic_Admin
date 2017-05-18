package com.kitri.admin.main.leftoverPanel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import com.kitri.admin.database.dao.Dao;

public class LeftDaoServiceImpl extends Dao implements LeftDaoService {

	public LeftDto dto;
	public LeftMain bsListFrame;
	Vector<String> rowData;
	Vector<Vector> rows = new Vector<Vector>(); 
	
	public LeftDaoServiceImpl () {}

	public LeftDaoServiceImpl (LeftMain bsListFrame) {
		this.bsListFrame = bsListFrame;
	}
	
	public Vector<Vector> selectAll() {
		
		try {
			sql = "SELECT * FROM blockedsites order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				rowData = new Vector<String>();
				rowData.add(rs.getString(1));
				rowData.add(rs.getString(2));
				rowData.add(rs.getString(3));
				rows.add(rowData);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return rows;
	}

	public boolean register(int num, String url, String name) {
		int result = 0;
		try {
			con = getConnection();
			String sql = "insert into blockedsites (blockedsite_num, blockedsite_url, blockedsite_name) \n";
			sql += "values( " + num + " , '" + url +"' , '" + name + "')";
			System.out.println(sql);
			stmt = con.createStatement();
			stmt.executeUpdate(sql);			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return result == 0 ? false : true;
	}

	public boolean update(LeftDto dto) {
		boolean result = false;
		try {
			sql = "update blockedsites \n";
			sql += "set \n";
			sql += "blockedsite_num = " + dto.getBlockedsite_num() + ", \n";
			sql += "blockedsite_url = '" + dto.getBlockedsite_url() + "', \n";
			sql += "blockedsite_name = '" + dto.getBlockedsite_name() +"'";
			System.out.println(sql);
			con = getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			int row = stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			resetStmt();
		}
		return result;
	}

	public boolean delete (String name) {
		boolean result = false;
		try {
			sql = "delete from blockedsites \n";
			sql += "where blockedsite_name = '" + name + "'"; 
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(sql);
			
			if (cnt > 0)
				result = true;
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			resetStmt();
		}
		return result;
	}

	public LeftDto getSite (String name) {
		LeftDto dto=null;
		
		try {
			sql = "select * from blockedsites \n";
			sql += "where blockedsite_name = '" + name + "'";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next())
				dto = new LeftDto (rs.getInt(1), rs.getString(2), rs.getString(3));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return dto;
	}
}