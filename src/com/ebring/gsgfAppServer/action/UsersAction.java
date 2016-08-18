package com.ebring.gsgfAppServer.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ebring.gsgfAppServer.serviceInterface.UsersServiceInter;
import com.ebring.gsgfAppServer.utils.DataBase.DButils;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户 action
 * @author ZhangJintao
 */
public class UsersAction extends ActionSupport{
	public SessionFactory sessionFactory ; //Hibernate的SessionFactory，注意，每一个方法都需要关闭session
	public DButils dButils ;
	public static Logger logger = Logger.getLogger(UsersAction.class) ;
	private static final long serialVersionUID = 1L ;
	private UsersServiceInter usersService ;
	private String result ;
	
	/**
	 * 通过主键查询用户
	 * 返回json数据格式：
	 * 正确时： {"success":true,"users":{"userId":"用户主键","userNum":"用户卡号","userType":"用户类型（0-民用，1-公用）","companyName":"单位名称",
	 * 			"companyAddress":"单位地址","userName":"用户姓名","userAddress":"用户地址","userPhone":"用户电话",
	 * 			"installTime":"安装日期","registerTime":"开户年月","gauId":"计量表id","userDirector":"责任人"}
	 * 错误时：{success：false;message:提示信息}
	 * @return String 
	 */
	@SuppressWarnings("static-access")
	public String getUsersByID(){
		Session session = sessionFactory.openSession();
		try {
			logger.info("【程序日志】通过主键查询用户事件");  //打日志
			HttpServletResponse response =  ServletActionContext.getResponse();
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			JSONObject json = new JSONObject();
			
			//1---准备数据 
			String userId = request.getParameter("userId");
			//2---调用service得到结果
			json = usersService.getUsersByID(userId, session);
			
			result = json.toString();
			PrintWriter out = response.getWriter();
			out.write(result);
			logger.info("【程序日志】通过主键查询用户事件 = " + result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("【程序日志】通过主键查询用户事件 = [系统异常,查询失败!!!]");
			logger.error("【程序日志】通过主键查询用户事件" + e.getMessage());
		}finally{
			dButils.closeSession(session);
		}
		return super.NONE;
	}
	
	public UsersServiceInter getUsersService() {
		return usersService;
	}
	public void setUsersService(UsersServiceInter usersService) {
		this.usersService = usersService;
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
