package com.ebring.gsgfAppServer.utils.DataBase;

import org.hibernate.Session;

public class DButils {
	public void closeSession(Session session) {
		if (session.isOpen()) {
			session.close();
		}
	}
}
