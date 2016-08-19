package com.ebring.gsgfAppServer.serviceInterface;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.entity.CycleCheck;

import net.sf.json.JSONObject;

public interface CycleCheckServiceinter {
    /**
     * 添加周检
     * @param check
     * @param session
     * @return
     */
	JSONObject add(CycleCheck check, Session session);
	
}
