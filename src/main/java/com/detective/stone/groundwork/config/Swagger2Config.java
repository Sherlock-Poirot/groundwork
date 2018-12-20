package com.detective.stone.groundwork.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Detective Stone
 * Create time 2018/12/20 13:37
 * <p>
 * swagger2配置类
 */
@Configuration
@EnableSwagger2 //启用swagger2
public class Swagger2Config {

    private static final String BASE_PACKAGE = "com.detective.stone.groundwork";

    @Value("${debug}")
    private boolean debug;

    @Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .enable(debug) // 是否开启swagger2
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("GroundWork的api文档")
                .description("DetectiveStone搭建的第一个联系项目的swagger2 api文档")
                .termsOfServiceUrl("https://github.com/Sherlock-Poirot/groundwork")
                .contact(new Contact("DetectiveStone", "", "348735716@qq.com"))
                .version("1.0")
                .build();
    }
}
