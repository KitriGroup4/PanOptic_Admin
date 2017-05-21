package com.kitri.admin.main.leftoverPanel;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import com.kitri.admin.database.dao.Dao;
import com.kitri.admin.main.controlPanel.BlockedsiteDto;

public class LeftDaoImpl extends Dao implements LeftDao {

	private LeftMain leftMain;
	ArrayList<LeftDto> list;

	public LeftDaoImpl() {
	}

	public LeftDaoImpl(LeftMain leftMain) {
		this.leftMain = leftMain;
	}

	public ArrayList<LeftDto> selectAll() {
		list = new ArrayList<>();
		LeftDto dto;
		try {
			sql = "SELECT food_num num, \n";
			sql += "food_name name, \n";
			sql += "food_type_num type, \n";
			sql += "food_left_num left, \n";
			sql += "food_price price, \n";
			sql += "food_order orderSite \n";
			sql += "FROM food \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
// check
			// System.out.println("데이터베이스 연결 됨");
			while (rs.next()) {
				dto = new LeftDto();
				dto.setFoodNum(rs.getInt("num"));
				dto.setFoodName(rs.getString("name"));
				dto.setFoodTypeNum(rs.getInt("type"));
				dto.setFoodleftNum(rs.getInt("left"));
				dto.setFoodPrice(rs.getInt("price"));
				dto.setFoodOrder(rs.getString("orderSite"));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			resetStmt();
		}
		return list;
	}

	public boolean delete(String name) {
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
	@Override
	public ArrayList<LeftDto> searchFood (String name) {
		list = new ArrayList<>();
		LeftDto dto;
		try {
			sql = "SELECT food_num num, \n";
			sql += "food_name name, \n";
			sql += "food_type_num type, \n";
			sql += "food_left_num left, \n";
			sql += "food_price price, \n";
			sql += "food_order orderSite \n";
			sql += "FROM food \n";
			sql += "where food_name = '" + name + "' \n";
			sql += "order by 1";
			System.out.println(sql);
			con = getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
// check
			// System.out.println("데이터베이스 연결 됨");
			while (rs.next()) {
				dto = new LeftDto();
				dto.setFoodNum(rs.getInt("num"));
				dto.setFoodName(rs.getString("name"));
				dto.setFoodTypeNum(rs.getInt("type"));
				dto.setFoodleftNum(rs.getInt("left"));
				dto.setFoodPrice(rs.getInt("price"));
				dto.setFoodOrder(rs.getString("orderSite"));
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