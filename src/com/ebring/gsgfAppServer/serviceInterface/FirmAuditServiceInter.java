package com.ebring.gsgfAppServer.serviceInterface;

import org.hibernate.Session;
import com.ebring.gsgfAppServer.entity.FirmAudit;

import net.sf.json.JSONObject;

/**
 * 公服用户日常巡检服务类
 * @author ZhangJintao
 */
public interface FirmAuditServiceInter {
	/**
	 * 添加一条公服用户日常巡检记录
	 * @param residentAudit
	 * @return
	 */
	public JSONObject AddFirmUserPatrolCheck(FirmAudit firmAudit , Session session) ;
}