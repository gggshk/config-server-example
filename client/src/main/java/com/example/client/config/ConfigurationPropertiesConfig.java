package com.example.client.config;

import com.example.client.domain.AppConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AppConfig.class)
public class ConfigurationPropertiesConfig {

}
