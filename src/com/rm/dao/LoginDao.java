package com.rm.dao;

import com.rm.model.Login;

public interface LoginDao {
  /*�����������û��źͿ������*/
	public Login finduser(String id,String password);
}
