package com.rm.service.imp;
import java.util.*;

import com.rm.dao.*;
import com.rm.service.*;
import com.rm.model.*;
public class MenuServiceManage implements MenuService {
	private MenuDao menudao;
	MenuService menuser;
	public MenuDao getMenudao() {
		return menudao;
	}

	public void setMenudao(MenuDao menudao) {
		this.menudao = menudao;
	}

	public Menu getOneMenu(Integer MenuId){
		return menudao.getOneMenu(MenuId);
		
	}

public List findAll(int pageNow,int pageSize){

	return menudao.findAll(pageNow,pageSize);
}
public int findMenuSize(){
	return menuser.findMenuSize();
}
public void save(Menu menu){
	menuser.save(menu);
}
public Menu find(int menuid){
	return menudao.find(menuid);
}

public List getAll(){
return menudao.getAll();
}
}
