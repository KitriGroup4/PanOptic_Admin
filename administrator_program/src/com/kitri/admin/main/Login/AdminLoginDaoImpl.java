package com.kitri.admin.main.Login;

import com.kitri.admin.database.dao.Dao;

public class AdminLoginDaoImpl extends Dao implements AdminLoginDao {
	AdminLogin login;

	public AdminLoginDaoImpl(AdminLogin login) {
		super();
		this.login = login;
	}

	@Override
	public boolean matchId(String id) {
		boolean flag = false;
		try {
			System.out.println("여긴 오나?");
			sql = "select employee_id id from employees \n";
			sql += "where employee_id = '" + id + "'";
			System.out.println(sql);

			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				flag = true;
				System.out.println("트루");
			}
			else
				flag = false;
			System.out.println("false");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return flag;
	}

	@Override
	public boolean matchPw(String id, String pw) {
		boolean flag = false;
		String tempId = "";
		String tempPw = "";
		try {
			sql = "select employee_pw pw from employees \n";
			sql += "where employee_id = '" + tempId + "'";
			System.out.println(sql);
			
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				tempPw = rs.getString("pw");
				if (tempPw.equals(pw))
					flag = true;
				else
					flag = false;
			}
			else
				flag = false;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return flag;
	}

}
