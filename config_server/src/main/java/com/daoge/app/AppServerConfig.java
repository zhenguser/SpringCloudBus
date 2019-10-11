package com.daoge.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //分布式配置中心
public class AppServerConfig {

	public static void main(String[] args) {
		SpringApplication.run(AppServerConfig.class, args);
	}
}
