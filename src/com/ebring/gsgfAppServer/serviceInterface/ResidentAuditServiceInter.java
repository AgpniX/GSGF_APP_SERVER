package com.ebring.gsgfAppServer.serviceInterface;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.entity.ResidentAudit;

import net.sf.json.JSONObject;

/**
 * 民用户日常巡检服务类
 * @author ZhangJintao
 */
public interface ResidentAuditServiceInter {
	/**
	 * 添加一条民用户日常巡检记录
	 * @param residentAudit
	 * @return
	 */
	public JSONObject AddNormalUserPatrolCheck(ResidentAudit residentAudit , Session session) ;
}