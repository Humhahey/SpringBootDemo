package cn.humhahey.config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"cn.humhahey.service","cn.humhahey.aspect"},includeFilters = {@ComponentScan.Filter(Aspect.class)})
public class AppConfig {
}
