package com.ebring.gsgfAppServer.serviceImp;

import java.util.List;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoInterface.EngineerDaoInterface;
import com.ebring.gsgfAppServer.entity.Engineer;
import com.ebring.gsgfAppServer.serviceInterface.EngineerServiceInter;

public class EngineerServiceImp implements EngineerServiceInter {
	public static Logger logger = Logger.getLogger(EngineerServiceImp.class);
	private EngineerDaoInterface engineerDao;

	@Override
	public Engineer engineerLogin(Engineer engineer , Session session) {
		if (engineer.getEngPassword() == null || engineer.getPhone() == null) {
			return null;
		}
		String hql = "from Engineer where phone = '"+engineer.getPhone().trim()+"' and eng_password = '"+engineer.getEngPassword()+"'" ;
		List<Object> lists = engineerDao.executeQuery(hql, null, 0, 0,session);
		if (lists == null || lists.size()<=0) {
			return null ;
		}else if(lists.size() >1 ){
			throw new RuntimeException("工程师登录异常：【电话和密码匹配到了两个工程师】");
		}else{
			return (Engineer) lists.get(0);
		}
	}
	
	@Override
	public JSONObject engineerChangePassword(Engineer engineer,
			String reset_new_password, String reset_new_repassword,
			Session session) {
		JSONObject json = new JSONObject();
		//*****1、先检查系统获取的参数是否存在
		if (engineer == null || engineer.getEngId() == null ) {
			//工程师不存在或者其主键不存在，无法定位工程师，报错。
			throw new RuntimeException("工程师修改密码异常：【系统未接收到工程师信息，无法定位工程师导致无法修改密码】");
		}
		if(reset_new_password == null || reset_new_repassword == null || "".equals(reset_new_password) || "".equals(reset_new_repassword)){
			//新密码不存在
			throw new RuntimeException("工程师修改密码异常：【系统未接收到新密码，无法修改】");
		}
		if (engineer.getEngPassword() == null || engineer.getIdCard() == null || engineer.getPhone() == null) {
			//工程师信息不全
			throw new RuntimeException("工程师修改密码异常：【工程师信息不全，无法修改密码】");
		}
		//*****2、参数存在时通过给定的参数查询数据库中对应工程师记录
		String hql = "from Engineer where engId = '"+engineer.getEngId()+"'" ;
		List<Object> lists = engineerDao.executeQuery(hql, null, 0, 0,session);
		Engineer engineer_select = new Engineer();
		if (lists == null || lists.size()<=0) {
			//找不到工程师
			throw new RuntimeException("工程师修改密码异常：【提交的主键无法再数据库中查找到工程师，主键无效!!!】");
		}else if(lists.size() >1 ){
			//找到了多个工程师
			throw new RuntimeException("工程师修改密码异常：【提交的主键定位到了多个工程师，主键重复，请联系管理员。】");
		}else{
			engineer_select =  (Engineer) lists.get(0);
		}
		//*****3、查询到了对应工程师记录对比查询到的信息与提交新新是否一致
		if (!engineer_select.getEngPassword().equals(engineer.getEngPassword()) 
				|| !engineer_select.getPhone().equals(engineer.getPhone()) 
				|| !engineer_select.getIdCard().equals(engineer.getIdCard())) {
			json.put("success", false);
			json.put("message", "工程师输入信息有误，请查证后在进行操作！");
			json.put("type", "reset_new_repassword_alert");
		}else{
			if (reset_new_password != null && reset_new_repassword != null && reset_new_password.equals(reset_new_repassword)) {
				engineer_select.setEngPassword(reset_new_password);
				engineerDao.saveObject(engineer_select, session);
				json.put("success", true);
				json.put("message", "工程师修改密码成功！");
			}else{
				json.put("success", false);
				json.put("message", "两次输入的新密码不一致，请查证！");
				json.put("type", "reset_new_repassword_alert");
			}
		}
		return json;
	}
	
	public EngineerDaoInterface getEngineerDao() {
		return engineerDao;
	}

	public void setEngineerDao(EngineerDaoInterface engineerDao) {
		this.engineerDao = engineerDao;
	}
}
