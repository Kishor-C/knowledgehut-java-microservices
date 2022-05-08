package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// Classes having @Configuration are treated as the source for beans
// this class 'Config' is also registered as a bean in the spring container
@Configuration
@ImportResource(locations = {"spring-beans.xml"})
public class Config {

}
