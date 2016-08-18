package com.ebring.gsgfAppServer.Thread;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ListenC3P0dataSourceMyThread extends Thread implements  ApplicationListener<ContextRefreshedEvent>{
	public static Logger logger = Logger.getLogger(ListenC3P0dataSourceMyThread.class);
	private ComboPooledDataSource dataSource ;
	private ListenC3P0dataSourceMyThread c3p0dataSourceMyThread ;
	public void run() {
		// 线程未中断执行循环
		while (!this.isInterrupted()) {
			logger.debug("【连接池运行时监测数据】----当前时间：" + (new Date()).toString() );
			try {
				logger.debug("		【连接池详情】-----最大连接数：" + dataSource.getMaxPoolSize() );
				logger.debug("		【连接池详情】-----最小连接数" + dataSource.getMinPoolSize() );
				logger.debug("		【连接池详情】-----正在使用连接数" + dataSource.getNumBusyConnections() );
				logger.debug("		【连接池详情】-----空闲连接数" + dataSource.getNumIdleConnections() );
				logger.debug("		【连接池详情】-----总连接数" + dataSource.getNumConnections() );
				ListenC3P0dataSourceMyThread.sleep(500); // 每隔1秒执行一次
			} catch (Exception e) {
				e.printStackTrace();
				try {
					ListenC3P0dataSourceMyThread.sleep(1000);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		c3p0dataSourceMyThread.start();
	}

	public ComboPooledDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(ComboPooledDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public ListenC3P0dataSourceMyThread getC3p0dataSourceMyThread() {
		return c3p0dataSourceMyThread;
	}
	
	public void setC3p0dataSourceMyThread(ListenC3P0dataSourceMyThread c3p0dataSourceMyThread) {
		this.c3p0dataSourceMyThread = c3p0dataSourceMyThread;
	}  
}