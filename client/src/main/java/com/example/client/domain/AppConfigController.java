package com.example.client.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/config")
public class AppConfigController {

  private final AppConfig appConfig;

  public AppConfigController(AppConfig appConfig) {
    this.appConfig = appConfig;
  }

  @GetMapping
  public Mono<AppConfig> getAppConfig() {
    return Mono.just(appConfig).log();
  }
}
