package com.ebring.gsgfAppServer.action;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ebring.gsgfAppServer.entity.Engineer;
import com.ebring.gsgfAppServer.serviceInterface.EngineerServiceInter;
import com.ebring.gsgfAppServer.utils.DataBase.DButils;
import com.ebring.gsgfAppServer.utils.normal.JsonUtilHibernate;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 工程师action
 * @author ZhangJintao
 */
public class EngineerAction extends ActionSupport{
	public SessionFactory sessionFactory ; //Hibernate的SessionFactory，注意，每一个方法都需要关闭session
	public DButils dButils ;
	public static Logger logger = Logger.getLogger(EngineerAction.class) ;
	private static final long serialVersionUID = 1L ;
	private EngineerServiceInter engineerService ;
	private Engineer engineer ;
	private String result ;
	
	/**
	 * 工程师登录
	 * 返回json数据格式：
	 * 正确时： {"success":true,"message":"登录成功","engineerMsg":{"engName":"工程师姓名","phone":"工程师电话","idCard":"工程师身份证","remark":"工程师备注","engId":"工程师主键","engPassword":"工程师密码"}}
	 * 错误时：{success：false;message:提示信息}
	 * @return
	 */
	@SuppressWarnings("static-access")
	public String login(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】工程师登录事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			engineer = new Engineer(null, null, null, request.getParameter("phone"), null, request.getParameter("eng_password"));
			JSONObject json = new JSONObject();
			engineer = engineerService.engineerLogin(engineer,session);
			if (engineer==null) {
				json.put("success", false);
				json.put("message", "用户名或密码错误，请重新登录！");
			}else{
				json.put("success", true);
				json.put("message","登录成功");
				String engineer_json = JsonUtilHibernate.beanToJson(engineer);
				json.put("engineerMsg", engineer_json);
			}
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】工程师登录结果 = " + result);
		} catch (Exception e) {
			logger.info("【程序日志】工程师登录结果 = [系统异常,工程师登录失败!!!]");
			logger.error("【程序日志】工程师登录出现异常" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	/**
	 * 工程师修改密码
	 * 返回json数据格式：
	 * （1）修改成功
	 * 	json格式返回数据
	 * 		{"success":true,message="工程师修改密码成功"}
	 * （2）修改失败
	 * 	json格式返回数据
	 * 		{"success":flase,message="相应提示信息",type="提示信息类型"}
	 * 		【
	 * 			注：type中提示信息类型分如下几类
	 * 				reset_phone_alert  --- 电话原因导致失败
	 * 				reset_iadcard_alert   --- 身份证原因导致失败
	 * 				reset_password_alert  --- 旧密码原因导致失败
	 * 				reset_new_password_alert  ---  新密码原因导致失败
	 * 				reset_new_repassword_alert  --- 重复输入的新密码导致失败
	 * 		】
	 * @return String
	 */
	@SuppressWarnings("static-access")
	public String change_password(){
		Session session = sessionFactory.openSession();
		HttpServletResponse response = null ;
		try {
			logger.info("【程序日志】工程师修改密码事件");  //打日志
			response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			
			engineer = new Engineer(request.getParameter("reset_engid"), null, request.getParameter("reset_idcard"), 
					request.getParameter("reset_phone"), null, request.getParameter("reset_password"));
			String reset_new_password = request.getParameter("reset_new_password");
			String reset_new_repassword = request.getParameter("reset_new_repassword");
			
			logger.info("【程序日志】工程师信息" + engineer.toString());
			logger.info("【程序日志】reset_new_password = " + reset_new_password + "   ||reset_new_repassword   " + reset_new_repassword);
			
			//调用service的修改密码方法，得到修改结果
			JSONObject json = engineerService.engineerChangePassword(engineer, reset_new_password, reset_new_repassword, session);
			
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】工程师修改密码结果 = " + result);
		} catch (Exception e) {
			JSONObject json = new JSONObject();
			json.put("success", false);
			json.put("message", e.getMessage());
			json.put("type", "reset_new_repassword_alert");
			PrintWriter out;
			try {
				out = response.getWriter();
				out.write(result);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			logger.info("【程序日志】工程师修改密码结果 = [系统异常,修改密码失败!!!]");
			logger.error("【程序日志】工程师修改密码发生异常" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	public EngineerServiceInter getEngineerService() {
		return engineerService;
	}
	public void setEngineerService(EngineerServiceInter engineerService) {
		this.engineerService = engineerService;
	}
	public Engineer getEngineer() {
		return engineer;
	}
	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
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
