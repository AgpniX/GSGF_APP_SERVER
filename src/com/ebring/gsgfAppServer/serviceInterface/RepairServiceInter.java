package com.ebring.gsgfAppServer.serviceInterface;

import net.sf.json.JSONObject;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.entity.Repair;


/**
 * 维修服务类
 * @author ZhangJintao
 */
public interface RepairServiceInter {
	/**
	 * 通过工程师、用户类型、分页查询维修信息
	 * @param engId
	 * @param userType
	 * @param pageIndex
	 * @param pageSize
	 * @param session
	 * @return
	 */
	JSONObject getRepairInfo(String engId,String userType ,int pageIndex,int pageSize ,Session session );
	
	/**
	 * 通过设备nfc信息查询待维修记录
	 * @param nfc_flag
	 * @return
	 */
	JSONObject getRepairInfoByNFC(String nfc_flag,Session session );
	
	/**
	 * 提交维修记录
	 * @return
	 */
	JSONObject submitRepairMessage(Repair repair,Session session );
	/**
	 * 通过维修id查询维修的详细信息
	 * @return
	 */
	JSONObject getRepairDetail(String id , Session session);
}