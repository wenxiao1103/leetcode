package com.learning.proxy;

/**
 * @author xiaowen
 * @date 2020/10/16 10:49 上午
 */
public class CGLIBProxy {
//    public class Dog{
//
//        final public void run(String name) {
//            System.out.println("狗"+name+"----run");
//        }
//
//        public void eat() {
//            System.out.println("狗----eat");
//        }
//    }
//
//    public class MyMethodInterceptor implements MethodInterceptor{
//
//        @Override
//        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//            System.out.println("这里是对目标类进行增强！！！");
//            System.out.println("--------------------before-------------------");
//            //注意这里的方法调用，不是用反射哦！！！
//            Object object = proxy.invokeSuper(obj, args);
//            System.out.println("--------------------after--------------------");
//            return object;
//        }
//    }
//
//    public class CgLibProxy {
//        public static void main(String[] args) {
//            //在指定目录下生成动态代理类，我们可以反编译看一下里面到底是一些什么东西
//            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\java\\java_workapace");
//
//            //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
//            Enhancer enhancer = new Enhancer();
//            //设置目标类的字节码文件
//            enhancer.setSuperclass(Dog.class);
//            //设置回调函数
//            enhancer.setCallback(new MyMethodInterceptor());
//
//            //这里的creat方法就是正式创建代理类
//            Dog proxyDog = (Dog)enhancer.create();
//            //调用代理类的eat方法
//            proxyDog.eat();
//        }
//    }
}
