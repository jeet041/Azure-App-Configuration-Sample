package com.brillio.Azureappconfigurationsample.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class DBConnection {

    @Value("${configMsg2}")
    public String username;


    public DBConnection(String username) {
        this.username = username;
    }
}
