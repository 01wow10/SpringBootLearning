package com.day2_work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class Day2WorkApplication {
    public static void main(String[] args) {
        SpringApplication.run(Day2WorkApplication.class, args);
    }

}
