package com.ebring.gsgfAppServer.action;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import weixin.utils.MapToObject;

import com.ebring.gsgfAppServer.entity.CycleCheck;
import com.ebring.gsgfAppServer.entity.Engineer;
import com.ebring.gsgfAppServer.entity.Gauges;
import com.ebring.gsgfAppServer.serviceInterface.CycleCheckServiceinter;
import com.ebring.gsgfAppServer.utils.DataBase.DButils;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 周检action
 * 
 * @author xz
 *
 */
public class ClycleCheckAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Logger logger = Logger.getLogger(ClycleCheckAction.class);
	private CycleCheckServiceinter service;
	private SessionFactory sessionFactory;
	private DButils dButils;

	
	private Session session;
	private CycleCheck check;
	private JSONObject json;
	
	public CycleCheckServiceinter getService() {
		return service;
	}

	public void setService(CycleCheckServiceinter service) {
		this.service = service;
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

	/**
	 * 公用周检
	 * 
	 * @return
	 */
	@SuppressWarnings("static-access")
	public String publicCheck() {
		try {
			init();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			dButils.closeSession(session);
		}
		return super.NONE;

	}

	/**
	 * 民用周检
	 * 
	 * @return
	 */
	@SuppressWarnings("static-access")
	public String privateCheck() {
		try {
			init();
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			dButils.closeSession(session);
		}
		return super.NONE;

	}
	
	
	private void init() throws Exception{
		HttpServletResponse response =  ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
			session = sessionFactory.openSession();
			response.setCharacterEncoding("utf-8");
			request.setCharacterEncoding("utf-8");
			check = (CycleCheck) MapToObject.mapToObject((Map<String, Object>) request, CycleCheck.class);
	        json = service.add(check, session);
	        response.getWriter().write(json.toString());
	}
}
