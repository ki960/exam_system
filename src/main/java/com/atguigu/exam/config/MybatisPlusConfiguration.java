package com.atguigu.exam.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackages = "com.atguigu.exam.mapper")
@Configuration
public class MybatisPlusConfiguration {
}
