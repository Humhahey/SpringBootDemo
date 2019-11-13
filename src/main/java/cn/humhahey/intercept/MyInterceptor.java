package cn.humhahey.intercept;

import cn.humhahey.invoke.Invocation;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.InvocationTargetException;

@Log4j2
public class MyInterceptor implements Interceptor{
    @Override
    public boolean before() {
        return true;
    }

    @Override
    public void after() {
        log.info("after");
    }

    @Override
    public void afterReturn() {
        log.info("afterReturn");
    }

    @Override
    public void afterThrowing() {
        log.info("afterThrowing");
    }

    @Override
    public boolean useAround() {
        return true;
    }

    @Override
    public Object invocation(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        log.info("invocation");
        return invocation.process();
    }
}
