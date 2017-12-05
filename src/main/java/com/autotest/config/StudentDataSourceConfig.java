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
public class StudentDataSourceConfig {

	/**
	 * 精确到 student 目录,以便跟其他数据源隔离
	 */
	static final String PACKAGE = "com.autotest.dao.student";

	@Value("${student.datasource.url}")
	private String url;

	@Value("${student.datasource.username}")
	private String user;

	@Value("${student.datasource.password}")
	private String password;

	@Value("${student.datasource.driverClassName}")
	private String driverClass;

	@Value("${spring.datasource.initialSize}")
	private int initialSize;

	@Value("${spring.datasource.minIdle}")
	private int minIdle;

	@Value("${spring.datasource.maxActive}")
	private int maxActive;

	@Value("${spring.datasource.maxWait}")
	private int maxWait;

	@Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${spring.datasource.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;

	@Value("${spring.datasource.validationQuery}")
	private String validationQuery;

	@Value("${spring.datasource.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${spring.datasource.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${spring.datasource.testOnReturn}")
	private boolean testOnReturn;

	@Value("${spring.datasource.poolPreparedStatements}")
	private boolean poolPreparedStatements;

	@Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
	private int maxPoolPreparedStatementPerConnectionSize;

	@Value("${spring.datasource.filters}")
	private String filters;

	@Value("{spring.datasource.connectionProperties}")
	private String connectionProperties;

	@Bean(name = "studentDataSource")
	public DataSource studentDataSource() {

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

	@Bean(name = "studentTransactionManager")
	public DataSourceTransactionManager studentTransactionManager() {
		return new DataSourceTransactionManager(studentDataSource());
	}

	@Bean(name = "studentSqlSessionFactory")
	public SqlSessionFactory studentSqlSessionFactory(@Qualifier("studentDataSource") DataSource studentDataSource)
			throws Exception {

		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        设置数据源
		sessionFactory.setDataSource(studentDataSource);
//        返回数据库工厂实例对象
		return sessionFactory.getObject();
	}
}