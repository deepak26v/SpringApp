package com.oreilly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by deepakvalechha on 3/4/16.
 */
@Configuration
public class InfrastructureConfig {
    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }
}
