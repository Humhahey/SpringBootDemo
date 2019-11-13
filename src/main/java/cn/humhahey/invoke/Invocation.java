package cn.humhahey.invoke;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


@Setter
@Getter
@AllArgsConstructor
public class Invocation {
    private Object[] args;
    private Method method;
    private Object target;

    public Object process() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, args);
    }
}
