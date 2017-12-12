package com.rm.service;

import java.util.*;

import com.rm.model.*;

public interface MenuService {
	/*方法：菜单信息查询*/
  public List MenuInfo_findall(int pageNow, int pageSize);
	/*方法：删除菜单信息*/
	public void delete_menu(String mid);
	
	
	/*方法：修改菜单信息*/
	public void update_menu(Menu menu);
	
	
	/*方法：添加菜单信息*/
	public void save_menu(Menu menu);
}
