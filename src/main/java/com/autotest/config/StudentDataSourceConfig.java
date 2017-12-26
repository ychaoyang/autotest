package com.autotest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by yu on 17/12/5.
 */
@Configuration
@MapperScan(basePackages = StudentDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "studentSqlSessionFactory")
public class StudentDataSourceConfig extends DruidConfig {

	static final String PACKAGE = "dal.dao.student";

	@Value("${student.datasource.url}")
	private String studentUrl;

	@Value("${student.datasource.username}")
	private String studentUser;

	@Value("${student.datasource.password}")
	private String studentPassword;

	@Value("${student.datasource.driverClassName}")
	private String studentDriverClass;

	@Bean(name = "studentDataSource")
	public DataSource studentDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUrl(studentUrl);
		dataSource.setUsername(studentUser);
		dataSource.setPassword(studentPassword);
		dataSource.setDriverClassName(studentDriverClass);
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

	@Bean(name = "studentTransactionManager")
	public DataSourceTransactionManager studentTransactionManager() {
		return new DataSourceTransactionManager(studentDataSource());
	}

	@Bean(name = "studentSqlSessionFactory")
	public SqlSessionFactory studentSqlSessionFactory(@Qualifier("studentDataSource") DataSource studentDataSource)
			throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(studentDataSource);
		return sessionFactory.getObject();
	}
}