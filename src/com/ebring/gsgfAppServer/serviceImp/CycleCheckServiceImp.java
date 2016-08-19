package com.ebring.gsgfAppServer.serviceImp;

import net.sf.json.JSONObject;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoImp.CycleCheckDAO;
import com.ebring.gsgfAppServer.entity.CycleCheck;
import com.ebring.gsgfAppServer.serviceInterface.CycleCheckServiceinter;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;

public class CycleCheckServiceImp implements CycleCheckServiceinter{

	private CycleCheckDAO dao;

	public CycleCheckDAO getDao() {
		return dao;
	}

	public void setDao(CycleCheckDAO dao) {
		this.dao = dao;
	}

	@Override
	public JSONObject add(CycleCheck check, Session session) {
		JSONObject json = new JSONObject() ;
		if (dao.saveObject(check, session)) {
			json.put("success", true);
			json.put("message", "提交信息成功");
			json.put("residentAudit", JsonUtilHibernate.beanToJson(check));
		}else{
			json.put("success", false);
			json.put("message", "系统异常提交信息失败！！");
		}
		return json ;
	}
	
	
}
