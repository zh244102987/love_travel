package com.qfedu.boot_ssm1901;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qfedu.boot_ssm1901.dao") //扫描Mybatis修饰的接口所在的包
@EnableSwagger2 //启用Swagger
public class BootSsm1901Application {

    public static void main(String[] args) {
        SpringApplication.run(BootSsm1901Application.class, args);
    }

}
