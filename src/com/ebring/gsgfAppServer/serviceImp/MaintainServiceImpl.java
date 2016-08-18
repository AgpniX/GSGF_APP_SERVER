package com.ebring.gsgfAppServer.serviceImp;

import net.sf.json.JSONObject;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoInterface.MaintainDao;
import com.ebring.gsgfAppServer.entity.Maintain;
import com.ebring.gsgfAppServer.serviceInterface.MaintainService;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;

public class MaintainServiceImpl implements MaintainService{
	
	private MaintainDao maintainDao;
	
	public MaintainDao getMaintainDao() {
		return maintainDao;
	}
	public void setMaintainDao(MaintainDao maintainDao) {
		this.maintainDao = maintainDao;
	}



	/**
	 * 添加保养信息
	 */
	@Override
	public JSONObject addMaintainInfo(Maintain maintain, Session session) {
		JSONObject jsonObject = new JSONObject() ;
		
		maintainDao.saveObject(maintain, session);
		
		jsonObject.put("success", true);
		jsonObject.put("message", "提交信息成功");
		jsonObject.put("data", JsonUtilHibernate.beanToJson(maintain));
		return jsonObject;
	}

}
