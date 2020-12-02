package com.artisan.service3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author puxianfeng
 * @date 2020/6/28 9:23 下午
 */
@RequestMapping("/service/three")
@RestController
public class ZipkinTestController {
    private final Logger logger = LoggerFactory.getLogger(ZipkinTestController.class);

    @GetMapping(value = "/zipkin")
    public String zipkinServer() {
        logger.info("call service3");
        return "service";
    }
}
