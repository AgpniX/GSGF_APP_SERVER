package com.ebring.gsgfAppServer.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ebring.gsgfAppServer.entity.Repair;
import com.ebring.gsgfAppServer.serviceInterface.RepairServiceInter;
import com.ebring.gsgfAppServer.utils.DataBase.DButils;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 维修 操作action
 * @author ZhangJintao
 */
public class RepairAction extends ActionSupport{
	public SessionFactory sessionFactory ; //Hibernate的SessionFactory，注意，每一个方法都需要关闭session
	public DButils dButils ;
	public static Logger logger = Logger.getLogger(RepairAction.class) ;
	private static final long serialVersionUID = 1L ;
	private RepairServiceInter repairService ;
	private String result ;
	
	/**
	 * 通过工程师id和用户类型查找维修信息
	 * 返回json数据格式：
	 * 正确时： {"success":true,"message":"成功的提示信息","data":"JsonArray对象，存放一条条维修表信息"}
	 * 错误时：{success：false;message:提示信息}
	 * @return String 
	 */
	@SuppressWarnings("static-access")
	public String getRepairMessageByEngidAndUsertype(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】通过工程师id和用户类型查找维修信息事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			
			//1---准备数据 
			int pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
			int pageSize = Integer.parseInt(request.getParameter("pageSize"));
			String engId = request.getParameter("engId");
			String userType = request.getParameter("userType");
			
			//2---调用service得到结果
			json = repairService.getRepairInfo(engId, userType, pageIndex,pageSize , session);
			
			//3---返回数据
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】通过工程师id和用户类型查找维修信息事件 = " + result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("【程序日志】通过工程师id和用户类型查找维修信息事件 = [系统异常,查询失败!!!]");
			logger.error("【程序日志】通过工程师id和用户类型查找维修信息事件" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	
	
	/**
	 * 查询维修信息
	 * 返回json数据格式：
	 * @return String 
	 */
	@SuppressWarnings("static-access")
	public String getRepairInfoByNFC(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】通过nfc查找维修信息事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			
			//1---准备数据 
			String nfc_flag = request.getParameter("nfc_flag");
			
			//2---调用service得到结果
			json = repairService.getRepairInfoByNFC(nfc_flag, session);
			
			//3---返回数据
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】通过nfc查找维修信息事件 = " + result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("【程序日志】通过nfc查找维修信息事件 = [系统异常,查询失败!!!]");
			logger.error("【程序日志】通过nfc查找维修信息事件" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	/**
	 * 提交维修信息
	 * 返回json数据格式：
	 * @return String 
	 */
	@SuppressWarnings("static-access")
	public String submitRepairMessage(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】提交维修信息事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			
			//1---准备数据 
			Repair repair = new Repair();
			repair.setId(request.getParameter("repair_id"));
			repair.setStartRepairTime(request.getParameter("startRepairTime"));
			repair.setEndRepairTime(request.getParameter("endRepairTime"));
			repair.setStartRepairTimeSys(request.getParameter("startRepairTimeSys"));
			repair.setEndRepairTimeSys(request.getParameter("endRepairTimeSys"));
			repair.setSceneMalfDesc(request.getParameter("sceneMalfDesc"));
			repair.setMalfModule(request.getParameter("malfModule"));
			repair.setMalfResult(request.getParameter("malfResult"));
			repair.setRepairMethod(request.getParameter("repairMethod"));
			repair.setDealMethod(request.getParameter("dealMethod"));
			repair.setIsChangePart(request.getParameter("isChangePart"));
			repair.setIsCharge(request.getParameter("isCharge"));
			repair.setRepairedState(request.getParameter("repairedState"));
			//1未写维修处理意见
			//2未写更换配件金额
			logger.info("【程序日志】提交维修信息事件[前台获取到的维修信息为] " + repair.toString());  //打日志
			//2---调用service得到结果
			json = repairService.submitRepairMessage(repair, session);
			
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
	
	/**
	 * 通过维修id查询维修信息的详情
	 * 返回json数据格式：
	 * 正确时： {"success":true,"message":"成功的提示信息","data":"JsonArray对象，该id的维修详情"}
	 * 错误时：{success：false;message:提示信息}
	 * @return String 
	 */
	@SuppressWarnings("static-access")
	public String getRepairDetail(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】通过维修id查找维修详细信息事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			
			//1---准备数据 
			String id = request.getParameter("id");
			
			//2---调用service得到结果
			json = repairService.getRepairDetail(id, session);
			
			//3---返回数据
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】通过维修id查找维修详细信息事件 = " + result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("【程序日志】通过维修id查找维修详细信息事件 = [系统异常,查询失败!!!]");
			logger.error("【程序日志】通过维修id查找维修详细信息事件" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	public RepairServiceInter getRepairService() {
		return repairService;
	}
	public void setRepairService(RepairServiceInter repairService) {
		this.repairService = repairService;
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
