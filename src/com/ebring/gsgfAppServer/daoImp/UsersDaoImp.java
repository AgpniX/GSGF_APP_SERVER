package com.ebring.gsgfAppServer.daoImp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoInterface.UsersDaoInterface;
import com.ebring.gsgfAppServer.entity.Users;

public class UsersDaoImp extends BaseDaoImp implements UsersDaoInterface {

	@Override
	public List<Users> getUsersByID(String id, Session session) {
		String hql = "from Users where userId = '"+id+"' " ;
		List<Object> lists = executeQuery(hql, null, 0, 0, session);
		List<Users> list_users = new ArrayList<Users>();
		for (Object object : lists) {
			list_users.add((Users)object);
		}
		if (list_users == null || list_users.size()<=0) {
			list_users = null ;
		}
		return list_users;
	}
}
