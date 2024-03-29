package com.qfedu.love_travel.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


//这里是接口注释文档，不需要可以整个java文件删除
@Configuration //标记这是一个配置
public class SwaggerConfig {

    public ApiInfo createA(){
        ApiInfo info = new ApiInfoBuilder().title("旅游app数据接口").
                contact(new Contact("Java1901","http://www.baidu.com","751299914@qq.com")).
                description("实现一个旅游项目的数据接口信息").build();

        return info;
    }

    @Bean //创建对象，修饰方法，方法的返回值必须是引用类型，对象储存在ioc中
    public Docket createDocket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(createA()).select().
                apis(RequestHandlerSelectors.basePackage("com.qfedu.love_travel.controller")).build();
        return docket;
    }
}



















