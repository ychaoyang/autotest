package com.autotest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yu on 17/12/5.
 */
@Configuration
public class DruidBaseConfig {


	/**
	 * setDataSource
	 * @param dataSource
	 * @param url
	 * @param username
	 * @param password
	 * @param driverClassName
	 * @return
	 */
	protected DruidDataSource setDataSource(DruidDataSource dataSource, String url, String username, String password,
											String driverClassName) {
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClassName);
		//configuration
		dataSource.setInitialSize(10);
		dataSource.setMinIdle(1);
		dataSource.setMaxActive(500);
		dataSource.setMaxWait(6000);
		dataSource.setTimeBetweenEvictionRunsMillis(60000);
		dataSource.setMinEvictableIdleTimeMillis(300000);
		dataSource.setValidationQuery("SELECT 1 FROM DUAL");
		dataSource.setTestWhileIdle(true);
		dataSource.setTestOnBorrow(false);
		dataSource.setTestOnReturn(false);
		dataSource.setPoolPreparedStatements(false);
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(20);
		return dataSource;
	}
}
