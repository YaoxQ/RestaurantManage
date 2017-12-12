package com.rm.service.imp;

import com.rm.dao.LoginDao;
import com.rm.model.Login;
import com.rm.service.LoginService;

public class LoginServiceManage implements LoginService {
    private LoginDao ldao;
	@Override
	public Login finduser(String id, String password) {
		
		return ldao.finduser(id, password);
	}
	public LoginDao getLdao() {
		return ldao;
	}
	public void setLdao(LoginDao ldao) {
		this.ldao = ldao;
	}

}
