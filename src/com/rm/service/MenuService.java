package com.rm.service;
import java.util.*;

import com.rm.dao.*;
import com.rm.dao.imp.*;
import com.rm.model.*;
public interface MenuService {
public Menu getOneMenu(Integer MenuId);
public List getAll();
public Menu find(int menuid);
public void save(Menu menu);
public List findAll(int pageNow,int pageSize);
public int findMenuSize();


}
