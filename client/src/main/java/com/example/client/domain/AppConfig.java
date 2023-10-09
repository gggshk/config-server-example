package com.example.client.domain;

import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope //RefreshScope을 사용해서 갱신을 하기 위해서는 getter, setter 필요
@ConfigurationProperties(prefix = "spring")
public class AppConfig {

  private Map<String, Object> application;
  private Map<String, Object> config;
  private Map<String, Object> dataSource;

  public Map<String, Object> getApplication() {
    return application;
  }

  public void setApplication(Map<String, Object> application) {
    this.application = application;
  }

  public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }

  public Map<String, Object> getDataSource() {
    return dataSource;
  }

  public void setDataSource(Map<String, Object> dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public String toString() {
    return "AppConfig{" +
      "application=" + application +
      ", config=" + config +
      ", dataSource=" + dataSource +
      '}';
  }
}
