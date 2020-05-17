package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther:cdx
 * @Date:2020-05-17
 * @Description:com.leyou
 * @Version:1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class LeyouResgistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouResgistryApplication.class);
    }
}
