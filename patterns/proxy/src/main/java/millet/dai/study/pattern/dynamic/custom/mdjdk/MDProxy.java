package millet.dai.study.pattern.dynamic.custom.mdjdk;

import sun.misc.ProxyGenerator;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

@SuppressWarnings("ALL")
public class MDProxy implements java.io.Serializable {
    //    private static MDInvocationHandler h;
//    private static final AtomicLong nextUniqueNumber = new AtomicLong();
    private static final String ln = "\r\n";

    public static Object newProxyInstance(MDClassLoader loader,
                                          Class<?>[] interfaces,
                                          MDInvocationHandler h)
            throws IllegalArgumentException {
        Constructor c = null;
        String filePath = null;
        File javaFile = null;
        File classFile;
        try {
            // 动态生成字节码
            String src = generateSrc(interfaces[0]);
            // 将字节码写入java文件
            filePath = MDProxy.class.getResource("").getPath();
            javaFile = new File(filePath + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(javaFile);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            // 将java文件编译
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manage.getJavaFileObjects(javaFile);
            JavaCompiler.CompilationTask task =
                    compiler.getTask(null, manage, null, null, null, iterable);
            task.call();
            manage.close();
            // 读取class文件，加载到JVM
            Class proxyClass = loader.findClass("$Proxy0");
            c = proxyClass.getConstructor(MDInvocationHandler.class);
            // 删除java和class文件
            // 返回代理对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (javaFile != null) {
                javaFile.deleteOnExit();
            }
            if (filePath != null) {
                classFile = new File(filePath + "$Proxy0.class");
                classFile.deleteOnExit();
            }
        }
    }

    private static String generateSrc(Class<?> intface) {
        StringBuffer sb = new StringBuffer();
        //导入的包
        sb.append("package millet.dai.study.pattern.dynamic.custom.mdjdk;" + ln);
        sb.append("import millet.dai.study.pattern.Human;" + ln);
        sb.append("import millet.dai.study.pattern.dynamic.custom.mdjdk.MDInvocationHandler;" + ln);
        sb.append("import java.lang.reflect.Method;" + ln);
        //开始写类
        sb.append("public class $Proxy0 implements " + intface.getName() + "{" + ln);
        //定义成员变量
        sb.append("  MDInvocationHandler h;" + ln);
        //定义构造方法
        sb.append("  public $Proxy0(MDInvocationHandler h){" + ln);
        sb.append("    this.h=h ;" + ln);
        sb.append("  }" + ln);
        //方法
        //（1）获得接口内的所有方法
        Method[] method = intface.getMethods();
        for (Method m : method) {
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "(){" + ln);
            sb.append("  try {" + ln);
            sb.append("    Method m =" + intface.getName() + ".class.getMethod(\"" + m.getName() + "\", new Class<?>[]{}) ;" + ln);
            sb.append("    this.h.invoke(this,m,null);" + ln);
            sb.append("  }catch(Throwable e){" + ln);
            sb.append("    e.printStackTrace();" + ln);
            sb.append("  }" + ln);
            sb.append("}" + ln);
        }

        sb.append("}" + ln);
        return sb.toString();
    }

//    private static Class<?> generateByteSource(ClassLoader loader, Class<?>[] interfaces) {
//        String proxyName = "com.sun.proxy.$Proxy" + nextUniqueNumber.getAndIncrement();
//        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(proxyName
//                , interfaces, 17);
//        System.out.println(new String(proxyClassFile));
//        return defineClass0(loader, proxyName,
//                proxyClassFile, 0, proxyClassFile.length);
//    }
//
//    private static native Class<?> defineClass0(ClassLoader loader, String name,
//                                                byte[] b, int off, int len);
}
