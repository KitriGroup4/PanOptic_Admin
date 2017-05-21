package com.kitri.admin.main.Login;

public interface AdminLoginDao {
	boolean matchId (String id);
	boolean matchPw (String id, String pw);
}
