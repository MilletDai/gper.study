# 工厂方式模式
## 简单工厂方法
  > 以产品为维度判断生成，只是将`new`的权利交给了`Factory`而已，不区分产品类型，混乱

![simple](https://github.com/MilletDai/gper.study/blob/master/patterns/factory-method/src/main/resources/uml/SimpleFactory.png)

## 工厂方法模式
  > 以产品为维度创建相应的工厂类，每个工厂类只负责生产`(new)`一种产品，简单、易扩展，对象膨胀

![factory](https://github.com/MilletDai/gper.study/blob/master/patterns/factory-method/src/main/resources/uml/FactoryMethod.png)
## 抽象工厂方法
  > 以产品族为维度创建相应的工厂类，每个工厂类可生产该产品族下所有产品，维护简单、易扩展，高内聚、低耦合，工厂类需提供该产品族下相应产品的获取方法

![abstract](https://github.com/MilletDai/gper.study/blob/master/patterns/factory-method/src/main/resources/uml/AbstractFactory.png)

