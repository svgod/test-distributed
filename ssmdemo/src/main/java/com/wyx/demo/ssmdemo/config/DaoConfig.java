package com.wyx.demo.ssmdemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan(basePackages = "com.wyx.demo.ssmdemo.dao")
@Configuration
public class DaoConfig {
}
