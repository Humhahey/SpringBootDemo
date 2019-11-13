package cn.humhahey.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "cn.humhahey.mapper")
public class MybatisConfig {
}
