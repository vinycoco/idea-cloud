package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author cocoyang
 * @date 2019/5/9
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.leyou.mapper")
public class  UserApplication {



    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
