package com.ebring.gsgfAppServer.serviceImp;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoInterface.FirmAuditDaoInterface;
import com.ebring.gsgfAppServer.entity.FirmAudit;
import com.ebring.gsgfAppServer.serviceInterface.FirmAuditServiceInter;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;

public class FirmAuditServiceImp implements FirmAuditServiceInter {
	public static Logger logger = Logger.getLogger(FirmAuditServiceImp.class);
	FirmAuditDaoInterface firmAuditDao ;
	
	@Override
	public JSONObject AddFirmUserPatrolCheck(FirmAudit firmAudit , Session session) {
		JSONObject json = new JSONObject() ;
		if (firmAuditDao.saveObject(firmAudit, session)) {
			json.put("success", true);
			json.put("message", "提交信息成功");
			json.put("residentAudit", JsonUtilHibernate.beanToJson(firmAudit));
		}else{
			json.put("success", false);
			json.put("message", "系统异常提交信息失败！！");
		}
		return json ;
	}

	public FirmAuditDaoInterface getFirmAuditDao() {
		return firmAuditDao;
	}

	public void setFirmAuditDao(FirmAuditDaoInterface firmAuditDao) {
		this.firmAuditDao = firmAuditDao;
	}
	
}
