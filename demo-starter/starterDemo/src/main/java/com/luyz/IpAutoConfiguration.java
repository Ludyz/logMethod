package com.luyz;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class IpAutoConfiguration {

    @Bean
    public IpCountService ipCountService() {
        return new IpCountService();
    }
}
