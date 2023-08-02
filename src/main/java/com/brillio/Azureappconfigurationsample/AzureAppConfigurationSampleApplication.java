package com.brillio.Azureappconfigurationsample;

import com.brillio.Azureappconfigurationsample.configuration.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class AzureAppConfigurationSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureAppConfigurationSampleApplication.class, args);
	}

}
