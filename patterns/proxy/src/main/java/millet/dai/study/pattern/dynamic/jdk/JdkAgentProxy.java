package millet.dai.study.pattern.dynamic.jdk;

import millet.dai.study.pattern.Human;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SuppressWarnings("ALL")
public class JdkAgentProxy<T extends Human> implements InvocationHandler {
    private Human human;
    public <T extends Human> T getInstance(T human){
        this.human = human;
        return (T)Proxy.newProxyInstance(human.getClass().getClassLoader(), human.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象：" + proxy.getClass().getName() + " 执行了 " + method.getName() + "()");
        return method.invoke(human, args);
    }
}
