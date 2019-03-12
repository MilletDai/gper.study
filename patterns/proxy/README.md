# 代理模式
  * 优点
    * 代理模式能将代理对象与真实被调用的目标对象分离
    * 一定程度上降低了系统的耦合程度易于扩展
    * 代理可以起到保护目标对象的作用
    * 增强目标对象的职责
## 静态代理
  > 代理类和被代理类实现同一个接口、同宗同源
## 动态代理
  > 字节码织入，生成代理类`$Proxy?`的字节码，写入到文件，编译后重新加载到内存，最后删除生成的`java`和`class`文件
  * `JDK`
    * 实现`InvocationHandler`，生成的代理类如：`com.sun.proxy.$Proxy0`
    * 接口代理，`$Proxy?`实现接口，在实现类的对应方法中`invoke`被代理对象的方法
  * `CGLIB`
    * 实现MethodInterceptor，生成的代理类如：`millet.dai.study.pattern.Man$$EnhancerByCGLIB$$5f4c7380`
    * 类代理，`$Proxy?`继承被代理类的方式
    * 依赖cglib.jar >> org.ow2.asm.jar
    * 与`final`冲突
# 为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？
![getProxyClass0](https://github.com/MilletDai/gper.study/blob/master/patterns/proxy/src/main/resources/img/Proxy.getProxyClass0.png)
  > JVM规范中规定的类文件结构中，包含三项用于确定类的继承关系数据：类索引(`this_class`)、父类索引(`super_class`)、接口索引集合(`interfaces`)<br/>
  其中`this_class`和`super_class`都是一个`u2`类型的数据，而`interfaces`则是一组u2类型的数据集合，他们各自指向一个类型为`CONSTANT_Class_info`的描述符常量，通过该常量的索引值可找到类的全限定名字符串。<br/>
  对于`interfaces`来说，第一项`u2`为接口计数器`interfaces_count`，表示该类所实现接口的个数，`u2`的大小为2^16-1=65535，所以接口个数不能大于65535。