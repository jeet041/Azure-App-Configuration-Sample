package com.brillio.Azureappconfigurationsample.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class ConfigProperties {
    public String getConfigMsg() {
        return configMsg2;
    }

    public void setConfigMsg(String configMsg) {
        this.configMsg2 = configMsg;
    }

    private String configMsg2;
}
