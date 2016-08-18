package com.ebring.gsgfAppServer.daoImp;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ebring.gsgfAppServer.daoInterface.BaseDaoInterface;

public class BaseDaoImp implements BaseDaoInterface {
	public static Logger logger = Logger.getLogger(BaseDaoImp.class);

	@Override
	public boolean saveObject(Object object , Session session) {
		Transaction transaction = null;
		boolean saveResult = false;
		try {
			transaction = session.beginTransaction();
			session.save(object);
			transaction.commit();
			saveResult = true ;
			return saveResult;
		} catch (Exception e) {
			transaction.rollback();
			return saveResult;
		}
	}
	
	@Override
	public boolean deleteObject(Object object , Session session) {
		Transaction transaction = null;
		boolean deleteResult = false ;
		try {
			transaction = session.beginTransaction();
			session.delete(object);
			transaction.commit();
			deleteResult = true;
		} catch (Exception e) {
			transaction.rollback();
			return deleteResult;
		}
		return deleteResult;
	}

	@Override
	public boolean updataObject(Object object , Session session) {
		Transaction transaction = null;
		boolean updataResult = false ;
		try {
			transaction = session.beginTransaction();
			session.update(object);
			transaction.commit();
			updataResult = true;
		} catch (Exception e) {
			transaction.rollback();
			return updataResult;
		}
		return updataResult;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> executeQuery(String hql, String[] parameters, int firstResult, int maxResults , Session session) {
		Transaction transaction = null;
		List<Object> lists = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery(hql);
			if (parameters != null && parameters.length>0) {
				for (int i = 0; i < parameters.length; i++) {
					query.setString(i,parameters[i]);
				}
			}
			query.setFirstResult(firstResult);
			if (maxResults != 0) {
				query.setMaxResults(maxResults);
			}
			lists = query.list();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
		return lists;
	}

	@Override
	public boolean updataOrSaveObjects(List<Object> saveObjs,List<Object> updataObjs , Session session) {
		Transaction transaction = null;
		boolean saveOrupdataResult = false;
		try {
			transaction = session.beginTransaction();
			
			for (Object o : saveObjs) {
				session.save(o);
			}
			for (Object o : updataObjs) {
				session.update(o);
			}
			transaction.commit();
			saveOrupdataResult = true ;
		} catch (Exception e) {
			transaction.rollback();
			return saveOrupdataResult;
		}
		return saveOrupdataResult;
	}
}
