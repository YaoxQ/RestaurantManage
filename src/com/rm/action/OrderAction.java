package com.rm.action;
import java.util.*;
import java.io.*;

import com.rm.model.*;
import com.rm.service.*;
import com.opensymphony.xwork2.*;

import javax.servlet.*;
import javax.servlet.http.*;

import org.apache.struts2.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.rm.dao.imp.*;

public class OrderAction extends ActionSupport {
	private int pageNow=1;
	private int pageSize=8;
	private Book dd;
	private Menu mn;
	private MenuService mnService;
	private MenuDaoImp menu;
	private List list;
	
	public Book getBook(){
		return dd;
		
	}
public void setBook(Book dd){
	this.dd=dd;
}
public MenuService getMenuService(MenuService mnService){
	return mnService;
	
}
public void setMenuService(MenuService mnService){
	this.mnService=mnService;
}
public List getList(){
	return mnService.findAll(pageNow,  pageSize);
}
public void setList(List list){
	this.list =list;
	
}
public String order() throws Exception{
	          List menuid=mnService.getAll();
	     mnService.getOneMenu(dd.getMenuId());
	          
	         Map request=(Map)ActionContext.getContext().get("request");
	     request.put("menuid", menuid);
	          double price=dd.getPrice();    
	       if(dd.getNumber()>1){
	    	price=dd.getNumber()*price;
	       }
	return SUCCESS;
}
public MenuDaoImp getMenu() {
	return menu;
}
public void setMenu(MenuDaoImp menu) {
	this.menu = menu;
}

}
