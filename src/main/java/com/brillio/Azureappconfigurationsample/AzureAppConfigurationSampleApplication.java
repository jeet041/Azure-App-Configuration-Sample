package com.brillio.Azureappconfigurationsample;

import com.brillio.Azureappconfigurationsample.configuration.AppProperties;
import com.brillio.Azureappconfigurationsample.configuration.ConfigProperties;
import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class AzureAppConfigurationSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureAppConfigurationSampleApplication.class, args);
	}

}
