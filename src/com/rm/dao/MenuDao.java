package com.rm.dao;

import java.util.*;

import com.rm.model.*;

public interface MenuDao {
    
	/*�������˵���Ϣ��ѯ*/
	public List menuinformation_findall(int pageNow ,int pageSize);
	
	/*������ɾ���˵���Ϣ*/
	public void delete_menu(String mid);
	
	
	/*�������޸Ĳ˵���Ϣ*/
	public void update_menu(Menu menu);
	
	
	/*��������Ӳ˵���Ϣ*/
	public void save_menu(Menu menu);
	
}
