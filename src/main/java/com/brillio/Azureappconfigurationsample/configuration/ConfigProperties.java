package com.brillio.Azureappconfigurationsample.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ConfigProperties {
    public String getConfigMsg() {
        return configMsg3;
    }

    public void setConfigMsg(String configMsg) {
        this.configMsg3 = configMsg;
    }

    private String configMsg3;
}
