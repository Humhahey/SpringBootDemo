package cn.humhahey.intercept;

import cn.humhahey.invoke.Invocation;

import java.lang.reflect.InvocationTargetException;

public interface Interceptor {

    public boolean before();

    public void after();

    public void afterReturn();

    public void afterThrowing();

    public boolean useAround();

    public Object invocation(Invocation invocation) throws InvocationTargetException, IllegalAccessException;
}
