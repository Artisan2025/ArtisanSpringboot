package com.artisan.service1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author puxianfeng
 * @date 2020/6/24 11:10 上午
 */
@RequestMapping("/service/one")
@RestController
public class ZipkinTestController {

    private final Logger logger = LoggerFactory.getLogger(ZipkinTestController.class);

    private RestTemplate restTemplate;

    @Autowired
    public ZipkinTestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/zipkin")
    public String zipkinServer() {
        logger.info("call service1");
        return restTemplate.getForObject("http://localhost:8081/service/two/zipkin", String.class);
    }
}
