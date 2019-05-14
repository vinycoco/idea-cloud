package  com.youle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cocoyang
 * @date 2019/5/9
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDemoApplication{

    public static void main(String[] args) {
        SpringApplication.run(EurekaDemoApplication.class);
    }
}
