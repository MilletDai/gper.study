package millet.dai.study.pattern.dynamic.cglib;

import millet.dai.study.pattern.Human;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@SuppressWarnings("ALL")
public class CglibAgentProxy<T extends Human> implements MethodInterceptor {

    public <T extends Human> T getInstance(T clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理对象：" + o.getClass().getName() + " 执行了 " + method.getName() + "()");
        methodProxy.invokeSuper(o, objects);
        return null;
    }
}
