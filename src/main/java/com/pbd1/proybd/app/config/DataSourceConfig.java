package com.pbd1.proybd.app.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean(name = "dataSource")
    @Description("DataSource configuration for the tomcat jdbc connection pool")
    public DataSource dataSource(){
        DataSource dataSource = new DataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.db.classname"));
        dataSource.setUrl(env.getProperty("jdbc.db.url"));
        dataSource.setUsername(env.getProperty("jdbc.db.username"));
        dataSource.setPassword(env.getProperty("jdbc.db.password"));
        dataSource.setMaxActive(3);
        return dataSource;
    }
    
}
