# 熟练掌握单例模式的常见写法。
  * 懒汉式
  * 饿汉式
  * 注册式
## 使用单例模式注意需
  * 私有化构造器
  * 保证线程安全
  * 延迟加载
  * 防止序列化和反序列化破坏单例
  * 预防反射攻击单例
# 思考破坏单例模式的方式有哪些？并且归纳总结。
  * 反射。在构造函数内做初始化判断。
  * 序列化、反序列化。使用`readResolve()`避免生成多个实例
# 梳理内部类的执行逻辑，并画出时序图
![innerClass](https://github.com/MilletDai/gper.study/blob/master/patterns/singleton/src/main/resources/uml/SingletonInnerClass.png)

