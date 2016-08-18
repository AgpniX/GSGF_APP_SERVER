package com.ebring.gsgfAppServer.serviceInterface;

import net.sf.json.JSONObject;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.entity.Engineer;

/**
 * 工程师服务类
 * @author ZhangJintao
 */
public interface EngineerServiceInter {
	/**
	 * 工程师登录方法
	 * @param engineer
	 * @return Engineer  /  null
	 */
	public Engineer engineerLogin(Engineer engineer , Session session);
	
	/**
	 * 工程呢个是修改密码
	 * @param engineer 工程师实体类【实体类必须包含的属性：工程师主键、工程师电话、工程师身份证、工程师密码】
	 * @param reset_new_password  新密码
	 * @param reset_new_repassword 重复输入新密码
	 * @param session session对象
	 * @return
	 */
	public JSONObject engineerChangePassword(Engineer engineer , String reset_new_password, String reset_new_repassword , Session session);
}