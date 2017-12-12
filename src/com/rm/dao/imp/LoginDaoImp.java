package com.rm.dao.imp;

import java.util.*;

import org.hibernate.*;

import com.rm.dao.*;
import com.rm.model.Login;

public class LoginDaoImp extends BaseDAO implements LoginDao{

	@Override
	public Login finduser(String id, String password) {
		String sql="from Login u where u.id=? and u.password=?";
		Session session=getSession();
		Query query=session.createQuery(sql);
		query.setParameter(0, id);
		query.setParameter(1,password);
		List users=query.list();
		Iterator it=users.iterator();
		while(it.hasNext()){
			if(users.size()!=0){
				Login user=(Login)it.next();
				return user;
			}
		}
		session.close();
		return null;
	}

}
