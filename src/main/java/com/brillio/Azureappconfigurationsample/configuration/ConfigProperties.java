package com.brillio.Azureappconfigurationsample.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class ConfigProperties {
    public String getConfigMsg() {
        return Msg3;
    }

    public void setConfigMsg(String Msg) {
        this.Msg3 = Msg;
    }

    private String Msg3;
}
