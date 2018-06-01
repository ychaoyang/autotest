package com.autotest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yu on 17/12/5.
 */
@Configuration
public class DruidBaseConfig {

	@Value("${spring.datasource.initialSize}")
	int initialSize;

	@Value("${spring.datasource.minIdle}")
	int minIdle;

	@Value("${spring.datasource.maxActive}")
	int maxActive;

	@Value("${spring.datasource.maxWait}")
	int maxWait;

	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
	int timeBetweenEvictionRunsMillis;

	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
	int minEvictableIdleTimeMillis;

	@Value("${spring.datasource.validationQuery}")
	String validationQuery;

	@Value("${spring.datasource.testWhileIdle}")
	boolean testWhileIdle;

	@Value("${spring.datasource.testOnBorrow}")
	boolean testOnBorrow;

	@Value("${spring.datasource.testOnReturn}")
	boolean testOnReturn;

	@Value("${spring.datasource.poolPreparedStatements}")
	boolean poolPreparedStatements;

	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
	int maxPoolPreparedStatementPerConnectionSize;

	@Value("${spring.datasource.filters}")
	String filters;

	@Value("{spring.datasource.connectionProperties}")
	String connectionProperties;

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
		dataSource.setInitialSize(initialSize);
		dataSource.setMinIdle(minIdle);
		dataSource.setMaxActive(maxActive);
		dataSource.setMaxWait(maxWait);
		dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		dataSource.setValidationQuery(validationQuery);
		dataSource.setTestWhileIdle(testWhileIdle);
		dataSource.setTestOnBorrow(testOnBorrow);
		dataSource.setTestOnReturn(testOnReturn);
		dataSource.setPoolPreparedStatements(poolPreparedStatements);
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
		return dataSource;
	}
}
