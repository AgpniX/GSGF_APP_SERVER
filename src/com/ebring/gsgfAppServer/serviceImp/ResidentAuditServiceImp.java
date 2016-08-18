package com.ebring.gsgfAppServer.serviceImp;

import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import com.ebring.gsgfAppServer.daoInterface.ResidentAuditDaoInterface;
import com.ebring.gsgfAppServer.entity.ResidentAudit;
import com.ebring.gsgfAppServer.serviceInterface.ResidentAuditServiceInter;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;

public class ResidentAuditServiceImp implements ResidentAuditServiceInter {
	public static Logger logger = Logger.getLogger(ResidentAuditServiceImp.class);
	ResidentAuditDaoInterface residentAuditDao ;
	
	@Override
	public JSONObject AddNormalUserPatrolCheck(ResidentAudit residentAudit , Session session) {
		JSONObject json = new JSONObject() ;
		if (residentAuditDao.saveObject(residentAudit, session)) {
			json.put("success", true);
			json.put("message", "提交信息成功");
			json.put("residentAudit", JsonUtilHibernate.beanToJson(residentAudit));
		}else{
			json.put("success", false);
			json.put("message", "系统异常提交信息失败！！");
		}
		return json ;
	}
	
	public ResidentAuditDaoInterface getResidentAuditDao() {
		return residentAuditDao;
	}
	public void setResidentAuditDao(ResidentAuditDaoInterface residentAuditDao) {
		this.residentAuditDao = residentAuditDao;
	}
}
