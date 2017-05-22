package com.kitri.admin.main.employeePanel;

import java.util.ArrayList;
import java.util.Vector;

import com.kitri.admin.database.dao.Dao;
import com.kitri.admin.main.customerPanel.CusDto;
import com.kitri.admin.main.leftoverPanel.LeftDto;

public class EmpDaoImpl extends Dao implements EmpDao {
	EmpMain empMain;
	Vector<String> rowData;
	ArrayList<EmpDto> list;

	public EmpDaoImpl(EmpMain empMain) {
		super();
		this.empMain = empMain;
	}

	@Override
	public ArrayList<EmpDto> selectAll() {
		list = new ArrayList<>();
		EmpDto dto;
		try {
			sql = "SELECT employee_num num, \n";
			sql += "employee_name name, \n";
			sql += "employee_hp hp, \n";
			sql += "employee_hire_date hiredate, \n";
			sql += "employee_id id, \n";
			sql += "employee_pw pw, \n";
			sql += "EMPLOYEE_EMAIL email, \n";
			sql += "employee_birth birth, \n";
			sql += "employee_position position, \n";
			sql += "employee_hour_pay_rate hourPay, \n";
			sql += "EMPLOYEE_ISMALE gender \n";
			sql += "FROM employees \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// check
			// System.out.println("데이터베이스 연결 됨");
			while (rs.next()) {
				dto = new EmpDto();
				dto.setEmpNum(rs.getInt("num"));
				dto.setEmpName(rs.getString("name"));
				dto.setEmpHp(rs.getString("hp"));
				dto.setEmpDate(rs.getString("hireDate"));
				dto.setEmpId(rs.getString("id"));
				dto.setEmpPw(rs.getString("pw"));
				dto.setEmpEmail(rs.getString("email"));
				dto.setEmpBirth(rs.getString("birth"));
				dto.setHourPayRate(rs.getInt("hourPay"));
				dto.setEmpPosition(rs.getString("position"));
				dto.setEmpIsMale(rs.getString("gender"));
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
	public EmpDto findUser(String name) {
		EmpDto dto = new EmpDto();
		try {
			sql = "SELECT employee_num num, \n";
			sql += "employee_name name, \n";
			sql += "employee_hp hp, \n";
			sql += "employee_hire_date hiredate, \n";
			sql += "employee_id id, \n";
			sql += "employee_pw pw, \n";
			sql += "EMPLOYEE_EMAIL email, \n";
			sql += "employee_birth birth, \n";
			sql += "employee_position position, \n";
			sql += "employee_hour_pay_rate hourPay, \n";
			sql += "EMPLOYEE_ISMALE gender, \n";
			sql += "to_char(employee_hire_date, 'yyyy') yy, \n";
			sql += "to_char(employee_hire_date, 'mm') mm, \n";
			sql += "to_char(employee_hire_date, 'dd') dd \n";
			sql += "FROM employees \n";
			sql += "where employee_name = '" + name + "' \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("findUser sql");
			while (rs.next()) {
				dto = new EmpDto();
				dto.setEmpNum(rs.getInt("num"));
				dto.setEmpName(rs.getString("name"));
				dto.setEmpHp(rs.getString("hp"));
				dto.setEmpDate(rs.getString("hireDate"));
				dto.setEmpId(rs.getString("id"));
				dto.setEmpPw(rs.getString("pw"));
				dto.setEmpEmail(rs.getString("email"));
				dto.setEmpBirth(rs.getString("birth"));
				dto.setHourPayRate(rs.getInt("hourPay"));
				dto.setEmpPosition(rs.getString("position"));
				dto.setEmpIsMale(rs.getString("gender"));
				dto.setYy(rs.getString("yy"));
				dto.setMm(rs.getString("mm"));
				dto.setDd(rs.getString("dd"));
			}
//			System.out.println(dto.getYy());
//			System.out.println("findUser dto 들어가는지?");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return dto;
	}

	@Override
	public int updateEmpInfo (String id) {
		int count = 0;
		String name = empMain.empDetail.nameTf.getText().trim();
		String hp = empMain.empDetail.hpTf.getText().trim();
		String inId = empMain.empDetail.idTf.getText().trim();
		String hourRate = empMain.empDetail.wageTf.getText().trim();
		
		String position = empMain.empDetail.positionCb.getSelectedItem() + "";
		
//		Object yyyy = empMain.empDetail.yy.getSelectedItem();
//		Object mm = empMain.empDetail.mm.getSelectedItem();
//		Object dd = empMain.empDetail.dd.getSelectedItem();
//		
//		String hireDate = "" + yyyy + mm + dd;
//		System.out.println(hireDate);
//		System.out.println(position);
//		System.out.println(yyyy);
//		System.out.println(mm);
//		System.out.println(dd);
		
		try {
			sql  = "update employees set \n";
			sql += "employee_name = '" + name + "', \n";
			sql += "employee_hp = '" + hp + "', \n";
			sql += "employee_id = '" + id + "', \n";
			sql += "employee_position = '" + position + "', \n";
			sql += "EMPLOYEE_HOUR_PAY_RATE = '" + hourRate + "' \n";
			sql += "where employee_id = '" + inId + "' \n";

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
	
	@Override
	public ArrayList<EmpDto> searchEmp (String name) {
		list = new ArrayList<>();
		EmpDto dto;
		try {
			sql = "SELECT employee_num num, \n";
			sql += "employee_name name, \n";
			sql += "employee_hp hp, \n";
			sql += "employee_hire_date hiredate, \n";
			sql += "employee_id id, \n";
			sql += "employee_pw pw, \n";
			sql += "EMPLOYEE_EMAIL email, \n";
			sql += "employee_birth birth, \n";
			sql += "employee_position position, \n";
			sql += "employee_hour_pay_rate hourPay, \n";
			sql += "EMPLOYEE_ISMALE gender \n";
			sql += "FROM employees \n";
			sql += "where employee_name = '" + name + "' \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
// check
			// System.out.println("데이터베이스 연결 됨");
			while (rs.next()) {
				dto = new EmpDto();
				dto.setEmpNum(rs.getInt("num"));
				dto.setEmpName(rs.getString("name"));
				dto.setEmpHp(rs.getString("hp"));
				dto.setEmpDate(rs.getString("hireDate"));
				dto.setEmpId(rs.getString("id"));
				dto.setEmpPw(rs.getString("pw"));
				dto.setEmpEmail(rs.getString("email"));
				dto.setEmpBirth(rs.getString("birth"));
				dto.setHourPayRate(rs.getInt("hourPay"));
				dto.setEmpPosition(rs.getString("position"));
				dto.setEmpIsMale(rs.getString("gender"));
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