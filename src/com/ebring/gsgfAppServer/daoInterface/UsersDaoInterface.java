package com.ebring.gsgfAppServer.daoInterface;

import java.util.List;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.entity.Users;

public interface UsersDaoInterface extends BaseDaoInterface {
	/**
	 * 通过主键获取用户信息
	 * @param id
	 * @param session
	 * @return
	 */
	public List<Users> getUsersByID(String id , Session session);
}
