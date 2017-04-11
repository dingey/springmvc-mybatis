package com.di.util;

import java.io.File;
import java.net.URISyntaxException;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;

/**
 * @author di
 */
public class SpringJUnit4ClassRunner extends org.springframework.test.context.junit4.SpringJUnit4ClassRunner {

	public SpringJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

	@Override
	public void run(RunNotifier notifier) {
		String configDirPath = System.getProperty("CONFIG_DIR_PATH");
		if (configDirPath == null || configDirPath.isEmpty()) {
			String path = "";
			try {
				path = Thread.currentThread().getContextClassLoader().getResource("").toURI().getPath();
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			path = path.replaceFirst("test-classes", "classes") + "config";
			File f = new File(path);
			if (!f.exists() || !f.isDirectory()) {
				throw new RuntimeException("系统环境变量CONFIG_DIR_PATH未配置,尝试从项目下加载配置文件失败！" + path);
			}
			System.setProperty("CONFIG_DIR_PATH", path);
		}
		super.run(notifier);
	}
}