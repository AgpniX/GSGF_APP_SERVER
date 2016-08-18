package com.ebring.gsgfAppServer.serviceInterface;

import net.sf.json.JSONObject;

import org.hibernate.Session;

/**
 * 用户服务类
 * @author ZhangJintao
 */
public interface UsersServiceInter {
	/**
	 * 通过主键获取用户
	 * @param id
	 * @param session
	 * @return
	 */
	public JSONObject getUsersByID(String id, Session session);
}