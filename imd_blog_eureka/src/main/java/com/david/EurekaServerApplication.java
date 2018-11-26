package com.david;

/**
 * eureka.client.registerWithEureka=true #是否将自身注册
 * eureka.client.fetchRegistry=false #如果为true，启动时报警.
 * 打开eureka server 界面的
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心服务。
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
