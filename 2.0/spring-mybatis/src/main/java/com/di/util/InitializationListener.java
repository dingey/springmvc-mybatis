package com.di.util;

import java.io.File;
import java.net.URISyntaxException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author di
 */
public class InitializationListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
	}

	public void contextInitialized(ServletContextEvent arg0) {
		String configDirPath = System.getProperty("CONFIG_DIR_PATH");
		if (configDirPath == null || configDirPath.isEmpty()) {
			String path = "";
			try {
				path = Thread.currentThread().getContextClassLoader().getResource("").toURI().getPath();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			path += "config";
			File f = new File(path);
			if (!f.exists() || !f.isDirectory()) {
				throw new RuntimeException("系统环境变量CONFIG_DIR_PATH未配置,尝试从项目下加载配置文件失败！");
			}
			System.setProperty("CONFIG_DIR_PATH", path);
		}
	}
}
