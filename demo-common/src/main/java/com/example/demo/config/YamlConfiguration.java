package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        value = "classpath:application-mysql.yml",
        factory = YamlLoadFactory.class
)
// used to include application-mysql.properties for module 'demo-common'
public class YamlConfiguration {
}
