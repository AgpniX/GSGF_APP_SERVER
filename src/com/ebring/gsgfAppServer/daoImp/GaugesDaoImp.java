package com.ebring.gsgfAppServer.daoImp;

import java.util.List;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoInterface.GaugesDaoInterface;

public class GaugesDaoImp extends BaseDaoImp implements GaugesDaoInterface {
	@Override
	public List<Object> getGaugesByNFC(String nfc_flag , Session session) {
		String hql = "from Gauges where nfcFlag = '"+nfc_flag+"' ";
		return this.executeQuery(hql, null, 0, 0, session);
	}
}
