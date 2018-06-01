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
@MapperScan(basePackages = "dal.dao.${projectName}", sqlSessionFactoryRef = "${projectName}SqlSessionFactory", nameGenerator =
		MultiBeanNameGenerator.class)
public class ${className} extends DruidBaseConfig {

    @Value("${r"${"}ds.${projectName}.url}")
    private String url;

    @Value("${r"${"}ds.${projectName}.username}")
    private String username;

    @Value("${r"${"}ds.${projectName}.password}")
    private String password;

    @Value("${r"${"}ds.${projectName}.driverClassName}")
    private String driverClassName;

    @Bean(name = "${projectName}DataSource")
    public DataSource ${projectName}DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return setDataSource(dataSource, url, username, password, driverClassName);
    }

    @Bean(name = "${projectName}TransactionManager")
    public DataSourceTransactionManager ${projectName}TransactionManager() {
        return new DataSourceTransactionManager(${projectName}DataSource());
    }

    @Bean(name = "${projectName}SqlSessionFactory")
    public SqlSessionFactory ${projectName}SqlSessionFactory(@Qualifier("${projectName}DataSource") DataSource ${projectName}DataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(${projectName}DataSource);
        return sessionFactory.getObject();
    }
}