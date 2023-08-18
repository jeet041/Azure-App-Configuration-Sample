package com.brillio.Azureappconfigurationsample.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class DBConnection {

    @Value("configMsg2")
    public String username;


}