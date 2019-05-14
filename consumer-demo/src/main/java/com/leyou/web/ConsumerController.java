package com.leyou.web;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cocoyang
 * @date 2019/5/9
 */
@RestController
@RequestMapping("consume")
@DefaultProperties(defaultFallback = "defaultFallback")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("{id}")
    @HystrixCommand(/*commandProperties = {
            @HystrixProperty(
                    name = "execution.isolation.thread.timeoutInMilliseconds",
                    value = "2500")
    }*/)
    public String queryById(@PathVariable("id") Long id) {
        String url = "http://user-service/user/" + id;
        String user = restTemplate.getForObject(url, String.class);
        return user;
    }

    public String defaultFallback() {

        return "服务器繁忙";
    }
}