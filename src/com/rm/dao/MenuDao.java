package com.rm.dao;
import com.rm.model.*;
import java.util.*;
public interface MenuDao {

	public Menu getOneMenu(Integer MenuId);
	public List getAll();
	public List findAll(int pageNow,int pageSize);
	public Menu find(int menuid);
}
