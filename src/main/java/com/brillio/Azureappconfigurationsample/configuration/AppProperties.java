package com.brillio.Azureappconfigurationsample.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties()
public class AppProperties {
    public String getConfigMsg() {
        return configMsg;
    }

    public void setConfigMsg(String configMsg) {
        this.configMsg = configMsg;
    }

    private String configMsg;
}
