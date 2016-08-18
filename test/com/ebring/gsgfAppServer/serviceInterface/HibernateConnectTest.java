package com.ebring.gsgfAppServer.serviceInterface;

import org.junit.Test;

public class HibernateConnectTest {
	@Test
	public void insert_engineer() {
		try {
			
//			Engineer engineer = new Engineer("1111", "111", "111", "18745215684", "这是备注", "123456789");
//			SessionFactory sessionFactory;
//			sessionFactory = new Configuration().configure().buildSessionFactory();
//	        Session session = sessionFactory.openSession();
//	        Transaction transaction =  session.beginTransaction();
//	        session.save(engineer);
//	        transaction.commit();
//	        session.close();
			
			//我们使用hibernate完成crud操作
			//这里我们只建对象，不建表
			//我们不使用service，直接调用
			//3、创建一个会话 相当于jdbc的connection
//			Session session=MySessionFactory.getSessionFactory().openSession();
//			//4、对hibernate而言，要求程序员在增加、删除、修改的时候使用事务提交，否则不生效
//			Transaction transaction=session.beginTransaction();
//			//5、添加一个雇员
//			Engineer engineer = new Engineer("1111", "111", "111", "18745215684", "这是备注", "123456789");
//			//6、保存用户后至数据库
//			session.save(engineer);
//			//7、提交事务
//			transaction.commit();
//			session.close();
//			System.out.println("insert ok!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_son_call_parent_method() {
			
			ParentClass p = new ParentClass();
	        ChildrenClass c = new ChildrenClass();
	 
	        System.out.println(p.getMsg());
	        System.out.println("");
	        System.out.println(c.getMsg());//没有重写，还是调用父类中的方法。
	}
}

