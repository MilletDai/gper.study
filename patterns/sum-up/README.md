# 一语中的
* 工厂方法模式(`FactoryMthod`)
  > 专人做专事，砖厂只产砖
* 抽象工厂模式(`AbstractFactory`)
  > 分清族和级，一族一工厂
* 单利模式(`Singleton`)
  > 计划生育好，内存吃的少
* 原型模式(`Prototype`)
  > 独生多孤单，克隆解忧烦
* 代理模式(`Proxy`)
  > 有事你说话，前后干点啥
* 委派模式(`Delegate`)
  > 你说干点啥，我就干点啥
* 策略模式(`Strategy`)
  > 美女千千万，不行咱就换
* 模板方法模式(`TemplateMethod`)
  > 冬去春又来，今年少雾霾
* 适配器模式(`Adapter`)
  > 美女千千万，老婆最好看
* 装饰器模式(`Decorator`)
  > 加蛋又加肠，煎饼王中王
* 观察者模式(`Observer`)
  > 老师在窗外，谁都别使坏
  > 
# `spring`的`IOC`、`AOP`、`DI`的应用
```java
    // DI
    @Controller
    public class ControllerA {
        @Autowired
        private RestTemplate restTemplate;
    }
```
```java
    // IOC
    public class ContextA implements ApplicationContextAware{
        private ApplicationContext context;
        public void setApplicationContext(ApplicationContext paramApplicationContext) throws BeansException{
            context = paramApplicationContext;
        }
    }
```
```java
    // AOP
    @Aspectj
    public class PCExe{
        @Pointcut("execution(public * com.example.aop..*.*(..))")
        public void point(){}
    
        @Before("point()")
        public void doBefore(JoinPoint joinPoint) {
            
        }
    
        @AfterReturning(returning = "ret",pointcut = "point()")
        public void doAfterReturning(Object ret) {
            
        }
    }
```
