package com.brillio.Azureappconfigurationsample.controller;

import com.azure.spring.cloud.appconfiguration.config.AppConfigurationRefresh;
import com.brillio.Azureappconfigurationsample.configuration.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class AzureRestController {
//    @Autowired(required = false)
//    private AppConfigurationRefresh refresh;

//    private final AppProperties properties;
//
//    public AzureRestController(AppProperties properties){
//        this.properties=properties;
//    }
    @Value("configMsg")
    private String msg;

    @GetMapping("/getmsg")
    public String getMsg(){
        return msg;
    }

    //@Scheduled(fixedDelay = 1000*2)
//    public void printMsg(){
//        System.out.println("fetched value is :"+properties.getConfigMsg());
//    }
}
