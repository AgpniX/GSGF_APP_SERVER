package com.ebring.gsgfAppServer.serviceInterface;

import org.hibernate.Session;
import net.sf.json.JSONObject;

/**
 * 计量表服务类
 * @author ZhangJintao
 */
public interface GaugesServiceInter {
	/**
	 * 通过nfc唯一标识找到唯一计量表
	 * @param nfc_flag
	 * @return
	 */
	public JSONObject getGaugesByNFC(String nfc_flag , Session session) ;
}