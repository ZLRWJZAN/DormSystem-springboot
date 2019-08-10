package com.ps.dorm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/27 14:26
 */
@SpringBootApplication
@MapperScan("com.ps.dorm.mapper")
public class Run {
    public static void main(String[] args) {
        SpringApplication.run(Run.class,args);
    }
}
