package com.ebring.gsgfAppServer.daoInterface;

import java.util.List;

import org.hibernate.Session;

/**
 * 基本 Dao
 * @author ZhangJintao
 */
public interface BaseDaoInterface {
	
	/**
	 * 给数据库插入一个对象
	 * @param object
	 * @return
	 */
	public boolean saveObject(Object object , Session session);
	
	/**
	 * 从数据库删除一个对象
	 * @param object
	 * @return boolean
	 */
	public boolean deleteObject(Object object , Session session) ;
	
	/**
	 * 更新数据库中对象
	 * @param object
	 * @return boolean
	 */
	public boolean updataObject(Object object , Session session) ;
	
	/**
	 * 执行查询hql语句<br/>
	 * @param<br/>
	 * *****String hql ---  要执行的语句<br/>
	 * *****String [] parameters ---  hql语句中参数，为传入null为无参模式<br/>
	 * *****int firstResult ---  从结果集的firstResult位置开始返回结果[为0代表从0开始]<br/> 
	 * *****int maxResults ---  一共返回maxResults条结果[为0代表从firstResult开始返回全部结果]<br/>
	 * @return List<Object>
	 */
	public List<Object> executeQuery(String hql , String [] parameters , int firstResult , int maxResults , Session session);

	/**
	 * 更新或者增加数据库中对象
	 * @param object
	 * @return boolean
	 */
	public boolean updataOrSaveObjects(List<Object> saveObjs , List<Object> updataObjs , Session session) ;
}
