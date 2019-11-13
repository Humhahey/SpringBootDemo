package cn.humhahey.aspect;

import cn.humhahey.service.ValidateService;
import cn.humhahey.service.impl.ValidateServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
@Log4j2
public class MyAspect {

    @DeclareParents(value = "cn.humhahey.service.impl.UserServiceImpl", defaultImpl = ValidateServiceImpl.class)
    private ValidateService validateService;

    @Before("execution(* cn.humhahey.service.UserService.printUser(..))")
    public void before() {
       log.info("before....");
    }
}
