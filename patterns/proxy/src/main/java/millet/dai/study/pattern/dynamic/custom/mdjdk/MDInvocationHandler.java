package millet.dai.study.pattern.dynamic.custom.mdjdk;

import java.lang.reflect.Method;

public interface MDInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
