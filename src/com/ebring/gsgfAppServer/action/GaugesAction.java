package com.ebring.gsgfAppServer.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ebring.gsgfAppServer.serviceInterface.GaugesServiceInter;
import com.ebring.gsgfAppServer.utils.DataBase.DButils;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 计量表action
 * @author ZhangJintao
 */
public class GaugesAction extends ActionSupport{
	public SessionFactory sessionFactory ; //Hibernate的SessionFactory，注意，每一个方法都需要关闭session
	public DButils dButils ;
	public static Logger logger = Logger.getLogger(GaugesAction.class) ;
	private static final long serialVersionUID = 1L ;
	private GaugesServiceInter gaugesService ;
	private String result ;
	
	/**
	 * 通过nfc_flag查询计量表
	 * 返回json数据格式：
	 * 正确时： {"success":true,"gaugesMsg":{"gauId":"计量表档案   主键","devType":"设备类型（0：餐饮，1：锅炉，3：民用，4：壁挂锅炉
	 * 			，5：别墅，6其他）","meterType":"气表类型（0：涡轮，1：罗茨，2:工业皮膜表，4：其他）","meterNum":"气表表号码",
	 * 			"meterProduceDate":"气表生产日期","contModel":"控制器型号","contNum":"控制器编号","contProduceDate":"控制器生产日期",
	 * 			"gauType":"计量表类型（0：民用，1：公用）","meterModel":"气表型号 （基表/IC卡表/远传表/物联表/其他）","userId":"用户主键",
	 * 			"address":"地址","exceptArriveTime":"期望到达时间（默认）","nfcFlag":"计量表nfc唯一标识"}
	 * 错误时：{success：false;message:提示信息}
	 * @return String 
	 */
	@SuppressWarnings("static-access")
	public String getGaugesByNFC(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】通过nfc_flag查询计量表事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			//1---准备数据 
			String nfc_flag = request.getParameter("nfc_flag");
			//2---调用service得到结果
			json = gaugesService.getGaugesByNFC(nfc_flag, session);
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】通过nfc_flag查询计量表事件 = " + result);
		} catch (Exception e) {
			logger.info("【程序日志】通过nfc_flag查询计量表事件 = [系统异常,查询失败!!!]");
			logger.error("【程序日志】通过nfc_flag查询计量表事件" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	
	public GaugesServiceInter getGaugesService() {
		return gaugesService;
	}
	public void setGaugesService(GaugesServiceInter gaugesService) {
		this.gaugesService = gaugesService;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

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
}
