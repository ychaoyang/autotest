package com.autotest.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.autotest.mybatis.MultiBeanNameGenerator;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "dal.dao.school", sqlSessionFactoryRef = "schoolSqlSessionFactory", nameGenerator =
		MultiBeanNameGenerator.class)
public class SchoolDataSourceConfig extends DruidBaseConfig {

    @Value("${ds.school.url}")
    private String url;

    @Value("${ds.school.username}")
    private String username;

    @Value("${ds.school.password}")
    private String password;

    @Value("${ds.school.driverClassName}")
    private String driverClassName;

    @Bean(name = "schoolDataSource")
    public DataSource schoolDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return setDataSource(dataSource, url, username, password, driverClassName);
    }

    @Bean(name = "schoolTransactionManager")
    public DataSourceTransactionManager schoolTransactionManager() {
        return new DataSourceTransactionManager(schoolDataSource());
    }

    @Bean(name = "schoolSqlSessionFactory")
    public SqlSessionFactory schoolSqlSessionFactory(@Qualifier("schoolDataSource") DataSource schoolDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(schoolDataSource);
        return sessionFactory.getObject();
    }
}