package com.rm.dao;

import com.rm.model.Login;

public interface LoginDao {
  /*方法：根据用户号和口令查找*/
	public Login finduser(String id,String password);
}
