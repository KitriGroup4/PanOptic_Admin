package com.kitri.admin.main.Login;

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
			} else
				count = 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return count;
	}

	@Override
	public int registerEmp() {
		int count = 0;
		String inId = manageMain.regEmp.idTf.getText().trim();
		String name = manageMain.regEmp.nameTf.getText().trim();
		String pw = manageMain.regEmp.pwTf.getText().trim();
		String email = manageMain.regEmp.eMailTf.getText().trim();
		String hourPay = manageMain.regEmp.hourPayTf.getText().trim();
		String hp = manageMain.regEmp.hpTf.getText().trim();

		String gender;
		if (manageMain.regEmp.manCheck.getState())
			gender = "1";
		else
			gender = "2";

		String position = (String) manageMain.regEmp.position.getSelectedItem();
		String birth = "" + manageMain.regEmp.yy.getSelectedItem() + manageMain.regEmp.mm.getSelectedItem()
				+ manageMain.regEmp.dd.getSelectedItem();
		String hireDate = "" + manageMain.regEmp.hireYear.getSelectedItem() + manageMain.regEmp.hireMonth.getSelectedItem()
				+ manageMain.regEmp.hireDay.getSelectedItem();

		try {
			sql = "insert into employees values(employees_seq.nextval, \n";
			sql += "'" + name + "', \n";
			sql += "'" + hp + "', \n";
			sql += "  sysdate  , \n";
			sql += "'" + inId + "', \n";
			sql += "'" + pw + "', \n";
			sql += "'" + email + "', \n";
			sql += "  sysdate  , \n";
			sql += "'" + position + "', \n";
			sql += "'" + hourPay + "', \n";
			sql += "'" + gender + "') \n";
			
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			count = stmt.executeUpdate(sql);
			System.out.println("===== update sql =====");
			if (count != 0)
				count = 1;
			System.out.println("update 되는지? " + count);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return count;
	}

}