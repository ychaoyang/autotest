package com.autotest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yu on 17/12/5.
 */
@Configuration
public class DruidConfig {

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
}
