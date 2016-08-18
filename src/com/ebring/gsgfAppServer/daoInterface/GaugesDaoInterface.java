package com.ebring.gsgfAppServer.daoInterface;

import java.util.List;

import org.hibernate.Session;

public interface GaugesDaoInterface extends BaseDaoInterface {
	/**
	 * 找到所有nfc特定标识的计量表
	 * @param nfc_flag
	 * @return
	 */
	public List<Object> getGaugesByNFC(String nfc_flag , Session session);
}
