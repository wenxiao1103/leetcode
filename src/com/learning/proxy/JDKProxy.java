package com.learning.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author xiaowen
 * @date 2020/10/16 10:17 上午
 */
public class JDKProxy {
    public interface UserService {
        public abstract void add();
    }
    /*接口*/
    public class UserServiceImpl implements UserService {
        @Override
        public void add() {
            System.out.println("-----------------------add-----------------------");
        }
    }
    /*被代理类*/

    public class MyInvocationHandler implements InvocationHandler {

        Object target;

        public MyInvocationHandler(Object target) {
            super();
            this.target = target;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("-----------------------before-----------------------");
            Object result = method.invoke(target, args);
            System.out.println("-----------------------after------------------------");
            return result;
        }
        public Object getProxy() {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
        }
    }

    /*test*/
    public class ProxyTest {
        public void testProxy() {
            //实例化目标对象
            UserService userService = new UserServiceImpl();
            //实例化InvocationHandler
            MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
            //根据目标对象生成代理对象
            UserService proxy = (UserService)myInvocationHandler.getProxy();
            //调用代理对象方法
            proxy.add();
        }
    }
    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
    }
}
