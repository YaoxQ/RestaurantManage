package com.rm.action;
import javax.servlet.*;
import javax.servlet.http.*;
import com.opensymphony.xwork2.*;
import com.rm.service.*;
import com.rm.service.imp.*;
import com.rm.model.*;
public class MenuAction extends ActionSupport {
	private MenuService menuservice;
	public String addMenu() throws Exception{
		Menu mn=new Menu();
		int id1=mn.getMenuId();
		if(menuservice.find(id1)!=null){
			return ERROR;
			
		}
		mn.setMenuId(mn.getMenuId());
		mn.setMenuName(mn.getMenuName());
		mn.setPrice(mn.getPrice());
		menuservice.save(mn);
		return SUCCESS;
	}

}
