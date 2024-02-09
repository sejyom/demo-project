package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        ignoreResourceNotFound = true,
        value = {
                "classpath:application-mysql.properties"
        }
)
// used to include application-mysql.properties for module 'demo-common'
public class PropertiesConfiguration {
}
