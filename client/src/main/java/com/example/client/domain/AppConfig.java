package com.example.client.domain;

import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring")
public record AppConfig(
  Map<String, Object> application,
  Map<String, Object> config,
  Map<String, Object> dataSource
) {

}
