package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication is shorthand for the following annotations:
 * @Configuration: 				tags the class as a source of bean definitions
 * @EnableAutoConfiguration:	tells spring boot to add beans based on class path settings.	
 * @EnableMVC:					added automatically when spring boot sees spring-webmvc on class path (sets up DispatcherServlet)
 * @ComponentScan:				tells spring to look for components, packages and services in package 'hello'
 * **/
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}