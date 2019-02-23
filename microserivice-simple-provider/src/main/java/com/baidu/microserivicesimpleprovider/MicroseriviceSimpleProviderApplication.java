package com.baidu.microserivicesimpleprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroseriviceSimpleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroseriviceSimpleProviderApplication.class, args);
    }

}
