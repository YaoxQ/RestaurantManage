package com.rm.dao;

import java.util.*;

import com.rm.model.*;

public interface MenuDao {
    
	/*方法：菜单信息查询*/
	public List menuinformation_findall(int pageNow ,int pageSize);
	
	/*方法：删除菜单信息*/
	public void delete_menu(String mid);
	
	
	/*方法：修改菜单信息*/
	public void update_menu(Menu menu);
	
	
	/*方法：添加菜单信息*/
	public void save_menu(Menu menu);
	
}
