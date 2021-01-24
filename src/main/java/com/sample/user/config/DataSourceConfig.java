package com.sample.user.config;

import org.springframework.beans.factory.annotation.Value;

public class DataSourceConfig {

    @Value("${driverClassName}")
    private String driverClass;

    @Value("${url}")
    private String url;

    @Value("${username}")
    private String username;

    //@Value("${}")
}
