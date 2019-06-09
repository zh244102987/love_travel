package com.qfedu.love_travel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qfedu.love_travel.dao")
@EnableSwagger2
public class LoveTravelApplication {

    public static void main(String[] args) {

        SpringApplication.run(LoveTravelApplication.class, args);
    }

}
