package com.lee.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author harry
 */
@MapperScan(basePackages = "com.lee.management.mapper")
@SpringBootApplication
public class ManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagementServiceApplication.class, args);
    }
}
