package com.javaFeature.camel.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
/**
 * https://camel.apache.org/spring-boot.html
 * @author amare
 *May 12, 2019
 */
@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:\\Users\\amare\\sts-workspace-rent\\springbootApatcheCamelIntegaration-project1\\input")
          .to("file:C:\\Users\\amare\\sts-workspace-rent\\springbootApatcheCamelIntegaration-project1\\output");
    }
}