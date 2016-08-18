package com.ebring.gsgfAppServer.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ebring.gsgfAppServer.entity.Engineer;
import com.ebring.gsgfAppServer.entity.Maintain;
import com.ebring.gsgfAppServer.serviceInterface.MaintainService;
import com.ebring.gsgfAppServer.utils.DataBase.DButils;
import com.ebring.gsgfAppServer.utils.normal.GenerateID;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 保养Action
 * @author 增宝狄
 *
 */
public class MaintainAction extends ActionSupport{
	public SessionFactory sessionFactory ; //Hibernate的SessionFactory，注意，每一个方法都需要关闭session
	public DButils dButils ;
	public static Logger logger = Logger.getLogger(RepairAction.class) ;
	private MaintainService maintainService;
	private String result ;
	private static final long serialVersionUID = 1L;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public DButils getdButils() {
		return dButils;
	}
	public void setdButils(DButils dButils) {
		this.dButils = dButils;
	}
	public static Logger getLogger() {
		return logger;
	}
	public static void setLogger(Logger logger) {
		MaintainAction.logger = logger;
	}
	public MaintainService getMaintainService() {
		return maintainService;
	}
	public void setMaintainService(MaintainService maintainService) {
		this.maintainService = maintainService;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 提交保养信息
	 * 返回json数据格式：
	 * @return String
	 */
	@SuppressWarnings("static-access")
	public String addMaintInfo(){
		
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】提交维修信息事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			
			//1---准备数据 
			Maintain maintain = new Maintain();
			Engineer eng = new Engineer();
			logger.info("【程序日志】提交维修信息事件[前台获取到的维修信息为] " + maintain.toString());  //打日志
			//2---调用service得到结果
			maintain.setMainId(GenerateID.getId(16));
			maintain.setWashTime(request.getParameter("washTime"));
			maintain.setGauState(request.getParameter("gauState"));
			maintain.setStopReason(request.getParameter("stopReason"));
			maintain.setGauFaceState(request.getParameter("gauFaceState"));
			maintain.setGauFaceResult(request.getParameter("gauFaceResult"));
			maintain.setGauMovState(request.getParameter("gauMovState"));
			maintain.setGauMovResult(request.getParameter("gauMovResult"));
			maintain.setIsCharge(request.getParameter("isCharge"));
			maintain.setMoney(request.getParameter("Money"));
			maintain.setNoFeeReason(request.getParameter("noFeeReson"));
			maintain.setNoChangeReason(request.getParameter("noChangeReason"));
			maintain.setDealResult(request.getParameter("dealResult"));
			maintain.setMaintainProcDesc(request.getParameter("maintainProcDesc"));
			maintain.setAbluentCount(request.getParameter("abluentCount"));
			maintain.setOilState(request.getParameter("oilState"));
			maintain.setIsAddOil(request.getParameter("isAddOil"));
			maintain.setIsChargeOil(request.getParameter("isChargeOil"));
			maintain.setOilMoney(request.getParameter("oilMoney"));
			maintain.setNoOilFeeReason(request.getParameter("noOilFeeReason"));
			maintain.setNoAddOilReason(request.getParameter("noAddOilReason"));
			maintain.setMeterCellState(request.getParameter("meterCellState"));
			maintain.setIsChangeMeterCell(request.getParameter("isChangeMeterCell"));
			maintain.setIsChargeMeterCell(request.getParameter("isChargeMeterCell"));
			maintain.setMeterCellMoney(request.getParameter("meterCellMoney"));
			maintain.setNoMeterFeeReason(request.getParameter("noMeterFeeReason"));
			maintain.setMeterDealAdvice(request.getParameter("meterDealAdvice"));
			maintain.setContCellState(request.getParameter("contCellState"));
			maintain.setIsChangeContCell(request.getParameter("isChangeContCell"));
			maintain.setIsChargeContCell(request.getParameter("isChargeContCell"));
			maintain.setContCellMoney(request.getParameter("contCellMoney"));
			maintain.setNoContFeeReason(request.getParameter("noContFeeReason"));
			maintain.setContDealAdvice(request.getParameter("contDealAdvice"));
			maintain.setFieldMaintainTime(request.getParameter("fieldMaintainTime"));
			eng.setEngId(request.getParameter("engId"));
			maintainService.addMaintainInfo(maintain, session);
			//3---返回数据
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】提交维修信息事件 = " + result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("【程序日志】提交维修信息事件 = [系统异常,查询失败!!!]");
			logger.error("【程序日志】提交维修信息事件" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
}
