package millet.dai.study.pattern.dynamic.custom;

import millet.dai.study.pattern.Human;
import millet.dai.study.pattern.dynamic.custom.mdjdk.MDClassLoader;
import millet.dai.study.pattern.dynamic.custom.mdjdk.MDInvocationHandler;
import millet.dai.study.pattern.dynamic.custom.mdjdk.MDProxy;

import java.lang.reflect.Method;

@SuppressWarnings("ALL")
public class CustomAgentProxy<T extends Human> implements MDInvocationHandler {
    private Human human;
    public <T extends Human> T getInstance(T human){
        this.human = human;
        return (T) MDProxy.newProxyInstance(new MDClassLoader(), human.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象：" + proxy.getClass().getName() + " 执行了 " + method.getName() + "()");
        return method.invoke(human, args);
    }
}
