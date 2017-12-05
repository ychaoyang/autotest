package com.autotest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by yu on 17/12/5.
 */
@Configuration
@MapperScan(basePackages = UserDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "userSqlSessionFactory")
public class UserDataSourceConfig extends DruidConfig {

	static final String PACKAGE = "com.autotest.dao.user";

	@Value("${user.datasource.url}")
	private String url;

	@Value("${user.datasource.username}")
	private String user;

	@Value("${user.datasource.password}")
	private String password;

	@Value("${user.datasource.driverClassName}")
	private String driverClass;

	/**
	 * 使用@Primary注解主数据源
	 */
	@Bean(name = "userDataSource")
	@Primary
	public DataSource userDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);
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

	@Bean(name = "userTransactionManager")
	@Primary
	public DataSourceTransactionManager userTransactionManager() {
		return new DataSourceTransactionManager(userDataSource());
	}

	@Bean(name = "userSqlSessionFactory")
	@Primary
	public SqlSessionFactory userSqlSessionFactory(@Qualifier("userDataSource") DataSource userDataSource)
			throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(userDataSource);
		return sessionFactory.getObject();
	}
}