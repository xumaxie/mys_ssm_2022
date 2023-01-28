package com.atguigu.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author xujian
 * @create 2023-01-10 16:19
 */
public class ProxyFactory {

    //被代理类的对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        /**
         * ClassLoader:加载动态生成的代理类的类加载器
         * interfaces：目标对象实现的所有接口的class对象所组成的数组
         * invocationHandler h：代理类中如何重写接口中的抽象方法
         */
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            /**
             *
             * @param proxy:代理类对象
             * @param method：调用的被代理类对象的方法
             * @param args：该方法的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;

                try {
                    System.out.println("[动态代理][日志] "+method.getName()+"，参数："+ Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("[动态代理][日志] "+method.getName()+"，结果："+ result);
                }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("[动态代理][日志] "+method.getName()+"，异常："+e.getMessage());
                }finally{
                    System.out.println("[动态代理][日志] "+method.getName()+"，方法执行完毕");
                }
                return result;
            }
        });
    }
}
