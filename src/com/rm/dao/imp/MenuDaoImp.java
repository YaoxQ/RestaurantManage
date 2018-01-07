package com.rm.dao.imp;
import java.util.*;
import org.hibernate.*;
import com.rm.dao.*;
import com.rm.model.*;
public class MenuDaoImp extends BaseDao implements MenuDao {
	
public Menu getOneMenu(Integer MenuId){
	try{
		Session session=getSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Menu where MenuId=?");
		query.setParameter(0, MenuId);
		query.setMaxResults(1);
		return(Menu)query.uniqueResult();
		
		
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}
public List getAll(){
	try{
		Session session=getSession();
		Transaction ts=session.beginTransaction();
		List list=session.createQuery("from Menu").list();
		ts.commit();
		session.close();
		return list;
		
	}
	catch(Exception e){
		e.printStackTrace();
		return null;
		
	}
}
public List findAll(int pageNow,int pageSize){
	Session session=getSession();
	Transaction ts=session.beginTransaction();
	Query query=session.createQuery("from Menu");
	int firstResult=(pageNow-1)*pageSize;
	query.setFirstResult(firstResult);
	query.setMaxResults(pageSize);
	List list=query.list();
	ts.commit();
	session.close();
	session=null;
	return list;
}
public Menu find(int menuid){
	try{
		Session session=getSession();
		Transaction ts=session.beginTransaction();
		Query query=session.createQuery("from Menu where MenuId=?");
		query.setParameter(0, menuid);
		query.setMaxResults(1);
		Menu menu=(Menu)query.uniqueResult();
		ts.commit();
		session.clear();
		return menu;
		
	}catch(Exception e){
		e.printStackTrace();
		return null;
		
	}
}
}
