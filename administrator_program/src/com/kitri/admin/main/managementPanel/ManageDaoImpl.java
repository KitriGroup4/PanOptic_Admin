package com.kitri.admin.main.managementPanel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import com.kitri.admin.database.dao.Dao;
import com.kitri.admin.main.controlPanel.BlockedsiteDto;

public class ManageDaoImpl extends Dao implements ManageDao {
	private ManageMain manageMain;
	ArrayList<WageInfoDto> list;

	public ManageDaoImpl() {
	}

	public ManageDaoImpl(ManageMain manageMain) {
		this.manageMain = manageMain;
	}

	@Override
	public ArrayList<WageInfoDto> selectAll() {
		list = new ArrayList<>();
		WageInfoDto dto;
		try {
			sql = "SELECT wage_info_num num, work_hour_total hourTotal, work_wage_total wageTotal \n";
			sql += "FROM wage_info \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// check
			// System.out.println("데이터베이스 연결 됨");
			while (rs.next()) {
				dto = new WageInfoDto();
				dto.setWageInfoNum(rs.getInt("num"));
				dto.setWorkHourTotal(rs.getInt("hourTotal"));
				dto.setWorkWageTotal(rs.getInt("wageTotal"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return list;
	}

	@Override
	public int findId(String id) {
		int count = 0;
		String tempId = "";
		try {
			sql = "SELECT employee_id id \n";
			sql += "FROM employees \n";
			sql += "where employee_id = '" + id + "' \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// check
			// System.out.println("데이터베이스 연결 됨");
			if (rs.next()) {
				tempId = rs.getString("id");
				count = 1; 
			}
			else 
				count = 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}		
		return count;
	}

}