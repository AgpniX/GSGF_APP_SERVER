package com.ebring.gsgfAppServer.serviceInterface;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.entity.Maintain;


import net.sf.json.JSONObject;

public interface MaintainService {
	//添加保养信息
	JSONObject addMaintainInfo(Maintain maintain , Session session);
}
