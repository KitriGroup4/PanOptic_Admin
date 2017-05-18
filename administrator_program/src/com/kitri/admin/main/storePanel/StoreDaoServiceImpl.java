package com.kitri.admin.main.storePanel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import com.kitri.admin.database.dao.Dao;

public class StoreDaoServiceImpl extends Dao implements BSDaoService {

	public BSDto dto;
	public BSMain bsListFrame;
//	Vector<BSDto> dtos = new Vector<BSDto>();
	Vector<String> rowData;
	Vector<Vector> rows = new Vector<Vector>(); 
	
	public StoreDaoServiceImpl () {}

	public StoreDaoServiceImpl (BSMain bsListFrame) {
		this.bsListFrame = bsListFrame;
	}
	
	public Vector<Vector> selectAll() {
		String query = "SELECT * FROM blockedsites";
		try {
			// �����ͺ��̽��� ������ �����Ѵ�.
			con = getConnection();
			// Statement�� �����´�.
			stmt = con.createStatement();
			// SQL���� �����Ѵ�.
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				rowData = new Vector<String>();
				rowData.add(rs.getString(1));
				rowData.add(rs.getString(2));
				rowData.add(rs.getString(3));
				
//				dto = new BSDto();
//				dto.setBlockedsite_num(rs.getInt(1));
//				dto.setBlockedsite_url(rs.getString(2));
//				dto.setBlockedsite_name(rs.getString(3));

				rows.add(rowData);
//				dtos.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return rows;
//		return dtos;
	}

	public boolean insert(String url, String name) {
		int result = 0;
		try {
			con = getConnection();
			preStmt = con.prepareStatement("insert into blockedsites(BLCOKEDSITE_NUM, BLOCKEDSITE_URL, BLOCKEDSITE_NAME) values(51, ?, ?)");
			preStmt.setString(1, url);
			preStmt.setString(2, name);
			result = preStmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			resetPreStmt();
		}
		return result == 0 ? false : true;
	}

	public boolean update(BSDto dto) {
		boolean result = false;
		try {			
			con = getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			preStmt = con.prepareStatement("update blockedsites set blockedsite_num = blocked_site_num_seq.nextval, blockedsite_url =? , blockedsite_name = ?");
							
			preStmt.setString(1, dto.getBlockedsite_url());
			preStmt.setString(2, dto.getBlockedsite_name());
			
			int row = preStmt.executeUpdate();
			if (row > 0)
				result = true;

			con.commit(); // ���� ������ �������� commit ��Ų��.

		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			} // error�� �߻��ϸ� rollback ��Ų��.
		} finally {
			try {
				con.setAutoCommit(true);
			} catch (Exception e) {
				e.printStackTrace();
			} // �ٸ� ���α׷��� ���� auto commit�� true�� ����
			resetStmt();
		}
		return result;
	}

	public boolean deleteBSDto (String name) {
		boolean result = false;
		try {
			con = getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
//
			rs = stmt.executeQuery("delete from blockedsites where blockedsite_name = ?");
			preStmt.setString(1, name);
System.out.println("s����?");
			int row = preStmt.executeUpdate();
			if (row > 0)
				result = true;

			con.commit(); // ���� ������ �������� commit ��Ų��.
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			} // error�� �߻��ϸ� rollback ��Ų��.
		} finally {
			try {
				con.setAutoCommit(true);
			} catch (Exception e) {
				e.printStackTrace();
			} // �ٸ� ���α׷��� ���� auto commit�� true�� ����
			resetStmt();
		}
		return result;
	}

	public StoreDaoServiceImpl getBSDao (String name) {
		StoreDaoServiceImpl dao=null;
		
		try {
			con = getConnection();
			con.setAutoCommit(false);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from blockedsites where blockedsite_name = ?");
			preStmt.setString(1, name);

			if (rs.next())
				dto = new BSDto (rs.getInt("num"), rs.getString("url"), rs.getString("name"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				try {
					con.setAutoCommit(true);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			resetStmt();
		}
		return dao;
	}
}