package com.brillio.Azureappconfigurationsample.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class DataService {
    @Value("${app.Msg3}")
    private String msg;

}
