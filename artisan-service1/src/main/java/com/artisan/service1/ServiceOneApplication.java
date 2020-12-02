package com.artisan.service1;

import brave.sampler.Sampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * @author puxianfeng
 * @date 2020/6/28 11:23 下午
 */
@SpringBootApplication
public class ServiceOneApplication {

    private RestTemplateBuilder restTemplateBuilder;

    public ServiceOneApplication(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Bean
    public RestTemplate restTemplate() {
        return restTemplateBuilder.build();
    }


    public static void main(String[] args) {
        SpringApplication.run(ServiceOneApplication.class, args);
    }
}
