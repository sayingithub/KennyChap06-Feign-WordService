package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class KennyChap06FeignWordServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KennyChap06FeignWordServiceApplication.class, args);
	}
}
