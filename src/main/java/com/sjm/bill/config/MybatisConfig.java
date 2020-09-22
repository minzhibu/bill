package com.sjm.bill.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.sjm.bill.mbg.mapper")
public class MybatisConfig {
}
