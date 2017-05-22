package com.kitri.admin.main.storePanel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import com.kitri.admin.database.dao.Dao;
import com.kitri.admin.main.employeePanel.EmpDto;

public class StoreDaoImpl extends Dao implements StoreDao {
	StoreMain storeMain;
	ArrayList<SettleAccountDto> list;

	public StoreDaoImpl(StoreMain storeMain) {
		this.storeMain = storeMain;
	}

	@Override
	public ArrayList<SettleAccountDto> search(String yyyy, String mm, String dd) {
		list = new ArrayList<>();
		SettleAccountDto dto;
		try {
			sql = "SELECT settle_account_num num, \n";
			sql += "settle_date date, \n";
			sql += "order_money orderMoney, \n";
			sql += "pay_money payMoney, \n";
			sql += "settle_total total, \n";
			sql += "to_char(settle_date date, 'yyyy') yyyy, \n";
			sql += "to_char(settle_date date, 'mm') mm, \n";
			sql += "to_char(settle_date date, 'dd') dd \n";
			sql += "FROM Settle_Account_Info \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
	
			String year = rs.getString("yyyy");
			String month = rs.getString("mm");
			String date = rs.getString("dd");
			
			if (yyyy.equals(year) && mm.equals(month) && dd.equals(date)) {
				while (rs.next()) {
					dto = new SettleAccountDto();
					dto.setSettleAccountNum(rs.getInt("num"));
					dto.setSettleDate(rs.getString("date"));
					dto.setOrderMoney(rs.getInt("orderMoney"));
					dto.setPayMoney(rs.getInt("payMoney"));
					dto.setSettleTotal(rs.getInt("total"));
					list.add(dto);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return list;
	}

	@Override
	public ArrayList<SettleAccountDto> selectAll() {
		list = new ArrayList<>();
		SettleAccountDto dto;
		try {
			sql = "SELECT settle_account_num num, \n";
			sql += "settle_date date, \n";
			sql += "order_money orderMoney, \n";
			sql += "pay_money payMoney, \n";
			sql += "settle_total total, \n";
			sql += "FROM Settle_Account_Info \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// check
			// System.out.println("데이터베이스 연결 됨");
			while (rs.next()) {
				dto = new SettleAccountDto();
				dto.setSettleAccountNum(rs.getInt("num"));
				dto.setSettleDate(rs.getString("date"));
				dto.setOrderMoney(rs.getInt("orderMoney"));
				dto.setPayMoney(rs.getInt("payMoney"));
				dto.setSettleTotal(rs.getInt("total"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return list;
	}

}