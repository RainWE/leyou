package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther:cdx
 * @Date:2020-06-02
 * @Description:com.leyou
 * @Version:1.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class LeyouGoodsWebAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGoodsWebAppliaction.class);
    }
}
