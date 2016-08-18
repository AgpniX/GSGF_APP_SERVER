package com.ebring.gsgfAppServer.serviceImp;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.hibernate.Session;

import com.ebring.gsgfAppServer.daoInterface.RepairDaoInterface;
import com.ebring.gsgfAppServer.entity.Repair;
import com.ebring.gsgfAppServer.serviceInterface.RepairServiceInter;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;

public class RepairServiceImp implements RepairServiceInter {
	private RepairDaoInterface repairDao;

	public RepairDaoInterface getRepairDao() {
		return repairDao;
	}

	public void setRepairDao(RepairDaoInterface repairDao) {
		this.repairDao = repairDao;
	}

	@Override
	public JSONObject getRepairInfo(String engId, String userType,
			int pageIndex, int pageSize, Session session) {
		JSONObject json = new JSONObject();
		String hql = "from Repair where engineer='"+engId+"' and users.userType='"+userType+"' and isRepConfirm = '0' order by appointmentTime";
		List<Object> list = repairDao.executeQuery(hql, null, (pageIndex-1)*pageSize, pageSize, session);
		JSONArray jsonArray = new JSONArray();
		if(list == null ){
			json.put("success", false);
			json.put("message", "系统异常");
		}else if(list.size() <= 0){
			json.put("success", false);
			json.put("message", "已经显示了所有数据！");
		}else{
			for (Object obj : list) {
				jsonArray.add(JsonUtilHibernate.beanToJson((Repair)obj));
			}
			json.put("success", true);
			json.put("message", "查询成功！！");
			json.put("data", jsonArray);
		}
		return json;
	}

	@Override
	public JSONObject getRepairInfoByNFC(String nfc_flag, Session session) {
		JSONObject json = new JSONObject();
		String hql = "from Repair where gauges.nfcFlag = '"+nfc_flag+"' and isRepConfirm = '0'";
		List<Object> list = repairDao.executeQuery(hql, null, 0, 0, session);
		JSONArray jsonArray = new JSONArray();
		if(list == null ){
			json.put("success", false);
			json.put("message", "系统异常");
		}else if(list.size() <= 0){
			json.put("success", false);
			json.put("message", "已经显示了所有数据！");
		}else if(list.size() > 1){
			json.put("success", false);
			json.put("message", "有重复维修记录！");
		}else if(list.size() == 1){
			Repair repair = (Repair) list.get(0);
			json.put("success", true);
			json.put("message", "查询成功！！");
			json.put("repair", JsonUtilHibernate.beanToJson(repair));
		}
		return json;
	}

	@Override
	public JSONObject submitRepairMessage(Repair repair, Session session) {
		JSONObject jsonObject = new JSONObject() ;
		
		String hql = "from Repair where id = '"+repair.getId()+"' " ;
		List<Object> list = repairDao.executeQuery(hql, null, 0, 0, session);
		Repair repairByDataBase = new Repair() ;
		if (list == null || list.size() <=0) {
			jsonObject.put("success", false);
			jsonObject.put("message", "没有定位到维修记录，请重新刷卡填写信息");
			return jsonObject ;
		}else{
			repairByDataBase = (Repair) list.get(0);
		}
		
		repairByDataBase.setStartRepairTime(repair.getStartRepairTime());
		repairByDataBase.setEndRepairTime(repair.getEndRepairTime());
		repairByDataBase.setStartRepairTimeSys(repair.getStartRepairTimeSys());
		repairByDataBase.setEndRepairTimeSys(repair.getEndRepairTimeSys());
		repairByDataBase.setSceneMalfDesc(repair.getSceneMalfDesc());
		repairByDataBase.setMalfModule(repair.getMalfModule());
		repairByDataBase.setMalfResult(repair.getMalfResult());
		repairByDataBase.setRepairMethod(repair.getRepairMethod());
		repairByDataBase.setDealMethod(repair.getDealMethod());
		repairByDataBase.setIsChangePart(repair.getIsChangePart());
		repairByDataBase.setIsCharge(repair.getIsCharge());
		repairByDataBase.setRepairedState(repair.getRepairedState());
		//session.update(repairByDataBase);
		repairDao.updataObject(repairByDataBase, session);
		
		
		jsonObject.put("success", true);
		jsonObject.put("message", "提交信息成功");
		jsonObject.put("data", JsonUtilHibernate.beanToJson(repairByDataBase));
		return jsonObject;
	}
	
	/**
	 * 通过维修id查询维修的详细信息
	 */
	@Override
	public JSONObject getRepairDetail(String id, Session session) {
		JSONObject json = new JSONObject();
		String hql = "from Repair where id='"+id+"'";
		List<Object> list = repairDao.executeQuery(hql, null, 0, 0, session);
		
		JSONArray jsonArray = new JSONArray();
		
		if(list == null ){
			json.put("success", false);
			json.put("message", "系统异常");
		}else if(list.size() <= 0){
			json.put("success", false);
			json.put("message", "没有改数据");
		}else{
			for (Object object : list) {
				jsonArray.add(JsonUtilHibernate.beanToJson((Repair)object));
			}
		}
		json.put("success", true);
		json.put("message", "查询成功");
		json.put("data", jsonArray);
		return json;
	}
	
	
}
