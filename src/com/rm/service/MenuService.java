package com.rm.service;

import java.util.*;

import com.rm.model.*;

public interface MenuService {
	/*�������˵���Ϣ��ѯ*/
  public List MenuInfo_findall(int pageNow, int pageSize);
	/*������ɾ���˵���Ϣ*/
	public void delete_menu(String mid);
	
	
	/*�������޸Ĳ˵���Ϣ*/
	public void update_menu(Menu menu);
	
	
	/*��������Ӳ˵���Ϣ*/
	public void save_menu(Menu menu);
}
