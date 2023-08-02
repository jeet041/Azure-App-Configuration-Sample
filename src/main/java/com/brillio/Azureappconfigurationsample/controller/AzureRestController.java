package com.brillio.Azureappconfigurationsample.controller;

import com.brillio.Azureappconfigurationsample.configuration.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/config/")
public class AzureRestController {
    @Autowired
    private AppProperties properties;

    @GetMapping("getmsg")
    public String getMsg(){
        return properties.getConfigMsg();
    }
}
