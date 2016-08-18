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
import com.ebring.gsgfAppServer.entity.Gauges;
import com.ebring.gsgfAppServer.entity.ResidentAudit;
import com.ebring.gsgfAppServer.serviceInterface.ResidentAuditServiceInter;
import com.ebring.gsgfAppServer.utils.DataBase.DButils;
import com.ebring.gsgfAppServer.utils.normal.GenerateID;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 民用户日常巡检 操作action
 * @author ZhangJintao
 */
public class ResidentAuditAction extends ActionSupport{
	public SessionFactory sessionFactory ; //Hibernate的SessionFactory，注意，每一个方法都需要关闭session
	public DButils dButils ;
	public static Logger logger = Logger.getLogger(ResidentAuditAction.class) ;
	private static final long serialVersionUID = 1L ;
	private ResidentAuditServiceInter residentAuditService ;
	private String result ;
	
	/**
	 * 添加一条民用户日常巡检记录
	 * 返回json数据格式：
	 * json格式返回数据
	 *		{"success":true,message="提交信息成功"}
	 *（2）修改失败
	 * json格式返回数据
	 *		{"success":flase,message="相应提示信息"}
	 * @return String 
	 */
	@SuppressWarnings("static-access")
	public String AddNormalUserPatrolCheck(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】添加民用户日常巡检记录事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			
			//1---准备数据 
			ResidentAudit residentAudit = new ResidentAudit(GenerateID.getId(16), new Gauges(request.getParameter("gauId")),new Engineer(request.getParameter("engId")), request.getParameter("testTime").replaceAll("/", "-"), 
					request.getParameter("isGauFacade"), request.getParameter("isGauCarSeal"), request.getParameter("isCell"), 
					request.getParameter("baseNum"), request.getParameter("sumGas"),request.getParameter("surplusGas"), 
					request.getParameter("gauState"), request.getParameter("malfDesc"),request.getParameter("dealState"),
					request.getParameter("dealMethod"), request.getParameter("dealResult"),request.getParameter("notDealReason"), 
					request.getParameter("dealAdvice"),request.getParameter("isDanger"), request.getParameter("dangerDesc"), 
					request.getParameter("isInformService"));
			logger.info("【程序日志】添加民用户日常巡检记录事件---巡检提交信息" + residentAudit.toString());  //打日志
			//2---调用service得到结果
			json = residentAuditService.AddNormalUserPatrolCheck(residentAudit, session);
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】添加民用户日常巡检记录事件 = " + result);
		} catch (Exception e) {
			logger.info("【程序日志】添加民用户日常巡检记录事件 = [系统异常,查询失败!!!]");
			logger.error("【程序日志】添加民用户日常巡检记录事件" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	public ResidentAuditServiceInter getResidentAuditService() {
		return residentAuditService;
	}
	public void setResidentAuditService(
			ResidentAuditServiceInter residentAuditService) {
		this.residentAuditService = residentAuditService;
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
