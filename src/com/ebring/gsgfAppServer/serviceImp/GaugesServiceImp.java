package com.ebring.gsgfAppServer.serviceImp;

import java.util.List;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import com.ebring.gsgfAppServer.daoInterface.GaugesDaoInterface;
import com.ebring.gsgfAppServer.entity.Gauges;
import com.ebring.gsgfAppServer.serviceInterface.GaugesServiceInter;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;

public class GaugesServiceImp implements GaugesServiceInter {
	public static Logger logger = Logger.getLogger(GaugesServiceImp.class);
	private GaugesDaoInterface gaugesDao;
	
	@Override
	public JSONObject getGaugesByNFC(String nfc_flag , Session session) {
		List<Object> lists = gaugesDao.getGaugesByNFC(nfc_flag, session);
		JSONObject json = new JSONObject();
		if (lists ==null || lists.size()<=0) {
			json.put("success", false);
			json.put("message", "未查询到本卡标识的计量表！");
		}else if(lists.size()>1){
			json.put("success", false);
			json.put("message", "一张NFC卡标识了多张计量表！");
		}else{
			Gauges gauges = (Gauges) lists.get(0);
			json.put("success", true);
			String gaugesMsg = JsonUtilHibernate.beanToJson(gauges);
			json.put("gaugesMsg", gaugesMsg);
		}
		return json;
	}

	public GaugesDaoInterface getGaugesDao() {
		return gaugesDao;
	}
	public void setGaugesDao(GaugesDaoInterface gaugesDao) {
		this.gaugesDao = gaugesDao;
	}
}
