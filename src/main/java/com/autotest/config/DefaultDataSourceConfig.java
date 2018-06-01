package com.autotest.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by huairen on 2017/12/11.
 */
@Configuration
//@MapperScan(basePackages = "dal.dao.default", sqlSessionFactoryRef = "defaultSqlSessionFactory", nameGenerator =
//        MultiBeanNameGenerator.class)
public class DefaultDataSourceConfig extends DruidBaseConfig {

    @Value("${ds.default.url}")
    private String url;

    @Value("${ds.default.username}")
    private String username;

    @Value("${ds.default.password}")
    private String password;

    @Value("${ds.default.driverClassName}")
    private String driverClassName;

    @Bean(name = "defaultDataSource")
    @Primary
    public DataSource defaultDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return setDataSource(dataSource, url, username, password, driverClassName);
    }

    @Bean(name = "defaultTransactionManager")
    @Primary
    public DataSourceTransactionManager defaultTransactionManager() {
        return new DataSourceTransactionManager(defaultDataSource());
    }

    @Bean(name = "defaultSqlSessionFactory")
    @Primary
    public SqlSessionFactory defaultSqlSessionFactory(@Qualifier("defaultDataSource") DataSource defaultDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(defaultDataSource);
        return sessionFactory.getObject();
    }
}