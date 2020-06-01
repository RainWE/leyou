package com.leyou.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @Auther:cdx
 * @Date:2020-05-20
 * @Description:com.leyou.gateway.config
 * @Version:1.0
 */
@Configuration
public class LeyouCorsConfiguration {

    /**
     * 处理跨域
     * @return
     */
    @Bean
    public CorsFilter corsFilter(){

        //初始化cors对象
        CorsConfiguration corsConfiguration =new CorsConfiguration();
        //允许跨域的域名，如果携带cookie，不能写*。*：代表所有域名都可以跨域访问
        corsConfiguration.addAllowedOrigin("http://manage.leyou.com");
        corsConfiguration.addAllowedOrigin("http://www.leyou.com");
        corsConfiguration.setAllowCredentials(true);    //允许携带cookie
        corsConfiguration.addAllowedMethod("*");        //代表所有的请求方法：GET POST PUT Delete
        corsConfiguration.addAllowedHeader("*");    //允许携带任何头信息

        //初始化cors配置源对象
        UrlBasedCorsConfigurationSource corsConfigurationSource=new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        //返回CorsFilter实例，参数：cors配置源对象
        return new CorsFilter(corsConfigurationSource);
    }
}
