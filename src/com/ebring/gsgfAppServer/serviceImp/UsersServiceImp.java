package com.ebring.gsgfAppServer.serviceImp;

import java.util.List;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoInterface.UsersDaoInterface;
import com.ebring.gsgfAppServer.entity.Users;
import com.ebring.gsgfAppServer.serviceInterface.UsersServiceInter;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;

public class UsersServiceImp implements UsersServiceInter {
	public static Logger logger = Logger.getLogger(UsersServiceImp.class);
	private UsersDaoInterface usersDao;
	public UsersDaoInterface getUsersDao() {
		return usersDao;
	}
	public void setUsersDao(UsersDaoInterface usersDao) {
		this.usersDao = usersDao;
	}
	
	@Override
	public JSONObject getUsersByID(String id, Session session) {
		List<Users> lists = usersDao.getUsersByID(id, session);
		JSONObject json = new JSONObject() ;
		if (lists!=null && lists.size() == 1) {
			json.put("success", true);
			json.put("users", JsonUtilHibernate.beanToJson(lists.get(0)));
		}if(lists == null || lists.size()<1){
			json.put("success", false);
			json.put("message", "没有查找到用户信息！！！");
		}else if(lists.size()>1){
			throw new RuntimeException("【异常警告】一个主键查询到了多个用户！！");
		}
		return json ;
	}
	
}
