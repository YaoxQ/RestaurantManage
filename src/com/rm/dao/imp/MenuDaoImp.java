package com.rm.dao.imp;

import java.util.List;
import org.hibernate.*;
import com.rm.dao.*;
import com.rm.model.*;

public class MenuDaoImp extends BaseDAO implements MenuDao {

	@Override
	public List menuinformation_findall(int pageNow, int pageSize) {
		try{
			Session session=getSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from Menu order by MenuID");
			int firstResult=(pageNow-1)*pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			List list=query.list();
			ts.commit();
			session.close();
			session=null;
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void delete_menu(String mid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update_menu(Menu menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save_menu(Menu menu) {
		// TODO Auto-generated method stub
		
	}

}
