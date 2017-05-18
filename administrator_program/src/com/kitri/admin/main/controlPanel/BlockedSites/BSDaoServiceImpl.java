package com.kitri.admin.main.controlPanel.BlockedSites;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import com.kitri.admin.database.dao.Dao;

public class BSDaoServiceImpl extends Dao implements BSDaoService {

	public BSDto dto;
	public BSMain bsListFrame;
//	Vector<BSDto> dtos = new Vector<BSDto>();
	Vector<String> rowData;
	Vector<Vector> rows = new Vector<Vector>(); 
	
	public BSDaoServiceImpl () {}

	public BSDaoServiceImpl (BSMain bsListFrame) {
		this.bsListFrame = bsListFrame;
	}
	
	public Vector<Vector> selectAll() {
		
		try {
			sql = "SELECT * FROM blockedsites order by 1";
			System.out.println(sql);
			// 데이터베이스의 연결을 설정한다.
			con = getConnection();
			// Statement를 가져온다.
			stmt = con.createStatement();
			// SQL문을 실행한다.
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				rowData = new Vector<String>();
				rowData.add(rs.getString(1));
				//rs.getString("blockedsite_num");
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
//			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return result == 0 ? false : true;
	}

	public boolean update(BSDto dto) {
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

//			if (row > 0)
//				result = true;
//			con.commit(); // 문장 수행이 끝났으면 commit 시킨다.
		} catch (Exception e) {
			e.printStackTrace();
//			try {
//				con.rollback();
//			} catch (Exception e1) {
//				e1.printStackTrace();
//			} // error가 발생하면 rollback 시킨다.
		} finally {
//			try {
//				con.setAutoCommit(true);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} // 다른 프로그램을 위해 auto commit을 true로 세팅
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
//			con.setAutoCommit(false);
			stmt = con.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(sql);
			
//			int row = preStmt.executeUpdate();
			if (cnt > 0)
				result = true;
//			con.commit(); // 문장 수행이 끝났으면 commit 시킨다.
		} catch (Exception e) {
			e.printStackTrace();
//			try {
//				con.rollback();
//			} catch (Exception e1) {
//				e1.printStackTrace();
//			} // error가 발생하면 rollback 시킨다.
		} finally {
//			try {
//				con.setAutoCommit(true);
//			} catch (Exception e) {
//				e.printStackTrace();
//			} // 다른 프로그램을 위해 auto commit을 true로 세팅
			resetStmt();
		}
		return result;
	}

	public BSDto getSite (String name) {
		BSDto dto=null;
		
		try {
			sql = "select * from blockedsites \n";
			sql += "where blockedsite_name = '" + name + "'";
			System.out.println(sql);
			con = getConnection();
//			con.setAutoCommit(false);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs.next())
				dto = new BSDto (rs.getInt(1), rs.getString(2), rs.getString(3));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//				try {
//					con.setAutoCommit(true);
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
			resetStmt();
		}
		return dto;
	}
}