package com.springcloud.gatewarydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GatewarydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewarydemoApplication.class, args);
    }
   /* @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("url-proxy-1", r -> r.path("/csdn")
                        .uri("localhost:8091"))
                .build();
    }*/
}
