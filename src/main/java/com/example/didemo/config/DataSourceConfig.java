package com.example.didemo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public MongoClient mongoClient(){
        return MongoClients.create("mongodb://admin:mongo@localhost:27017/test?authSource=admin");
    }

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.postgresql.Driver");
        dataSourceBuilder.url("jdbc:postgresql://localhost:5422/default");
        dataSourceBuilder.username("admin");
        dataSourceBuilder.password("postgres");
        return dataSourceBuilder.build();
    }
}
